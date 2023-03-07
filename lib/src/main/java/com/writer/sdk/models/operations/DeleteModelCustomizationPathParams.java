package com.writer.sdk.models.operations;

import com.writer.sdk.utils.SpeakeasyMetadata;

public class DeleteModelCustomizationPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=customizationId")
    public String customizationId;
    public DeleteModelCustomizationPathParams withCustomizationId(String customizationId) {
        this.customizationId = customizationId;
        return this;
    }
    
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=modelId")
    public String modelId;
    public DeleteModelCustomizationPathParams withModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }
    
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=organizationId")
    public Long organizationId;
    public DeleteModelCustomizationPathParams withOrganizationId(Long organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    
}
