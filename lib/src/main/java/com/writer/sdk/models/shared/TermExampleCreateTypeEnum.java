package com.writer.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum TermExampleCreateTypeEnum {
    GOOD("good"),
    BAD("bad");

    @JsonValue
    public final String value;

    private TermExampleCreateTypeEnum(String value) {
        this.value = value;
    }
}
