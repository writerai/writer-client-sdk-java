package com.writer.sdk.models.operations;

import com.writer.sdk.utils.SpeakeasyMetadata;

public class DeleteTermsQueryParams {
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=ids")
    public Long[] ids;
    public DeleteTermsQueryParams withIds(Long[] ids) {
        this.ids = ids;
        return this;
    }
    
}
