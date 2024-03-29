/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.writer.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;


public class TermCreate {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("approvedTermExtension")
    public ApprovedTermExtensionCreate approvedTermExtension;

    public TermCreate withApprovedTermExtension(ApprovedTermExtensionCreate approvedTermExtension) {
        this.approvedTermExtension = approvedTermExtension;
        return this;
    }
    
    @JsonProperty("caseSensitive")
    public Boolean caseSensitive;

    public TermCreate withCaseSensitive(Boolean caseSensitive) {
        this.caseSensitive = caseSensitive;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("description")
    public String description;

    public TermCreate withDescription(String description) {
        this.description = description;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("examples")
    public TermExampleCreate[] examples;

    public TermCreate withExamples(TermExampleCreate[] examples) {
        this.examples = examples;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("highlight")
    public Boolean highlight;

    public TermCreate withHighlight(Boolean highlight) {
        this.highlight = highlight;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("linkedTerms")
    public LinkedTermCreate[] linkedTerms;

    public TermCreate withLinkedTerms(LinkedTermCreate[] linkedTerms) {
        this.linkedTerms = linkedTerms;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("mistakes")
    public TermMistakeCreate[] mistakes;

    public TermCreate withMistakes(TermMistakeCreate[] mistakes) {
        this.mistakes = mistakes;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("pos")
    public TermCreatePos pos;

    public TermCreate withPos(TermCreatePos pos) {
        this.pos = pos;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("reference")
    public String reference;

    public TermCreate withReference(String reference) {
        this.reference = reference;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("tags")
    public TermTagCreate[] tags;

    public TermCreate withTags(TermTagCreate[] tags) {
        this.tags = tags;
        return this;
    }
    
    @JsonProperty("term")
    public String term;

    public TermCreate withTerm(String term) {
        this.term = term;
        return this;
    }
    
    @JsonProperty("type")
    public TermCreateType type;

    public TermCreate withType(TermCreateType type) {
        this.type = type;
        return this;
    }
    
    public TermCreate(@JsonProperty("caseSensitive") Boolean caseSensitive, @JsonProperty("term") String term, @JsonProperty("type") TermCreateType type) {
        this.caseSensitive = caseSensitive;
        this.term = term;
        this.type = type;
  }
}
