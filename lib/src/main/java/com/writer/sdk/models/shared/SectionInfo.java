/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.writer.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;


public class SectionInfo {
    @JsonProperty("id")
    public Long id;

    public SectionInfo withId(Long id) {
        this.id = id;
        return this;
    }
    
    @JsonProperty("title")
    public String title;

    public SectionInfo withTitle(String title) {
        this.title = title;
        return this;
    }
    
    @JsonProperty("url")
    public String url;

    public SectionInfo withUrl(String url) {
        this.url = url;
        return this;
    }
    
    public SectionInfo(@JsonProperty("id") Long id, @JsonProperty("title") String title, @JsonProperty("url") String url) {
        this.id = id;
        this.title = title;
        this.url = url;
  }
}
