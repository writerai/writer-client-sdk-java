package com.writer.sdk.models.operations;

import com.writer.sdk.utils.SpeakeasyMetadata;

public class UpdateSnippetsPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=organizationId")
    public Long organizationId;
    public UpdateSnippetsPathParams withOrganizationId(Long organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=teamId")
    public Long teamId;
    public UpdateSnippetsPathParams withTeamId(Long teamId) {
        this.teamId = teamId;
        return this;
    }
    
}
