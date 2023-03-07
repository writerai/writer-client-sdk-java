package com.writer.sdk.models.operations;

import com.writer.sdk.utils.SpeakeasyMetadata;

public class DeleteSnippetsQueryParams {
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=ids")
    public String[] ids;
    public DeleteSnippetsQueryParams withIds(String[] ids) {
        this.ids = ids;
        return this;
    }
    
}
