package com.writer.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum InputTypeEnum {
    TEXTBOX("textbox"),
    TEXTAREA("textarea"),
    DROPDOWN("dropdown");

    @JsonValue
    public final String value;

    private InputTypeEnum(String value) {
        this.value = value;
    }
}
