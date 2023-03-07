package com.writer.sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonValue;
public enum ListUsersSortFieldEnum {
    ID("id"),
    NAME("name"),
    CREATION_TIME("creationTime"),
    DELETED("deleted"),
    MODIFICATION_TIME("modificationTime"),
    EMAIL("email"),
    LAST_SEEN("lastSeen");

    @JsonValue
    public final String value;

    private ListUsersSortFieldEnum(String value) {
        this.value = value;
    }
}
