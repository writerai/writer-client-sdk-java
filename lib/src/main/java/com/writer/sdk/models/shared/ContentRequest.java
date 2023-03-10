package com.writer.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ContentRequest {
    @JsonProperty("content")
    public String content;
    public ContentRequest withContent(String content) {
        this.content = content;
        return this;
    }
    
    @JsonProperty("settings")
    public ContentSettings settings;
    public ContentRequest withSettings(ContentSettings settings) {
        this.settings = settings;
        return this;
    }
    
}
