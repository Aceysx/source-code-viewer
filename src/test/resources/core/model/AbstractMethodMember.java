package com.acey.core.model;

import java.util.List;

public abstract class AbstractMethodMember extends AbstractModelMember {
    protected List<FieldMember> fields;


    public List<FieldMember> getFields() {
        return fields;
    }
}
