package com.writer.sdk.models.operations;



public class CustomizationsRequest {
    public CustomizationsPathParams pathParams;
    public CustomizationsRequest withPathParams(CustomizationsPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    
    public CustomizationsHeaders headers;
    public CustomizationsRequest withHeaders(CustomizationsHeaders headers) {
        this.headers = headers;
        return this;
    }
    
}
