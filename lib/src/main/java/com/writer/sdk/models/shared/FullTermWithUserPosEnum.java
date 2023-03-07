package com.writer.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum FullTermWithUserPosEnum {
    NOUN("noun"),
    VERB("verb"),
    ADVERB("adverb"),
    ADJECTIVE("adjective");

    @JsonValue
    public final String value;

    private FullTermWithUserPosEnum(String value) {
        this.value = value;
    }
}
