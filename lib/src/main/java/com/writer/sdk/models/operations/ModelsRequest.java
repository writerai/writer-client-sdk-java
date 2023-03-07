package com.writer.sdk.models.operations;



public class ModelsRequest {
    public ModelsPathParams pathParams;
    public ModelsRequest withPathParams(ModelsPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    
    public ModelsHeaders headers;
    public ModelsRequest withHeaders(ModelsHeaders headers) {
        this.headers = headers;
        return this;
    }
    
}
