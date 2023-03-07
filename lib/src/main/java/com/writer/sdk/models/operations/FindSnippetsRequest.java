package com.writer.sdk.models.operations;



public class FindSnippetsRequest {
    public FindSnippetsPathParams pathParams;
    public FindSnippetsRequest withPathParams(FindSnippetsPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    
    public FindSnippetsQueryParams queryParams;
    public FindSnippetsRequest withQueryParams(FindSnippetsQueryParams queryParams) {
        this.queryParams = queryParams;
        return this;
    }
    
    public FindSnippetsHeaders headers;
    public FindSnippetsRequest withHeaders(FindSnippetsHeaders headers) {
        this.headers = headers;
        return this;
    }
    
}
