package com.writer.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class TermExample {
    @JsonProperty("example")
    public String example;
    public TermExample withExample(String example) {
        this.example = example;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    public Long id;
    public TermExample withId(Long id) {
        this.id = id;
        return this;
    }
    
    @JsonProperty("termBankId")
    public Long termBankId;
    public TermExample withTermBankId(Long termBankId) {
        this.termBankId = termBankId;
        return this;
    }
    
    @JsonProperty("termId")
    public Long termId;
    public TermExample withTermId(Long termId) {
        this.termId = termId;
        return this;
    }
    
    @JsonProperty("type")
    public TermExampleTypeEnum type;
    public TermExample withType(TermExampleTypeEnum type) {
        this.type = type;
        return this;
    }
    
}
