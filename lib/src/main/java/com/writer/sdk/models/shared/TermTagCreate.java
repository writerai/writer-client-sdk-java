package com.writer.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TermTagCreate {
    @JsonProperty("tag")
    public String tag;
    public TermTagCreate withTag(String tag) {
        this.tag = tag;
        return this;
    }
    
}
