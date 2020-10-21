package com.acey.core.model;

public abstract class AbstractModelMember implements ModelMember, Modifier {
    protected Integer modifier;
    protected String name;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getModifiers() {
        return java.lang.reflect.Modifier.toString(modifier);
    }
}
