package com.writer.sdk.models.operations;

import com.writer.sdk.utils.SpeakeasyMetadata;

public class ContentDetectorApiRequest {
    public ContentDetectorApiPathParams pathParams;
    public ContentDetectorApiRequest withPathParams(ContentDetectorApiPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    
    public ContentDetectorApiHeaders headers;
    public ContentDetectorApiRequest withHeaders(ContentDetectorApiHeaders headers) {
        this.headers = headers;
        return this;
    }
    
    @SpeakeasyMetadata("request:mediaType=application/json")
    public com.writer.sdk.models.shared.ContentDetectorRequest request;
    public ContentDetectorApiRequest withRequest(com.writer.sdk.models.shared.ContentDetectorRequest request) {
        this.request = request;
        return this;
    }
    
}
