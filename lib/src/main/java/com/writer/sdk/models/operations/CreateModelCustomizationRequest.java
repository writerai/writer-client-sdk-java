package com.writer.sdk.models.operations;

import com.writer.sdk.utils.SpeakeasyMetadata;

public class CreateModelCustomizationRequest {
    public CreateModelCustomizationPathParams pathParams;
    public CreateModelCustomizationRequest withPathParams(CreateModelCustomizationPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    
    public CreateModelCustomizationHeaders headers;
    public CreateModelCustomizationRequest withHeaders(CreateModelCustomizationHeaders headers) {
        this.headers = headers;
        return this;
    }
    
    @SpeakeasyMetadata("request:mediaType=application/json")
    public com.writer.sdk.models.shared.CreateCustomizationRequest request;
    public CreateModelCustomizationRequest withRequest(com.writer.sdk.models.shared.CreateCustomizationRequest request) {
        this.request = request;
        return this;
    }
    
}
