package com.nailong.xt.data.tools;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

/**
 * JSON自动生成Java Model类脚本
 * 使用：修改下方的 BASE_DIR 和 PACKAGE_NAME，然后运行 main 方法。
 */

public class DataCodeGeneration {

    // ============ 配置区域 ============
    private static final String RESOURCES_BASE_DIR = "./data/bin";
    private static final String JAVA_OUTPUT_DIR = "output/src/main/java/com/nailong/xt/data";
    private static final String PACKAGE_NAME = "com.nailong.xt.data.model";
    // ================================

    private static final ObjectMapper MAPPER = new ObjectMapper();
    private static final Set<String> GENERATED_DATA_NAMES = new HashSet<>();

    static void main(String[] args) throws IOException {
        System.out.println("开始扫描目录: " + RESOURCES_BASE_DIR);
        File dataDir = new File(RESOURCES_BASE_DIR);
        if (!dataDir.exists() || !dataDir.isDirectory()) {
            System.err.println("目录不存在: " + RESOURCES_BASE_DIR);
            return;
        }

        // 创建输出目录
        Path outputPath = Paths.get(JAVA_OUTPUT_DIR);
        if (!Files.exists(outputPath)) {
            Files.createDirectories(outputPath);
        }
        Path loadOutputPath = Paths.get(JAVA_OUTPUT_DIR + "/load");
        if (!Files.exists(loadOutputPath)) {
            Files.createDirectories(loadOutputPath);
        }
        Path serviceOutputPath = Paths.get(JAVA_OUTPUT_DIR + "/service");
        if (!Files.exists(serviceOutputPath)) {
            Files.createDirectories(serviceOutputPath);
        }

        // 遍历所有json文件
        File[] jsonFiles = dataDir.listFiles((dir, name) -> name.endsWith(".json"));
        if (jsonFiles == null || jsonFiles.length == 0) {
            System.out.println("未找到JSON文件");
            return;
        }

        // 处理文件
        for (File jsonFile : jsonFiles) {
            try {
                System.out.println("\n处理文件: " + jsonFile.getName());
                processJsonFile(jsonFile);
            } catch (Exception e) {
                System.err.println("处理文件失败: " + jsonFile.getName());
                e.printStackTrace();
            }
        }

        generateMgrJavaClass();
        generateAutoLoadJavaClass();

        System.out.println("\n生成完成！共生成 " + GENERATED_DATA_NAMES.size() + " 个Model类。");
    }

    private static void processJsonFile(File jsonFile) throws IOException {
        String fileName = jsonFile.getName();
        String dataName = toPascalCase(fileName.replace(".json", ""));
        String className = dataName + "Config";

        // 分析整个文件的所有对象，合并字段
        Map<String, FieldInfo> fields = analyzeAllObjects(jsonFile);

        // 生成Java文件
        generateModelJavaClass(className, fields);
        generateServiceJavaClass(dataName);
        GENERATED_DATA_NAMES.add(dataName);
    }

