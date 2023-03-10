package com.writer.sdk.models.operations;

import java.net.http.HttpResponse;

public class FetchCustomizedModelFileResponse {
    public String contentType;
    public FetchCustomizedModelFileResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public com.writer.sdk.models.shared.FailResponse failResponse;
    public FetchCustomizedModelFileResponse withFailResponse(com.writer.sdk.models.shared.FailResponse failResponse) {
        this.failResponse = failResponse;
        return this;
    }
    
    public java.util.Map<String, String[]> headers;
    public FetchCustomizedModelFileResponse withHeaders(java.util.Map<String, String[]> headers) {
        this.headers = headers;
        return this;
    }
    
    public Integer statusCode;
    public FetchCustomizedModelFileResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public HttpResponse<byte[]> rawResponse;
    public FetchCustomizedModelFileResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public byte[] fetchCustomizedModelFile200ApplicationOctetStreamBinaryString;
    public FetchCustomizedModelFileResponse withFetchCustomizedModelFile200ApplicationOctetStreamBinaryString(byte[] fetchCustomizedModelFile200ApplicationOctetStreamBinaryString) {
        this.fetchCustomizedModelFile200ApplicationOctetStreamBinaryString = fetchCustomizedModelFile200ApplicationOctetStreamBinaryString;
        return this;
    }
    
}
