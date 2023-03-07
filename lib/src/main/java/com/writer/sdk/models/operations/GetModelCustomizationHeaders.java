package com.writer.sdk.models.operations;

import com.writer.sdk.utils.SpeakeasyMetadata;

public class GetModelCustomizationHeaders {
    @SpeakeasyMetadata("header:style=simple,explode=false,name=Authorization")
    public String authorization;
    public GetModelCustomizationHeaders withAuthorization(String authorization) {
        this.authorization = authorization;
        return this;
    }
    
}
