package com.nailong.xt.common.utils;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.Deflater;
import java.util.zip.Inflater;

public class ZLibUtils {

    /**
     * 使用zlib 压缩byte数组
     *
     * @param data 待压缩的字节数组
     * @return 压缩后的字节数组
     * @throws RuntimeException 如果压缩过程中发生错误
     */
    public static byte[] compressZlib(byte[] data) {
        if (data == null || data.length == 0) {
            return data;
        }

        Deflater deflater = new Deflater();
        deflater.setInput(data);
        deflater.finish();

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream(data.length / 2); // 预分配一半空间作为初始容量
        byte[] buffer = new byte[65536]; // 使用64KB缓冲区

        while (!deflater.finished()) {
            int count = deflater.deflate(buffer);
            if (count > 0) { // 只有当有数据输出时才写入
                outputStream.write(buffer, 0, count);
            }
        }

        byte[] compressedData = outputStream.toByteArray();
        deflater.end();

        try {
            outputStream.close();
        } catch (IOException e) {
            // 忽略关闭流的异常
        }

        return compressedData;
    }

    /**
     * 使用zlib 解压缩byte数组
     *
     * @param compressedData 待解压的压缩字节数组
     * @return 解压后的字节数组
     * @throws RuntimeException 如果解压过程中发生错误
     */
    public static byte[] decompressZlib(byte[] compressedData) {
        if (compressedData == null || compressedData.length == 0) {
            return compressedData;
        }

        Inflater inflater = new Inflater();
        inflater.setInput(compressedData);

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream(); // 根据实际解压数据动态扩展
        byte[] buffer = new byte[65536]; // 使用64KB缓冲区

        try {
            int count;
            while (!inflater.finished()) {
                count = inflater.inflate(buffer);
                if (count > 0) { // 只有当有数据输出时才写入
                    outputStream.write(buffer, 0, count);
                }
            }
        } catch (Exception e) {
            throw new RuntimeException("Zlib decompression failed", e);
        } finally {
            inflater.end();
        }

        return outputStream.toByteArray();
    }
}
