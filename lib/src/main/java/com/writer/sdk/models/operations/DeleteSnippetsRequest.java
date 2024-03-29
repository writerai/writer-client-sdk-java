/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.writer.sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.writer.sdk.utils.SpeakeasyMetadata;


public class DeleteSnippetsRequest {
    @SpeakeasyMetadata("header:style=simple,explode=false,name=X-Request-ID")
    public String xRequestID;

    public DeleteSnippetsRequest withXRequestID(String xRequestID) {
        this.xRequestID = xRequestID;
        return this;
    }
    
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=ids")
    public String[] ids;

    public DeleteSnippetsRequest withIds(String[] ids) {
        this.ids = ids;
        return this;
    }
    
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=organizationId")
    public Long organizationId;

    public DeleteSnippetsRequest withOrganizationId(Long organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=teamId")
    public Long teamId;

    public DeleteSnippetsRequest withTeamId(Long teamId) {
        this.teamId = teamId;
        return this;
    }
    
    public DeleteSnippetsRequest(@JsonProperty("teamId") Long teamId) {
        this.teamId = teamId;
  }
}