    /**
     * 分析整个JSON文件，合并所有对象的字段
     */
    private static Map<String, FieldInfo> analyzeAllObjects(File jsonFile) throws IOException {
        JsonNode rootNode = MAPPER.readTree(jsonFile);
        Map<String, FieldInfo> allFields = new LinkedHashMap<>();
        Map<String, Set<String>> fieldTypeHistory = new HashMap<>();

        // 遍历JSON中的所有对象
        if (rootNode.isObject()) {
            // 处理 { "3101": {...}, "3102": {...} } 这种格式
            Iterator<Map.Entry<String, JsonNode>> entries = rootNode.fields();
            while (entries.hasNext()) {
                JsonNode objNode = entries.next().getValue();
                if (objNode.isObject()) {
                    analyzeSingleObject((ObjectNode) objNode, allFields, fieldTypeHistory);
                }
            }
        } else if (rootNode.isArray()) {
            // 处理数组格式 [{...}, {...}]
            for (JsonNode element : rootNode) {
                if (element.isObject()) {
                    analyzeSingleObject((ObjectNode) element, allFields, fieldTypeHistory);
                }
            }
        } else if (rootNode.isObject()) {
            // 处理单个对象格式
            analyzeSingleObject((ObjectNode) rootNode, allFields, fieldTypeHistory);
        }

        // 优化：为每个字段选择最合适的类型
        for (FieldInfo field : allFields.values()) {
            // go学长针对我们瓦学弟😭
            switch (field.fieldName) {
                case "char", "break", "class" -> field.fieldName += "Field";
            }

            Set<String> typeSet = fieldTypeHistory.get(field.jsonKey);
            if (typeSet != null && typeSet.size() > 1) {
                // 如果有多种类型出现，选择最通用的类型
                field.javaType = determineMostGeneralType(typeSet);
                System.out.println("  字段 " + field.jsonKey + " 有多种类型: " + typeSet +
                        ", 选择: " + field.javaType);
            }
        }

        return allFields;
    }

    /**
     * 分析单个JSON对象
     */
    private static void analyzeSingleObject(ObjectNode node,
                                            Map<String, FieldInfo> allFields,
                                            Map<String, Set<String>> fieldTypeHistory) {
        Iterator<Map.Entry<String, JsonNode>> fieldsIt = node.fields();
        while (fieldsIt.hasNext()) {
            Map.Entry<String, JsonNode> entry = fieldsIt.next();
            String jsonKey = entry.getKey();
            JsonNode valueNode = entry.getValue();

            // 获取Java类型（始终使用包装类型）
            String javaType = inferJavaType(valueNode, jsonKey);

            // 记录类型历史
            fieldTypeHistory.computeIfAbsent(jsonKey, k -> new HashSet<>()).add(javaType);

            // 如果字段已记录，检查类型是否冲突
            if (allFields.containsKey(jsonKey)) {
                FieldInfo existing = allFields.get(jsonKey);
                if (!existing.javaType.equals(javaType)) {
                    // 如果类型冲突，保留更通用的类型
                    String upgradedType = upgradeType(existing.javaType, javaType);
                    if (!existing.javaType.equals(upgradedType)) {
                        existing.javaType = upgradedType;
                    }
                }
            } else {
                // 创建新字段信息
                FieldInfo fieldInfo = new FieldInfo();
                fieldInfo.jsonKey = jsonKey;
                fieldInfo.fieldName = toCamelCase(jsonKey);
                fieldInfo.javaType = javaType;
                allFields.put(jsonKey, fieldInfo);
            }
        }
    }

    /**
     * Java类型推断 - 始终返回包装类型
     */
    private static String inferJavaType(JsonNode valueNode, String jsonKey) {
        if (valueNode.isInt()) {
            return "Integer";
        } else if (valueNode.isLong()) {
            return "Long";
        } else if (valueNode.isDouble() || valueNode.isFloat()) {
            return "Double";
        } else if (valueNode.isBoolean()) {
            return "Boolean";
        } else if (valueNode.isTextual()) {
            return "String";
        } else if (valueNode.isArray()) {
            ArrayNode arrayNode = (ArrayNode) valueNode;
            String elementType = inferArrayElementType(arrayNode);
            return "List<" + elementType + ">";
        } else if (valueNode.isObject()) {
            // 嵌套对象，生成专用类名
            return toPascalCase(jsonKey);
        } else if (valueNode.isNull()) {
            // 对于null值，保守返回Object类型，后续会根据实际值修正
            return "Object";
        }
        return "Object";
    }

