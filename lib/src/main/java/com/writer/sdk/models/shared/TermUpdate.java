package com.writer.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class TermUpdate {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("approvedTermExtension")
    public ApprovedTermExtensionCreate approvedTermExtension;
    public TermUpdate withApprovedTermExtension(ApprovedTermExtensionCreate approvedTermExtension) {
        this.approvedTermExtension = approvedTermExtension;
        return this;
    }
    
    @JsonProperty("caseSensitive")
    public Boolean caseSensitive;
    public TermUpdate withCaseSensitive(Boolean caseSensitive) {
        this.caseSensitive = caseSensitive;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("description")
    public String description;
    public TermUpdate withDescription(String description) {
        this.description = description;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("examples")
    public TermExampleCreate[] examples;
    public TermUpdate withExamples(TermExampleCreate[] examples) {
        this.examples = examples;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("highlight")
    public Boolean highlight;
    public TermUpdate withHighlight(Boolean highlight) {
        this.highlight = highlight;
        return this;
    }
    
    @JsonProperty("id")
    public Long id;
    public TermUpdate withId(Long id) {
        this.id = id;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("linkedTerms")
    public LinkedTermCreate[] linkedTerms;
    public TermUpdate withLinkedTerms(LinkedTermCreate[] linkedTerms) {
        this.linkedTerms = linkedTerms;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("mistakes")
    public TermMistakeCreate[] mistakes;
    public TermUpdate withMistakes(TermMistakeCreate[] mistakes) {
        this.mistakes = mistakes;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("pos")
    public TermUpdatePosEnum pos;
    public TermUpdate withPos(TermUpdatePosEnum pos) {
        this.pos = pos;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("tags")
    public TermTagCreate[] tags;
    public TermUpdate withTags(TermTagCreate[] tags) {
        this.tags = tags;
        return this;
    }
    
    @JsonProperty("term")
    public String term;
    public TermUpdate withTerm(String term) {
        this.term = term;
        return this;
    }
    
    @JsonProperty("type")
    public TermUpdateTypeEnum type;
    public TermUpdate withType(TermUpdateTypeEnum type) {
        this.type = type;
        return this;
    }
    
}
