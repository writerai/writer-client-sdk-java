/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.writer.sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * SortOrder
 */
public enum SortOrder {
    ASC("asc"),
    DESC("desc");

    @JsonValue
    public final String value;

    private SortOrder(String value) {
        this.value = value;
    }
}
