package com.nailong.xt.common.config;

import com.nailong.xt.common.annotation.CmdIdHandler;
import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.ContextRefreshedEvent;

import java.lang.reflect.Method;

@Configuration
@RequiredArgsConstructor
public class CmdHandlerRegistrar implements ApplicationListener<ContextRefreshedEvent> {

    private final CmdHandlerConfig cmdHandlerConfig;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        // 获取所有Bean实例
        String[] beanNames = event.getApplicationContext().getBeanNamesForType(Object.class);

        for (String beanName : beanNames) {
            Object bean = event.getApplicationContext().getBean(beanName);
            Class<?> clazz = bean.getClass();
            Method[] methods = clazz.getDeclaredMethods();

            for (Method method : methods) {
                if (method.isAnnotationPresent(CmdIdHandler.class)) {
                    CmdIdHandler cmdIdHandler = method.getAnnotation(CmdIdHandler.class);
                    int cmdId = cmdIdHandler.value();
                    cmdHandlerConfig.registerHandler(cmdId, bean, method);
                }
            }
        }
    }
}