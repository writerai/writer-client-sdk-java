package com.writer.sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonValue;
public enum ListPagesStatusEnum {
    LIVE("live"),
    OFFLINE("offline");

    @JsonValue
    public final String value;

    private ListPagesStatusEnum(String value) {
        this.value = value;
    }
}
