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

public class SourceBuzzsprout {

    @JsonProperty("api_key")
    private String apiKey;

    /**
     * Podcast ID found in `https://www.buzzsprout.com/my/profile/api`
     */
    @JsonProperty("podcast_id")
    private String podcastId;

    @JsonProperty("sourceType")
    private Buzzsprout sourceType;

    @JsonProperty("start_date")
    private OffsetDateTime startDate;

    @JsonCreator
    public SourceBuzzsprout(
            @JsonProperty("api_key") String apiKey,
            @JsonProperty("podcast_id") String podcastId,
            @JsonProperty("start_date") OffsetDateTime startDate) {
        Utils.checkNotNull(apiKey, "apiKey");
        Utils.checkNotNull(podcastId, "podcastId");
        Utils.checkNotNull(startDate, "startDate");
        this.apiKey = apiKey;
        this.podcastId = podcastId;
        this.sourceType = Builder._SINGLETON_VALUE_SourceType.value();
        this.startDate = startDate;
    }

    @JsonIgnore
    public String apiKey() {
        return apiKey;
    }

    /**
     * Podcast ID found in `https://www.buzzsprout.com/my/profile/api`
     */
    @JsonIgnore
    public String podcastId() {
        return podcastId;
    }

    @JsonIgnore
    public Buzzsprout sourceType() {
        return sourceType;
    }

    @JsonIgnore
    public OffsetDateTime startDate() {
        return startDate;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    public SourceBuzzsprout withApiKey(String apiKey) {
        Utils.checkNotNull(apiKey, "apiKey");
        this.apiKey = apiKey;
        return this;
    }

    /**
     * Podcast ID found in `https://www.buzzsprout.com/my/profile/api`
     */
    public SourceBuzzsprout withPodcastId(String podcastId) {
        Utils.checkNotNull(podcastId, "podcastId");
        this.podcastId = podcastId;
        return this;
    }

    public SourceBuzzsprout withStartDate(OffsetDateTime startDate) {
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
        SourceBuzzsprout other = (SourceBuzzsprout) o;
        return 
            Objects.deepEquals(this.apiKey, other.apiKey) &&
            Objects.deepEquals(this.podcastId, other.podcastId) &&
            Objects.deepEquals(this.sourceType, other.sourceType) &&
            Objects.deepEquals(this.startDate, other.startDate);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            apiKey,
            podcastId,
            sourceType,
            startDate);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceBuzzsprout.class,
                "apiKey", apiKey,
                "podcastId", podcastId,
                "sourceType", sourceType,
                "startDate", startDate);
    }
    
    public final static class Builder {
 
        private String apiKey;
 
        private String podcastId;
 
        private OffsetDateTime startDate;
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder apiKey(String apiKey) {
            Utils.checkNotNull(apiKey, "apiKey");
            this.apiKey = apiKey;
            return this;
        }

        /**
         * Podcast ID found in `https://www.buzzsprout.com/my/profile/api`
         */
        public Builder podcastId(String podcastId) {
            Utils.checkNotNull(podcastId, "podcastId");
            this.podcastId = podcastId;
            return this;
        }

        public Builder startDate(OffsetDateTime startDate) {
            Utils.checkNotNull(startDate, "startDate");
            this.startDate = startDate;
            return this;
        }
        
        public SourceBuzzsprout build() {
            return new SourceBuzzsprout(
                apiKey,
                podcastId,
                startDate);
        }

        private static final LazySingletonValue<Buzzsprout> _SINGLETON_VALUE_SourceType =
                new LazySingletonValue<>(
                        "sourceType",
                        "\"buzzsprout\"",
                        new TypeReference<Buzzsprout>() {});
    }
}
