package com.writer.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

public class HyperParameters {
    @JsonProperty("numVirtualTokens")
    public Long numVirtualTokens;
    public HyperParameters withNumVirtualTokens(Long numVirtualTokens) {
        this.numVirtualTokens = numVirtualTokens;
        return this;
    }
    
}
