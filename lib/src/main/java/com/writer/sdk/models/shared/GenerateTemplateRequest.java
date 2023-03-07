package com.writer.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class GenerateTemplateRequest {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("inputs")
    public MagicRequestInput[] inputs;
    public GenerateTemplateRequest withInputs(MagicRequestInput[] inputs) {
        this.inputs = inputs;
        return this;
    }
    
    @JsonProperty("templateId")
    public String templateId;
    public GenerateTemplateRequest withTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    
}
