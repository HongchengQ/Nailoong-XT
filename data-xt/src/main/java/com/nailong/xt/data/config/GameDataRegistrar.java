package com.nailong.xt.data.config;

import com.nailong.xt.data.annotation.GameDataName;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.ContextRefreshedEvent;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@Configuration
@RequiredArgsConstructor
@Slf4j
public class GameDataRegistrar implements ApplicationListener<ContextRefreshedEvent> {

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        long start = System.currentTimeMillis();
        // 获取所有Bean实例
        String[] beanNames = event.getApplicationContext().getBeanNamesForType(Object.class);

        for (String beanName : beanNames) {
            Object bean = event.getApplicationContext().getBean(beanName);
            Class<?> clazz = bean.getClass();
            Method[] methods = clazz.getDeclaredMethods();

            for (Method method : methods) {
                if (method.isAnnotationPresent(GameDataName.class)) {
                    GameDataName methodAnnotation = method.getAnnotation(GameDataName.class);
                    String gameDataName = methodAnnotation.name();


                    log.info("正在加载 Game Data -> {}", gameDataName);
                    try {
                        method.invoke(bean);
                    } catch (IllegalAccessException | InvocationTargetException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }

        log.info("游戏数据加载完成，耗时{}ms", System.currentTimeMillis() - start);
    }
}