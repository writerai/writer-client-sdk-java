/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.writer.sdk.models.operations;

import java.net.http.HttpResponse;

public class CreateCompletionResponse {
    
    public com.writer.sdk.models.shared.CompletionResponse completionResponse;
    public CreateCompletionResponse withCompletionResponse(com.writer.sdk.models.shared.CompletionResponse completionResponse) {
        this.completionResponse = completionResponse;
        return this;
    }
    
    
    public String contentType;
    public CreateCompletionResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * Bad Request
     */
    
    public com.writer.sdk.models.shared.FailResponse failResponse;
    public CreateCompletionResponse withFailResponse(com.writer.sdk.models.shared.FailResponse failResponse) {
        this.failResponse = failResponse;
        return this;
    }
    
    
    public java.util.Map<String, String[]> headers;
    public CreateCompletionResponse withHeaders(java.util.Map<String, String[]> headers) {
        this.headers = headers;
        return this;
    }
    
    
    public Integer statusCode;
    public CreateCompletionResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;
    public CreateCompletionResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
}