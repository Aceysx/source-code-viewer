package com.acey.support.loader;

import com.acey.support.model.LoaderModel;
import com.acey.support.model.Resource;
import com.acey.support.model.ResourceResolverType;
import org.junit.jupiter.api.Test;

import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.assertEquals;


class ResolveLoaderTest {

    @Test
    public void should_return_java_files() {
        String path = Paths.get(System.getProperty("user.dir"), "src", "test", "resources", "core").toString();
        Resource resource = new Resource(ResourceResolverType.LOCAL_PATH, path, path);
        LoaderModel loaderModel = new DefaultResolveLoader(resource).load();

        assertEquals(resource, loaderModel.getResource());
        assertEquals(16, loaderModel.getFilterFiles().size());
    }
}