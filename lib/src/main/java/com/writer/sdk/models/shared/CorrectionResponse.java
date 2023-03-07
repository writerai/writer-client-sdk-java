package com.writer.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CorrectionResponse {
    @JsonProperty("correct")
    public String correct;
    public CorrectionResponse withCorrect(String correct) {
        this.correct = correct;
        return this;
    }
    
}