    /**
     * 推断数组元素的Java类型 - 始终返回包装类型
     */
    private static String inferArrayElementType(ArrayNode arrayNode) {
        if (arrayNode.isEmpty()) {
            return "Object"; // 空数组无法推断类型
        }

        Set<String> types = new HashSet<>();
        for (JsonNode element : arrayNode) {
            if (!element.isNull()) {
                types.add(inferJavaType(element, "arrayElement"));
            }
        }

        if (types.isEmpty()) {
            return "Object"; // 所有元素都是null
        }

        if (types.size() == 1) {
            return types.iterator().next();
        }

        // 多种类型，尝试找到最通用的类型
        return determineMostGeneralType(types);
    }

    /**
     * 确定最通用的类型
     */
    private static String determineMostGeneralType(Set<String> types) {
        // 检查是否有String类型
        if (types.contains("String")) {
            return "String"; // String通常是最终类型
        }

        // 检查是否有Object类型
        if (types.contains("Object")) {
            return "Object";
        }

        // 检查数字类型
        boolean hasDouble = types.contains("Double");
        boolean hasLong = types.contains("Long");
        boolean hasInteger = types.contains("Integer");

        if (hasDouble) {
            return "Double"; // Double可以容纳所有数字
        } else if (hasLong) {
            return "Long"; // Long可以容纳Integer
        } else if (hasInteger) {
            return "Integer";
        }

        // 检查布尔类型
        if (types.contains("Boolean")) {
            return "Boolean";
        }

        // 默认返回第一个类型
        return types.iterator().next();
    }

    /**
     * 处理类型冲突：升级为更通用的类型
     */
    private static String upgradeType(String oldType, String newType) {
        // 类型相同，无需升级
        if (oldType.equals(newType)) return oldType;

        // 如果其中一个已经是Object或String，保持
        if (oldType.equals("Object") || oldType.equals("String")) return oldType;
        if (newType.equals("Object") || newType.equals("String")) return newType;

        // 处理数字类型的升级
        if (isNumberType(oldType) && isNumberType(newType)) {
            // 数字类型升级顺序：Integer -> Long -> Double
            if (oldType.equals("Double") || newType.equals("Double")) return "Double";
            if (oldType.equals("Long") || newType.equals("Long")) return "Long";
            return "Integer";
        }

        // 其他情况，返回更通用的类型
        return "Object";
    }

    private static boolean isNumberType(String type) {
        return type.equals("Integer") || type.equals("Long") || type.equals("Double");
    }

    private static void generateServiceJavaClass(String name) throws IOException {
        File javaFile = new File(JAVA_OUTPUT_DIR + "/service", name + "DataService.java");
        try (FileWriter writer = new FileWriter(javaFile)) {
            writer.write("""
                    package com.nailong.xt.data.service;
                    
                    import com.nailong.xt.data.GameDataMgr;
                    import com.nailong.xt.data.model.*;
                    import lombok.RequiredArgsConstructor;
                    import org.springframework.stereotype.Service;
                    
                    import java.util.ArrayList;
                    
                    @Service
                    @RequiredArgsConstructor
                    """);

            String s = String.format("""
                    public class %sDataService {
                        private final GameDataMgr gameDataMgr;
                    
                        public %sConfig get%sData(int id) {
                            return gameDataMgr.get%sConfigMap().get(String.valueOf(id));
                        }
                        public %sConfig get%sData(String id) {
                            return gameDataMgr.get%sConfigMap().get(id);
                        }
                    
                        public ArrayList<%sConfig> getAll%sData() {
                            return new ArrayList<>(gameDataMgr.get%sConfigMap().values());
                        }
                    }
                    """, name, name, name, name, name, name, name, name, name, name);

            writer.write(s);
        }
    }

