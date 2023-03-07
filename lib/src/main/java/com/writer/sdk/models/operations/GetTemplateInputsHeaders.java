package com.writer.sdk.models.operations;

import com.writer.sdk.utils.SpeakeasyMetadata;

public class GetTemplateInputsHeaders {
    @SpeakeasyMetadata("header:style=simple,explode=false,name=Authorization")
    public String authorization;
    public GetTemplateInputsHeaders withAuthorization(String authorization) {
        this.authorization = authorization;
        return this;
    }
    
}
