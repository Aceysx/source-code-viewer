package com.acey.support.resolver;

import lombok.Getter;

@Getter
public abstract class AbstractResourceResolver implements ResourceResolver {
    private String origResource;

    public AbstractResourceResolver(String resource) {
        this.origResource = resource;
    }
}
