package com.writer.sdk.models.operations;

import java.net.http.HttpResponse;

public class ListPagesResponse {
    public String contentType;
    public ListPagesResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public com.writer.sdk.models.shared.FailResponse failResponse;
    public ListPagesResponse withFailResponse(com.writer.sdk.models.shared.FailResponse failResponse) {
        this.failResponse = failResponse;
        return this;
    }
    
    public java.util.Map<String, String[]> headers;
    public ListPagesResponse withHeaders(java.util.Map<String, String[]> headers) {
        this.headers = headers;
        return this;
    }
    
    public com.writer.sdk.models.shared.PaginatedResultPagePublicApiResponse paginatedResultPagePublicApiResponse;
    public ListPagesResponse withPaginatedResultPagePublicApiResponse(com.writer.sdk.models.shared.PaginatedResultPagePublicApiResponse paginatedResultPagePublicApiResponse) {
        this.paginatedResultPagePublicApiResponse = paginatedResultPagePublicApiResponse;
        return this;
    }
    
    public Integer statusCode;
    public ListPagesResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public HttpResponse<byte[]> rawResponse;
    public ListPagesResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
}
