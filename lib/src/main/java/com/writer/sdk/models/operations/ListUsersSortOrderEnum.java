package com.writer.sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonValue;
public enum ListUsersSortOrderEnum {
    ASC("asc"),
    DESC("desc");

    @JsonValue
    public final String value;

    private ListUsersSortOrderEnum(String value) {
        this.value = value;
    }
}
