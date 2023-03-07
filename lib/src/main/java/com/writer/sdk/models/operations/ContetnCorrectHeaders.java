package com.writer.sdk.models.operations;

import com.writer.sdk.utils.SpeakeasyMetadata;

public class ContetnCorrectHeaders {
    @SpeakeasyMetadata("header:style=simple,explode=false,name=Authorization")
    public String authorization;
    public ContetnCorrectHeaders withAuthorization(String authorization) {
        this.authorization = authorization;
        return this;
    }
    
    @SpeakeasyMetadata("header:style=simple,explode=false,name=X-Request-ID")
    public String xRequestID;
    public ContetnCorrectHeaders withXRequestID(String xRequestID) {
        this.xRequestID = xRequestID;
        return this;
    }
    
}
