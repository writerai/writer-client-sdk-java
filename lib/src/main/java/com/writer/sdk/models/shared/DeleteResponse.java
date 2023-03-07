package com.writer.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DeleteResponse {
    @JsonProperty("deleted")
    public Long deleted;
    public DeleteResponse withDeleted(Long deleted) {
        this.deleted = deleted;
        return this;
    }
    
}
