package com.writer.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum GenerationModelInfoResponseTypeEnum {
    GPT("GPT"),
    INSTRUCT("Instruct");

    @JsonValue
    public final String value;

    private GenerationModelInfoResponseTypeEnum(String value) {
        this.value = value;
    }
}
