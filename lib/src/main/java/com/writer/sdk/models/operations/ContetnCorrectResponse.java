package com.writer.sdk.models.operations;

import java.net.http.HttpResponse;

public class ContetnCorrectResponse {
    public String contentType;
    public ContetnCorrectResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public com.writer.sdk.models.shared.CorrectionResponse correctionResponse;
    public ContetnCorrectResponse withCorrectionResponse(com.writer.sdk.models.shared.CorrectionResponse correctionResponse) {
        this.correctionResponse = correctionResponse;
        return this;
    }
    
    public com.writer.sdk.models.shared.FailResponse failResponse;
    public ContetnCorrectResponse withFailResponse(com.writer.sdk.models.shared.FailResponse failResponse) {
        this.failResponse = failResponse;
        return this;
    }
    
    public java.util.Map<String, String[]> headers;
    public ContetnCorrectResponse withHeaders(java.util.Map<String, String[]> headers) {
        this.headers = headers;
        return this;
    }
    
    public Integer statusCode;
    public ContetnCorrectResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public HttpResponse<byte[]> rawResponse;
    public ContetnCorrectResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
}
