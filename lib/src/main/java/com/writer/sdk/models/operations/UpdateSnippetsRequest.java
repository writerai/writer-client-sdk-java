package com.writer.sdk.models.operations;

import com.writer.sdk.utils.SpeakeasyMetadata;

public class UpdateSnippetsRequest {
    public UpdateSnippetsPathParams pathParams;
    public UpdateSnippetsRequest withPathParams(UpdateSnippetsPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    
    public UpdateSnippetsHeaders headers;
    public UpdateSnippetsRequest withHeaders(UpdateSnippetsHeaders headers) {
        this.headers = headers;
        return this;
    }
    
    @SpeakeasyMetadata("request:mediaType=application/json")
    public com.writer.sdk.models.shared.SnippetUpdate[] request;
    public UpdateSnippetsRequest withRequest(com.writer.sdk.models.shared.SnippetUpdate[] request) {
        this.request = request;
        return this;
    }
    
}
