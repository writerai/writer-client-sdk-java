package com.writer.sdk.models.operations;



public class FindTermsRequest {
    public FindTermsPathParams pathParams;
    public FindTermsRequest withPathParams(FindTermsPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    
    public FindTermsQueryParams queryParams;
    public FindTermsRequest withQueryParams(FindTermsQueryParams queryParams) {
        this.queryParams = queryParams;
        return this;
    }
    
    public FindTermsHeaders headers;
    public FindTermsRequest withHeaders(FindTermsHeaders headers) {
        this.headers = headers;
        return this;
    }
    
}
