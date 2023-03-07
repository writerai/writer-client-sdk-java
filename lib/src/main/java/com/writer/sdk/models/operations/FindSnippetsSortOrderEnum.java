package com.writer.sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonValue;
public enum FindSnippetsSortOrderEnum {
    ASC("asc"),
    DESC("desc");

    @JsonValue
    public final String value;

    private FindSnippetsSortOrderEnum(String value) {
        this.value = value;
    }
}
