/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.writer.sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Status
 */
public enum Status {
    LIVE("live"),
    OFFLINE("offline");

    @JsonValue
    public final String value;

    private Status(String value) {
        this.value = value;
    }
}
