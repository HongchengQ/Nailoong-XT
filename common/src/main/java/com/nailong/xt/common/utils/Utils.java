package com.nailong.xt.common.utils;

import java.util.Base64;
import java.util.concurrent.ThreadLocalRandom;

public final class Utils {
    private static final char[] HEX_ARRAY = "0123456789abcdef".toCharArray();

    public static int randomRange(int min, int max) {
        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }

    /**
     * Base64 encodes a given byte array.
     *
     * @param toEncode An array of bytes.
     * @return A base64 encoded string.
     */
    public static String base64Encode(byte[] toEncode) {
        return Base64.getEncoder().encodeToString(toEncode);
    }

    /**
     * @return 当前服务器时间（秒数）
     */
    public static long getCurrentServerTime() {
        return System.currentTimeMillis() / 1000;
    }

    public static String bytesToHex(byte[] bytes) {
        return bytesToHex(bytes, 0);
    }

    public static String bytesToHex(byte[] bytes, int offset) {
        if (bytes == null || (bytes.length - offset) <= 0) return "";
        char[] hexChars = new char[(bytes.length - offset) * 2];
        for (int j = offset; j < bytes.length; j++) {
            int v = bytes[j] & 0xFF;
            int h = j - offset;
            hexChars[h * 2] = HEX_ARRAY[v >>> 4];
            hexChars[h * 2 + 1] = HEX_ARRAY[v & 0x0F];
        }
        return new String(hexChars);
    }
}
