package com.writer.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TermTagResponse {
    @JsonProperty("id")
    public Long id;
    public TermTagResponse withId(Long id) {
        this.id = id;
        return this;
    }
    
    @JsonProperty("parentTagId")
    public Long parentTagId;
    public TermTagResponse withParentTagId(Long parentTagId) {
        this.parentTagId = parentTagId;
        return this;
    }
    
    @JsonProperty("tag")
    public String tag;
    public TermTagResponse withTag(String tag) {
        this.tag = tag;
        return this;
    }
    
    @JsonProperty("termId")
    public Long termId;
    public TermTagResponse withTermId(Long termId) {
        this.termId = termId;
        return this;
    }
    
}
