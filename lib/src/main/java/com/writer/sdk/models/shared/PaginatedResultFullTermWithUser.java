package com.writer.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class PaginatedResultFullTermWithUser {
    @JsonProperty("pagination")
    public Pagination pagination;
    public PaginatedResultFullTermWithUser withPagination(Pagination pagination) {
        this.pagination = pagination;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("result")
    public FullTermWithUser[] result;
    public PaginatedResultFullTermWithUser withResult(FullTermWithUser[] result) {
        this.result = result;
        return this;
    }
    
    @JsonProperty("totalCount")
    public Long totalCount;
    public PaginatedResultFullTermWithUser withTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    
}
