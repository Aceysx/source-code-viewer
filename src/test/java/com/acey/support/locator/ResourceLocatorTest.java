package com.acey.support.locator;

import com.acey.support.model.Resource;
import com.acey.support.model.ResourceResolverType;
import com.acey.support.exceptions.SystemException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class ResourceLocatorTest {
    private ResourceLocator resourceLocator;

    @Test
    public void should_resolve_when_given_Local_path_if_exist() {
        String path = System.getProperty("user.dir");
        resourceLocator = new LocalPathResourceLocator(path);
        Resource resource = resourceLocator.locate();

        assertEquals(resource.getOriginUrl(), path);
        assertEquals(resource.getResolvePath(), path);
        assertEquals(resource.getResolveType(), ResourceResolverType.LOCAL_PATH);
    }

    @Test
    public void should_failure_when_given_Local_path_if_not_exist() {
        String path = "./path";
        resourceLocator = new LocalPathResourceLocator(path);
        Exception assertThrows = assertThrows(SystemException.class, () -> resourceLocator.locate());
        assertTrue(assertThrows.getMessage().contains("is not exist"));
    }

}