/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.writer.sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * ListUsersQueryParamSortOrder
 */
public enum ListUsersQueryParamSortOrder {
    ASC("asc"),
    DESC("desc");

    @JsonValue
    public final String value;

    private ListUsersQueryParamSortOrder(String value) {
        this.value = value;
    }
}
