/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.writer.sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;

public class DetectContentResponse {
    
    public com.writer.sdk.models.shared.ContentDetectorResponse[] contentDetectorResponses;
    public DetectContentResponse withContentDetectorResponses(com.writer.sdk.models.shared.ContentDetectorResponse[] contentDetectorResponses) {
        this.contentDetectorResponses = contentDetectorResponses;
        return this;
    }
    
    
    public String contentType;
    public DetectContentResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * Bad Request
     */
    
    public com.writer.sdk.models.shared.FailResponse failResponse;
    public DetectContentResponse withFailResponse(com.writer.sdk.models.shared.FailResponse failResponse) {
        this.failResponse = failResponse;
        return this;
    }
    
    
    public java.util.Map<String, String[]> headers;
    public DetectContentResponse withHeaders(java.util.Map<String, String[]> headers) {
        this.headers = headers;
        return this;
    }
    
    
    public Integer statusCode;
    public DetectContentResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;
    public DetectContentResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    

    public DetectContentResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
    this.contentType = contentType;
this.statusCode = statusCode;
  }
}
