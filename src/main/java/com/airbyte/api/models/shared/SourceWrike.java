/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.airbyte.api.utils.LazySingletonValue;
import com.airbyte.api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Optional;

public class SourceWrike {

    /**
     * Permanent access token. You can find documentation on how to acquire a permanent access token  &lt;a href="https://developers.wrike.com/oauth-20-authorization/"&gt;here&lt;/a&gt;
     */
    @JsonProperty("access_token")
    private String accessToken;

    @JsonProperty("sourceType")
    private Wrike sourceType;

    /**
     * UTC date and time in the format 2017-01-25T00:00:00Z. Only comments after this date will be replicated.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("start_date")
    private Optional<? extends String> startDate;

    /**
     * Wrike's instance such as `app-us2.wrike.com`
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("wrike_instance")
    private Optional<? extends String> wrikeInstance;

    @JsonCreator
    public SourceWrike(
            @JsonProperty("access_token") String accessToken,
            @JsonProperty("start_date") Optional<? extends String> startDate,
            @JsonProperty("wrike_instance") Optional<? extends String> wrikeInstance) {
        Utils.checkNotNull(accessToken, "accessToken");
        Utils.checkNotNull(startDate, "startDate");
        Utils.checkNotNull(wrikeInstance, "wrikeInstance");
        this.accessToken = accessToken;
        this.sourceType = Builder._SINGLETON_VALUE_SourceType.value();
        this.startDate = startDate;
        this.wrikeInstance = wrikeInstance;
    }
    
    public SourceWrike(
            String accessToken) {
        this(accessToken, Optional.empty(), Optional.empty());
    }

    /**
     * Permanent access token. You can find documentation on how to acquire a permanent access token  &lt;a href="https://developers.wrike.com/oauth-20-authorization/"&gt;here&lt;/a&gt;
     */
    @JsonIgnore
    public String accessToken() {
        return accessToken;
    }

    @JsonIgnore
    public Wrike sourceType() {
        return sourceType;
    }

    /**
     * UTC date and time in the format 2017-01-25T00:00:00Z. Only comments after this date will be replicated.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> startDate() {
        return (Optional<String>) startDate;
    }

    /**
     * Wrike's instance such as `app-us2.wrike.com`
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> wrikeInstance() {
        return (Optional<String>) wrikeInstance;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Permanent access token. You can find documentation on how to acquire a permanent access token  &lt;a href="https://developers.wrike.com/oauth-20-authorization/"&gt;here&lt;/a&gt;
     */
    public SourceWrike withAccessToken(String accessToken) {
        Utils.checkNotNull(accessToken, "accessToken");
        this.accessToken = accessToken;
        return this;
    }

    /**
     * UTC date and time in the format 2017-01-25T00:00:00Z. Only comments after this date will be replicated.
     */
    public SourceWrike withStartDate(String startDate) {
        Utils.checkNotNull(startDate, "startDate");
        this.startDate = Optional.ofNullable(startDate);
        return this;
    }

    /**
     * UTC date and time in the format 2017-01-25T00:00:00Z. Only comments after this date will be replicated.
     */
    public SourceWrike withStartDate(Optional<? extends String> startDate) {
        Utils.checkNotNull(startDate, "startDate");
        this.startDate = startDate;
        return this;
    }

    /**
     * Wrike's instance such as `app-us2.wrike.com`
     */
    public SourceWrike withWrikeInstance(String wrikeInstance) {
        Utils.checkNotNull(wrikeInstance, "wrikeInstance");
        this.wrikeInstance = Optional.ofNullable(wrikeInstance);
        return this;
    }

    /**
     * Wrike's instance such as `app-us2.wrike.com`
     */
    public SourceWrike withWrikeInstance(Optional<? extends String> wrikeInstance) {
        Utils.checkNotNull(wrikeInstance, "wrikeInstance");
        this.wrikeInstance = wrikeInstance;
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
        SourceWrike other = (SourceWrike) o;
        return 
            java.util.Objects.deepEquals(this.accessToken, other.accessToken) &&
            java.util.Objects.deepEquals(this.sourceType, other.sourceType) &&
            java.util.Objects.deepEquals(this.startDate, other.startDate) &&
            java.util.Objects.deepEquals(this.wrikeInstance, other.wrikeInstance);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            accessToken,
            sourceType,
            startDate,
            wrikeInstance);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceWrike.class,
                "accessToken", accessToken,
                "sourceType", sourceType,
                "startDate", startDate,
                "wrikeInstance", wrikeInstance);
    }
    
    public final static class Builder {
 
        private String accessToken;
 
        private Optional<? extends String> startDate = Optional.empty();
 
        private Optional<? extends String> wrikeInstance;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Permanent access token. You can find documentation on how to acquire a permanent access token  &lt;a href="https://developers.wrike.com/oauth-20-authorization/"&gt;here&lt;/a&gt;
         */
        public Builder accessToken(String accessToken) {
            Utils.checkNotNull(accessToken, "accessToken");
            this.accessToken = accessToken;
            return this;
        }

        /**
         * UTC date and time in the format 2017-01-25T00:00:00Z. Only comments after this date will be replicated.
         */
        public Builder startDate(String startDate) {
            Utils.checkNotNull(startDate, "startDate");
            this.startDate = Optional.ofNullable(startDate);
            return this;
        }

        /**
         * UTC date and time in the format 2017-01-25T00:00:00Z. Only comments after this date will be replicated.
         */
        public Builder startDate(Optional<? extends String> startDate) {
            Utils.checkNotNull(startDate, "startDate");
            this.startDate = startDate;
            return this;
        }

        /**
         * Wrike's instance such as `app-us2.wrike.com`
         */
        public Builder wrikeInstance(String wrikeInstance) {
            Utils.checkNotNull(wrikeInstance, "wrikeInstance");
            this.wrikeInstance = Optional.ofNullable(wrikeInstance);
            return this;
        }

        /**
         * Wrike's instance such as `app-us2.wrike.com`
         */
        public Builder wrikeInstance(Optional<? extends String> wrikeInstance) {
            Utils.checkNotNull(wrikeInstance, "wrikeInstance");
            this.wrikeInstance = wrikeInstance;
            return this;
        }
        
        public SourceWrike build() {
            if (wrikeInstance == null) {
                wrikeInstance = _SINGLETON_VALUE_WrikeInstance.value();
            }
            return new SourceWrike(
                accessToken,
                startDate,
                wrikeInstance);
        }

        private static final LazySingletonValue<Wrike> _SINGLETON_VALUE_SourceType =
                new LazySingletonValue<>(
                        "sourceType",
                        "\"wrike\"",
                        new TypeReference<Wrike>() {});

        private static final LazySingletonValue<Optional<? extends String>> _SINGLETON_VALUE_WrikeInstance =
                new LazySingletonValue<>(
                        "wrike_instance",
                        "\"app-us2.wrike.com\"",
                        new TypeReference<Optional<? extends String>>() {});
    }
}

