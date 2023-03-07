package com.writer.sdk.models.operations;

import java.net.http.HttpResponse;

public class DeleteFileResponse {
    public String contentType;
    public DeleteFileResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public com.writer.sdk.models.shared.FailResponse failResponse;
    public DeleteFileResponse withFailResponse(com.writer.sdk.models.shared.FailResponse failResponse) {
        this.failResponse = failResponse;
        return this;
    }
    
    public java.util.Map<String, String[]> headers;
    public DeleteFileResponse withHeaders(java.util.Map<String, String[]> headers) {
        this.headers = headers;
        return this;
    }
    
    public Integer statusCode;
    public DeleteFileResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public HttpResponse<byte[]> rawResponse;
    public DeleteFileResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public java.util.Map<String, Object> deleteFile200ApplicationJSONObject;
    public DeleteFileResponse withDeleteFile200ApplicationJSONObject(java.util.Map<String, Object> deleteFile200ApplicationJSONObject) {
        this.deleteFile200ApplicationJSONObject = deleteFile200ApplicationJSONObject;
        return this;
    }
    
}
