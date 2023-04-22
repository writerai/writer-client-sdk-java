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

public class SnippetWithUser {
    @JsonProperty("createdUser")
    public TerminologyUser createdUser;
    public SnippetWithUser withCreatedUser(TerminologyUser createdUser) {
        this.createdUser = createdUser;
        return this;
    }
    
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("creationTime")
    public OffsetDateTime creationTime;
    public SnippetWithUser withCreationTime(OffsetDateTime creationTime) {
        this.creationTime = creationTime;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("description")
    public String description;
    public SnippetWithUser withDescription(String description) {
        this.description = description;
        return this;
    }
    
    @JsonProperty("id")
    public String id;
    public SnippetWithUser withId(String id) {
        this.id = id;
        return this;
    }
    
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("modificationTime")
    public OffsetDateTime modificationTime;
    public SnippetWithUser withModificationTime(OffsetDateTime modificationTime) {
        this.modificationTime = modificationTime;
        return this;
    }
    
    @JsonProperty("modifiedUser")
    public TerminologyUser modifiedUser;
    public SnippetWithUser withModifiedUser(TerminologyUser modifiedUser) {
        this.modifiedUser = modifiedUser;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("shortcut")
    public String shortcut;
    public SnippetWithUser withShortcut(String shortcut) {
        this.shortcut = shortcut;
        return this;
    }
    
    @JsonProperty("snippet")
    public String snippet;
    public SnippetWithUser withSnippet(String snippet) {
        this.snippet = snippet;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("tags")
    public SnippetTagV2[] tags;
    public SnippetWithUser withTags(SnippetTagV2[] tags) {
        this.tags = tags;
        return this;
    }
    

    public SnippetWithUser(@JsonProperty("createdUser") TerminologyUser createdUser, @JsonProperty("creationTime") OffsetDateTime creationTime, @JsonProperty("id") String id, @JsonProperty("modificationTime") OffsetDateTime modificationTime, @JsonProperty("modifiedUser") TerminologyUser modifiedUser, @JsonProperty("snippet") String snippet) {
    this.createdUser = createdUser;
this.creationTime = creationTime;
this.id = id;
this.modificationTime = modificationTime;
this.modifiedUser = modifiedUser;
this.snippet = snippet;
  }
}
