/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.writer.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

public enum SubscriptionPublicResponseApiProductName {
    FREE("free"),
    PRO("pro"),
    TEAM("team"),
    ENTERPRISE("enterprise"),
    LEGACY("legacy");

    @JsonValue
    public final String value;

    private SubscriptionPublicResponseApiProductName(String value) {
        this.value = value;
    }
}
