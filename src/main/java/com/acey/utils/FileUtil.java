package com.acey.utils;

import com.acey.support.exceptions.SystemException;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FileUtil {
    public static boolean isExistAndIsDirectory(String path) {
        File file = new File(path);
        return file.exists() && file.isDirectory();
    }

    public static List<String> deepFiles(String path, Predicate<File> fileFilter) {
        List<File> result = new ArrayList<>();
        File file = new File(path);
        if (!file.exists()) {
            throw new SystemException("%s path is not exist or is not a directory");
        }
        if (file.isFile()) {
            return Collections.singletonList(file.getPath());
        }
        scanSubFiles(file, fileFilter, result);
        return result
            .stream().map(File::getPath)
            .collect(Collectors.toList());
    }

    public static void scanSubFiles(File file, Predicate<File> fileFilter, List<File> result) {
        File[] listFiles = file.listFiles();
        for (File f : listFiles) {
            if (f.isDirectory()) {
                scanSubFiles(f, fileFilter, result);
            }
            if (fileFilter.test(f)) {
                result.add(f);
            }
        }
    }
}
