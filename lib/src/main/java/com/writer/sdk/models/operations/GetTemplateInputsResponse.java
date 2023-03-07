package com.writer.sdk.models.operations;

import java.net.http.HttpResponse;

public class GetTemplateInputsResponse {
    public String contentType;
    public GetTemplateInputsResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public com.writer.sdk.models.shared.FailResponse failResponse;
    public GetTemplateInputsResponse withFailResponse(com.writer.sdk.models.shared.FailResponse failResponse) {
        this.failResponse = failResponse;
        return this;
    }
    
    public java.util.Map<String, String[]> headers;
    public GetTemplateInputsResponse withHeaders(java.util.Map<String, String[]> headers) {
        this.headers = headers;
        return this;
    }
    
    public Integer statusCode;
    public GetTemplateInputsResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public HttpResponse<byte[]> rawResponse;
    public GetTemplateInputsResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public com.writer.sdk.models.shared.TemplateDetailsResponse templateDetailsResponse;
    public GetTemplateInputsResponse withTemplateDetailsResponse(com.writer.sdk.models.shared.TemplateDetailsResponse templateDetailsResponse) {
        this.templateDetailsResponse = templateDetailsResponse;
        return this;
    }
    
}
