package com.writer.sdk.models.operations;

import com.writer.sdk.utils.SpeakeasyMetadata;

public class ListPagesHeaders {
    @SpeakeasyMetadata("header:style=simple,explode=false,name=Authorization")
    public String authorization;
    public ListPagesHeaders withAuthorization(String authorization) {
        this.authorization = authorization;
        return this;
    }
    
}
