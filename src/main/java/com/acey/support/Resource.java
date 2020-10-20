package com.acey.support;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Resource {
    private ResourceResolverType resolveType;
    private String originUrl;
    private String resolvePath;
}
