package com.writer.sdk.models.operations;

import com.writer.sdk.utils.SpeakeasyMetadata;

public class UploadFileRequest {
    public UploadFilePathParams pathParams;
    public UploadFileRequest withPathParams(UploadFilePathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    
    public UploadFileHeaders headers;
    public UploadFileRequest withHeaders(UploadFileHeaders headers) {
        this.headers = headers;
        return this;
    }
    
    @SpeakeasyMetadata("request:mediaType=multipart/form-data")
    public com.writer.sdk.models.shared.UploadModelFileRequest request;
    public UploadFileRequest withRequest(com.writer.sdk.models.shared.UploadModelFileRequest request) {
        this.request = request;
        return this;
    }
    
}
