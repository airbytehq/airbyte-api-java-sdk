/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.airbyte.api.utils.LazySingletonValue;
import com.airbyte.api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;


public class SourceApifyDataset {

    /**
     * ID of the dataset you would like to load to Airbyte. In Apify Console, you can view your datasets in the &lt;a href="https://console.apify.com/storage/datasets"&gt;Storage section under the Datasets tab&lt;/a&gt; after you login. See the &lt;a href="https://docs.apify.com/platform/storage/dataset"&gt;Apify Docs&lt;/a&gt; for more information.
     */
    @JsonProperty("dataset_id")
    private String datasetId;

    @JsonProperty("sourceType")
    private ApifyDataset sourceType;

    /**
     * Personal API token of your Apify account. In Apify Console, you can find your API token in the &lt;a href="https://console.apify.com/account/integrations"&gt;Settings section under the Integrations tab&lt;/a&gt; after you login. See the &lt;a href="https://docs.apify.com/platform/integrations/api#api-token"&gt;Apify Docs&lt;/a&gt; for more information.
     */
    @JsonProperty("token")
    private String token;

    @JsonCreator
    public SourceApifyDataset(
            @JsonProperty("dataset_id") String datasetId,
            @JsonProperty("token") String token) {
        Utils.checkNotNull(datasetId, "datasetId");
        Utils.checkNotNull(token, "token");
        this.datasetId = datasetId;
        this.sourceType = Builder._SINGLETON_VALUE_SourceType.value();
        this.token = token;
    }

    /**
     * ID of the dataset you would like to load to Airbyte. In Apify Console, you can view your datasets in the &lt;a href="https://console.apify.com/storage/datasets"&gt;Storage section under the Datasets tab&lt;/a&gt; after you login. See the &lt;a href="https://docs.apify.com/platform/storage/dataset"&gt;Apify Docs&lt;/a&gt; for more information.
     */
    @JsonIgnore
    public String datasetId() {
        return datasetId;
    }

    @JsonIgnore
    public ApifyDataset sourceType() {
        return sourceType;
    }

    /**
     * Personal API token of your Apify account. In Apify Console, you can find your API token in the &lt;a href="https://console.apify.com/account/integrations"&gt;Settings section under the Integrations tab&lt;/a&gt; after you login. See the &lt;a href="https://docs.apify.com/platform/integrations/api#api-token"&gt;Apify Docs&lt;/a&gt; for more information.
     */
    @JsonIgnore
    public String token() {
        return token;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * ID of the dataset you would like to load to Airbyte. In Apify Console, you can view your datasets in the &lt;a href="https://console.apify.com/storage/datasets"&gt;Storage section under the Datasets tab&lt;/a&gt; after you login. See the &lt;a href="https://docs.apify.com/platform/storage/dataset"&gt;Apify Docs&lt;/a&gt; for more information.
     */
    public SourceApifyDataset withDatasetId(String datasetId) {
        Utils.checkNotNull(datasetId, "datasetId");
        this.datasetId = datasetId;
        return this;
    }

    /**
     * Personal API token of your Apify account. In Apify Console, you can find your API token in the &lt;a href="https://console.apify.com/account/integrations"&gt;Settings section under the Integrations tab&lt;/a&gt; after you login. See the &lt;a href="https://docs.apify.com/platform/integrations/api#api-token"&gt;Apify Docs&lt;/a&gt; for more information.
     */
    public SourceApifyDataset withToken(String token) {
        Utils.checkNotNull(token, "token");
        this.token = token;
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
        SourceApifyDataset other = (SourceApifyDataset) o;
        return 
            java.util.Objects.deepEquals(this.datasetId, other.datasetId) &&
            java.util.Objects.deepEquals(this.sourceType, other.sourceType) &&
            java.util.Objects.deepEquals(this.token, other.token);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            datasetId,
            sourceType,
            token);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceApifyDataset.class,
                "datasetId", datasetId,
                "sourceType", sourceType,
                "token", token);
    }
    
    public final static class Builder {
 
        private String datasetId;
 
        private String token;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * ID of the dataset you would like to load to Airbyte. In Apify Console, you can view your datasets in the &lt;a href="https://console.apify.com/storage/datasets"&gt;Storage section under the Datasets tab&lt;/a&gt; after you login. See the &lt;a href="https://docs.apify.com/platform/storage/dataset"&gt;Apify Docs&lt;/a&gt; for more information.
         */
        public Builder datasetId(String datasetId) {
            Utils.checkNotNull(datasetId, "datasetId");
            this.datasetId = datasetId;
            return this;
        }

        /**
         * Personal API token of your Apify account. In Apify Console, you can find your API token in the &lt;a href="https://console.apify.com/account/integrations"&gt;Settings section under the Integrations tab&lt;/a&gt; after you login. See the &lt;a href="https://docs.apify.com/platform/integrations/api#api-token"&gt;Apify Docs&lt;/a&gt; for more information.
         */
        public Builder token(String token) {
            Utils.checkNotNull(token, "token");
            this.token = token;
            return this;
        }
        
        public SourceApifyDataset build() {
            return new SourceApifyDataset(
                datasetId,
                token);
        }

        private static final LazySingletonValue<ApifyDataset> _SINGLETON_VALUE_SourceType =
                new LazySingletonValue<>(
                        "sourceType",
                        "\"apify-dataset\"",
                        new TypeReference<ApifyDataset>() {});
    }
}

