package com.writer.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TermExampleCreate {
    @JsonProperty("example")
    public String example;
    public TermExampleCreate withExample(String example) {
        this.example = example;
        return this;
    }
    
    @JsonProperty("type")
    public TermExampleCreateTypeEnum type;
    public TermExampleCreate withType(TermExampleCreateTypeEnum type) {
        this.type = type;
        return this;
    }
    
}
