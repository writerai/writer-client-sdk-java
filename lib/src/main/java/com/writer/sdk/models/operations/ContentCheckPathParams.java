package com.writer.sdk.models.operations;

import com.writer.sdk.utils.SpeakeasyMetadata;

public class ContentCheckPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=organizationId")
    public Long organizationId;
    public ContentCheckPathParams withOrganizationId(Long organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=teamId")
    public Long teamId;
    public ContentCheckPathParams withTeamId(Long teamId) {
        this.teamId = teamId;
        return this;
    }
    
}
