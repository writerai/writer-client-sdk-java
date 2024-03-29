/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.writer.sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * QueryParamSortField
 */
public enum QueryParamSortField {
    TERM("term"),
    CREATION_TIME("creationTime"),
    MODIFICATION_TIME("modificationTime"),
    TYPE("type");

    @JsonValue
    public final String value;

    private QueryParamSortField(String value) {
        this.value = value;
    }
}
