package com.writer.sdk.models.operations;

import java.net.http.HttpResponse;

public class GetFileResponse {
    public String contentType;
    public GetFileResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public com.writer.sdk.models.shared.FailResponse failResponse;
    public GetFileResponse withFailResponse(com.writer.sdk.models.shared.FailResponse failResponse) {
        this.failResponse = failResponse;
        return this;
    }
    
    public java.util.Map<String, String[]> headers;
    public GetFileResponse withHeaders(java.util.Map<String, String[]> headers) {
        this.headers = headers;
        return this;
    }
    
    public com.writer.sdk.models.shared.ModelFile modelFile;
    public GetFileResponse withModelFile(com.writer.sdk.models.shared.ModelFile modelFile) {
        this.modelFile = modelFile;
        return this;
    }
    
    public Integer statusCode;
    public GetFileResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public HttpResponse<byte[]> rawResponse;
    public GetFileResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
}
