package com.nailong.xt.gate.handler;

import org.springframework.stereotype.Component;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

@Component
public class CmdHandlerRegistry {
    private final Map<Integer, HandlerMethod> cmdHandlers = new HashMap<>();

    public void registerHandler(int cmdId, Object handler, Method method) {
        cmdHandlers.put(cmdId, new HandlerMethod(handler, method));
    }

    public HandlerMethod getHandler(int cmdId) {
        return cmdHandlers.get(cmdId);
    }

    public record HandlerMethod(Object handler, Method method) {
    }
}