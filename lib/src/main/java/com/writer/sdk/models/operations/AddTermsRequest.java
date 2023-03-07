package com.writer.sdk.models.operations;

import com.writer.sdk.utils.SpeakeasyMetadata;

public class AddTermsRequest {
    public AddTermsPathParams pathParams;
    public AddTermsRequest withPathParams(AddTermsPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    
    public AddTermsHeaders headers;
    public AddTermsRequest withHeaders(AddTermsHeaders headers) {
        this.headers = headers;
        return this;
    }
    
    @SpeakeasyMetadata("request:mediaType=application/json")
    public com.writer.sdk.models.shared.CreateTermsRequest request;
    public AddTermsRequest withRequest(com.writer.sdk.models.shared.CreateTermsRequest request) {
        this.request = request;
        return this;
    }
    
}
