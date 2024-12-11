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
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.time.LocalDate;
import java.util.Objects;
import java.util.Optional;


public class SourceAwsCloudtrail {

    /**
     * AWS CloudTrail Access Key ID. See the &lt;a href="https://docs.airbyte.com/integrations/sources/aws-cloudtrail"&gt;docs&lt;/a&gt; for more information on how to obtain this key.
     */
    @JsonProperty("aws_key_id")
    private String awsKeyId;

    /**
     * The default AWS Region to use, for example, us-west-1 or us-west-2. When specifying a Region inline during client initialization, this property is named region_name.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("aws_region_name")
    private Optional<String> awsRegionName;

    /**
     * AWS CloudTrail Access Key ID. See the &lt;a href="https://docs.airbyte.com/integrations/sources/aws-cloudtrail"&gt;docs&lt;/a&gt; for more information on how to obtain this key.
     */
    @JsonProperty("aws_secret_key")
    private String awsSecretKey;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("lookup_attributes_filter")
    private Optional<? extends FilterAppliedWhileFetchingRecordsBasedOnAttributeKeyAndAttributeValueWhichWillBeAppendedOnTheRequestBody> lookupAttributesFilter;

    @JsonProperty("sourceType")
    private AwsCloudtrail sourceType;

    /**
     * The date you would like to replicate data. Data in AWS CloudTrail is available for last 90 days only. Format: YYYY-MM-DD.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("start_date")
    private Optional<LocalDate> startDate;

    @JsonCreator
    public SourceAwsCloudtrail(
            @JsonProperty("aws_key_id") String awsKeyId,
            @JsonProperty("aws_region_name") Optional<String> awsRegionName,
            @JsonProperty("aws_secret_key") String awsSecretKey,
            @JsonProperty("lookup_attributes_filter") Optional<? extends FilterAppliedWhileFetchingRecordsBasedOnAttributeKeyAndAttributeValueWhichWillBeAppendedOnTheRequestBody> lookupAttributesFilter,
            @JsonProperty("start_date") Optional<LocalDate> startDate) {
        Utils.checkNotNull(awsKeyId, "awsKeyId");
        Utils.checkNotNull(awsRegionName, "awsRegionName");
        Utils.checkNotNull(awsSecretKey, "awsSecretKey");
        Utils.checkNotNull(lookupAttributesFilter, "lookupAttributesFilter");
        Utils.checkNotNull(startDate, "startDate");
        this.awsKeyId = awsKeyId;
        this.awsRegionName = awsRegionName;
        this.awsSecretKey = awsSecretKey;
        this.lookupAttributesFilter = lookupAttributesFilter;
        this.sourceType = Builder._SINGLETON_VALUE_SourceType.value();
        this.startDate = startDate;
    }
    
    public SourceAwsCloudtrail(
            String awsKeyId,
            String awsSecretKey) {
        this(awsKeyId, Optional.empty(), awsSecretKey, Optional.empty(), Optional.empty());
    }

    /**
     * AWS CloudTrail Access Key ID. See the &lt;a href="https://docs.airbyte.com/integrations/sources/aws-cloudtrail"&gt;docs&lt;/a&gt; for more information on how to obtain this key.
     */
    @JsonIgnore
    public String awsKeyId() {
        return awsKeyId;
    }

    /**
     * The default AWS Region to use, for example, us-west-1 or us-west-2. When specifying a Region inline during client initialization, this property is named region_name.
     */
    @JsonIgnore
    public Optional<String> awsRegionName() {
        return awsRegionName;
    }

