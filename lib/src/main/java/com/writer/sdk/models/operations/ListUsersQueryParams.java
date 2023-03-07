package com.writer.sdk.models.operations;

import com.writer.sdk.utils.SpeakeasyMetadata;

public class ListUsersQueryParams {
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=limit")
    public Long limit;
    public ListUsersQueryParams withLimit(Long limit) {
        this.limit = limit;
        return this;
    }
    
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=offset")
    public Long offset;
    public ListUsersQueryParams withOffset(Long offset) {
        this.offset = offset;
        return this;
    }
    
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=search")
    public String search;
    public ListUsersQueryParams withSearch(String search) {
        this.search = search;
        return this;
    }
    
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=sortField")
    public ListUsersSortFieldEnum sortField;
    public ListUsersQueryParams withSortField(ListUsersSortFieldEnum sortField) {
        this.sortField = sortField;
        return this;
    }
    
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=sortOrder")
    public ListUsersSortOrderEnum sortOrder;
    public ListUsersQueryParams withSortOrder(ListUsersSortOrderEnum sortOrder) {
        this.sortOrder = sortOrder;
        return this;
    }
    
}
