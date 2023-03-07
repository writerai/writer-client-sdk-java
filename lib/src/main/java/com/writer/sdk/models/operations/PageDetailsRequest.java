package com.writer.sdk.models.operations;



public class PageDetailsRequest {
    public PageDetailsPathParams pathParams;
    public PageDetailsRequest withPathParams(PageDetailsPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    
    public PageDetailsHeaders headers;
    public PageDetailsRequest withHeaders(PageDetailsHeaders headers) {
        this.headers = headers;
        return this;
    }
    
}