    private static void generateAutoLoadJavaClass() throws IOException {
        File javaFile = new File(JAVA_OUTPUT_DIR + "/load", "JsonDataAutoLoad.java");
        try (FileWriter writer = new FileWriter(javaFile)) {
            writer.write("""
                    package com.nailong.xt.data.load;
                    
                    import com.nailong.xt.common.utils.DataUtils;
                    import com.nailong.xt.data.GameDataMgr;
                    import com.nailong.xt.data.model.*;
                    import jakarta.annotation.PostConstruct;
                    import lombok.RequiredArgsConstructor;
                    import lombok.ToString;
                    import lombok.extern.slf4j.Slf4j;
                    import org.springframework.stereotype.Component;
                    import tools.jackson.core.type.TypeReference;
                    import tools.jackson.databind.ObjectMapper;
                    
                    import java.io.File;
                    
                    /**
                     * 自动生成的类
                     */
                    @Component
                    @ToString
                    @RequiredArgsConstructor
                    @Slf4j
                    public class JsonDataAutoLoad {
                        private final ObjectMapper objectMapper;
                        private final GameDataMgr gameDataMgr;
                    
                    """);

            writer.write("""
                        @PostConstruct
                        public void autoLoadAllConfig() {
                            Thread.startVirtualThread(() -> {
                                long start = System.currentTimeMillis();
                    """);

            for (String name : GENERATED_DATA_NAMES) {
                String s = String.format("""
                        
                                    File %sDataFile = DataUtils.getDataFile("%s");
                                    gameDataMgr.set%sConfigMap(objectMapper.readValue(%sDataFile, new TypeReference<>() {}));
                        """, name, name, name, name);
                writer.write(s);
            }
            writer.write("\n            log.info(\"游戏数据加载完成，耗时{}ms\", System.currentTimeMillis() - start);\n");
            writer.write("\n        });\n");
            writer.write("    }\n");

            writer.write("}");
        }
    }

    private static void generateMgrJavaClass() throws IOException {
        File javaFile = new File(JAVA_OUTPUT_DIR, "GameDataMgr.java");
        try (FileWriter writer = new FileWriter(javaFile)) {
            writer.write("""
                    package com.nailong.xt.data;
                    
                    import com.nailong.xt.data.model.*;
                    import lombok.Getter;
                    import lombok.Setter;
                    import org.springframework.stereotype.Component;
                    
                    import java.util.Map;
                    
                    /**
                     * 自动生成的类
                     */
                    @Component
                    @Getter
                    @Setter
                    public class GameDataMgr {
                        ///
                        /// Map
                        ///
                    """);

            for (String name : GENERATED_DATA_NAMES) {
                writer.write("    private Map<String, " + name + "Config> " + name + "ConfigMap;\n");
            }

            writer.write("}");
        }
    }

