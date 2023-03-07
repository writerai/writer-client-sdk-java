package com.writer.sdk.models.operations;

import com.writer.sdk.utils.SpeakeasyMetadata;

public class CompletionsRequest {
    public CompletionsPathParams pathParams;
    public CompletionsRequest withPathParams(CompletionsPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    
    public CompletionsHeaders headers;
    public CompletionsRequest withHeaders(CompletionsHeaders headers) {
        this.headers = headers;
        return this;
    }
    
    @SpeakeasyMetadata("request:mediaType=application/json")
    public com.writer.sdk.models.shared.CompletionRequest request;
    public CompletionsRequest withRequest(com.writer.sdk.models.shared.CompletionRequest request) {
        this.request = request;
        return this;
    }
    
}
