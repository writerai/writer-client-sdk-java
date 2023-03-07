package com.writer.sdk.models.operations;

import java.net.http.HttpResponse;

public class CustomizationCompletionsResponse {
    public com.writer.sdk.models.shared.CompletionResponse completionResponse;
    public CustomizationCompletionsResponse withCompletionResponse(com.writer.sdk.models.shared.CompletionResponse completionResponse) {
        this.completionResponse = completionResponse;
        return this;
    }
    
    public String contentType;
    public CustomizationCompletionsResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public com.writer.sdk.models.shared.FailResponse failResponse;
    public CustomizationCompletionsResponse withFailResponse(com.writer.sdk.models.shared.FailResponse failResponse) {
        this.failResponse = failResponse;
        return this;
    }
    
    public java.util.Map<String, String[]> headers;
    public CustomizationCompletionsResponse withHeaders(java.util.Map<String, String[]> headers) {
        this.headers = headers;
        return this;
    }
    
    public Integer statusCode;
    public CustomizationCompletionsResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public HttpResponse<byte[]> rawResponse;
    public CustomizationCompletionsResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
}
