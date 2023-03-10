package com.writer.sdk.models.operations;

import java.net.http.HttpResponse;

public class UpdateSnippetsResponse {
    public String contentType;
    public UpdateSnippetsResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public com.writer.sdk.models.shared.FailResponse failResponse;
    public UpdateSnippetsResponse withFailResponse(com.writer.sdk.models.shared.FailResponse failResponse) {
        this.failResponse = failResponse;
        return this;
    }
    
    public java.util.Map<String, String[]> headers;
    public UpdateSnippetsResponse withHeaders(java.util.Map<String, String[]> headers) {
        this.headers = headers;
        return this;
    }
    
    public com.writer.sdk.models.shared.SnippetWithUser[] snippetWithUsers;
    public UpdateSnippetsResponse withSnippetWithUsers(com.writer.sdk.models.shared.SnippetWithUser[] snippetWithUsers) {
        this.snippetWithUsers = snippetWithUsers;
        return this;
    }
    
    public Integer statusCode;
    public UpdateSnippetsResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public HttpResponse<byte[]> rawResponse;
    public UpdateSnippetsResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
}
