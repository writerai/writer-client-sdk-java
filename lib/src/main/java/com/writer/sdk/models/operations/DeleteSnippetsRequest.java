package com.writer.sdk.models.operations;



public class DeleteSnippetsRequest {
    public DeleteSnippetsPathParams pathParams;
    public DeleteSnippetsRequest withPathParams(DeleteSnippetsPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    
    public DeleteSnippetsQueryParams queryParams;
    public DeleteSnippetsRequest withQueryParams(DeleteSnippetsQueryParams queryParams) {
        this.queryParams = queryParams;
        return this;
    }
    
    public DeleteSnippetsHeaders headers;
    public DeleteSnippetsRequest withHeaders(DeleteSnippetsHeaders headers) {
        this.headers = headers;
        return this;
    }
    
}
