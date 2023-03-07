package com.writer.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CompletionRequest {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("bestOf")
    public Long bestOf;
    public CompletionRequest withBestOf(Long bestOf) {
        this.bestOf = bestOf;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("frequencyPenalty")
    public Double frequencyPenalty;
    public CompletionRequest withFrequencyPenalty(Double frequencyPenalty) {
        this.frequencyPenalty = frequencyPenalty;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("logprobs")
    public Long logprobs;
    public CompletionRequest withLogprobs(Long logprobs) {
        this.logprobs = logprobs;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("maxTokens")
    public Long maxTokens;
    public CompletionRequest withMaxTokens(Long maxTokens) {
        this.maxTokens = maxTokens;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("minTokens")
    public Long minTokens;
    public CompletionRequest withMinTokens(Long minTokens) {
        this.minTokens = minTokens;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("n")
    public Long n;
    public CompletionRequest withN(Long n) {
        this.n = n;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("presencePenalty")
    public Double presencePenalty;
    public CompletionRequest withPresencePenalty(Double presencePenalty) {
        this.presencePenalty = presencePenalty;
        return this;
    }
    
    @JsonProperty("prompt")
    public String prompt;
    public CompletionRequest withPrompt(String prompt) {
        this.prompt = prompt;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("stop")
    public String[] stop;
    public CompletionRequest withStop(String[] stop) {
        this.stop = stop;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("temperature")
    public Double temperature;
    public CompletionRequest withTemperature(Double temperature) {
        this.temperature = temperature;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("topP")
    public Double topP;
    public CompletionRequest withTopP(Double topP) {
        this.topP = topP;
        return this;
    }
    
}
