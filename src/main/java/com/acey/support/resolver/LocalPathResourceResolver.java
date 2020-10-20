package com.acey.support.resolver;

import com.acey.support.Resource;
import com.acey.support.exceptions.SystemException;
import com.acey.utils.FileUtil;
import lombok.Getter;

import static com.acey.support.ResourceResolverType.LOCAL_PATH;

@Getter
public class LocalPathResourceResolver extends AbstractResourceResolver {
    public LocalPathResourceResolver(String resource) {
        super(resource);
    }

    @Override
    public Resource resolve() {
        if (!FileUtil.isExistAndIsDirectory(this.getOrigResource())) {
            throw new SystemException(
                String.format("%s path is not exist", this.getOrigResource())
            );
        }
        return new Resource(LOCAL_PATH, getOrigResource(), getOrigResource());
    }
}
