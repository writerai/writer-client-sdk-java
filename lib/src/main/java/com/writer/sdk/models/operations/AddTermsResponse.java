package com.writer.sdk.models.operations;

import java.net.http.HttpResponse;

public class AddTermsResponse {
    public String contentType;
    public AddTermsResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public com.writer.sdk.models.shared.CreateTermsResponse createTermsResponse;
    public AddTermsResponse withCreateTermsResponse(com.writer.sdk.models.shared.CreateTermsResponse createTermsResponse) {
        this.createTermsResponse = createTermsResponse;
        return this;
    }
    
    public com.writer.sdk.models.shared.FailResponse failResponse;
    public AddTermsResponse withFailResponse(com.writer.sdk.models.shared.FailResponse failResponse) {
        this.failResponse = failResponse;
        return this;
    }
    
    public java.util.Map<String, String[]> headers;
    public AddTermsResponse withHeaders(java.util.Map<String, String[]> headers) {
        this.headers = headers;
        return this;
    }
    
    public Integer statusCode;
    public AddTermsResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public HttpResponse<byte[]> rawResponse;
    public AddTermsResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
}
