package com.acey.core.context;

import com.acey.core.Container;
import com.acey.support.resolver.ResourceResolver;
import io.vavr.control.Option;
import org.springframework.stereotype.Service;

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
        //定位

        //加载

        //解析

        //转换

        return null;
    }
}
