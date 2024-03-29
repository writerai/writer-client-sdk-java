/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.writer.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Pagination {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("limit")
    public Long limit;

    public Pagination withLimit(Long limit) {
        this.limit = limit;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("offset")
    public Long offset;

    public Pagination withOffset(Long offset) {
        this.offset = offset;
        return this;
    }
    
    public Pagination(){}
}
