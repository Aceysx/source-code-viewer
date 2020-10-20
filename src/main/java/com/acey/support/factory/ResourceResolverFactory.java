package com.acey.support.factory;

import com.acey.support.ResourceResolverType;
import com.acey.support.resolver.LocalPathResourceResolver;
import com.acey.support.resolver.ResourceResolver;
import io.vavr.API;

import static com.acey.support.ResourceResolverType.LOCAL_PATH;
import static io.vavr.API.$;
import static io.vavr.API.Case;

public class ResourceResolverFactory {

    public static ResourceResolver create(ResourceResolverType type, String resource) {
        return API.Match(type).of(
            Case($(LOCAL_PATH), () -> new LocalPathResourceResolver(resource))
        );
    }
}
