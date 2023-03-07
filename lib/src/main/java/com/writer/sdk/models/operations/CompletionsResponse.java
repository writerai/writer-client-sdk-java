package com.writer.sdk.models.operations;

import java.net.http.HttpResponse;

public class CompletionsResponse {
    public com.writer.sdk.models.shared.CompletionResponse completionResponse;
    public CompletionsResponse withCompletionResponse(com.writer.sdk.models.shared.CompletionResponse completionResponse) {
        this.completionResponse = completionResponse;
        return this;
    }
    
    public String contentType;
    public CompletionsResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public com.writer.sdk.models.shared.FailResponse failResponse;
    public CompletionsResponse withFailResponse(com.writer.sdk.models.shared.FailResponse failResponse) {
        this.failResponse = failResponse;
        return this;
    }
    
    public java.util.Map<String, String[]> headers;
    public CompletionsResponse withHeaders(java.util.Map<String, String[]> headers) {
        this.headers = headers;
        return this;
    }
    
    public Integer statusCode;
    public CompletionsResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public HttpResponse<byte[]> rawResponse;
    public CompletionsResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
}
