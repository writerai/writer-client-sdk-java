package com.writer.sdk.models.operations;

import java.net.http.HttpResponse;

public class CustomizationsResponse {
    public String contentType;
    public CustomizationsResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public com.writer.sdk.models.shared.CustomizationsResponse customizationsResponse;
    public CustomizationsResponse withCustomizationsResponse(com.writer.sdk.models.shared.CustomizationsResponse customizationsResponse) {
        this.customizationsResponse = customizationsResponse;
        return this;
    }
    
    public com.writer.sdk.models.shared.FailResponse failResponse;
    public CustomizationsResponse withFailResponse(com.writer.sdk.models.shared.FailResponse failResponse) {
        this.failResponse = failResponse;
        return this;
    }
    
    public java.util.Map<String, String[]> headers;
    public CustomizationsResponse withHeaders(java.util.Map<String, String[]> headers) {
        this.headers = headers;
        return this;
    }
    
    public Integer statusCode;
    public CustomizationsResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public HttpResponse<byte[]> rawResponse;
    public CustomizationsResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
}
