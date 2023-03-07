package com.writer.sdk.models.operations;

import com.writer.sdk.utils.SpeakeasyMetadata;

public class ListUsersHeaders {
    @SpeakeasyMetadata("header:style=simple,explode=false,name=Authorization")
    public String authorization;
    public ListUsersHeaders withAuthorization(String authorization) {
        this.authorization = authorization;
        return this;
    }
    
}
