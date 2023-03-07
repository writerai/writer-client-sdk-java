package com.writer.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum TermUpdateTypeEnum {
    APPROVED("approved"),
    BANNED("banned"),
    PENDING("pending");

    @JsonValue
    public final String value;

    private TermUpdateTypeEnum(String value) {
        this.value = value;
    }
}
