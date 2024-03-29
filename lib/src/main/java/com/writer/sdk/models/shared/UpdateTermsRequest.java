/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.writer.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;


public class UpdateTermsRequest {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("failHandling")
    public UpdateTermsRequestFailHandling failHandling;

    public UpdateTermsRequest withFailHandling(UpdateTermsRequestFailHandling failHandling) {
        this.failHandling = failHandling;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("models")
    public TermUpdate[] models;

    public UpdateTermsRequest withModels(TermUpdate[] models) {
        this.models = models;
        return this;
    }
    
    public UpdateTermsRequest(){}
}
