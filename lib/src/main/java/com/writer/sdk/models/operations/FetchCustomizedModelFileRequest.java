package com.writer.sdk.models.operations;



public class FetchCustomizedModelFileRequest {
    public FetchCustomizedModelFilePathParams pathParams;
    public FetchCustomizedModelFileRequest withPathParams(FetchCustomizedModelFilePathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    
    public FetchCustomizedModelFileHeaders headers;
    public FetchCustomizedModelFileRequest withHeaders(FetchCustomizedModelFileHeaders headers) {
        this.headers = headers;
        return this;
    }
    
}
