/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.writer.sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.writer.sdk.utils.SpeakeasyMetadata;

public class GetFileRequest {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=fileId")
    public String fileId;
    public GetFileRequest withFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=organizationId")
    public Long organizationId;
    public GetFileRequest withOrganizationId(Long organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    

    public GetFileRequest(@JsonProperty("fileId") String fileId) {
    this.fileId = fileId;
  }
}
