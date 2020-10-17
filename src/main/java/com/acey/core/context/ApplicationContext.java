package com.acey.core.context;

import com.acey.core.Container;
import com.acey.support.Resource;
import com.acey.support.resolver.ResourceResolver;
import io.vavr.control.Option;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApplicationContext {

    public Container get(String key, ResourceResolver resolver, boolean isRefresh) {
        if (isRefresh) {
            return refresh(key, resolver);
        }
        return Option.of(getFromCache(key)).getOrElse(() -> refresh(key, resolver));
    }

    private Container getFromCache(String key) {
        return null;
    }

    private Container getContext() {
        return null;
    }

    private Container refresh(String key, ResourceResolver resolver) {
        if (Option.of(getFromCache(key)).isDefined()) {
            //delete cache
        }
        List<Resource> resources = resolver.load();


        return null;
    }
}
