package com.writer.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum FullLinkedTermPosEnum {
    NOUN("noun"),
    VERB("verb"),
    ADVERB("adverb"),
    ADJECTIVE("adjective");

    @JsonValue
    public final String value;

    private FullLinkedTermPosEnum(String value) {
        this.value = value;
    }
}