    /**
     * 生成Java类文件
     */
    private static void generateModelJavaClass(String className, Map<String, FieldInfo> fields) throws IOException {
        File javaFile = new File(JAVA_OUTPUT_DIR + "/model", className + ".java");
        try (FileWriter writer = new FileWriter(javaFile)) {
            // 包声明
            writer.write("package " + PACKAGE_NAME + ";\n\n");

            writer.write("""
                    import com.fasterxml.jackson.annotation.JsonCreator;
                    import com.fasterxml.jackson.annotation.JsonProperty;
                    import com.fasterxml.jackson.annotation.JsonInclude;
                    import java.util.List;
                    import java.util.ArrayList;
                    import java.util.Objects;
                    import lombok.Builder;
                    import lombok.EqualsAndHashCode;
                    import lombok.ToString;
                    
                    """);

            // 类声明
            writer.write("/**\n");
            writer.write(" * 自动生成的配置类。\n");
            writer.write(" * 对应文件: " + className.replace("Config", ".json") + "\n");
            writer.write(" */\n");
            writer.write("""
                    @ToString
                    @Builder
                    @EqualsAndHashCode
                    """);
            writer.write("@JsonInclude(JsonInclude.Include.NON_NULL)\n");
            writer.write("public final class " + className + " {\n\n");

            // 字段声明
            List<FieldInfo> fieldList = new ArrayList<>(fields.values());
            for (FieldInfo field : fieldList) {
                writer.write("    private final " + field.javaType + " " + field.fieldName + ";\n");
            }
            writer.write("\n");

            // 构造器
            writer.write("    @JsonCreator\n");
            writer.write("    public " + className + "(\n");
            for (int i = 0; i < fieldList.size(); i++) {
                FieldInfo field = fieldList.get(i);
                writer.write("        @JsonProperty(\"" + field.jsonKey + "\") " +
                        field.javaType + " " + field.fieldName);
                if (i < fieldList.size() - 1) writer.write(",\n");
                else writer.write("\n");
            }
            writer.write("    ) {\n");

            // 构造器体 - 处理null值
            for (FieldInfo field : fieldList) {
                String fieldName = field.fieldName;
                String javaType = field.javaType;

                if (javaType.startsWith("List<")) {
                    writer.write("        this." + fieldName + " = " + fieldName + " != null ? \n");
                    writer.write("            new ArrayList<>(" + fieldName + ") : \n");
                    writer.write("            new ArrayList<>();\n");
                } else {
                    // 包装类型直接赋值
                    writer.write("        this." + fieldName + " = " + fieldName + ";\n");
                }
            }
            writer.write("    }\n\n");

            // Getter方法
            for (FieldInfo field : fieldList) {
                writer.write("    public " + field.javaType + " get" + toPascalCase(field.fieldName) + "() {\n");
                writer.write("        return this." + field.fieldName + ";\n");
                writer.write("    }\n\n");
            }

            // toString 方法
//            writer.write("    @Override\n");
//            writer.write("    public String toString() {\n");
//            writer.write("        return \"" + className + "{\" +\n");
//            for (int i = 0; i < fieldList.size(); i++) {
//                FieldInfo field = fieldList.get(i);
//                if (i == 0) {
//                    writer.write("            \"" + field.fieldName + "=\" + " + field.fieldName);
//                } else {
//                    writer.write("            \", " + field.fieldName + "=\" + " + field.fieldName);
//                }
//                if (i < fieldList.size() - 1) writer.write(" +\n");
//            }
//            writer.write(";\n");
//            writer.write("    }\n\n");

            // equals 方法
//            writer.write("    @Override\n");
//            writer.write("    public boolean equals(Object o) {\n");
//            writer.write("        if (this == o) return true;\n");
//            writer.write("        if (o == null || getClass() != o.getClass()) return false;\n");
//            writer.write("        " + className + " that = (" + className + ") o;\n");
//            for (FieldInfo field : fieldList) {
//                writer.write("        if (!Objects.equals(" + field.fieldName + ", that." + field.fieldName + ")) return false;\n");
//            }
//            writer.write("        return true;\n");
//            writer.write("    }\n\n");

            // hashCode 方法
//            writer.write("    @Override\n");
//            writer.write("    public int hashCode() {\n");
//            writer.write("        return Objects.hash(");
//            for (int i = 0; i < fieldList.size(); i++) {
//                writer.write(fieldList.get(i).fieldName);
//                if (i < fieldList.size() - 1) writer.write(", ");
//            }
//            writer.write(");\n");
//            writer.write("    }\n");

            // Builder 方法
//            writer.write("\n");
//            writer.write("    public static Builder builder() {\n");
//            writer.write("        return new Builder();\n");
//            writer.write("    }\n\n");
//
//            writer.write("    public static final class Builder {\n");
//            for (FieldInfo field : fieldList) {
//                writer.write("        private " + field.javaType + " " + field.fieldName + ";\n");
//            }
//            writer.write("\n");

            // Setter 方法
//            for (FieldInfo field : fieldList) {
//                writer.write("        public Builder " + field.fieldName + "(" + field.javaType + " " + field.fieldName + ") {\n");
//                writer.write("            this." + field.fieldName + " = " + field.fieldName + ";\n");
//                writer.write("            return this;\n");
//                writer.write("        }\n\n");
//            }

            // build 方法
//            writer.write("        public " + className + " build() {\n");
//            writer.write("            return new " + className + "(\n");
//            for (int i = 0; i < fieldList.size(); i++) {
//                FieldInfo field = fieldList.get(i);
//                writer.write("                " + field.fieldName);
//                if (i < fieldList.size() - 1) writer.write(",\n");
//                else writer.write("\n");
//            }
//            writer.write("            );\n");
//            writer.write("        }\n");
//            writer.write("    }\n");

            writer.write("}\n");

            System.out.println("  生成: " + className + ".java (" + fieldList.size() + "个字段)");
        }
    }

