/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.writer.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;


public class TermExampleCreate {
    @JsonProperty("example")
    public String example;

    public TermExampleCreate withExample(String example) {
        this.example = example;
        return this;
    }
    
    @JsonProperty("type")
    public TermExampleCreateType type;

    public TermExampleCreate withType(TermExampleCreateType type) {
        this.type = type;
        return this;
    }
    
    public TermExampleCreate(@JsonProperty("example") String example, @JsonProperty("type") TermExampleCreateType type) {
        this.example = example;
        this.type = type;
  }
}
