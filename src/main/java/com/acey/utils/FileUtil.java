package com.acey.utils;

import java.io.File;

public class FileUtil {
    public static boolean isExistAndIsDirectory(String path) {
        File file = new File(path);
        return file.exists() && file.isDirectory();
    }
}
