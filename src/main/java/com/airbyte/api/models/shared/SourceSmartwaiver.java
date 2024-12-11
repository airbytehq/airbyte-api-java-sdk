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
import java.time.OffsetDateTime;
import java.util.Objects;
import java.util.Optional;


public class SourceSmartwaiver {

    /**
     * You can retrieve your token by visiting your dashboard then click on My Account then click on API keys.
     */
    @JsonProperty("api_key")
    private String apiKey;

    @JsonProperty("sourceType")
    private Smartwaiver sourceType;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("start_date")
    private Optional<String> startDate;

    @JsonProperty("start_date_2")
    private OffsetDateTime startDate2;

    @JsonCreator
    public SourceSmartwaiver(
            @JsonProperty("api_key") String apiKey,
            @JsonProperty("start_date") Optional<String> startDate,
            @JsonProperty("start_date_2") OffsetDateTime startDate2) {
        Utils.checkNotNull(apiKey, "apiKey");
        Utils.checkNotNull(startDate, "startDate");
        Utils.checkNotNull(startDate2, "startDate2");
        this.apiKey = apiKey;
        this.sourceType = Builder._SINGLETON_VALUE_SourceType.value();
        this.startDate = startDate;
        this.startDate2 = startDate2;
    }
    
    public SourceSmartwaiver(
            String apiKey,
            OffsetDateTime startDate2) {
        this(apiKey, Optional.empty(), startDate2);
    }

    /**
     * You can retrieve your token by visiting your dashboard then click on My Account then click on API keys.
     */
    @JsonIgnore
    public String apiKey() {
        return apiKey;
    }

    @JsonIgnore
    public Smartwaiver sourceType() {
        return sourceType;
    }

    @JsonIgnore
    public Optional<String> startDate() {
        return startDate;
    }

    @JsonIgnore
    public OffsetDateTime startDate2() {
        return startDate2;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * You can retrieve your token by visiting your dashboard then click on My Account then click on API keys.
     */
    public SourceSmartwaiver withApiKey(String apiKey) {
        Utils.checkNotNull(apiKey, "apiKey");
        this.apiKey = apiKey;
        return this;
    }

    public SourceSmartwaiver withStartDate(String startDate) {
        Utils.checkNotNull(startDate, "startDate");
        this.startDate = Optional.ofNullable(startDate);
        return this;
    }

    public SourceSmartwaiver withStartDate(Optional<String> startDate) {
        Utils.checkNotNull(startDate, "startDate");
        this.startDate = startDate;
        return this;
    }

    public SourceSmartwaiver withStartDate2(OffsetDateTime startDate2) {
        Utils.checkNotNull(startDate2, "startDate2");
        this.startDate2 = startDate2;
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
        SourceSmartwaiver other = (SourceSmartwaiver) o;
        return 
            Objects.deepEquals(this.apiKey, other.apiKey) &&
            Objects.deepEquals(this.sourceType, other.sourceType) &&
            Objects.deepEquals(this.startDate, other.startDate) &&
            Objects.deepEquals(this.startDate2, other.startDate2);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            apiKey,
            sourceType,
            startDate,
            startDate2);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceSmartwaiver.class,
                "apiKey", apiKey,
                "sourceType", sourceType,
                "startDate", startDate,
                "startDate2", startDate2);
    }
    
    public final static class Builder {
 
        private String apiKey;
 
        private Optional<String> startDate;
 
        private OffsetDateTime startDate2;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * You can retrieve your token by visiting your dashboard then click on My Account then click on API keys.
         */
        public Builder apiKey(String apiKey) {
            Utils.checkNotNull(apiKey, "apiKey");
            this.apiKey = apiKey;
            return this;
        }

        public Builder startDate(String startDate) {
            Utils.checkNotNull(startDate, "startDate");
            this.startDate = Optional.ofNullable(startDate);
            return this;
        }

        public Builder startDate(Optional<String> startDate) {
            Utils.checkNotNull(startDate, "startDate");
            this.startDate = startDate;
            return this;
        }

        public Builder startDate2(OffsetDateTime startDate2) {
            Utils.checkNotNull(startDate2, "startDate2");
            this.startDate2 = startDate2;
            return this;
        }
        
        public SourceSmartwaiver build() {
            if (startDate == null) {
                startDate = _SINGLETON_VALUE_StartDate.value();
            }            return new SourceSmartwaiver(
                apiKey,
                startDate,
                startDate2);
        }

        private static final LazySingletonValue<Smartwaiver> _SINGLETON_VALUE_SourceType =
                new LazySingletonValue<>(
                        "sourceType",
                        "\"smartwaiver\"",
                        new TypeReference<Smartwaiver>() {});

        private static final LazySingletonValue<Optional<String>> _SINGLETON_VALUE_StartDate =
                new LazySingletonValue<>(
                        "start_date",
                        "\"2017-01-24 13:12:29\"",
                        new TypeReference<Optional<String>>() {});
    }
}

