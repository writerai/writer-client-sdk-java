package com.writer.sdk.models.operations;

import com.writer.sdk.utils.SpeakeasyMetadata;

public class PageDetailsPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=pageId")
    public Long pageId;
    public PageDetailsPathParams withPageId(Long pageId) {
        this.pageId = pageId;
        return this;
    }
    
}
