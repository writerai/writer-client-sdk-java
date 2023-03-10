package com.writer.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class TermMistake {
    @JsonProperty("caseSensitive")
    public Boolean caseSensitive;
    public TermMistake withCaseSensitive(Boolean caseSensitive) {
        this.caseSensitive = caseSensitive;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    public Long id;
    public TermMistake withId(Long id) {
        this.id = id;
        return this;
    }
    
    @JsonProperty("mistake")
    public String mistake;
    public TermMistake withMistake(String mistake) {
        this.mistake = mistake;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("pos")
    public TermMistakePosEnum pos;
    public TermMistake withPos(TermMistakePosEnum pos) {
        this.pos = pos;
        return this;
    }
    
    @JsonProperty("termBankId")
    public Long termBankId;
    public TermMistake withTermBankId(Long termBankId) {
        this.termBankId = termBankId;
        return this;
    }
    
    @JsonProperty("termId")
    public Long termId;
    public TermMistake withTermId(Long termId) {
        this.termId = termId;
        return this;
    }
    
}
