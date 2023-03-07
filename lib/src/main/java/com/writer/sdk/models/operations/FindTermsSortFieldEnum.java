package com.writer.sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonValue;
public enum FindTermsSortFieldEnum {
    TERM("term"),
    CREATION_TIME("creationTime"),
    MODIFICATION_TIME("modificationTime"),
    TYPE("type");

    @JsonValue
    public final String value;

    private FindTermsSortFieldEnum(String value) {
        this.value = value;
    }
}
