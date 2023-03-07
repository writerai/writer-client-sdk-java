package com.writer.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum FullTermWithUserTypeEnum {
    APPROVED("approved"),
    BANNED("banned"),
    PENDING("pending");

    @JsonValue
    public final String value;

    private FullTermWithUserTypeEnum(String value) {
        this.value = value;
    }
}
