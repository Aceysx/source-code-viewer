package com.acey.support.resolver;

import com.acey.support.Resource;
import com.acey.support.ResourceResolverType;
import com.acey.support.exceptions.SystemException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class ResourceResolverTest {
    private ResourceResolver resourceResolver;

    @Test
    public void should_resolve_when_given_Local_path_if_exist() {
        String path = System.getProperty("user.dir");
        resourceResolver = new LocalPathResourceResolver(path);
        Resource resource = resourceResolver.resolve();

        assertEquals(resource.getOriginUrl(), path);
        assertEquals(resource.getResolvePath(), path);
        assertEquals(resource.getResolveType(), ResourceResolverType.LOCAL_PATH);
    }

    @Test
    public void should_failure_when_given_Local_path_if_not_exist() {
        String path = "./path";
        resourceResolver = new LocalPathResourceResolver(path);
        Exception assertThrows = assertThrows(SystemException.class, () -> resourceResolver.resolve());
        assertTrue(assertThrows.getMessage().contains("is not exist"));
    }

}