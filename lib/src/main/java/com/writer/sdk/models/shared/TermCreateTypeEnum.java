package com.writer.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum TermCreateTypeEnum {
    APPROVED("approved"),
    BANNED("banned"),
    PENDING("pending");

    @JsonValue
    public final String value;

    private TermCreateTypeEnum(String value) {
        this.value = value;
    }
}
