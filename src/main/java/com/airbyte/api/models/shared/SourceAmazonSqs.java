/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;


import com.airbyte.api.utils.LazySingletonValue;
import com.airbyte.api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.lang.Boolean;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;


public class SourceAmazonSqs {

    /**
     * The Access Key ID of the AWS IAM Role to use for pulling messages
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("access_key")
    private Optional<String> accessKey;

    /**
     * Comma separated list of Mesage Attribute names to return
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("attributes_to_return")
    private Optional<String> attributesToReturn;

    /**
     * If Enabled, messages will be deleted from the SQS Queue after being read. If Disabled, messages are left in the queue and can be read more than once. WARNING: Enabling this option can result in data loss in cases of failure, use with caution, see documentation for more detail. 
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("delete_messages")
    private Optional<Boolean> deleteMessages;

    /**
     * Max amount of messages to get in one batch (10 max)
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("max_batch_size")
    private Optional<Long> maxBatchSize;

    /**
     * Max amount of time in seconds to wait for messages in a single poll (20 max)
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("max_wait_time")
    private Optional<Long> maxWaitTime;

    /**
     * URL of the SQS Queue
     */
    @JsonProperty("queue_url")
    private String queueUrl;

    /**
     * AWS Region of the SQS Queue
     */
    @JsonProperty("region")
    private SourceAmazonSqsAWSRegion region;

    /**
     * The Secret Key of the AWS IAM Role to use for pulling messages
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("secret_key")
    private Optional<String> secretKey;

    @JsonProperty("sourceType")
    private AmazonSqs sourceType;

    /**
     * Modify the Visibility Timeout of the individual message from the Queue's default (seconds).
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("visibility_timeout")
    private Optional<Long> visibilityTimeout;

    @JsonCreator
    public SourceAmazonSqs(
            @JsonProperty("access_key") Optional<String> accessKey,
            @JsonProperty("attributes_to_return") Optional<String> attributesToReturn,
            @JsonProperty("delete_messages") Optional<Boolean> deleteMessages,
            @JsonProperty("max_batch_size") Optional<Long> maxBatchSize,
            @JsonProperty("max_wait_time") Optional<Long> maxWaitTime,
            @JsonProperty("queue_url") String queueUrl,
            @JsonProperty("region") SourceAmazonSqsAWSRegion region,
            @JsonProperty("secret_key") Optional<String> secretKey,
            @JsonProperty("visibility_timeout") Optional<Long> visibilityTimeout) {
        Utils.checkNotNull(accessKey, "accessKey");
        Utils.checkNotNull(attributesToReturn, "attributesToReturn");
        Utils.checkNotNull(deleteMessages, "deleteMessages");
        Utils.checkNotNull(maxBatchSize, "maxBatchSize");
        Utils.checkNotNull(maxWaitTime, "maxWaitTime");
        Utils.checkNotNull(queueUrl, "queueUrl");
        Utils.checkNotNull(region, "region");
        Utils.checkNotNull(secretKey, "secretKey");
        Utils.checkNotNull(visibilityTimeout, "visibilityTimeout");
        this.accessKey = accessKey;
        this.attributesToReturn = attributesToReturn;
        this.deleteMessages = deleteMessages;
        this.maxBatchSize = maxBatchSize;
        this.maxWaitTime = maxWaitTime;
        this.queueUrl = queueUrl;
        this.region = region;
        this.secretKey = secretKey;
        this.sourceType = Builder._SINGLETON_VALUE_SourceType.value();
        this.visibilityTimeout = visibilityTimeout;
    }
    
    public SourceAmazonSqs(
            String queueUrl,
            SourceAmazonSqsAWSRegion region) {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), queueUrl, region, Optional.empty(), Optional.empty());
    }

    /**
     * The Access Key ID of the AWS IAM Role to use for pulling messages
     */
    @JsonIgnore
    public Optional<String> accessKey() {
        return accessKey;
    }

    /**
     * Comma separated list of Mesage Attribute names to return
     */
    @JsonIgnore
    public Optional<String> attributesToReturn() {
        return attributesToReturn;
    }

    /**
     * If Enabled, messages will be deleted from the SQS Queue after being read. If Disabled, messages are left in the queue and can be read more than once. WARNING: Enabling this option can result in data loss in cases of failure, use with caution, see documentation for more detail. 
     */
    @JsonIgnore
    public Optional<Boolean> deleteMessages() {
        return deleteMessages;
    }

    /**
     * Max amount of messages to get in one batch (10 max)
     */
    @JsonIgnore
    public Optional<Long> maxBatchSize() {
        return maxBatchSize;
    }

