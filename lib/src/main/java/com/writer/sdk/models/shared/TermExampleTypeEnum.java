package com.writer.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum TermExampleTypeEnum {
    GOOD("good"),
    BAD("bad");

    @JsonValue
    public final String value;

    private TermExampleTypeEnum(String value) {
        this.value = value;
    }
}
