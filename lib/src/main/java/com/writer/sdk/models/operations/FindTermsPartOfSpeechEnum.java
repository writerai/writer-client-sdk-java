package com.writer.sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonValue;
public enum FindTermsPartOfSpeechEnum {
    NOUN("noun"),
    VERB("verb"),
    ADVERB("adverb"),
    ADJECTIVE("adjective");

    @JsonValue
    public final String value;

    private FindTermsPartOfSpeechEnum(String value) {
        this.value = value;
    }
}
