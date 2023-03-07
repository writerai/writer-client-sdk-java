package com.writer.sdk.models.operations;



public class ListPagesRequest {
    public ListPagesQueryParams queryParams;
    public ListPagesRequest withQueryParams(ListPagesQueryParams queryParams) {
        this.queryParams = queryParams;
        return this;
    }
    
    public ListPagesHeaders headers;
    public ListPagesRequest withHeaders(ListPagesHeaders headers) {
        this.headers = headers;
        return this;
    }
    
}
