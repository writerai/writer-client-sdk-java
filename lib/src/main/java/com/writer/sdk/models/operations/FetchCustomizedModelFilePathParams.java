package com.writer.sdk.models.operations;

import com.writer.sdk.utils.SpeakeasyMetadata;

public class FetchCustomizedModelFilePathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=customizationId")
    public String customizationId;
    public FetchCustomizedModelFilePathParams withCustomizationId(String customizationId) {
        this.customizationId = customizationId;
        return this;
    }
    
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=modelId")
    public String modelId;
    public FetchCustomizedModelFilePathParams withModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }
    
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=organizationId")
    public Long organizationId;
    public FetchCustomizedModelFilePathParams withOrganizationId(Long organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    
}
