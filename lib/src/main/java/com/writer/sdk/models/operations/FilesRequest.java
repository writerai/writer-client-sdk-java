package com.writer.sdk.models.operations;



public class FilesRequest {
    public FilesPathParams pathParams;
    public FilesRequest withPathParams(FilesPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    
    public FilesHeaders headers;
    public FilesRequest withHeaders(FilesHeaders headers) {
        this.headers = headers;
        return this;
    }
    
}
