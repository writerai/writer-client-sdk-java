/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.writer.sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.writer.sdk.utils.SpeakeasyMetadata;


public class ContentCheckRequest {
    @SpeakeasyMetadata("request:mediaType=application/json")
    public com.writer.sdk.models.shared.ContentRequest contentRequest;

    public ContentCheckRequest withContentRequest(com.writer.sdk.models.shared.ContentRequest contentRequest) {
        this.contentRequest = contentRequest;
        return this;
    }
    
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=organizationId")
    public Long organizationId;

    public ContentCheckRequest withOrganizationId(Long organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=teamId")
    public Long teamId;

    public ContentCheckRequest withTeamId(Long teamId) {
        this.teamId = teamId;
        return this;
    }
    
    public ContentCheckRequest(@JsonProperty("ContentRequest") com.writer.sdk.models.shared.ContentRequest contentRequest, @JsonProperty("teamId") Long teamId) {
        this.contentRequest = contentRequest;
        this.teamId = teamId;
  }
}
