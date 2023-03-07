package com.writer.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CreateTermsRequest {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("failHandling")
    public CreateTermsRequestFailHandlingEnum failHandling;
    public CreateTermsRequest withFailHandling(CreateTermsRequestFailHandlingEnum failHandling) {
        this.failHandling = failHandling;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("models")
    public TermCreate[] models;
    public CreateTermsRequest withModels(TermCreate[] models) {
        this.models = models;
        return this;
    }
    
}
