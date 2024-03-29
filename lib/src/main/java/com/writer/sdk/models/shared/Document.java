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


public class Document {
    @JsonProperty("access")
    public DocumentAccess access;

    public Document withAccess(DocumentAccess access) {
        this.access = access;
        return this;
    }
    
    @JsonProperty("content")
    public String content;

    public Document withContent(String content) {
        this.content = content;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("createdUser")
    public SimpleUser createdUser;

    public Document withCreatedUser(SimpleUser createdUser) {
        this.createdUser = createdUser;
        return this;
    }
    
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("creationTime")
    public OffsetDateTime creationTime;

    public Document withCreationTime(OffsetDateTime creationTime) {
        this.creationTime = creationTime;
        return this;
    }
    
    @JsonProperty("id")
    public Long id;

    public Document withId(Long id) {
        this.id = id;
        return this;
    }
    
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("modificationTime")
    public OffsetDateTime modificationTime;

    public Document withModificationTime(OffsetDateTime modificationTime) {
        this.modificationTime = modificationTime;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("modifiedUser")
    public SimpleUser modifiedUser;

    public Document withModifiedUser(SimpleUser modifiedUser) {
        this.modifiedUser = modifiedUser;
        return this;
    }
    
    @JsonProperty("organizationId")
    public Long organizationId;

    public Document withOrganizationId(Long organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    
    @JsonProperty("score")
    public Long score;

    public Document withScore(Long score) {
        this.score = score;
        return this;
    }
    
    @JsonProperty("teamId")
    public Long teamId;

    public Document withTeamId(Long teamId) {
        this.teamId = teamId;
        return this;
    }
    
    @JsonProperty("title")
    public String title;

    public Document withTitle(String title) {
        this.title = title;
        return this;
    }
    
    public Document(@JsonProperty("access") DocumentAccess access, @JsonProperty("content") String content, @JsonProperty("creationTime") OffsetDateTime creationTime, @JsonProperty("id") Long id, @JsonProperty("modificationTime") OffsetDateTime modificationTime, @JsonProperty("organizationId") Long organizationId, @JsonProperty("score") Long score, @JsonProperty("teamId") Long teamId, @JsonProperty("title") String title) {
        this.access = access;
        this.content = content;
        this.creationTime = creationTime;
        this.id = id;
        this.modificationTime = modificationTime;
        this.organizationId = organizationId;
        this.score = score;
        this.teamId = teamId;
        this.title = title;
  }
}
