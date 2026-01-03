package com.nailong.xt.gate.exception;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(CmdHandlerException.class)
    public Map<String, Object> handleCmdHandlerException(CmdHandlerException ex) {
        Map<String, Object> response = new HashMap<>();
        response.put("error", "CMD_HANDLER_ERROR");
        response.put("cmdId", ex.getCmdId());
        response.put("message", ex.getMessage());
        response.put("timestamp", System.currentTimeMillis());
        return response;
    }

    @ExceptionHandler(IllegalArgumentException.class)
    public Map<String, Object> handleIllegalArgumentException(IllegalArgumentException ex) {
        Map<String, Object> response = new HashMap<>();
        response.put("error", "ILLEGAL_ARGUMENT");
        response.put("message", ex.getMessage());
        response.put("timestamp", System.currentTimeMillis());
        return response;
    }
}