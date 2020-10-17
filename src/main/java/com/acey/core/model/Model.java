package com.acey.core.model;

import java.util.List;

public interface Model {
    ModelType getType();

    String getName();

    List<FieldMember> getFields();

    List<ConstructorMethodMember> getConstructors();

    List<LocalMethodMember> getMethods();
}
