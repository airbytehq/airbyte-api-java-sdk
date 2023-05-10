/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SourceAmazonSqs - The values required to configure the source.
 */
public class SourceAmazonSqs {
    /**
     * The Access Key ID of the AWS IAM Role to use for pulling messages
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("access_key")
    public String accessKey;

    public SourceAmazonSqs withAccessKey(String accessKey) {
        this.accessKey = accessKey;
        return this;
    }
    
    /**
     * Comma separated list of Mesage Attribute names to return
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("attributes_to_return")
    public String attributesToReturn;

    public SourceAmazonSqs withAttributesToReturn(String attributesToReturn) {
        this.attributesToReturn = attributesToReturn;
        return this;
    }
    
    /**
     * If Enabled, messages will be deleted from the SQS Queue after being read. If Disabled, messages are left in the queue and can be read more than once. WARNING: Enabling this option can result in data loss in cases of failure, use with caution, see documentation for more detail. 
     */
    @JsonProperty("delete_messages")
    public Boolean deleteMessages;

    public SourceAmazonSqs withDeleteMessages(Boolean deleteMessages) {
        this.deleteMessages = deleteMessages;
        return this;
    }
    
    /**
     * Max amount of messages to get in one batch (10 max)
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("max_batch_size")
    public Long maxBatchSize;

    public SourceAmazonSqs withMaxBatchSize(Long maxBatchSize) {
        this.maxBatchSize = maxBatchSize;
        return this;
    }
    
    /**
     * Max amount of time in seconds to wait for messages in a single poll (20 max)
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("max_wait_time")
    public Long maxWaitTime;

    public SourceAmazonSqs withMaxWaitTime(Long maxWaitTime) {
        this.maxWaitTime = maxWaitTime;
        return this;
    }
    
    /**
     * URL of the SQS Queue
     */
    @JsonProperty("queue_url")
    public String queueUrl;

    public SourceAmazonSqs withQueueUrl(String queueUrl) {
        this.queueUrl = queueUrl;
        return this;
    }
    
    /**
     * AWS Region of the SQS Queue
     */
    @JsonProperty("region")
    public SourceAmazonSqsAWSRegionEnum region;

    public SourceAmazonSqs withRegion(SourceAmazonSqsAWSRegionEnum region) {
        this.region = region;
        return this;
    }
    
    /**
     * The Secret Key of the AWS IAM Role to use for pulling messages
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("secret_key")
    public String secretKey;

    public SourceAmazonSqs withSecretKey(String secretKey) {
        this.secretKey = secretKey;
        return this;
    }
    
    @JsonProperty("sourceType")
    public SourceAmazonSqsAmazonSqsEnum sourceType;

    public SourceAmazonSqs withSourceType(SourceAmazonSqsAmazonSqsEnum sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    
    /**
     * Modify the Visibility Timeout of the individual message from the Queue's default (seconds).
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("visibility_timeout")
    public Long visibilityTimeout;

    public SourceAmazonSqs withVisibilityTimeout(Long visibilityTimeout) {
        this.visibilityTimeout = visibilityTimeout;
        return this;
    }
    
    public SourceAmazonSqs(@JsonProperty("delete_messages") Boolean deleteMessages, @JsonProperty("queue_url") String queueUrl, @JsonProperty("region") SourceAmazonSqsAWSRegionEnum region, @JsonProperty("sourceType") SourceAmazonSqsAmazonSqsEnum sourceType) {
        this.deleteMessages = deleteMessages;
        this.queueUrl = queueUrl;
        this.region = region;
        this.sourceType = sourceType;
  }
}
