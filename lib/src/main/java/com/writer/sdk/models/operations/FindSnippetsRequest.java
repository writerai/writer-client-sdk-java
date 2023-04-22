/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.writer.sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.writer.sdk.utils.SpeakeasyMetadata;

public class FindSnippetsRequest {
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=limit")
    public Long limit;
    public FindSnippetsRequest withLimit(Long limit) {
        this.limit = limit;
        return this;
    }
    
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=offset")
    public Long offset;
    public FindSnippetsRequest withOffset(Long offset) {
        this.offset = offset;
        return this;
    }
    
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=organizationId")
    public Long organizationId;
    public FindSnippetsRequest withOrganizationId(Long organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=search")
    public String search;
    public FindSnippetsRequest withSearch(String search) {
        this.search = search;
        return this;
    }
    
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=shortcuts")
    public String[] shortcuts;
    public FindSnippetsRequest withShortcuts(String[] shortcuts) {
        this.shortcuts = shortcuts;
        return this;
    }
    
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=sortField")
    public FindSnippetsSortFieldEnum sortField;
    public FindSnippetsRequest withSortField(FindSnippetsSortFieldEnum sortField) {
        this.sortField = sortField;
        return this;
    }
    
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=sortOrder")
    public FindSnippetsSortOrderEnum sortOrder;
    public FindSnippetsRequest withSortOrder(FindSnippetsSortOrderEnum sortOrder) {
        this.sortOrder = sortOrder;
        return this;
    }
    
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=tags")
    public String[] tags;
    public FindSnippetsRequest withTags(String[] tags) {
        this.tags = tags;
        return this;
    }
    
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=teamId")
    public Long teamId;
    public FindSnippetsRequest withTeamId(Long teamId) {
        this.teamId = teamId;
        return this;
    }
    

    public FindSnippetsRequest(@JsonProperty("teamId") Long teamId) {
    this.teamId = teamId;
  }
}
