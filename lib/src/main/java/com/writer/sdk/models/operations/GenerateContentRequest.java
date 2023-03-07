package com.writer.sdk.models.operations;

import com.writer.sdk.utils.SpeakeasyMetadata;

public class GenerateContentRequest {
    public GenerateContentPathParams pathParams;
    public GenerateContentRequest withPathParams(GenerateContentPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    
    public GenerateContentHeaders headers;
    public GenerateContentRequest withHeaders(GenerateContentHeaders headers) {
        this.headers = headers;
        return this;
    }
    
    @SpeakeasyMetadata("request:mediaType=application/json")
    public com.writer.sdk.models.shared.GenerateTemplateRequest request;
    public GenerateContentRequest withRequest(com.writer.sdk.models.shared.GenerateTemplateRequest request) {
        this.request = request;
        return this;
    }
    
}
