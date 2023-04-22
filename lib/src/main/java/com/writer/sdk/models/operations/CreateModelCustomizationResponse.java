/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.writer.sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;

public class CreateModelCustomizationResponse {
    
    public String contentType;
    public CreateModelCustomizationResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * Bad Request
     */
    
    public com.writer.sdk.models.shared.FailResponse failResponse;
    public CreateModelCustomizationResponse withFailResponse(com.writer.sdk.models.shared.FailResponse failResponse) {
        this.failResponse = failResponse;
        return this;
    }
    
    
    public java.util.Map<String, String[]> headers;
    public CreateModelCustomizationResponse withHeaders(java.util.Map<String, String[]> headers) {
        this.headers = headers;
        return this;
    }
    
    
    public com.writer.sdk.models.shared.ModelCustomization modelCustomization;
    public CreateModelCustomizationResponse withModelCustomization(com.writer.sdk.models.shared.ModelCustomization modelCustomization) {
        this.modelCustomization = modelCustomization;
        return this;
    }
    
    
    public Integer statusCode;
    public CreateModelCustomizationResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;
    public CreateModelCustomizationResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    

    public CreateModelCustomizationResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
    this.contentType = contentType;
this.statusCode = statusCode;
  }
}
