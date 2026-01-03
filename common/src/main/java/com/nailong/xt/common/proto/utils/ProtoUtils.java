package com.nailong.xt.common.proto.utils;

import com.nailong.xt.common.proto.Packet;
import us.hebi.quickbuf.InvalidProtocolBufferException;

public class ProtoUtils {
    public static Packet decodeMsg(byte[] bytes) throws InvalidProtocolBufferException {
        int offset = 0;

        byte[] data = null;
        int cmdId = 0;

        // todo
        boolean hasKey3 = true;

        // Sanity for malformed packets
        if (bytes.length <= 12) {
            return null;
        }

        // Decrypt message
        if (hasKey3) {
            // todo
//            message = AeadHelper.decrypt(message, sessionKey, encryptMethod);
            offset = 10;
        } else {
//            message = AeadHelper.decryptBasic(message, sessionKey);
//            message = AeadHelper.decryptGCM(message, sessionKey);
        }

        // Get message id
        cmdId = (bytes[offset++] << 8) | (bytes[offset++] & 0xff);

        // Set data
        data = new byte[bytes.length - offset];
        System.arraycopy(bytes, offset, data, 0, data.length);

        return new Packet(cmdId, data);
    }
}
