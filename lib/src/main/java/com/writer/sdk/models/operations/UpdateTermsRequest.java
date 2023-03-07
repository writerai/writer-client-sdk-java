package com.writer.sdk.models.operations;

import com.writer.sdk.utils.SpeakeasyMetadata;

public class UpdateTermsRequest {
    public UpdateTermsPathParams pathParams;
    public UpdateTermsRequest withPathParams(UpdateTermsPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    
    public UpdateTermsHeaders headers;
    public UpdateTermsRequest withHeaders(UpdateTermsHeaders headers) {
        this.headers = headers;
        return this;
    }
    
    @SpeakeasyMetadata("request:mediaType=application/json")
    public com.writer.sdk.models.shared.UpdateTermsRequest request;
    public UpdateTermsRequest withRequest(com.writer.sdk.models.shared.UpdateTermsRequest request) {
        this.request = request;
        return this;
    }
    
}
