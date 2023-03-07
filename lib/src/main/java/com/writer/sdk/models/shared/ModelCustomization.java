package com.writer.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.writer.sdk.utils.DateTimeDeserializer;
import com.writer.sdk.utils.DateTimeSerializer;
import java.time.OffsetDateTime;

public class ModelCustomization {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("additionalHyperParameters")
    public HyperParameters additionalHyperParameters;
    public ModelCustomization withAdditionalHyperParameters(HyperParameters additionalHyperParameters) {
        this.additionalHyperParameters = additionalHyperParameters;
        return this;
    }
    
    @JsonProperty("baseModelId")
    public String baseModelId;
    public ModelCustomization withBaseModelId(String baseModelId) {
        this.baseModelId = baseModelId;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("batchSize")
    public Long batchSize;
    public ModelCustomization withBatchSize(Long batchSize) {
        this.batchSize = batchSize;
        return this;
    }
    
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("createdAt")
    public OffsetDateTime createdAt;
    public ModelCustomization withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("description")
    public String description;
    public ModelCustomization withDescription(String description) {
        this.description = description;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("epochs")
    public Long epochs;
    public ModelCustomization withEpochs(Long epochs) {
        this.epochs = epochs;
        return this;
    }
    
    @JsonProperty("id")
    public String id;
    public ModelCustomization withId(String id) {
        this.id = id;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("learningRate")
    public Double learningRate;
    public ModelCustomization withLearningRate(Double learningRate) {
        this.learningRate = learningRate;
        return this;
    }
    
    @JsonProperty("name")
    public String name;
    public ModelCustomization withName(String name) {
        this.name = name;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("promptTemplate")
    public String promptTemplate;
    public ModelCustomization withPromptTemplate(String promptTemplate) {
        this.promptTemplate = promptTemplate;
        return this;
    }
    
    @JsonProperty("status")
    public String status;
    public ModelCustomization withStatus(String status) {
        this.status = status;
        return this;
    }
    
    @JsonProperty("trainingDatasetFileId")
    public String trainingDatasetFileId;
    public ModelCustomization withTrainingDatasetFileId(String trainingDatasetFileId) {
        this.trainingDatasetFileId = trainingDatasetFileId;
        return this;
    }
    
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("updatedAt")
    public OffsetDateTime updatedAt;
    public ModelCustomization withUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("validationDatasetFileId")
    public String validationDatasetFileId;
    public ModelCustomization withValidationDatasetFileId(String validationDatasetFileId) {
        this.validationDatasetFileId = validationDatasetFileId;
        return this;
    }
    
}
