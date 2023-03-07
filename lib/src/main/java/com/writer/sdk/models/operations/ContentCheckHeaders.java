package com.writer.sdk.models.operations;

import com.writer.sdk.utils.SpeakeasyMetadata;

public class ContentCheckHeaders {
    @SpeakeasyMetadata("header:style=simple,explode=false,name=Authorization")
    public String authorization;
    public ContentCheckHeaders withAuthorization(String authorization) {
        this.authorization = authorization;
        return this;
    }
    
}
