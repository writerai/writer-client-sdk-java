package com.writer.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ApprovedTermExtensionCreate {
    @JsonProperty("capitalize")
    public Boolean capitalize;
    public ApprovedTermExtensionCreate withCapitalize(Boolean capitalize) {
        this.capitalize = capitalize;
        return this;
    }
    
    @JsonProperty("fixCase")
    public Boolean fixCase;
    public ApprovedTermExtensionCreate withFixCase(Boolean fixCase) {
        this.fixCase = fixCase;
        return this;
    }
    
    @JsonProperty("fixCommonMistakes")
    public Boolean fixCommonMistakes;
    public ApprovedTermExtensionCreate withFixCommonMistakes(Boolean fixCommonMistakes) {
        this.fixCommonMistakes = fixCommonMistakes;
        return this;
    }
    
}
