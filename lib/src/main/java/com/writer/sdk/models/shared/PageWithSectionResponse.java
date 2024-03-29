/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.writer.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.writer.sdk.utils.DateTimeDeserializer;
import com.writer.sdk.utils.DateTimeSerializer;
import java.time.OffsetDateTime;


public class PageWithSectionResponse {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("content")
    public String content;

    public PageWithSectionResponse withContent(String content) {
        this.content = content;
        return this;
    }
    
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("createdAt")
    public OffsetDateTime createdAt;

    public PageWithSectionResponse withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    
    @JsonProperty("id")
    public Long id;

    public PageWithSectionResponse withId(Long id) {
        this.id = id;
        return this;
    }
    
    @JsonProperty("order")
    public Long order;

    public PageWithSectionResponse withOrder(Long order) {
        this.order = order;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("section")
    public SectionInfo section;

    public PageWithSectionResponse withSection(SectionInfo section) {
        this.section = section;
        return this;
    }
    
    @JsonProperty("status")
    public PageWithSectionResponseStatus status;

    public PageWithSectionResponse withStatus(PageWithSectionResponseStatus status) {
        this.status = status;
        return this;
    }
    
    @JsonProperty("title")
    public String title;

    public PageWithSectionResponse withTitle(String title) {
        this.title = title;
        return this;
    }
    
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("updatedAt")
    public OffsetDateTime updatedAt;

    public PageWithSectionResponse withUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("updatedBy")
    public SimpleUser updatedBy;

    public PageWithSectionResponse withUpdatedBy(SimpleUser updatedBy) {
        this.updatedBy = updatedBy;
        return this;
    }
    
    @JsonProperty("url")
    public String url;

    public PageWithSectionResponse withUrl(String url) {
        this.url = url;
        return this;
    }
    
    public PageWithSectionResponse(@JsonProperty("createdAt") OffsetDateTime createdAt, @JsonProperty("id") Long id, @JsonProperty("order") Long order, @JsonProperty("status") PageWithSectionResponseStatus status, @JsonProperty("title") String title, @JsonProperty("updatedAt") OffsetDateTime updatedAt, @JsonProperty("url") String url) {
        this.createdAt = createdAt;
        this.id = id;
        this.order = order;
        this.status = status;
        this.title = title;
        this.updatedAt = updatedAt;
        this.url = url;
  }
}
