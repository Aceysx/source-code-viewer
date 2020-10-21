package com.acey.support.locator;

import com.acey.support.model.Resource;
import com.acey.support.exceptions.SystemException;
import com.acey.utils.FileUtil;
import lombok.Getter;

import static com.acey.support.model.ResourceResolverType.LOCAL_PATH;

@Getter
public class LocalPathResourceLocator extends AbstractResourceLocator {
    public LocalPathResourceLocator(String resource) {
        super(resource);
    }

    @Override
    public Resource locate() {
        if (!FileUtil.isExistAndIsDirectory(this.getOrigResource())) {
            throw new SystemException(
                String.format("%s path is not exist", this.getOrigResource())
            );
        }
        return new Resource(LOCAL_PATH, getOrigResource(), getOrigResource());
    }
}
