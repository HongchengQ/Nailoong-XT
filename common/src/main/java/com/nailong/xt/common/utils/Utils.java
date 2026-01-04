package com.nailong.xt.common.utils;

import java.util.Base64;
import java.util.concurrent.ThreadLocalRandom;

public class Utils {
    public static int randomRange(int min, int max) {
        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }

    /**
     * Base64 encodes a given byte array.
     * @param toEncode An array of bytes.
     * @return A base64 encoded string.
     */
    public static String base64Encode(byte[] toEncode) {
        return Base64.getEncoder().encodeToString(toEncode);
    }
}
