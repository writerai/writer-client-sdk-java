package com.writer.sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonValue;
public enum FindTermsTypeEnum {
    APPROVED("approved"),
    BANNED("banned"),
    PENDING("pending");

    @JsonValue
    public final String value;

    private FindTermsTypeEnum(String value) {
        this.value = value;
    }
}
