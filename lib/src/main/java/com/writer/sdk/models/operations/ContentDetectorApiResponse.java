package com.writer.sdk.models.operations;

import java.net.http.HttpResponse;

public class ContentDetectorApiResponse {
    public com.writer.sdk.models.shared.ContentDetectorResponse[] contentDetectorResponses;
    public ContentDetectorApiResponse withContentDetectorResponses(com.writer.sdk.models.shared.ContentDetectorResponse[] contentDetectorResponses) {
        this.contentDetectorResponses = contentDetectorResponses;
        return this;
    }
    
    public String contentType;
    public ContentDetectorApiResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public com.writer.sdk.models.shared.FailResponse failResponse;
    public ContentDetectorApiResponse withFailResponse(com.writer.sdk.models.shared.FailResponse failResponse) {
        this.failResponse = failResponse;
        return this;
    }
    
    public java.util.Map<String, String[]> headers;
    public ContentDetectorApiResponse withHeaders(java.util.Map<String, String[]> headers) {
        this.headers = headers;
        return this;
    }
    
    public Integer statusCode;
    public ContentDetectorApiResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public HttpResponse<byte[]> rawResponse;
    public ContentDetectorApiResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
}
