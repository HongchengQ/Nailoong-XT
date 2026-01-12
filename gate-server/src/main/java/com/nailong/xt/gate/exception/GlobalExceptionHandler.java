package com.nailong.xt.gate.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler {
    /**
     * gate 处的全局异常只能返回空的未知异常
     *
     * @param ex Exception
     * @return 空的未知异常
     */
    @ExceptionHandler(Exception.class)
    public byte[] handleException(Exception ex) {
        log.error(String.valueOf(ex));
        return new byte[0];
    }
}