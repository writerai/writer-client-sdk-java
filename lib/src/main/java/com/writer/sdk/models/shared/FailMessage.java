package com.writer.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FailMessage {
    @JsonProperty("description")
    public String description;
    public FailMessage withDescription(String description) {
        this.description = description;
        return this;
    }
    
    @JsonProperty("extras")
    public Object extras;
    public FailMessage withExtras(Object extras) {
        this.extras = extras;
        return this;
    }
    
    @JsonProperty("key")
    public String key;
    public FailMessage withKey(String key) {
        this.key = key;
        return this;
    }
    
}
