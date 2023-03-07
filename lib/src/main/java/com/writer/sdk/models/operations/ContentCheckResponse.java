package com.writer.sdk.models.operations;

import java.net.http.HttpResponse;

public class ContentCheckResponse {
    public String contentType;
    public ContentCheckResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public com.writer.sdk.models.shared.FailResponse failResponse;
    public ContentCheckResponse withFailResponse(com.writer.sdk.models.shared.FailResponse failResponse) {
        this.failResponse = failResponse;
        return this;
    }
    
    public java.util.Map<String, String[]> headers;
    public ContentCheckResponse withHeaders(java.util.Map<String, String[]> headers) {
        this.headers = headers;
        return this;
    }
    
    public com.writer.sdk.models.shared.ProcessedContent processedContent;
    public ContentCheckResponse withProcessedContent(com.writer.sdk.models.shared.ProcessedContent processedContent) {
        this.processedContent = processedContent;
        return this;
    }
    
    public Integer statusCode;
    public ContentCheckResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public HttpResponse<byte[]> rawResponse;
    public ContentCheckResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
}
