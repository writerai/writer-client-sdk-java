/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.writer.sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;


public class DeleteModelCustomizationResponse {
    /**
     * HTTP response content type for this operation
     */
    
    public String contentType;

    public DeleteModelCustomizationResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * Bad Request
     */
    
    public com.writer.sdk.models.shared.FailResponse failResponse;

    public DeleteModelCustomizationResponse withFailResponse(com.writer.sdk.models.shared.FailResponse failResponse) {
        this.failResponse = failResponse;
        return this;
    }
    
    
    public java.util.Map<String, String[]> headers;

    public DeleteModelCustomizationResponse withHeaders(java.util.Map<String, String[]> headers) {
        this.headers = headers;
        return this;
    }
    
    /**
     * HTTP response status code for this operation
     */
    
    public Integer statusCode;

    public DeleteModelCustomizationResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    
    public HttpResponse<byte[]> rawResponse;

    public DeleteModelCustomizationResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    
    public DeleteModelCustomization200ApplicationJSON deleteModelCustomization200ApplicationJSONObject;

    public DeleteModelCustomizationResponse withDeleteModelCustomization200ApplicationJSONObject(DeleteModelCustomization200ApplicationJSON deleteModelCustomization200ApplicationJSONObject) {
        this.deleteModelCustomization200ApplicationJSONObject = deleteModelCustomization200ApplicationJSONObject;
        return this;
    }
    
    public DeleteModelCustomizationResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
