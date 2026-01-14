package com.nailong.xt.common.utils;

import java.io.File;

public final class FileUtilsNL {
    public static File getUerdirFile(String path) {
        String fullPath = System.getProperty("user.dir") + File.separator + path;
        return new File(fullPath);
    }
}
