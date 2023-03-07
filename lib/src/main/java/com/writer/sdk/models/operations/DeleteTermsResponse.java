package com.writer.sdk.models.operations;

import java.net.http.HttpResponse;

public class DeleteTermsResponse {
    public String contentType;
    public DeleteTermsResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public com.writer.sdk.models.shared.DeleteResponse deleteResponse;
    public DeleteTermsResponse withDeleteResponse(com.writer.sdk.models.shared.DeleteResponse deleteResponse) {
        this.deleteResponse = deleteResponse;
        return this;
    }
    
    public com.writer.sdk.models.shared.FailResponse failResponse;
    public DeleteTermsResponse withFailResponse(com.writer.sdk.models.shared.FailResponse failResponse) {
        this.failResponse = failResponse;
        return this;
    }
    
    public java.util.Map<String, String[]> headers;
    public DeleteTermsResponse withHeaders(java.util.Map<String, String[]> headers) {
        this.headers = headers;
        return this;
    }
    
    public Integer statusCode;
    public DeleteTermsResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public HttpResponse<byte[]> rawResponse;
    public DeleteTermsResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
}
