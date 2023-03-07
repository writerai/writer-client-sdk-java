package com.writer.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum PagePublicApiResponseStatusEnum {
    LIVE("live"),
    OFFLINE("offline");

    @JsonValue
    public final String value;

    private PagePublicApiResponseStatusEnum(String value) {
        this.value = value;
    }
}
