package com.writer.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CustomizationsResponse {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("customizations")
    public ModelCustomization[] customizations;
    public CustomizationsResponse withCustomizations(ModelCustomization[] customizations) {
        this.customizations = customizations;
        return this;
    }
    
}
