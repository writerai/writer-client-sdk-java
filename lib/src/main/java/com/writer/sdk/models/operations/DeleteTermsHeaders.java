package com.writer.sdk.models.operations;

import com.writer.sdk.utils.SpeakeasyMetadata;

public class DeleteTermsHeaders {
    @SpeakeasyMetadata("header:style=simple,explode=false,name=Authorization")
    public String authorization;
    public DeleteTermsHeaders withAuthorization(String authorization) {
        this.authorization = authorization;
        return this;
    }
    
    @SpeakeasyMetadata("header:style=simple,explode=false,name=X-Request-ID")
    public String xRequestID;
    public DeleteTermsHeaders withXRequestID(String xRequestID) {
        this.xRequestID = xRequestID;
        return this;
    }
    
}
