package com.acey.support.resolver;

import com.acey.support.Resource;

import java.util.List;

public class LocalZipResourceResolver extends AbstractResourceResolver {
    public LocalZipResourceResolver(String resource) {
        super(resource);
    }

    @Override
    public List<Resource> load() {
        return null;
    }
}
