/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.writer.sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Type
 */
public enum Type {
    APPROVED("approved"),
    BANNED("banned"),
    PENDING("pending");

    @JsonValue
    public final String value;

    private Type(String value) {
        this.value = value;
    }
}
