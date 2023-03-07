package com.writer.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class MagicRequestInput {
    @JsonProperty("name")
    public String name;
    public MagicRequestInput withName(String name) {
        this.name = name;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("value")
    public String[] value;
    public MagicRequestInput withValue(String[] value) {
        this.value = value;
        return this;
    }
    
}
