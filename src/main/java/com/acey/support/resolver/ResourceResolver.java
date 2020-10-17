package com.acey.support.resolver;

import com.acey.support.Resource;

import java.util.List;

public interface ResourceResolver {
    List<Resource> load();
}
