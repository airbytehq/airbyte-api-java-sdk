/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.LocalDate;

/**
 * SourceAwsCloudtrail - The values required to configure the source.
 */
public class SourceAwsCloudtrail {
    /**
     * AWS CloudTrail Access Key ID. See the &lt;a href="https://docs.airbyte.com/integrations/sources/aws-cloudtrail"&gt;docs&lt;/a&gt; for more information on how to obtain this key.
     */
    @JsonProperty("aws_key_id")
    public String awsKeyId;
    public SourceAwsCloudtrail withAwsKeyId(String awsKeyId) {
        this.awsKeyId = awsKeyId;
        return this;
    }
    
    /**
     * The default AWS Region to use, for example, us-west-1 or us-west-2. When specifying a Region inline during client initialization, this property is named region_name.
     */
    @JsonProperty("aws_region_name")
    public String awsRegionName;
    public SourceAwsCloudtrail withAwsRegionName(String awsRegionName) {
        this.awsRegionName = awsRegionName;
        return this;
    }
    
    /**
     * AWS CloudTrail Access Key ID. See the &lt;a href="https://docs.airbyte.com/integrations/sources/aws-cloudtrail"&gt;docs&lt;/a&gt; for more information on how to obtain this key.
     */
    @JsonProperty("aws_secret_key")
    public String awsSecretKey;
    public SourceAwsCloudtrail withAwsSecretKey(String awsSecretKey) {
        this.awsSecretKey = awsSecretKey;
        return this;
    }
    
    @JsonProperty("sourceType")
    public SourceAwsCloudtrailAwsCloudtrailEnum sourceType;
    public SourceAwsCloudtrail withSourceType(SourceAwsCloudtrailAwsCloudtrailEnum sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    
    /**
     * The date you would like to replicate data. Data in AWS CloudTrail is available for last 90 days only. Format: YYYY-MM-DD.
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @JsonProperty("start_date")
    public LocalDate startDate;
    public SourceAwsCloudtrail withStartDate(LocalDate startDate) {
        this.startDate = startDate;
        return this;
    }
    

    public SourceAwsCloudtrail(@JsonProperty("aws_key_id") String awsKeyId, @JsonProperty("aws_region_name") String awsRegionName, @JsonProperty("aws_secret_key") String awsSecretKey, @JsonProperty("sourceType") SourceAwsCloudtrailAwsCloudtrailEnum sourceType, @JsonProperty("start_date") LocalDate startDate) {
    this.awsKeyId = awsKeyId;
this.awsRegionName = awsRegionName;
this.awsSecretKey = awsSecretKey;
this.sourceType = sourceType;
this.startDate = startDate;
  }
}
