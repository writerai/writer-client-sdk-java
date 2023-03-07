package com.writer.sdk.models.operations;

import java.net.http.HttpResponse;

public class FilesResponse {
    public String contentType;
    public FilesResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public com.writer.sdk.models.shared.FailResponse failResponse;
    public FilesResponse withFailResponse(com.writer.sdk.models.shared.FailResponse failResponse) {
        this.failResponse = failResponse;
        return this;
    }
    
    public java.util.Map<String, String[]> headers;
    public FilesResponse withHeaders(java.util.Map<String, String[]> headers) {
        this.headers = headers;
        return this;
    }
    
    public com.writer.sdk.models.shared.ModelFilesResponse modelFilesResponse;
    public FilesResponse withModelFilesResponse(com.writer.sdk.models.shared.ModelFilesResponse modelFilesResponse) {
        this.modelFilesResponse = modelFilesResponse;
        return this;
    }
    
    public Integer statusCode;
    public FilesResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public HttpResponse<byte[]> rawResponse;
    public FilesResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
}
