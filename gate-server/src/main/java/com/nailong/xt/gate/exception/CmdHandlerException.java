package com.nailong.xt.gate.exception;

public class CmdHandlerException extends Exception {
    private final int cmdId;

    public CmdHandlerException(int cmdId, String message) {
        super("CmdHandler error for cmdId " + cmdId + ": " + message);
        this.cmdId = cmdId;
    }

    public CmdHandlerException(int cmdId, String message, Throwable cause) {
        super("CmdHandler error for cmdId " + cmdId + ": " + message, cause);
        this.cmdId = cmdId;
    }

    public int getCmdId() {
        return cmdId;
    }
}