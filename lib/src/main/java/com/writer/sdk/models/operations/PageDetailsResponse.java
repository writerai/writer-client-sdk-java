package com.writer.sdk.models.operations;

import java.net.http.HttpResponse;

public class PageDetailsResponse {
    public String contentType;
    public PageDetailsResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public com.writer.sdk.models.shared.FailResponse failResponse;
    public PageDetailsResponse withFailResponse(com.writer.sdk.models.shared.FailResponse failResponse) {
        this.failResponse = failResponse;
        return this;
    }
    
    public java.util.Map<String, String[]> headers;
    public PageDetailsResponse withHeaders(java.util.Map<String, String[]> headers) {
        this.headers = headers;
        return this;
    }
    
    public com.writer.sdk.models.shared.PageWithSectionResponse pageWithSectionResponse;
    public PageDetailsResponse withPageWithSectionResponse(com.writer.sdk.models.shared.PageWithSectionResponse pageWithSectionResponse) {
        this.pageWithSectionResponse = pageWithSectionResponse;
        return this;
    }
    
    public Integer statusCode;
    public PageDetailsResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public HttpResponse<byte[]> rawResponse;
    public PageDetailsResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
}
