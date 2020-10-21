package com.acey.support.factory;

import com.acey.support.model.ResourceResolverType;
import com.acey.support.locator.LocalPathResourceLocator;
import com.acey.support.locator.ResourceLocator;
import io.vavr.API;

import static com.acey.support.model.ResourceResolverType.LOCAL_PATH;
import static io.vavr.API.$;
import static io.vavr.API.Case;

public class ResourceResolverFactory {

    public static ResourceLocator create(ResourceResolverType type, String resource) {
        return API.Match(type).of(
            Case($(LOCAL_PATH), () -> new LocalPathResourceLocator(resource))
        );
    }
}
