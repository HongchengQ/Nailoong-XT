package com.nailong.xt.gate.handler;

import lombok.Getter;

/**
 * Command request context, contains information about the incoming request
 */
@Getter
public class CmdRequestContext {
    private final int cmdId;
    private final byte[] protoData;
    private final long timestamp;

    public CmdRequestContext(int cmdId, byte[] protoData) {
        this.cmdId = cmdId;
        this.protoData = protoData;
        this.timestamp = System.currentTimeMillis();
    }

}