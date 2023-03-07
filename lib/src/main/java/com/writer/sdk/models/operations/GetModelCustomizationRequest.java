package com.writer.sdk.models.operations;



public class GetModelCustomizationRequest {
    public GetModelCustomizationPathParams pathParams;
    public GetModelCustomizationRequest withPathParams(GetModelCustomizationPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    
    public GetModelCustomizationHeaders headers;
    public GetModelCustomizationRequest withHeaders(GetModelCustomizationHeaders headers) {
        this.headers = headers;
        return this;
    }
    
}
