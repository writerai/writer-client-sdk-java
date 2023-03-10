package com.writer.sdk.models.operations;

import java.net.http.HttpResponse;

public class GenerateContentResponse {
    public String contentType;
    public GenerateContentResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public com.writer.sdk.models.shared.Draft draft;
    public GenerateContentResponse withDraft(com.writer.sdk.models.shared.Draft draft) {
        this.draft = draft;
        return this;
    }
    
    public com.writer.sdk.models.shared.FailResponse failResponse;
    public GenerateContentResponse withFailResponse(com.writer.sdk.models.shared.FailResponse failResponse) {
        this.failResponse = failResponse;
        return this;
    }
    
    public java.util.Map<String, String[]> headers;
    public GenerateContentResponse withHeaders(java.util.Map<String, String[]> headers) {
        this.headers = headers;
        return this;
    }
    
    public Integer statusCode;
    public GenerateContentResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public HttpResponse<byte[]> rawResponse;
    public GenerateContentResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
}
