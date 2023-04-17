/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.writer.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CreateCustomizationRequest {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("additionalHyperParameters")
    public HyperParameters additionalHyperParameters;
    public CreateCustomizationRequest withAdditionalHyperParameters(HyperParameters additionalHyperParameters) {
        this.additionalHyperParameters = additionalHyperParameters;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("batchSize")
    public Long batchSize;
    public CreateCustomizationRequest withBatchSize(Long batchSize) {
        this.batchSize = batchSize;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("description")
    public String description;
    public CreateCustomizationRequest withDescription(String description) {
        this.description = description;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("epochs")
    public Long epochs;
    public CreateCustomizationRequest withEpochs(Long epochs) {
        this.epochs = epochs;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("learningRate")
    public Double learningRate;
    public CreateCustomizationRequest withLearningRate(Double learningRate) {
        this.learningRate = learningRate;
        return this;
    }
    
    @JsonProperty("name")
    public String name;
    public CreateCustomizationRequest withName(String name) {
        this.name = name;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("promptTemplate")
    public String promptTemplate;
    public CreateCustomizationRequest withPromptTemplate(String promptTemplate) {
        this.promptTemplate = promptTemplate;
        return this;
    }
    
    @JsonProperty("trainingDatasetFileId")
    public String trainingDatasetFileId;
    public CreateCustomizationRequest withTrainingDatasetFileId(String trainingDatasetFileId) {
        this.trainingDatasetFileId = trainingDatasetFileId;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("validationDatasetFileId")
    public String validationDatasetFileId;
    public CreateCustomizationRequest withValidationDatasetFileId(String validationDatasetFileId) {
        this.validationDatasetFileId = validationDatasetFileId;
        return this;
    }
    
}