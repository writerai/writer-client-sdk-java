package com.writer.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum UserPublicResponseAccountStatusEnum {
    INVITED("invited"),
    SIGNED_UP("signed_up");

    @JsonValue
    public final String value;

    private UserPublicResponseAccountStatusEnum(String value) {
        this.value = value;
    }
}
