package com.writer.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum PageWithSectionResponseStatusEnum {
    LIVE("live"),
    OFFLINE("offline");

    @JsonValue
    public final String value;

    private PageWithSectionResponseStatusEnum(String value) {
        this.value = value;
    }
}
