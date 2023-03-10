package com.writer.sdk.models.operations;

import java.net.http.HttpResponse;

public class FindTermsResponse {
    public String contentType;
    public FindTermsResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public com.writer.sdk.models.shared.FailResponse failResponse;
    public FindTermsResponse withFailResponse(com.writer.sdk.models.shared.FailResponse failResponse) {
        this.failResponse = failResponse;
        return this;
    }
    
    public java.util.Map<String, String[]> headers;
    public FindTermsResponse withHeaders(java.util.Map<String, String[]> headers) {
        this.headers = headers;
        return this;
    }
    
    public com.writer.sdk.models.shared.PaginatedResultFullTermWithUser paginatedResultFullTermWithUser;
    public FindTermsResponse withPaginatedResultFullTermWithUser(com.writer.sdk.models.shared.PaginatedResultFullTermWithUser paginatedResultFullTermWithUser) {
        this.paginatedResultFullTermWithUser = paginatedResultFullTermWithUser;
        return this;
    }
    
    public Integer statusCode;
    public FindTermsResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public HttpResponse<byte[]> rawResponse;
    public FindTermsResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
}
