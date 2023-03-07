package com.writer.sdk.models.operations;

import com.writer.sdk.utils.SpeakeasyMetadata;

public class ContentDetectorApiPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=organizationId")
    public Long organizationId;
    public ContentDetectorApiPathParams withOrganizationId(Long organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    
}
