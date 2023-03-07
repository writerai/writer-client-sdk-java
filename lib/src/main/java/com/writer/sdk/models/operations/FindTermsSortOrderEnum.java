package com.writer.sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonValue;
public enum FindTermsSortOrderEnum {
    ASC("asc"),
    DESC("desc");

    @JsonValue
    public final String value;

    private FindTermsSortOrderEnum(String value) {
        this.value = value;
    }
}
