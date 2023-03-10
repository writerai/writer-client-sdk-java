package com.writer.sdk.models.operations;

import java.net.http.HttpResponse;

public class DeleteSnippetsResponse {
    public String contentType;
    public DeleteSnippetsResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public com.writer.sdk.models.shared.DeleteResponse deleteResponse;
    public DeleteSnippetsResponse withDeleteResponse(com.writer.sdk.models.shared.DeleteResponse deleteResponse) {
        this.deleteResponse = deleteResponse;
        return this;
    }
    
    public com.writer.sdk.models.shared.FailResponse failResponse;
    public DeleteSnippetsResponse withFailResponse(com.writer.sdk.models.shared.FailResponse failResponse) {
        this.failResponse = failResponse;
        return this;
    }
    
    public java.util.Map<String, String[]> headers;
    public DeleteSnippetsResponse withHeaders(java.util.Map<String, String[]> headers) {
        this.headers = headers;
        return this;
    }
    
    public Integer statusCode;
    public DeleteSnippetsResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public HttpResponse<byte[]> rawResponse;
    public DeleteSnippetsResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
}
