package com.writer.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UsageItem {
    @JsonProperty("limit")
    public Long limit;
    public UsageItem withLimit(Long limit) {
        this.limit = limit;
        return this;
    }
    
    @JsonProperty("value")
    public Long value;
    public UsageItem withValue(Long value) {
        this.value = value;
        return this;
    }
    
}
