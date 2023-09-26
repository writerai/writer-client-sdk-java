/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.writer.sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;


public class DeleteSnippetsResponse {
    /**
     * HTTP response content type for this operation
     */
    
    public String contentType;

    public DeleteSnippetsResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    
    public com.writer.sdk.models.shared.DeleteResponse deleteResponse;

    public DeleteSnippetsResponse withDeleteResponse(com.writer.sdk.models.shared.DeleteResponse deleteResponse) {
        this.deleteResponse = deleteResponse;
        return this;
    }
    
    /**
     * Bad Request
     */
    
    public com.writer.sdk.models.shared.FailResponse failResponse;

    public DeleteSnippetsResponse withFailResponse(com.writer.sdk.models.shared.FailResponse failResponse) {
        this.failResponse = failResponse;
        return this;
    }
    
    
    public java.util.Map<String, String[]> headers;

    public DeleteSnippetsResponse withHeaders(java.util.Map<String, String[]> headers) {
        this.headers = headers;
        return this;
    }
    
    /**
     * HTTP response status code for this operation
     */
    
    public Integer statusCode;

    public DeleteSnippetsResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    
    public HttpResponse<byte[]> rawResponse;

    public DeleteSnippetsResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public DeleteSnippetsResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
