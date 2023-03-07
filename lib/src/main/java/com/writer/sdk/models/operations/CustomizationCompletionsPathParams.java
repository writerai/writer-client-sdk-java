package com.writer.sdk.models.operations;

import com.writer.sdk.utils.SpeakeasyMetadata;

public class CustomizationCompletionsPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=customizationId")
    public String customizationId;
    public CustomizationCompletionsPathParams withCustomizationId(String customizationId) {
        this.customizationId = customizationId;
        return this;
    }
    
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=modelId")
    public String modelId;
    public CustomizationCompletionsPathParams withModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }
    
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=organizationId")
    public Long organizationId;
    public CustomizationCompletionsPathParams withOrganizationId(Long organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    
}
