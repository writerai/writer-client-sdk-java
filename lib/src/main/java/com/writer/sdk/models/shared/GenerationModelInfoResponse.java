package com.writer.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GenerationModelInfoResponse {
    @JsonProperty("id")
    public String id;
    public GenerationModelInfoResponse withId(String id) {
        this.id = id;
        return this;
    }
    
    @JsonProperty("name")
    public String name;
    public GenerationModelInfoResponse withName(String name) {
        this.name = name;
        return this;
    }
    
    @JsonProperty("type")
    public GenerationModelInfoResponseTypeEnum type;
    public GenerationModelInfoResponse withType(GenerationModelInfoResponseTypeEnum type) {
        this.type = type;
        return this;
    }
    
}
