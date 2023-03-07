package com.writer.sdk.models.operations;

import java.net.http.HttpResponse;

public class UpdateTermsResponse {
    public String contentType;
    public UpdateTermsResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public com.writer.sdk.models.shared.CreateTermsResponse createTermsResponse;
    public UpdateTermsResponse withCreateTermsResponse(com.writer.sdk.models.shared.CreateTermsResponse createTermsResponse) {
        this.createTermsResponse = createTermsResponse;
        return this;
    }
    
    public com.writer.sdk.models.shared.FailResponse failResponse;
    public UpdateTermsResponse withFailResponse(com.writer.sdk.models.shared.FailResponse failResponse) {
        this.failResponse = failResponse;
        return this;
    }
    
    public java.util.Map<String, String[]> headers;
    public UpdateTermsResponse withHeaders(java.util.Map<String, String[]> headers) {
        this.headers = headers;
        return this;
    }
    
    public Integer statusCode;
    public UpdateTermsResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public HttpResponse<byte[]> rawResponse;
    public UpdateTermsResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
}
