package com.writer.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SubscriptionPublicResponseApiProductNameEnum {
    FREE("free"),
    PRO("pro"),
    TEAM("team"),
    ENTERPRISE("enterprise"),
    LEGACY("legacy");

    @JsonValue
    public final String value;

    private SubscriptionPublicResponseApiProductNameEnum(String value) {
        this.value = value;
    }
}
