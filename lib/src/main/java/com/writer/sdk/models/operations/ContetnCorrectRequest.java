package com.writer.sdk.models.operations;

import com.writer.sdk.utils.SpeakeasyMetadata;

public class ContetnCorrectRequest {
    public ContetnCorrectPathParams pathParams;
    public ContetnCorrectRequest withPathParams(ContetnCorrectPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    
    public ContetnCorrectHeaders headers;
    public ContetnCorrectRequest withHeaders(ContetnCorrectHeaders headers) {
        this.headers = headers;
        return this;
    }
    
    @SpeakeasyMetadata("request:mediaType=application/json")
    public com.writer.sdk.models.shared.ContentRequest request;
    public ContetnCorrectRequest withRequest(com.writer.sdk.models.shared.ContentRequest request) {
        this.request = request;
        return this;
    }
    
}
