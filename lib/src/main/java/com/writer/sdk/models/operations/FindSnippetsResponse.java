package com.writer.sdk.models.operations;

import java.net.http.HttpResponse;

public class FindSnippetsResponse {
    public String contentType;
    public FindSnippetsResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public com.writer.sdk.models.shared.FailResponse failResponse;
    public FindSnippetsResponse withFailResponse(com.writer.sdk.models.shared.FailResponse failResponse) {
        this.failResponse = failResponse;
        return this;
    }
    
    public java.util.Map<String, String[]> headers;
    public FindSnippetsResponse withHeaders(java.util.Map<String, String[]> headers) {
        this.headers = headers;
        return this;
    }
    
    public com.writer.sdk.models.shared.PaginatedResultSnippetWithUser paginatedResultSnippetWithUser;
    public FindSnippetsResponse withPaginatedResultSnippetWithUser(com.writer.sdk.models.shared.PaginatedResultSnippetWithUser paginatedResultSnippetWithUser) {
        this.paginatedResultSnippetWithUser = paginatedResultSnippetWithUser;
        return this;
    }
    
    public Integer statusCode;
    public FindSnippetsResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public HttpResponse<byte[]> rawResponse;
    public FindSnippetsResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
}
