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

public class SourceVercel {

    /**
     * Access token to authenticate with the Vercel API. Create and manage tokens in your Vercel account settings.
     */
    @JsonProperty("access_token")
    private String accessToken;

    @JsonProperty("sourceType")
    private Vercel sourceType;

    @JsonProperty("start_date")
    private OffsetDateTime startDate;

    @JsonCreator
    public SourceVercel(
            @JsonProperty("access_token") String accessToken,
            @JsonProperty("start_date") OffsetDateTime startDate) {
        Utils.checkNotNull(accessToken, "accessToken");
        Utils.checkNotNull(startDate, "startDate");
        this.accessToken = accessToken;
        this.sourceType = Builder._SINGLETON_VALUE_SourceType.value();
        this.startDate = startDate;
    }

    /**
     * Access token to authenticate with the Vercel API. Create and manage tokens in your Vercel account settings.
     */
    @JsonIgnore
    public String accessToken() {
        return accessToken;
    }

    @JsonIgnore
    public Vercel sourceType() {
        return sourceType;
    }

    @JsonIgnore
    public OffsetDateTime startDate() {
        return startDate;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    /**
     * Access token to authenticate with the Vercel API. Create and manage tokens in your Vercel account settings.
     */
    public SourceVercel withAccessToken(String accessToken) {
        Utils.checkNotNull(accessToken, "accessToken");
        this.accessToken = accessToken;
        return this;
    }

    public SourceVercel withStartDate(OffsetDateTime startDate) {
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
        SourceVercel other = (SourceVercel) o;
        return 
            Objects.deepEquals(this.accessToken, other.accessToken) &&
            Objects.deepEquals(this.sourceType, other.sourceType) &&
            Objects.deepEquals(this.startDate, other.startDate);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            accessToken,
            sourceType,
            startDate);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceVercel.class,
                "accessToken", accessToken,
                "sourceType", sourceType,
                "startDate", startDate);
    }
    
    public final static class Builder {
 
        private String accessToken;
 
        private OffsetDateTime startDate;
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Access token to authenticate with the Vercel API. Create and manage tokens in your Vercel account settings.
         */
        public Builder accessToken(String accessToken) {
            Utils.checkNotNull(accessToken, "accessToken");
            this.accessToken = accessToken;
            return this;
        }

        public Builder startDate(OffsetDateTime startDate) {
            Utils.checkNotNull(startDate, "startDate");
            this.startDate = startDate;
            return this;
        }
        
        public SourceVercel build() {
            return new SourceVercel(
                accessToken,
                startDate);
        }

        private static final LazySingletonValue<Vercel> _SINGLETON_VALUE_SourceType =
                new LazySingletonValue<>(
                        "sourceType",
                        "\"vercel\"",
                        new TypeReference<Vercel>() {});
    }
}
