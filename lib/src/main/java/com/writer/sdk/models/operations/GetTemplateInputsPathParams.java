package com.writer.sdk.models.operations;

import com.writer.sdk.utils.SpeakeasyMetadata;

public class GetTemplateInputsPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=organizationId")
    public Long organizationId;
    public GetTemplateInputsPathParams withOrganizationId(Long organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=teamId")
    public Long teamId;
    public GetTemplateInputsPathParams withTeamId(Long teamId) {
        this.teamId = teamId;
        return this;
    }
    
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=templateId")
    public String templateId;
    public GetTemplateInputsPathParams withTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    
}
