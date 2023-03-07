package com.writer.sdk.models.operations;

import com.writer.sdk.utils.SpeakeasyMetadata;

public class DeleteFilePathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=fileId")
    public String fileId;
    public DeleteFilePathParams withFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=organizationId")
    public Long organizationId;
    public DeleteFilePathParams withOrganizationId(Long organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    
}
