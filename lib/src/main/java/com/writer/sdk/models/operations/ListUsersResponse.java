package com.writer.sdk.models.operations;

import java.net.http.HttpResponse;

public class ListUsersResponse {
    public String contentType;
    public ListUsersResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public com.writer.sdk.models.shared.FailResponse failResponse;
    public ListUsersResponse withFailResponse(com.writer.sdk.models.shared.FailResponse failResponse) {
        this.failResponse = failResponse;
        return this;
    }
    
    public java.util.Map<String, String[]> headers;
    public ListUsersResponse withHeaders(java.util.Map<String, String[]> headers) {
        this.headers = headers;
        return this;
    }
    
    public com.writer.sdk.models.shared.PaginatedResultUserPublicResponse paginatedResultUserPublicResponse;
    public ListUsersResponse withPaginatedResultUserPublicResponse(com.writer.sdk.models.shared.PaginatedResultUserPublicResponse paginatedResultUserPublicResponse) {
        this.paginatedResultUserPublicResponse = paginatedResultUserPublicResponse;
        return this;
    }
    
    public Integer statusCode;
    public ListUsersResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public HttpResponse<byte[]> rawResponse;
    public ListUsersResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
}
