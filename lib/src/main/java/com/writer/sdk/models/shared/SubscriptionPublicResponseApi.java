/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.writer.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.writer.sdk.utils.DateTimeDeserializer;
import com.writer.sdk.utils.DateTimeSerializer;
import java.time.OffsetDateTime;

public class SubscriptionPublicResponseApi {
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("createdAt")
    public OffsetDateTime createdAt;
    public SubscriptionPublicResponseApi withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    
    @JsonProperty("meta")
    public MetaData meta;
    public SubscriptionPublicResponseApi withMeta(MetaData meta) {
        this.meta = meta;
        return this;
    }
    
    @JsonProperty("productName")
    public SubscriptionPublicResponseApiProductNameEnum productName;
    public SubscriptionPublicResponseApi withProductName(SubscriptionPublicResponseApiProductNameEnum productName) {
        this.productName = productName;
        return this;
    }
    
    @JsonProperty("seats")
    public Long seats;
    public SubscriptionPublicResponseApi withSeats(Long seats) {
        this.seats = seats;
        return this;
    }
    
    @JsonProperty("status")
    public SubscriptionPublicResponseApiStatusEnum status;
    public SubscriptionPublicResponseApi withStatus(SubscriptionPublicResponseApiStatusEnum status) {
        this.status = status;
        return this;
    }
    
    @JsonProperty("subscriptionId")
    public String subscriptionId;
    public SubscriptionPublicResponseApi withSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }
    
    @JsonProperty("usage")
    public Usage usage;
    public SubscriptionPublicResponseApi withUsage(Usage usage) {
        this.usage = usage;
        return this;
    }
    

    public SubscriptionPublicResponseApi(@JsonProperty("createdAt") OffsetDateTime createdAt, @JsonProperty("meta") MetaData meta, @JsonProperty("productName") SubscriptionPublicResponseApiProductNameEnum productName, @JsonProperty("seats") Long seats, @JsonProperty("status") SubscriptionPublicResponseApiStatusEnum status, @JsonProperty("subscriptionId") String subscriptionId, @JsonProperty("usage") Usage usage) {
    this.createdAt = createdAt;
this.meta = meta;
this.productName = productName;
this.seats = seats;
this.status = status;
this.subscriptionId = subscriptionId;
this.usage = usage;
  }
}