    /**
     * AWS CloudTrail Access Key ID. See the &lt;a href="https://docs.airbyte.com/integrations/sources/aws-cloudtrail"&gt;docs&lt;/a&gt; for more information on how to obtain this key.
     */
    @JsonIgnore
    public String awsSecretKey() {
        return awsSecretKey;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<FilterAppliedWhileFetchingRecordsBasedOnAttributeKeyAndAttributeValueWhichWillBeAppendedOnTheRequestBody> lookupAttributesFilter() {
        return (Optional<FilterAppliedWhileFetchingRecordsBasedOnAttributeKeyAndAttributeValueWhichWillBeAppendedOnTheRequestBody>) lookupAttributesFilter;
    }

    @JsonIgnore
    public AwsCloudtrail sourceType() {
        return sourceType;
    }

    /**
     * The date you would like to replicate data. Data in AWS CloudTrail is available for last 90 days only. Format: YYYY-MM-DD.
     */
    @JsonIgnore
    public Optional<LocalDate> startDate() {
        return startDate;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * AWS CloudTrail Access Key ID. See the &lt;a href="https://docs.airbyte.com/integrations/sources/aws-cloudtrail"&gt;docs&lt;/a&gt; for more information on how to obtain this key.
     */
    public SourceAwsCloudtrail withAwsKeyId(String awsKeyId) {
        Utils.checkNotNull(awsKeyId, "awsKeyId");
        this.awsKeyId = awsKeyId;
        return this;
    }

    /**
     * The default AWS Region to use, for example, us-west-1 or us-west-2. When specifying a Region inline during client initialization, this property is named region_name.
     */
    public SourceAwsCloudtrail withAwsRegionName(String awsRegionName) {
        Utils.checkNotNull(awsRegionName, "awsRegionName");
        this.awsRegionName = Optional.ofNullable(awsRegionName);
        return this;
    }

    /**
     * The default AWS Region to use, for example, us-west-1 or us-west-2. When specifying a Region inline during client initialization, this property is named region_name.
     */
    public SourceAwsCloudtrail withAwsRegionName(Optional<String> awsRegionName) {
        Utils.checkNotNull(awsRegionName, "awsRegionName");
        this.awsRegionName = awsRegionName;
        return this;
    }

    /**
     * AWS CloudTrail Access Key ID. See the &lt;a href="https://docs.airbyte.com/integrations/sources/aws-cloudtrail"&gt;docs&lt;/a&gt; for more information on how to obtain this key.
     */
    public SourceAwsCloudtrail withAwsSecretKey(String awsSecretKey) {
        Utils.checkNotNull(awsSecretKey, "awsSecretKey");
        this.awsSecretKey = awsSecretKey;
        return this;
    }

    public SourceAwsCloudtrail withLookupAttributesFilter(FilterAppliedWhileFetchingRecordsBasedOnAttributeKeyAndAttributeValueWhichWillBeAppendedOnTheRequestBody lookupAttributesFilter) {
        Utils.checkNotNull(lookupAttributesFilter, "lookupAttributesFilter");
        this.lookupAttributesFilter = Optional.ofNullable(lookupAttributesFilter);
        return this;
    }

    public SourceAwsCloudtrail withLookupAttributesFilter(Optional<? extends FilterAppliedWhileFetchingRecordsBasedOnAttributeKeyAndAttributeValueWhichWillBeAppendedOnTheRequestBody> lookupAttributesFilter) {
        Utils.checkNotNull(lookupAttributesFilter, "lookupAttributesFilter");
        this.lookupAttributesFilter = lookupAttributesFilter;
        return this;
    }

    /**
     * The date you would like to replicate data. Data in AWS CloudTrail is available for last 90 days only. Format: YYYY-MM-DD.
     */
    public SourceAwsCloudtrail withStartDate(LocalDate startDate) {
        Utils.checkNotNull(startDate, "startDate");
        this.startDate = Optional.ofNullable(startDate);
        return this;
    }

    /**
     * The date you would like to replicate data. Data in AWS CloudTrail is available for last 90 days only. Format: YYYY-MM-DD.
     */
    public SourceAwsCloudtrail withStartDate(Optional<LocalDate> startDate) {
        Utils.checkNotNull(startDate, "startDate");
        this.startDate = startDate;
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
        SourceAwsCloudtrail other = (SourceAwsCloudtrail) o;
        return 
            Objects.deepEquals(this.awsKeyId, other.awsKeyId) &&
            Objects.deepEquals(this.awsRegionName, other.awsRegionName) &&
            Objects.deepEquals(this.awsSecretKey, other.awsSecretKey) &&
            Objects.deepEquals(this.lookupAttributesFilter, other.lookupAttributesFilter) &&
            Objects.deepEquals(this.sourceType, other.sourceType) &&
            Objects.deepEquals(this.startDate, other.startDate);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            awsKeyId,
            awsRegionName,
            awsSecretKey,
            lookupAttributesFilter,
            sourceType,
            startDate);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceAwsCloudtrail.class,
                "awsKeyId", awsKeyId,
                "awsRegionName", awsRegionName,
                "awsSecretKey", awsSecretKey,
                "lookupAttributesFilter", lookupAttributesFilter,
                "sourceType", sourceType,
                "startDate", startDate);
    }
    
