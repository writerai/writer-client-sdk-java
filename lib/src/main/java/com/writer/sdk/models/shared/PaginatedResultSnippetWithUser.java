package com.writer.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class PaginatedResultSnippetWithUser {
    @JsonProperty("pagination")
    public Pagination pagination;
    public PaginatedResultSnippetWithUser withPagination(Pagination pagination) {
        this.pagination = pagination;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("result")
    public SnippetWithUser[] result;
    public PaginatedResultSnippetWithUser withResult(SnippetWithUser[] result) {
        this.result = result;
        return this;
    }
    
    @JsonProperty("totalCount")
    public Long totalCount;
    public PaginatedResultSnippetWithUser withTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    
}
