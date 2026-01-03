package com.nailong.xt.gate.config;

import com.nailong.xt.gate.annotation.CmdHandler;
import com.nailong.xt.gate.handler.CmdHandlerRegistry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

@Component
public class CmdHandlerRegistrar implements ApplicationListener<ContextRefreshedEvent> {

    @Autowired
    private CmdHandlerRegistry cmdHandlerRegistry;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        // 获取所有Bean实例
        String[] beanNames = event.getApplicationContext().getBeanNamesForType(Object.class);
        
        for (String beanName : beanNames) {
            Object bean = event.getApplicationContext().getBean(beanName);
            Class<?> clazz = bean.getClass();
            Method[] methods = clazz.getDeclaredMethods();
            
            for (Method method : methods) {
                if (method.isAnnotationPresent(CmdHandler.class)) {
                    CmdHandler cmdHandler = method.getAnnotation(CmdHandler.class);
                    int cmdId = cmdHandler.value();
                    cmdHandlerRegistry.registerHandler(cmdId, bean, method);
                }
            }
        }
    }
}