    /**
     * 转换为帕斯卡命名（类名）
     */
    private static String toPascalCase(String str) {
        if (str == null || str.isEmpty()) return str;

        // 处理数字开头的特殊情况
        if (Character.isDigit(str.charAt(0))) {
            str = "Item" + str;
        }

        // 分割字符串：以下划线、连字符、空格分割，同时识别大小写边界
        List<String> parts = new ArrayList<>();
        StringBuilder currentPart = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            // 分割符：下划线、连字符、空格
            if (c == '_' || c == '-' || Character.isWhitespace(c)) {
                if (!currentPart.isEmpty()) {
                    parts.add(currentPart.toString());
                    currentPart = new StringBuilder();
                }
            }
            // 大小写边界：小写->大写 或 大写->小写+大写（如 "SpawnType" 中的 "awnT"）
            else if (i > 0 && Character.isUpperCase(c)) {
                char prev = str.charAt(i - 1);
                if (Character.isLowerCase(prev) ||
                        (i < str.length() - 1 && Character.isLowerCase(str.charAt(i + 1)))) {
                    if (!currentPart.isEmpty()) {
                        parts.add(currentPart.toString());
                        currentPart = new StringBuilder();
                    }
                }
                currentPart.append(c);
            }
            // 其他字符直接添加
            else {
                currentPart.append(c);
            }
        }

        // 添加最后一部分
        if (!currentPart.isEmpty()) {
            parts.add(currentPart.toString());
        }

        // 如果通过分割符没有分割出部分，尝试按纯大小写边界分割
        if (parts.isEmpty()) {
            parts = splitByCase(str);
        }

        // 构建帕斯卡命名
        StringBuilder result = new StringBuilder();
        for (String part : parts) {
            if (!part.isEmpty()) {
                // 确保每个部分首字母大写，其余小写
                result.append(Character.toUpperCase(part.charAt(0)));
                if (part.length() > 1) {
                    result.append(part.substring(1).toLowerCase());
                }
            }
        }

        return result.toString();
    }

    /**
     * 按大小写边界分割字符串（处理纯大小写混合的情况）
     */
    private static List<String> splitByCase(String str) {
        List<String> parts = new ArrayList<>();
        StringBuilder currentPart = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            // 遇到大写字母且不是第一个字符，且前一个字符是小写
            if (i > 0 && Character.isUpperCase(c) && Character.isLowerCase(str.charAt(i - 1))) {
                if (!currentPart.isEmpty()) {
                    parts.add(currentPart.toString());
                    currentPart = new StringBuilder();
                }
            }
            currentPart.append(c);
        }

        if (!currentPart.isEmpty()) {
            parts.add(currentPart.toString());
        }

        return parts;
    }

    /**
     * 转换为驼峰命名（字段名）
     */
    private static String toCamelCase(String str) {
        if (str == null || str.isEmpty()) return str;

        String pascal = toPascalCase(str);
        // 首字母小写
        return Character.toLowerCase(pascal.charAt(0)) + pascal.substring(1);
    }

    /**
     * 字段信息内部类
     */
    static class FieldInfo {
        String jsonKey;      // JSON中的原始key，如 "ItemNum"
        String fieldName;    // 转换后的字段名，如 "itemNum"
        String javaType;     // Java类型，如 "Integer", "List<Integer>"
    }
}