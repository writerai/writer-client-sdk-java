package com.writer.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class TermMistakeCreate {
    @JsonProperty("caseSensitive")
    public Boolean caseSensitive;
    public TermMistakeCreate withCaseSensitive(Boolean caseSensitive) {
        this.caseSensitive = caseSensitive;
        return this;
    }
    
    @JsonProperty("mistake")
    public String mistake;
    public TermMistakeCreate withMistake(String mistake) {
        this.mistake = mistake;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("pos")
    public TermMistakeCreatePosEnum pos;
    public TermMistakeCreate withPos(TermMistakeCreatePosEnum pos) {
        this.pos = pos;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("reference")
    public String reference;
    public TermMistakeCreate withReference(String reference) {
        this.reference = reference;
        return this;
    }
    
}
