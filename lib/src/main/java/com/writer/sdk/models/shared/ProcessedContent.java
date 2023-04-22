/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.writer.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ProcessedContent {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("issues")
    public ContentIssue[] issues;
    public ProcessedContent withIssues(ContentIssue[] issues) {
        this.issues = issues;
        return this;
    }
    

    public ProcessedContent(){}
}
