package com.writer.sdk.models.operations;

import java.net.http.HttpResponse;

public class DeleteModelCustomizationResponse {
    public String contentType;
    public DeleteModelCustomizationResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public com.writer.sdk.models.shared.FailResponse failResponse;
    public DeleteModelCustomizationResponse withFailResponse(com.writer.sdk.models.shared.FailResponse failResponse) {
        this.failResponse = failResponse;
        return this;
    }
    
    public java.util.Map<String, String[]> headers;
    public DeleteModelCustomizationResponse withHeaders(java.util.Map<String, String[]> headers) {
        this.headers = headers;
        return this;
    }
    
    public Integer statusCode;
    public DeleteModelCustomizationResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public HttpResponse<byte[]> rawResponse;
    public DeleteModelCustomizationResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public java.util.Map<String, Object> deleteModelCustomization200ApplicationJSONObject;
    public DeleteModelCustomizationResponse withDeleteModelCustomization200ApplicationJSONObject(java.util.Map<String, Object> deleteModelCustomization200ApplicationJSONObject) {
        this.deleteModelCustomization200ApplicationJSONObject = deleteModelCustomization200ApplicationJSONObject;
        return this;
    }
    
}
