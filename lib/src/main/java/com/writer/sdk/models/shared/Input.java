package com.writer.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Input {
    @JsonProperty("dynamic")
    public Boolean dynamic;
    public Input withDynamic(Boolean dynamic) {
        this.dynamic = dynamic;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("help")
    public String help;
    public Input withHelp(String help) {
        this.help = help;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("maxFields")
    public Long maxFields;
    public Input withMaxFields(Long maxFields) {
        this.maxFields = maxFields;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("minFields")
    public Long minFields;
    public Input withMinFields(Long minFields) {
        this.minFields = minFields;
        return this;
    }
    
    @JsonProperty("name")
    public String name;
    public Input withName(String name) {
        this.name = name;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("options")
    public String[] options;
    public Input withOptions(String[] options) {
        this.options = options;
        return this;
    }
    
    @JsonProperty("required")
    public Boolean required;
    public Input withRequired(Boolean required) {
        this.required = required;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("subtitle")
    public String subtitle;
    public Input withSubtitle(String subtitle) {
        this.subtitle = subtitle;
        return this;
    }
    
    @JsonProperty("type")
    public InputTypeEnum type;
    public Input withType(InputTypeEnum type) {
        this.type = type;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("unitCopy")
    public String unitCopy;
    public Input withUnitCopy(String unitCopy) {
        this.unitCopy = unitCopy;
        return this;
    }
    
}