    /**
     * Max amount of time in seconds to wait for messages in a single poll (20 max)
     */
    @JsonIgnore
    public Optional<Long> maxWaitTime() {
        return maxWaitTime;
    }

    /**
     * URL of the SQS Queue
     */
    @JsonIgnore
    public String queueUrl() {
        return queueUrl;
    }

    /**
     * AWS Region of the SQS Queue
     */
    @JsonIgnore
    public SourceAmazonSqsAWSRegion region() {
        return region;
    }

    /**
     * The Secret Key of the AWS IAM Role to use for pulling messages
     */
    @JsonIgnore
    public Optional<String> secretKey() {
        return secretKey;
    }

    @JsonIgnore
    public AmazonSqs sourceType() {
        return sourceType;
    }

    /**
     * Modify the Visibility Timeout of the individual message from the Queue's default (seconds).
     */
    @JsonIgnore
    public Optional<Long> visibilityTimeout() {
        return visibilityTimeout;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The Access Key ID of the AWS IAM Role to use for pulling messages
     */
    public SourceAmazonSqs withAccessKey(String accessKey) {
        Utils.checkNotNull(accessKey, "accessKey");
        this.accessKey = Optional.ofNullable(accessKey);
        return this;
    }

    /**
     * The Access Key ID of the AWS IAM Role to use for pulling messages
     */
    public SourceAmazonSqs withAccessKey(Optional<String> accessKey) {
        Utils.checkNotNull(accessKey, "accessKey");
        this.accessKey = accessKey;
        return this;
    }

    /**
     * Comma separated list of Mesage Attribute names to return
     */
    public SourceAmazonSqs withAttributesToReturn(String attributesToReturn) {
        Utils.checkNotNull(attributesToReturn, "attributesToReturn");
        this.attributesToReturn = Optional.ofNullable(attributesToReturn);
        return this;
    }

    /**
     * Comma separated list of Mesage Attribute names to return
     */
    public SourceAmazonSqs withAttributesToReturn(Optional<String> attributesToReturn) {
        Utils.checkNotNull(attributesToReturn, "attributesToReturn");
        this.attributesToReturn = attributesToReturn;
        return this;
    }

    /**
     * If Enabled, messages will be deleted from the SQS Queue after being read. If Disabled, messages are left in the queue and can be read more than once. WARNING: Enabling this option can result in data loss in cases of failure, use with caution, see documentation for more detail. 
     */
    public SourceAmazonSqs withDeleteMessages(boolean deleteMessages) {
        Utils.checkNotNull(deleteMessages, "deleteMessages");
        this.deleteMessages = Optional.ofNullable(deleteMessages);
        return this;
    }

    /**
     * If Enabled, messages will be deleted from the SQS Queue after being read. If Disabled, messages are left in the queue and can be read more than once. WARNING: Enabling this option can result in data loss in cases of failure, use with caution, see documentation for more detail. 
     */
    public SourceAmazonSqs withDeleteMessages(Optional<Boolean> deleteMessages) {
        Utils.checkNotNull(deleteMessages, "deleteMessages");
        this.deleteMessages = deleteMessages;
        return this;
    }

    /**
     * Max amount of messages to get in one batch (10 max)
     */
    public SourceAmazonSqs withMaxBatchSize(long maxBatchSize) {
        Utils.checkNotNull(maxBatchSize, "maxBatchSize");
        this.maxBatchSize = Optional.ofNullable(maxBatchSize);
        return this;
    }

    /**
     * Max amount of messages to get in one batch (10 max)
     */
    public SourceAmazonSqs withMaxBatchSize(Optional<Long> maxBatchSize) {
        Utils.checkNotNull(maxBatchSize, "maxBatchSize");
        this.maxBatchSize = maxBatchSize;
        return this;
    }

    /**
     * Max amount of time in seconds to wait for messages in a single poll (20 max)
     */
    public SourceAmazonSqs withMaxWaitTime(long maxWaitTime) {
        Utils.checkNotNull(maxWaitTime, "maxWaitTime");
        this.maxWaitTime = Optional.ofNullable(maxWaitTime);
        return this;
    }

    /**
     * Max amount of time in seconds to wait for messages in a single poll (20 max)
     */
    public SourceAmazonSqs withMaxWaitTime(Optional<Long> maxWaitTime) {
        Utils.checkNotNull(maxWaitTime, "maxWaitTime");
        this.maxWaitTime = maxWaitTime;
        return this;
    }

    /**
     * URL of the SQS Queue
     */
    public SourceAmazonSqs withQueueUrl(String queueUrl) {
        Utils.checkNotNull(queueUrl, "queueUrl");
        this.queueUrl = queueUrl;
        return this;
    }

    /**
     * AWS Region of the SQS Queue
     */
    public SourceAmazonSqs withRegion(SourceAmazonSqsAWSRegion region) {
        Utils.checkNotNull(region, "region");
        this.region = region;
        return this;
    }

    /**
     * The Secret Key of the AWS IAM Role to use for pulling messages
     */
    public SourceAmazonSqs withSecretKey(String secretKey) {
        Utils.checkNotNull(secretKey, "secretKey");
        this.secretKey = Optional.ofNullable(secretKey);
        return this;
    }

    /**
     * The Secret Key of the AWS IAM Role to use for pulling messages
     */
    public SourceAmazonSqs withSecretKey(Optional<String> secretKey) {
        Utils.checkNotNull(secretKey, "secretKey");
        this.secretKey = secretKey;
        return this;
    }

    /**
     * Modify the Visibility Timeout of the individual message from the Queue's default (seconds).
     */
    public SourceAmazonSqs withVisibilityTimeout(long visibilityTimeout) {
        Utils.checkNotNull(visibilityTimeout, "visibilityTimeout");
        this.visibilityTimeout = Optional.ofNullable(visibilityTimeout);
        return this;
    }

    /**
     * Modify the Visibility Timeout of the individual message from the Queue's default (seconds).
     */
    public SourceAmazonSqs withVisibilityTimeout(Optional<Long> visibilityTimeout) {
        Utils.checkNotNull(visibilityTimeout, "visibilityTimeout");
        this.visibilityTimeout = visibilityTimeout;
        return this;
    }
    
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SourceAmazonSqs other = (SourceAmazonSqs) o;
        return 
            Objects.deepEquals(this.accessKey, other.accessKey) &&
            Objects.deepEquals(this.attributesToReturn, other.attributesToReturn) &&
            Objects.deepEquals(this.deleteMessages, other.deleteMessages) &&
            Objects.deepEquals(this.maxBatchSize, other.maxBatchSize) &&
            Objects.deepEquals(this.maxWaitTime, other.maxWaitTime) &&
            Objects.deepEquals(this.queueUrl, other.queueUrl) &&
            Objects.deepEquals(this.region, other.region) &&
            Objects.deepEquals(this.secretKey, other.secretKey) &&
            Objects.deepEquals(this.sourceType, other.sourceType) &&
            Objects.deepEquals(this.visibilityTimeout, other.visibilityTimeout);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            accessKey,
            attributesToReturn,
            deleteMessages,
            maxBatchSize,
            maxWaitTime,
            queueUrl,
            region,
            secretKey,
            sourceType,
            visibilityTimeout);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceAmazonSqs.class,
                "accessKey", accessKey,
                "attributesToReturn", attributesToReturn,
                "deleteMessages", deleteMessages,
                "maxBatchSize", maxBatchSize,
                "maxWaitTime", maxWaitTime,
                "queueUrl", queueUrl,
                "region", region,
                "secretKey", secretKey,
                "sourceType", sourceType,
                "visibilityTimeout", visibilityTimeout);
    }
    
    public final static class Builder {
 
        private Optional<String> accessKey = Optional.empty();
 
        private Optional<String> attributesToReturn = Optional.empty();
 
        private Optional<Boolean> deleteMessages;
 
        private Optional<Long> maxBatchSize = Optional.empty();
 
        private Optional<Long> maxWaitTime = Optional.empty();
 
        private String queueUrl;
 
        private SourceAmazonSqsAWSRegion region;
 
        private Optional<String> secretKey = Optional.empty();
 
        private Optional<Long> visibilityTimeout = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The Access Key ID of the AWS IAM Role to use for pulling messages
         */
        public Builder accessKey(String accessKey) {
            Utils.checkNotNull(accessKey, "accessKey");
            this.accessKey = Optional.ofNullable(accessKey);
            return this;
        }

        /**
         * The Access Key ID of the AWS IAM Role to use for pulling messages
         */
        public Builder accessKey(Optional<String> accessKey) {
            Utils.checkNotNull(accessKey, "accessKey");
            this.accessKey = accessKey;
            return this;
        }

        /**
         * Comma separated list of Mesage Attribute names to return
         */
        public Builder attributesToReturn(String attributesToReturn) {
            Utils.checkNotNull(attributesToReturn, "attributesToReturn");
            this.attributesToReturn = Optional.ofNullable(attributesToReturn);
            return this;
        }

        /**
         * Comma separated list of Mesage Attribute names to return
         */
        public Builder attributesToReturn(Optional<String> attributesToReturn) {
            Utils.checkNotNull(attributesToReturn, "attributesToReturn");
            this.attributesToReturn = attributesToReturn;
            return this;
        }

        /**
         * If Enabled, messages will be deleted from the SQS Queue after being read. If Disabled, messages are left in the queue and can be read more than once. WARNING: Enabling this option can result in data loss in cases of failure, use with caution, see documentation for more detail. 
         */
        public Builder deleteMessages(boolean deleteMessages) {
            Utils.checkNotNull(deleteMessages, "deleteMessages");
            this.deleteMessages = Optional.ofNullable(deleteMessages);
            return this;
        }

        /**
         * If Enabled, messages will be deleted from the SQS Queue after being read. If Disabled, messages are left in the queue and can be read more than once. WARNING: Enabling this option can result in data loss in cases of failure, use with caution, see documentation for more detail. 
         */
        public Builder deleteMessages(Optional<Boolean> deleteMessages) {
            Utils.checkNotNull(deleteMessages, "deleteMessages");
            this.deleteMessages = deleteMessages;
            return this;
        }

        /**
         * Max amount of messages to get in one batch (10 max)
         */
        public Builder maxBatchSize(long maxBatchSize) {
            Utils.checkNotNull(maxBatchSize, "maxBatchSize");
            this.maxBatchSize = Optional.ofNullable(maxBatchSize);
            return this;
        }

        /**
         * Max amount of messages to get in one batch (10 max)
         */
        public Builder maxBatchSize(Optional<Long> maxBatchSize) {
            Utils.checkNotNull(maxBatchSize, "maxBatchSize");
            this.maxBatchSize = maxBatchSize;
            return this;
        }

        /**
         * Max amount of time in seconds to wait for messages in a single poll (20 max)
         */
        public Builder maxWaitTime(long maxWaitTime) {
            Utils.checkNotNull(maxWaitTime, "maxWaitTime");
            this.maxWaitTime = Optional.ofNullable(maxWaitTime);
            return this;
        }

        /**
         * Max amount of time in seconds to wait for messages in a single poll (20 max)
         */
        public Builder maxWaitTime(Optional<Long> maxWaitTime) {
            Utils.checkNotNull(maxWaitTime, "maxWaitTime");
            this.maxWaitTime = maxWaitTime;
            return this;
        }

        /**
         * URL of the SQS Queue
         */
        public Builder queueUrl(String queueUrl) {
            Utils.checkNotNull(queueUrl, "queueUrl");
            this.queueUrl = queueUrl;
            return this;
        }

        /**
         * AWS Region of the SQS Queue
         */
        public Builder region(SourceAmazonSqsAWSRegion region) {
            Utils.checkNotNull(region, "region");
            this.region = region;
            return this;
        }

        /**
         * The Secret Key of the AWS IAM Role to use for pulling messages
         */
        public Builder secretKey(String secretKey) {
            Utils.checkNotNull(secretKey, "secretKey");
            this.secretKey = Optional.ofNullable(secretKey);
            return this;
        }

        /**
         * The Secret Key of the AWS IAM Role to use for pulling messages
         */
        public Builder secretKey(Optional<String> secretKey) {
            Utils.checkNotNull(secretKey, "secretKey");
            this.secretKey = secretKey;
            return this;
        }

        /**
         * Modify the Visibility Timeout of the individual message from the Queue's default (seconds).
         */
        public Builder visibilityTimeout(long visibilityTimeout) {
            Utils.checkNotNull(visibilityTimeout, "visibilityTimeout");
            this.visibilityTimeout = Optional.ofNullable(visibilityTimeout);
            return this;
        }

        /**
         * Modify the Visibility Timeout of the individual message from the Queue's default (seconds).
         */
        public Builder visibilityTimeout(Optional<Long> visibilityTimeout) {
            Utils.checkNotNull(visibilityTimeout, "visibilityTimeout");
            this.visibilityTimeout = visibilityTimeout;
            return this;
        }
        
        public SourceAmazonSqs build() {
            if (deleteMessages == null) {
                deleteMessages = _SINGLETON_VALUE_DeleteMessages.value();
            }            return new SourceAmazonSqs(
                accessKey,
                attributesToReturn,
                deleteMessages,
                maxBatchSize,
                maxWaitTime,
                queueUrl,
                region,
                secretKey,
                visibilityTimeout);
        }

        private static final LazySingletonValue<Optional<Boolean>> _SINGLETON_VALUE_DeleteMessages =
                new LazySingletonValue<>(
                        "delete_messages",
                        "false",
                        new TypeReference<Optional<Boolean>>() {});

        private static final LazySingletonValue<AmazonSqs> _SINGLETON_VALUE_SourceType =
                new LazySingletonValue<>(
                        "sourceType",
                        "\"amazon-sqs\"",
                        new TypeReference<AmazonSqs>() {});
    }
}

