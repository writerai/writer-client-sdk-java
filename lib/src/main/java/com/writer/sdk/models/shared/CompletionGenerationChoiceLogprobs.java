package com.writer.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CompletionGenerationChoiceLogprobs {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("textOffset")
    public Long[] textOffset;
    public CompletionGenerationChoiceLogprobs withTextOffset(Long[] textOffset) {
        this.textOffset = textOffset;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("tokenLogprobs")
    public Double[] tokenLogprobs;
    public CompletionGenerationChoiceLogprobs withTokenLogprobs(Double[] tokenLogprobs) {
        this.tokenLogprobs = tokenLogprobs;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("tokens")
    public String[] tokens;
    public CompletionGenerationChoiceLogprobs withTokens(String[] tokens) {
        this.tokens = tokens;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("topLogprobs")
    public java.util.Map<String, String>[] topLogprobs;
    public CompletionGenerationChoiceLogprobs withTopLogprobs(java.util.Map<String, String>[] topLogprobs) {
        this.topLogprobs = topLogprobs;
        return this;
    }
    
}
