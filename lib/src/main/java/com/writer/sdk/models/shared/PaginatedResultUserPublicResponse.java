package com.writer.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class PaginatedResultUserPublicResponse {
    @JsonProperty("pagination")
    public Pagination pagination;
    public PaginatedResultUserPublicResponse withPagination(Pagination pagination) {
        this.pagination = pagination;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("result")
    public UserPublicResponse[] result;
    public PaginatedResultUserPublicResponse withResult(UserPublicResponse[] result) {
        this.result = result;
        return this;
    }
    
    @JsonProperty("totalCount")
    public Long totalCount;
    public PaginatedResultUserPublicResponse withTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    
}
