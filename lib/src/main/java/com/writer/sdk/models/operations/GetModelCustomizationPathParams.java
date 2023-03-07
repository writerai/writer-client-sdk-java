package com.writer.sdk.models.operations;

import com.writer.sdk.utils.SpeakeasyMetadata;

public class GetModelCustomizationPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=customizationId")
    public String customizationId;
    public GetModelCustomizationPathParams withCustomizationId(String customizationId) {
        this.customizationId = customizationId;
        return this;
    }
    
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=modelId")
    public String modelId;
    public GetModelCustomizationPathParams withModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }
    
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=organizationId")
    public Long organizationId;
    public GetModelCustomizationPathParams withOrganizationId(Long organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    
}
