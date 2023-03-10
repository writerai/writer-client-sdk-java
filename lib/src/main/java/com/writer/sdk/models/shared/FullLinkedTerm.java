package com.writer.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class FullLinkedTerm {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("approvedTermExtension")
    public ApprovedTermExtension approvedTermExtension;
    public FullLinkedTerm withApprovedTermExtension(ApprovedTermExtension approvedTermExtension) {
        this.approvedTermExtension = approvedTermExtension;
        return this;
    }
    
    @JsonProperty("caseSensitive")
    public Boolean caseSensitive;
    public FullLinkedTerm withCaseSensitive(Boolean caseSensitive) {
        this.caseSensitive = caseSensitive;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    public Long id;
    public FullLinkedTerm withId(Long id) {
        this.id = id;
        return this;
    }
    
    @JsonProperty("linkedTermId")
    public Long linkedTermId;
    public FullLinkedTerm withLinkedTermId(Long linkedTermId) {
        this.linkedTermId = linkedTermId;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("pos")
    public FullLinkedTermPosEnum pos;
    public FullLinkedTerm withPos(FullLinkedTermPosEnum pos) {
        this.pos = pos;
        return this;
    }
    
    @JsonProperty("term")
    public String term;
    public FullLinkedTerm withTerm(String term) {
        this.term = term;
        return this;
    }
    
    @JsonProperty("termId")
    public Long termId;
    public FullLinkedTerm withTermId(Long termId) {
        this.termId = termId;
        return this;
    }
    
}
