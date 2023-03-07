package com.writer.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class GenerationModelsResponse {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("models")
    public GenerationModelInfoResponse[] models;
    public GenerationModelsResponse withModels(GenerationModelInfoResponse[] models) {
        this.models = models;
        return this;
    }
    
}
