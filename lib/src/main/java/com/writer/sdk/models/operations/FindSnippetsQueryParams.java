package com.writer.sdk.models.operations;

import com.writer.sdk.utils.SpeakeasyMetadata;

public class FindSnippetsQueryParams {
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=limit")
    public Long limit;
    public FindSnippetsQueryParams withLimit(Long limit) {
        this.limit = limit;
        return this;
    }
    
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=offset")
    public Long offset;
    public FindSnippetsQueryParams withOffset(Long offset) {
        this.offset = offset;
        return this;
    }
    
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=search")
    public String search;
    public FindSnippetsQueryParams withSearch(String search) {
        this.search = search;
        return this;
    }
    
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=shortcuts")
    public String[] shortcuts;
    public FindSnippetsQueryParams withShortcuts(String[] shortcuts) {
        this.shortcuts = shortcuts;
        return this;
    }
    
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=sortField")
    public FindSnippetsSortFieldEnum sortField;
    public FindSnippetsQueryParams withSortField(FindSnippetsSortFieldEnum sortField) {
        this.sortField = sortField;
        return this;
    }
    
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=sortOrder")
    public FindSnippetsSortOrderEnum sortOrder;
    public FindSnippetsQueryParams withSortOrder(FindSnippetsSortOrderEnum sortOrder) {
        this.sortOrder = sortOrder;
        return this;
    }
    
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=tags")
    public String[] tags;
    public FindSnippetsQueryParams withTags(String[] tags) {
        this.tags = tags;
        return this;
    }
    
}
