package com.writer.sdk.models.operations;

import java.net.http.HttpResponse;

public class GetSubscriptionDetailsResponse {
    public String contentType;
    public GetSubscriptionDetailsResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public com.writer.sdk.models.shared.FailResponse failResponse;
    public GetSubscriptionDetailsResponse withFailResponse(com.writer.sdk.models.shared.FailResponse failResponse) {
        this.failResponse = failResponse;
        return this;
    }
    
    public java.util.Map<String, String[]> headers;
    public GetSubscriptionDetailsResponse withHeaders(java.util.Map<String, String[]> headers) {
        this.headers = headers;
        return this;
    }
    
    public Integer statusCode;
    public GetSubscriptionDetailsResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public HttpResponse<byte[]> rawResponse;
    public GetSubscriptionDetailsResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public com.writer.sdk.models.shared.SubscriptionPublicResponseApi subscriptionPublicResponseApi;
    public GetSubscriptionDetailsResponse withSubscriptionPublicResponseApi(com.writer.sdk.models.shared.SubscriptionPublicResponseApi subscriptionPublicResponseApi) {
        this.subscriptionPublicResponseApi = subscriptionPublicResponseApi;
        return this;
    }
    
}
