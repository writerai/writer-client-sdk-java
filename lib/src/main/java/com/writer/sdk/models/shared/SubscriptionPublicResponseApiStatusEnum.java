package com.writer.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SubscriptionPublicResponseApiStatusEnum {
    TRIALING("trialing"),
    ACTIVE("active"),
    PAST_DUE("past_due"),
    INCOMPLETE("incomplete"),
    INCOMPLETE_EXPIRED("incomplete_expired"),
    UNPAID("unpaid"),
    CANCELED("canceled");

    @JsonValue
    public final String value;

    private SubscriptionPublicResponseApiStatusEnum(String value) {
        this.value = value;
    }
}
