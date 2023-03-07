package com.writer.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CompletionResponse {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("choices")
    public CompletionGenerationChoice[] choices;
    public CompletionResponse withChoices(CompletionGenerationChoice[] choices) {
        this.choices = choices;
        return this;
    }
    
}
