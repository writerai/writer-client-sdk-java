package com.writer.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ApprovedTermExtension {
    @JsonProperty("capitalize")
    public Boolean capitalize;
    public ApprovedTermExtension withCapitalize(Boolean capitalize) {
        this.capitalize = capitalize;
        return this;
    }
    
    @JsonProperty("fixCase")
    public Boolean fixCase;
    public ApprovedTermExtension withFixCase(Boolean fixCase) {
        this.fixCase = fixCase;
        return this;
    }
    
    @JsonProperty("fixCommonMistakes")
    public Boolean fixCommonMistakes;
    public ApprovedTermExtension withFixCommonMistakes(Boolean fixCommonMistakes) {
        this.fixCommonMistakes = fixCommonMistakes;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    public Long id;
    public ApprovedTermExtension withId(Long id) {
        this.id = id;
        return this;
    }
    
    @JsonProperty("termId")
    public Long termId;
    public ApprovedTermExtension withTermId(Long termId) {
        this.termId = termId;
        return this;
    }
    
}
