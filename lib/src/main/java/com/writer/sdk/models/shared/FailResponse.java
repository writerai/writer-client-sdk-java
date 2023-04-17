/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.writer.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * FailResponse - Bad Request
 */
public class FailResponse {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("errors")
    public FailMessage[] errors;
    public FailResponse withErrors(FailMessage[] errors) {
        this.errors = errors;
        return this;
    }
    
    @JsonProperty("extras")
    public Object extras;
    public FailResponse withExtras(Object extras) {
        this.extras = extras;
        return this;
    }
    
    @JsonProperty("tpe")
    public String tpe;
    public FailResponse withTpe(String tpe) {
        this.tpe = tpe;
        return this;
    }
    
}