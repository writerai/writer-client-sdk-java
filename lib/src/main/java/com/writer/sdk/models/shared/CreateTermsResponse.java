package com.writer.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CreateTermsResponse {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("fails")
    public FailMessage[] fails;
    public CreateTermsResponse withFails(FailMessage[] fails) {
        this.fails = fails;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("models")
    public FullTermWithUser[] models;
    public CreateTermsResponse withModels(FullTermWithUser[] models) {
        this.models = models;
        return this;
    }
    
}
