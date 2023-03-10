package com.writer.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.writer.sdk.utils.DateTimeDeserializer;
import com.writer.sdk.utils.DateTimeSerializer;
import java.time.OffsetDateTime;

public class ModelFile {
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("createdAt")
    public OffsetDateTime createdAt;
    public ModelFile withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    
    @JsonProperty("format")
    public String format;
    public ModelFile withFormat(String format) {
        this.format = format;
        return this;
    }
    
    @JsonProperty("id")
    public String id;
    public ModelFile withId(String id) {
        this.id = id;
        return this;
    }
    
    @JsonProperty("name")
    public String name;
    public ModelFile withName(String name) {
        this.name = name;
        return this;
    }
    
    @JsonProperty("numberOfSamples")
    public Long numberOfSamples;
    public ModelFile withNumberOfSamples(Long numberOfSamples) {
        this.numberOfSamples = numberOfSamples;
        return this;
    }
    
    @JsonProperty("size")
    public Long size;
    public ModelFile withSize(Long size) {
        this.size = size;
        return this;
    }
    
}
