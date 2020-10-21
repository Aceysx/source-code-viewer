package com.acey.core.model;

import java.lang.reflect.Modifier;
import java.util.List;

public abstract class AbstractModel implements Model, com.acey.core.model.Modifier {
    protected ModelType type;
    protected Integer modifiers;
    protected String name;
    protected List<FieldMember> fields;
    protected List<ConstructorMethodMember> constructors;
    protected List<LocalMethodMember> methods;

    public AbstractModel(ModelType type) {
        this.type = type;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public List<ConstructorMethodMember> getConstructors() {
        return constructors;
    }

    @Override
    public List<FieldMember> getFields() {
        return fields;
    }

    @Override
    public List<LocalMethodMember> getMethods() {
        return methods;
    }

    @Override
    public ModelType getType() {
        return type;
    }

    @Override
    public String getModifiers() {
        return Modifier.toString(this.modifiers);
    }
}
