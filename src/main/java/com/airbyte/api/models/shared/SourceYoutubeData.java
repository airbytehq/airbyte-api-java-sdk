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
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

public class SourceYoutubeData {

    @JsonProperty("api_key")
    private String apiKey;

    @JsonProperty("channel_ids")
    private List<Object> channelIds;

    @JsonProperty("sourceType")
    private YoutubeData sourceType;

    @JsonCreator
    public SourceYoutubeData(
            @JsonProperty("api_key") String apiKey,
            @JsonProperty("channel_ids") List<Object> channelIds) {
        Utils.checkNotNull(apiKey, "apiKey");
        Utils.checkNotNull(channelIds, "channelIds");
        this.apiKey = apiKey;
        this.channelIds = channelIds;
        this.sourceType = Builder._SINGLETON_VALUE_SourceType.value();
    }

    @JsonIgnore
    public String apiKey() {
        return apiKey;
    }

    @JsonIgnore
    public List<Object> channelIds() {
        return channelIds;
    }

    @JsonIgnore
    public YoutubeData sourceType() {
        return sourceType;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    public SourceYoutubeData withApiKey(String apiKey) {
        Utils.checkNotNull(apiKey, "apiKey");
        this.apiKey = apiKey;
        return this;
    }

    public SourceYoutubeData withChannelIds(List<Object> channelIds) {
        Utils.checkNotNull(channelIds, "channelIds");
        this.channelIds = channelIds;
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
        SourceYoutubeData other = (SourceYoutubeData) o;
        return 
            Objects.deepEquals(this.apiKey, other.apiKey) &&
            Objects.deepEquals(this.channelIds, other.channelIds) &&
            Objects.deepEquals(this.sourceType, other.sourceType);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            apiKey,
            channelIds,
            sourceType);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceYoutubeData.class,
                "apiKey", apiKey,
                "channelIds", channelIds,
                "sourceType", sourceType);
    }
    
    public final static class Builder {
 
        private String apiKey;
 
        private List<Object> channelIds;
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder apiKey(String apiKey) {
            Utils.checkNotNull(apiKey, "apiKey");
            this.apiKey = apiKey;
            return this;
        }

        public Builder channelIds(List<Object> channelIds) {
            Utils.checkNotNull(channelIds, "channelIds");
            this.channelIds = channelIds;
            return this;
        }
        
        public SourceYoutubeData build() {
            return new SourceYoutubeData(
                apiKey,
                channelIds);
        }

        private static final LazySingletonValue<YoutubeData> _SINGLETON_VALUE_SourceType =
                new LazySingletonValue<>(
                        "sourceType",
                        "\"youtube-data\"",
                        new TypeReference<YoutubeData>() {});
    }
}
