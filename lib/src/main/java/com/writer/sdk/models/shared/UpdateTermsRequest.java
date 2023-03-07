package com.writer.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class UpdateTermsRequest {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("failHandling")
    public UpdateTermsRequestFailHandlingEnum failHandling;
    public UpdateTermsRequest withFailHandling(UpdateTermsRequestFailHandlingEnum failHandling) {
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
    
}
