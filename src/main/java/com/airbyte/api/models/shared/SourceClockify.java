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
import java.util.Objects;
import java.util.Optional;

public class SourceClockify {

    /**
     * You can get your api access_key &lt;a href="https://app.clockify.me/user/settings"&gt;here&lt;/a&gt; This API is Case Sensitive.
     */
    @JsonProperty("api_key")
    private String apiKey;

    /**
     * The URL for the Clockify API. This should only need to be modified if connecting to an enterprise version of Clockify.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("api_url")
    private Optional<String> apiUrl;

    @JsonProperty("sourceType")
    private Clockify sourceType;

    /**
     * WorkSpace Id
     */
    @JsonProperty("workspace_id")
    private String workspaceId;

    @JsonCreator
    public SourceClockify(
            @JsonProperty("api_key") String apiKey,
            @JsonProperty("api_url") Optional<String> apiUrl,
            @JsonProperty("workspace_id") String workspaceId) {
        Utils.checkNotNull(apiKey, "apiKey");
        Utils.checkNotNull(apiUrl, "apiUrl");
        Utils.checkNotNull(workspaceId, "workspaceId");
        this.apiKey = apiKey;
        this.apiUrl = apiUrl;
        this.sourceType = Builder._SINGLETON_VALUE_SourceType.value();
        this.workspaceId = workspaceId;
    }
    
    public SourceClockify(
            String apiKey,
            String workspaceId) {
        this(apiKey, Optional.empty(), workspaceId);
    }

    /**
     * You can get your api access_key &lt;a href="https://app.clockify.me/user/settings"&gt;here&lt;/a&gt; This API is Case Sensitive.
     */
    @JsonIgnore
    public String apiKey() {
        return apiKey;
    }

    /**
     * The URL for the Clockify API. This should only need to be modified if connecting to an enterprise version of Clockify.
     */
    @JsonIgnore
    public Optional<String> apiUrl() {
        return apiUrl;
    }

    @JsonIgnore
    public Clockify sourceType() {
        return sourceType;
    }

    /**
     * WorkSpace Id
     */
    @JsonIgnore
    public String workspaceId() {
        return workspaceId;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    /**
     * You can get your api access_key &lt;a href="https://app.clockify.me/user/settings"&gt;here&lt;/a&gt; This API is Case Sensitive.
     */
    public SourceClockify withApiKey(String apiKey) {
        Utils.checkNotNull(apiKey, "apiKey");
        this.apiKey = apiKey;
        return this;
    }

    /**
     * The URL for the Clockify API. This should only need to be modified if connecting to an enterprise version of Clockify.
     */
    public SourceClockify withApiUrl(String apiUrl) {
        Utils.checkNotNull(apiUrl, "apiUrl");
        this.apiUrl = Optional.ofNullable(apiUrl);
        return this;
    }

    /**
     * The URL for the Clockify API. This should only need to be modified if connecting to an enterprise version of Clockify.
     */
    public SourceClockify withApiUrl(Optional<String> apiUrl) {
        Utils.checkNotNull(apiUrl, "apiUrl");
        this.apiUrl = apiUrl;
        return this;
    }

    /**
     * WorkSpace Id
     */
    public SourceClockify withWorkspaceId(String workspaceId) {
        Utils.checkNotNull(workspaceId, "workspaceId");
        this.workspaceId = workspaceId;
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
        SourceClockify other = (SourceClockify) o;
        return 
            Objects.deepEquals(this.apiKey, other.apiKey) &&
            Objects.deepEquals(this.apiUrl, other.apiUrl) &&
            Objects.deepEquals(this.sourceType, other.sourceType) &&
            Objects.deepEquals(this.workspaceId, other.workspaceId);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            apiKey,
            apiUrl,
            sourceType,
            workspaceId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceClockify.class,
                "apiKey", apiKey,
                "apiUrl", apiUrl,
                "sourceType", sourceType,
                "workspaceId", workspaceId);
    }
    
    public final static class Builder {
 
        private String apiKey;
 
        private Optional<String> apiUrl;
 
        private String workspaceId;
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * You can get your api access_key &lt;a href="https://app.clockify.me/user/settings"&gt;here&lt;/a&gt; This API is Case Sensitive.
         */
        public Builder apiKey(String apiKey) {
            Utils.checkNotNull(apiKey, "apiKey");
            this.apiKey = apiKey;
            return this;
        }

        /**
         * The URL for the Clockify API. This should only need to be modified if connecting to an enterprise version of Clockify.
         */
        public Builder apiUrl(String apiUrl) {
            Utils.checkNotNull(apiUrl, "apiUrl");
            this.apiUrl = Optional.ofNullable(apiUrl);
            return this;
        }

        /**
         * The URL for the Clockify API. This should only need to be modified if connecting to an enterprise version of Clockify.
         */
        public Builder apiUrl(Optional<String> apiUrl) {
            Utils.checkNotNull(apiUrl, "apiUrl");
            this.apiUrl = apiUrl;
            return this;
        }

        /**
         * WorkSpace Id
         */
        public Builder workspaceId(String workspaceId) {
            Utils.checkNotNull(workspaceId, "workspaceId");
            this.workspaceId = workspaceId;
            return this;
        }
        
        public SourceClockify build() {
            if (apiUrl == null) {
                apiUrl = _SINGLETON_VALUE_ApiUrl.value();
            }
            return new SourceClockify(
                apiKey,
                apiUrl,
                workspaceId);
        }

        private static final LazySingletonValue<Optional<String>> _SINGLETON_VALUE_ApiUrl =
                new LazySingletonValue<>(
                        "api_url",
                        "\"https://api.clockify.me\"",
                        new TypeReference<Optional<String>>() {});

        private static final LazySingletonValue<Clockify> _SINGLETON_VALUE_SourceType =
                new LazySingletonValue<>(
                        "sourceType",
                        "\"clockify\"",
                        new TypeReference<Clockify>() {});
    }
}
