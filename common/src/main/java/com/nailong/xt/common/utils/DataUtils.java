package com.nailong.xt.common.utils;

import java.io.File;

public final class DataUtils {
    public static File getDataFile(String fileName) {
        return FileUtilsNL.getUerdirFile("data" + File.separator + "bin" + File.separator + fileName + ".json");
    }
}
