/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.airbyte.api.models.shared;

import com.airbyte.api.utils.LazySingletonValue;
import com.airbyte.api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;

public class SourceIterable {

    /**
     * Iterable API Key. See the &lt;a href=\"https://docs.airbyte.com/integrations/sources/iterable\"&gt;docs&lt;/a&gt;  for more information on how to obtain this key.
     */
    @JsonProperty("api_key")
    private String apiKey;

    @JsonProperty("sourceType")
    private Iterable sourceType;

    /**
     * The date from which you'd like to replicate data for Iterable, in the format YYYY-MM-DDT00:00:00Z.  All data generated after this date will be replicated.
     */
    @JsonProperty("start_date")
    private OffsetDateTime startDate;

    @JsonCreator
    public SourceIterable(
            @JsonProperty("api_key") String apiKey,
            @JsonProperty("start_date") OffsetDateTime startDate) {
        Utils.checkNotNull(apiKey, "apiKey");
        Utils.checkNotNull(startDate, "startDate");
        this.apiKey = apiKey;
        this.sourceType = Builder._SINGLETON_VALUE_SourceType.value();
        this.startDate = startDate;
    }

    /**
     * Iterable API Key. See the &lt;a href=\"https://docs.airbyte.com/integrations/sources/iterable\"&gt;docs&lt;/a&gt;  for more information on how to obtain this key.
     */
    @JsonIgnore
    public String apiKey() {
        return apiKey;
    }

    @JsonIgnore
    public Iterable sourceType() {
        return sourceType;
    }

    /**
     * The date from which you'd like to replicate data for Iterable, in the format YYYY-MM-DDT00:00:00Z.  All data generated after this date will be replicated.
     */
    @JsonIgnore
    public OffsetDateTime startDate() {
        return startDate;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    /**
     * Iterable API Key. See the &lt;a href=\"https://docs.airbyte.com/integrations/sources/iterable\"&gt;docs&lt;/a&gt;  for more information on how to obtain this key.
     */
    public SourceIterable withApiKey(String apiKey) {
        Utils.checkNotNull(apiKey, "apiKey");
        this.apiKey = apiKey;
        return this;
    }

    /**
     * The date from which you'd like to replicate data for Iterable, in the format YYYY-MM-DDT00:00:00Z.  All data generated after this date will be replicated.
     */
    public SourceIterable withStartDate(OffsetDateTime startDate) {
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
        SourceIterable other = (SourceIterable) o;
        return 
            Objects.deepEquals(this.apiKey, other.apiKey) &&
            Objects.deepEquals(this.sourceType, other.sourceType) &&
            Objects.deepEquals(this.startDate, other.startDate);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            apiKey,
            sourceType,
            startDate);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceIterable.class,
                "apiKey", apiKey,
                "sourceType", sourceType,
                "startDate", startDate);
    }
    
    public final static class Builder {
 
        private String apiKey;
 
        private OffsetDateTime startDate;
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Iterable API Key. See the &lt;a href=\"https://docs.airbyte.com/integrations/sources/iterable\"&gt;docs&lt;/a&gt;  for more information on how to obtain this key.
         */
        public Builder apiKey(String apiKey) {
            Utils.checkNotNull(apiKey, "apiKey");
            this.apiKey = apiKey;
            return this;
        }

        /**
         * The date from which you'd like to replicate data for Iterable, in the format YYYY-MM-DDT00:00:00Z.  All data generated after this date will be replicated.
         */
        public Builder startDate(OffsetDateTime startDate) {
            Utils.checkNotNull(startDate, "startDate");
            this.startDate = startDate;
            return this;
        }
        
        public SourceIterable build() {
            return new SourceIterable(
                apiKey,
                startDate);
        }

        private static final LazySingletonValue<Iterable> _SINGLETON_VALUE_SourceType =
                new LazySingletonValue<>(
                        "sourceType",
                        "\"iterable\"",
                        new TypeReference<Iterable>() {});
    }
}
