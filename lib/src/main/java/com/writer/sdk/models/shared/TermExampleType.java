/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.writer.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

public enum TermExampleType {
    GOOD("good"),
    BAD("bad");

    @JsonValue
    public final String value;

    private TermExampleType(String value) {
        this.value = value;
    }
}