package com.acey.support.locator;

import lombok.Getter;

@Getter
public abstract class AbstractResourceLocator implements ResourceLocator {
    private String origResource;

    public AbstractResourceLocator(String resource) {
        this.origResource = resource;
    }
}
