/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.writer.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ContentRequest {
    @JsonProperty("content")
    public String content;
    public ContentRequest withContent(String content) {
        this.content = content;
        return this;
    }
    
    @JsonProperty("settings")
    public ContentSettings settings;
    public ContentRequest withSettings(ContentSettings settings) {
        this.settings = settings;
        return this;
    }
    

    public ContentRequest(@JsonProperty("content") String content, @JsonProperty("settings") ContentSettings settings) {
    this.content = content;
this.settings = settings;
  }
}
