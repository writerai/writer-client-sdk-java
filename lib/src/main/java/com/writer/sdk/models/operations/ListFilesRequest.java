/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.writer.sdk.models.operations;

import com.writer.sdk.utils.SpeakeasyMetadata;


public class ListFilesRequest {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=organizationId")
    public Long organizationId;

    public ListFilesRequest withOrganizationId(Long organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    
    public ListFilesRequest(){}
}
