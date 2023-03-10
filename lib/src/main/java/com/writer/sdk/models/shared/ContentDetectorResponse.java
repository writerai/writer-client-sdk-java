package com.writer.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ContentDetectorResponse {
    @JsonProperty("label")
    public ContentDetectorResponseLabelEnum label;
    public ContentDetectorResponse withLabel(ContentDetectorResponseLabelEnum label) {
        this.label = label;
        return this;
    }
    
    @JsonProperty("score")
    public Double score;
    public ContentDetectorResponse withScore(Double score) {
        this.score = score;
        return this;
    }
    
}
