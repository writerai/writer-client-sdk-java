package com.writer.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum UpdateTermsRequestFailHandlingEnum {
    ACCUMULATE("accumulate"),
    VALIDATE("validate"),
    SKIP("skip"),
    VALIDATE_ONLY("validateOnly");

    @JsonValue
    public final String value;

    private UpdateTermsRequestFailHandlingEnum(String value) {
        this.value = value;
    }
}
