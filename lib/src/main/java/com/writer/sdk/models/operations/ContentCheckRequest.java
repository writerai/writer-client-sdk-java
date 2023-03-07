package com.writer.sdk.models.operations;

import com.writer.sdk.utils.SpeakeasyMetadata;

public class ContentCheckRequest {
    public ContentCheckPathParams pathParams;
    public ContentCheckRequest withPathParams(ContentCheckPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    
    public ContentCheckHeaders headers;
    public ContentCheckRequest withHeaders(ContentCheckHeaders headers) {
        this.headers = headers;
        return this;
    }
    
    @SpeakeasyMetadata("request:mediaType=application/json")
    public com.writer.sdk.models.shared.ContentRequest request;
    public ContentCheckRequest withRequest(com.writer.sdk.models.shared.ContentRequest request) {
        this.request = request;
        return this;
    }
    
}