    public final static class Builder {
 
        private String awsKeyId;
 
        private Optional<String> awsRegionName;
 
        private String awsSecretKey;
 
        private Optional<? extends FilterAppliedWhileFetchingRecordsBasedOnAttributeKeyAndAttributeValueWhichWillBeAppendedOnTheRequestBody> lookupAttributesFilter = Optional.empty();
 
        private Optional<LocalDate> startDate = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * AWS CloudTrail Access Key ID. See the &lt;a href="https://docs.airbyte.com/integrations/sources/aws-cloudtrail"&gt;docs&lt;/a&gt; for more information on how to obtain this key.
         */
        public Builder awsKeyId(String awsKeyId) {
            Utils.checkNotNull(awsKeyId, "awsKeyId");
            this.awsKeyId = awsKeyId;
            return this;
        }

        /**
         * The default AWS Region to use, for example, us-west-1 or us-west-2. When specifying a Region inline during client initialization, this property is named region_name.
         */
        public Builder awsRegionName(String awsRegionName) {
            Utils.checkNotNull(awsRegionName, "awsRegionName");
            this.awsRegionName = Optional.ofNullable(awsRegionName);
            return this;
        }

        /**
         * The default AWS Region to use, for example, us-west-1 or us-west-2. When specifying a Region inline during client initialization, this property is named region_name.
         */
        public Builder awsRegionName(Optional<String> awsRegionName) {
            Utils.checkNotNull(awsRegionName, "awsRegionName");
            this.awsRegionName = awsRegionName;
            return this;
        }

        /**
         * AWS CloudTrail Access Key ID. See the &lt;a href="https://docs.airbyte.com/integrations/sources/aws-cloudtrail"&gt;docs&lt;/a&gt; for more information on how to obtain this key.
         */
        public Builder awsSecretKey(String awsSecretKey) {
            Utils.checkNotNull(awsSecretKey, "awsSecretKey");
            this.awsSecretKey = awsSecretKey;
            return this;
        }

        public Builder lookupAttributesFilter(FilterAppliedWhileFetchingRecordsBasedOnAttributeKeyAndAttributeValueWhichWillBeAppendedOnTheRequestBody lookupAttributesFilter) {
            Utils.checkNotNull(lookupAttributesFilter, "lookupAttributesFilter");
            this.lookupAttributesFilter = Optional.ofNullable(lookupAttributesFilter);
            return this;
        }

        public Builder lookupAttributesFilter(Optional<? extends FilterAppliedWhileFetchingRecordsBasedOnAttributeKeyAndAttributeValueWhichWillBeAppendedOnTheRequestBody> lookupAttributesFilter) {
            Utils.checkNotNull(lookupAttributesFilter, "lookupAttributesFilter");
            this.lookupAttributesFilter = lookupAttributesFilter;
            return this;
        }

        /**
         * The date you would like to replicate data. Data in AWS CloudTrail is available for last 90 days only. Format: YYYY-MM-DD.
         */
        public Builder startDate(LocalDate startDate) {
            Utils.checkNotNull(startDate, "startDate");
            this.startDate = Optional.ofNullable(startDate);
            return this;
        }

        /**
         * The date you would like to replicate data. Data in AWS CloudTrail is available for last 90 days only. Format: YYYY-MM-DD.
         */
        public Builder startDate(Optional<LocalDate> startDate) {
            Utils.checkNotNull(startDate, "startDate");
            this.startDate = startDate;
            return this;
        }
        
        public SourceAwsCloudtrail build() {
            if (awsRegionName == null) {
                awsRegionName = _SINGLETON_VALUE_AwsRegionName.value();
            }            return new SourceAwsCloudtrail(
                awsKeyId,
                awsRegionName,
                awsSecretKey,
                lookupAttributesFilter,
                startDate);
        }

        private static final LazySingletonValue<Optional<String>> _SINGLETON_VALUE_AwsRegionName =
                new LazySingletonValue<>(
                        "aws_region_name",
                        "\"us-east-1\"",
                        new TypeReference<Optional<String>>() {});

        private static final LazySingletonValue<AwsCloudtrail> _SINGLETON_VALUE_SourceType =
                new LazySingletonValue<>(
                        "sourceType",
                        "\"aws-cloudtrail\"",
                        new TypeReference<AwsCloudtrail>() {});
    }
}

