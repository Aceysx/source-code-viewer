package com.acey.support.factory;

import com.acey.support.ResourceResolverType;
import com.acey.support.resolver.LocalZipResourceResolver;
import com.acey.support.resolver.ResourceResolver;
import io.vavr.API;

import static com.acey.support.ResourceResolverType.ZIP_FILE;
import static io.vavr.API.$;
import static io.vavr.API.Case;

public class ResourceResolverFactory {

    public ResourceResolver create(ResourceResolverType type, String resource) {
        return API.Match(type).of(
            Case($(ZIP_FILE), () -> new LocalZipResourceResolver(resource))
        );
    }
}
