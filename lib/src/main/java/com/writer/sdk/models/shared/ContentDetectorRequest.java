package com.writer.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ContentDetectorRequest {
    @JsonProperty("input")
    public String input;
    public ContentDetectorRequest withInput(String input) {
        this.input = input;
        return this;
    }
    
}
