package com.writer.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum ContentDetectorResponseLabelEnum {
    FAKE("fake"),
    REAL("real");

    @JsonValue
    public final String value;

    private ContentDetectorResponseLabelEnum(String value) {
        this.value = value;
    }
}
