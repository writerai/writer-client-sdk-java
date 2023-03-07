package com.writer.sdk.models.operations;

import com.writer.sdk.utils.SpeakeasyMetadata;

public class GetFileHeaders {
    @SpeakeasyMetadata("header:style=simple,explode=false,name=Authorization")
    public String authorization;
    public GetFileHeaders withAuthorization(String authorization) {
        this.authorization = authorization;
        return this;
    }
    
}
