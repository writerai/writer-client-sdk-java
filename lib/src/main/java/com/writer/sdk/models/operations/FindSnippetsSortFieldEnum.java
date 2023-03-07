package com.writer.sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonValue;
public enum FindSnippetsSortFieldEnum {
    SHORTCUT("shortcut"),
    CREATION_TIME("creationTime"),
    MODIFICATION_TIME("modificationTime");

    @JsonValue
    public final String value;

    private FindSnippetsSortFieldEnum(String value) {
        this.value = value;
    }
}
