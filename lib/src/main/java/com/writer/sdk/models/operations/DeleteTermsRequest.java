package com.writer.sdk.models.operations;



public class DeleteTermsRequest {
    public DeleteTermsPathParams pathParams;
    public DeleteTermsRequest withPathParams(DeleteTermsPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    
    public DeleteTermsQueryParams queryParams;
    public DeleteTermsRequest withQueryParams(DeleteTermsQueryParams queryParams) {
        this.queryParams = queryParams;
        return this;
    }
    
    public DeleteTermsHeaders headers;
    public DeleteTermsRequest withHeaders(DeleteTermsHeaders headers) {
        this.headers = headers;
        return this;
    }
    
}
