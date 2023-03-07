package com.writer.sdk.models.operations;

import java.net.http.HttpResponse;

public class ModelsResponse {
    public String contentType;
    public ModelsResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public com.writer.sdk.models.shared.FailResponse failResponse;
    public ModelsResponse withFailResponse(com.writer.sdk.models.shared.FailResponse failResponse) {
        this.failResponse = failResponse;
        return this;
    }
    
    public com.writer.sdk.models.shared.GenerationModelsResponse generationModelsResponse;
    public ModelsResponse withGenerationModelsResponse(com.writer.sdk.models.shared.GenerationModelsResponse generationModelsResponse) {
        this.generationModelsResponse = generationModelsResponse;
        return this;
    }
    
    public java.util.Map<String, String[]> headers;
    public ModelsResponse withHeaders(java.util.Map<String, String[]> headers) {
        this.headers = headers;
        return this;
    }
    
    public Integer statusCode;
    public ModelsResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public HttpResponse<byte[]> rawResponse;
    public ModelsResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
}
