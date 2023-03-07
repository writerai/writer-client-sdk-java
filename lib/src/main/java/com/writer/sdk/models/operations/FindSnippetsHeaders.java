package com.writer.sdk.models.operations;

import com.writer.sdk.utils.SpeakeasyMetadata;

public class FindSnippetsHeaders {
    @SpeakeasyMetadata("header:style=simple,explode=false,name=Authorization")
    public String authorization;
    public FindSnippetsHeaders withAuthorization(String authorization) {
        this.authorization = authorization;
        return this;
    }
    
}
