package com.writer.sdk.models.operations;

import java.net.http.HttpResponse;

public class UploadFileResponse {
    public String contentType;
    public UploadFileResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public com.writer.sdk.models.shared.FailResponse failResponse;
    public UploadFileResponse withFailResponse(com.writer.sdk.models.shared.FailResponse failResponse) {
        this.failResponse = failResponse;
        return this;
    }
    
    public java.util.Map<String, String[]> headers;
    public UploadFileResponse withHeaders(java.util.Map<String, String[]> headers) {
        this.headers = headers;
        return this;
    }
    
    public com.writer.sdk.models.shared.ModelFile modelFile;
    public UploadFileResponse withModelFile(com.writer.sdk.models.shared.ModelFile modelFile) {
        this.modelFile = modelFile;
        return this;
    }
    
    public Integer statusCode;
    public UploadFileResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public HttpResponse<byte[]> rawResponse;
    public UploadFileResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
}
