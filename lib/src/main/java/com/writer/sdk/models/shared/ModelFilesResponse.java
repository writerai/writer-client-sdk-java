package com.writer.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ModelFilesResponse {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("files")
    public ModelFile[] files;
    public ModelFilesResponse withFiles(ModelFile[] files) {
        this.files = files;
        return this;
    }
    
}
