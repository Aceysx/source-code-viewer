package com.acey.support.loader;

import com.acey.support.model.LoaderModel;
import com.acey.support.model.Resource;
import com.acey.utils.FileUtil;

import java.io.File;
import java.util.List;
import java.util.function.Predicate;

public class DefaultResolveLoader {
    private Resource resource;

    public DefaultResolveLoader(Resource resource) {
        this.resource = resource;
    }

    public LoaderModel load() {
        Predicate<File> fileFilter = (file) -> file.isFile() && file.getName().endsWith(".java");
        List<String> paths = FileUtil.deepFiles(this.resource.getResolvePath(), fileFilter);
        return new LoaderModel(resource, paths);
    }

}
