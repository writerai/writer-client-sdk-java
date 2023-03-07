package com.writer.sdk.models.operations;

import com.writer.sdk.utils.SpeakeasyMetadata;

public class CustomizationCompletionsRequest {
    public CustomizationCompletionsPathParams pathParams;
    public CustomizationCompletionsRequest withPathParams(CustomizationCompletionsPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    
    public CustomizationCompletionsHeaders headers;
    public CustomizationCompletionsRequest withHeaders(CustomizationCompletionsHeaders headers) {
        this.headers = headers;
        return this;
    }
    
    @SpeakeasyMetadata("request:mediaType=application/json")
    public com.writer.sdk.models.shared.CompletionRequest request;
    public CustomizationCompletionsRequest withRequest(com.writer.sdk.models.shared.CompletionRequest request) {
        this.request = request;
        return this;
    }
    
}
