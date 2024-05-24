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

public class SourceNetsuite {

    /**
     * Consumer key associated with your integration
     */
    @JsonProperty("consumer_key")
    private String consumerKey;

    /**
     * Consumer secret associated with your integration
     */
    @JsonProperty("consumer_secret")
    private String consumerSecret;

    /**
     * The API names of the Netsuite objects you want to sync. Setting this speeds up the connection setup process by limiting the number of schemas that need to be retrieved from Netsuite.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("object_types")
    private Optional<? extends java.util.List<String>> objectTypes;

    /**
     * Netsuite realm e.g. 2344535, as for `production` or 2344535_SB1, as for the `sandbox`
     */
    @JsonProperty("realm")
    private String realm;

    @JsonProperty("sourceType")
    private Netsuite sourceType;

    /**
     * Starting point for your data replication, in format of "YYYY-MM-DDTHH:mm:ssZ"
     */
    @JsonProperty("start_datetime")
    private String startDatetime;

    /**
     * Access token key
     */
    @JsonProperty("token_key")
    private String tokenKey;

    /**
     * Access token secret
     */
    @JsonProperty("token_secret")
    private String tokenSecret;

    /**
     * The amount of days used to query the data with date chunks. Set smaller value, if you have lots of data.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("window_in_days")
    private Optional<? extends Long> windowInDays;

    @JsonCreator
    public SourceNetsuite(
            @JsonProperty("consumer_key") String consumerKey,
            @JsonProperty("consumer_secret") String consumerSecret,
            @JsonProperty("object_types") Optional<? extends java.util.List<String>> objectTypes,
            @JsonProperty("realm") String realm,
            @JsonProperty("start_datetime") String startDatetime,
            @JsonProperty("token_key") String tokenKey,
            @JsonProperty("token_secret") String tokenSecret,
            @JsonProperty("window_in_days") Optional<? extends Long> windowInDays) {
        Utils.checkNotNull(consumerKey, "consumerKey");
        Utils.checkNotNull(consumerSecret, "consumerSecret");
        Utils.checkNotNull(objectTypes, "objectTypes");
        Utils.checkNotNull(realm, "realm");
        Utils.checkNotNull(startDatetime, "startDatetime");
        Utils.checkNotNull(tokenKey, "tokenKey");
        Utils.checkNotNull(tokenSecret, "tokenSecret");
        Utils.checkNotNull(windowInDays, "windowInDays");
        this.consumerKey = consumerKey;
        this.consumerSecret = consumerSecret;
        this.objectTypes = objectTypes;
        this.realm = realm;
        this.sourceType = Builder._SINGLETON_VALUE_SourceType.value();
        this.startDatetime = startDatetime;
        this.tokenKey = tokenKey;
        this.tokenSecret = tokenSecret;
        this.windowInDays = windowInDays;
    }
    
    public SourceNetsuite(
            String consumerKey,
            String consumerSecret,
            String realm,
            String startDatetime,
            String tokenKey,
            String tokenSecret) {
        this(consumerKey, consumerSecret, Optional.empty(), realm, startDatetime, tokenKey, tokenSecret, Optional.empty());
    }

    /**
     * Consumer key associated with your integration
     */
    @JsonIgnore
    public String consumerKey() {
        return consumerKey;
    }

    /**
     * Consumer secret associated with your integration
     */
    @JsonIgnore
    public String consumerSecret() {
        return consumerSecret;
    }

    /**
     * The API names of the Netsuite objects you want to sync. Setting this speeds up the connection setup process by limiting the number of schemas that need to be retrieved from Netsuite.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<java.util.List<String>> objectTypes() {
        return (Optional<java.util.List<String>>) objectTypes;
    }

    /**
     * Netsuite realm e.g. 2344535, as for `production` or 2344535_SB1, as for the `sandbox`
     */
    @JsonIgnore
    public String realm() {
        return realm;
    }

    @JsonIgnore
    public Netsuite sourceType() {
        return sourceType;
    }

    /**
     * Starting point for your data replication, in format of "YYYY-MM-DDTHH:mm:ssZ"
     */
    @JsonIgnore
    public String startDatetime() {
        return startDatetime;
    }

    /**
     * Access token key
     */
    @JsonIgnore
    public String tokenKey() {
        return tokenKey;
    }

    /**
     * Access token secret
     */
    @JsonIgnore
    public String tokenSecret() {
        return tokenSecret;
    }

    /**
     * The amount of days used to query the data with date chunks. Set smaller value, if you have lots of data.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Long> windowInDays() {
        return (Optional<Long>) windowInDays;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Consumer key associated with your integration
     */
    public SourceNetsuite withConsumerKey(String consumerKey) {
        Utils.checkNotNull(consumerKey, "consumerKey");
        this.consumerKey = consumerKey;
        return this;
    }

    /**
     * Consumer secret associated with your integration
     */
    public SourceNetsuite withConsumerSecret(String consumerSecret) {
        Utils.checkNotNull(consumerSecret, "consumerSecret");
        this.consumerSecret = consumerSecret;
        return this;
    }

    /**
     * The API names of the Netsuite objects you want to sync. Setting this speeds up the connection setup process by limiting the number of schemas that need to be retrieved from Netsuite.
     */
    public SourceNetsuite withObjectTypes(java.util.List<String> objectTypes) {
        Utils.checkNotNull(objectTypes, "objectTypes");
        this.objectTypes = Optional.ofNullable(objectTypes);
        return this;
    }

    /**
     * The API names of the Netsuite objects you want to sync. Setting this speeds up the connection setup process by limiting the number of schemas that need to be retrieved from Netsuite.
     */
    public SourceNetsuite withObjectTypes(Optional<? extends java.util.List<String>> objectTypes) {
        Utils.checkNotNull(objectTypes, "objectTypes");
        this.objectTypes = objectTypes;
        return this;
    }

    /**
     * Netsuite realm e.g. 2344535, as for `production` or 2344535_SB1, as for the `sandbox`
     */
    public SourceNetsuite withRealm(String realm) {
        Utils.checkNotNull(realm, "realm");
        this.realm = realm;
        return this;
    }

    /**
     * Starting point for your data replication, in format of "YYYY-MM-DDTHH:mm:ssZ"
     */
    public SourceNetsuite withStartDatetime(String startDatetime) {
        Utils.checkNotNull(startDatetime, "startDatetime");
        this.startDatetime = startDatetime;
        return this;
    }

    /**
     * Access token key
     */
    public SourceNetsuite withTokenKey(String tokenKey) {
        Utils.checkNotNull(tokenKey, "tokenKey");
        this.tokenKey = tokenKey;
        return this;
    }

    /**
     * Access token secret
     */
    public SourceNetsuite withTokenSecret(String tokenSecret) {
        Utils.checkNotNull(tokenSecret, "tokenSecret");
        this.tokenSecret = tokenSecret;
        return this;
    }

    /**
     * The amount of days used to query the data with date chunks. Set smaller value, if you have lots of data.
     */
    public SourceNetsuite withWindowInDays(long windowInDays) {
        Utils.checkNotNull(windowInDays, "windowInDays");
        this.windowInDays = Optional.ofNullable(windowInDays);
        return this;
    }

    /**
     * The amount of days used to query the data with date chunks. Set smaller value, if you have lots of data.
     */
    public SourceNetsuite withWindowInDays(Optional<? extends Long> windowInDays) {
        Utils.checkNotNull(windowInDays, "windowInDays");
        this.windowInDays = windowInDays;
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
        SourceNetsuite other = (SourceNetsuite) o;
        return 
            java.util.Objects.deepEquals(this.consumerKey, other.consumerKey) &&
            java.util.Objects.deepEquals(this.consumerSecret, other.consumerSecret) &&
            java.util.Objects.deepEquals(this.objectTypes, other.objectTypes) &&
            java.util.Objects.deepEquals(this.realm, other.realm) &&
            java.util.Objects.deepEquals(this.sourceType, other.sourceType) &&
            java.util.Objects.deepEquals(this.startDatetime, other.startDatetime) &&
            java.util.Objects.deepEquals(this.tokenKey, other.tokenKey) &&
            java.util.Objects.deepEquals(this.tokenSecret, other.tokenSecret) &&
            java.util.Objects.deepEquals(this.windowInDays, other.windowInDays);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            consumerKey,
            consumerSecret,
            objectTypes,
            realm,
            sourceType,
            startDatetime,
            tokenKey,
            tokenSecret,
            windowInDays);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceNetsuite.class,
                "consumerKey", consumerKey,
                "consumerSecret", consumerSecret,
                "objectTypes", objectTypes,
                "realm", realm,
                "sourceType", sourceType,
                "startDatetime", startDatetime,
                "tokenKey", tokenKey,
                "tokenSecret", tokenSecret,
                "windowInDays", windowInDays);
    }
    
    public final static class Builder {
 
        private String consumerKey;
 
        private String consumerSecret;
 
        private Optional<? extends java.util.List<String>> objectTypes = Optional.empty();
 
        private String realm;
 
        private String startDatetime;
 
        private String tokenKey;
 
        private String tokenSecret;
 
        private Optional<? extends Long> windowInDays;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Consumer key associated with your integration
         */
        public Builder consumerKey(String consumerKey) {
            Utils.checkNotNull(consumerKey, "consumerKey");
            this.consumerKey = consumerKey;
            return this;
        }

        /**
         * Consumer secret associated with your integration
         */
        public Builder consumerSecret(String consumerSecret) {
            Utils.checkNotNull(consumerSecret, "consumerSecret");
            this.consumerSecret = consumerSecret;
            return this;
        }

        /**
         * The API names of the Netsuite objects you want to sync. Setting this speeds up the connection setup process by limiting the number of schemas that need to be retrieved from Netsuite.
         */
        public Builder objectTypes(java.util.List<String> objectTypes) {
            Utils.checkNotNull(objectTypes, "objectTypes");
            this.objectTypes = Optional.ofNullable(objectTypes);
            return this;
        }

        /**
         * The API names of the Netsuite objects you want to sync. Setting this speeds up the connection setup process by limiting the number of schemas that need to be retrieved from Netsuite.
         */
        public Builder objectTypes(Optional<? extends java.util.List<String>> objectTypes) {
            Utils.checkNotNull(objectTypes, "objectTypes");
            this.objectTypes = objectTypes;
            return this;
        }

        /**
         * Netsuite realm e.g. 2344535, as for `production` or 2344535_SB1, as for the `sandbox`
         */
        public Builder realm(String realm) {
            Utils.checkNotNull(realm, "realm");
            this.realm = realm;
            return this;
        }

        /**
         * Starting point for your data replication, in format of "YYYY-MM-DDTHH:mm:ssZ"
         */
        public Builder startDatetime(String startDatetime) {
            Utils.checkNotNull(startDatetime, "startDatetime");
            this.startDatetime = startDatetime;
            return this;
        }

        /**
         * Access token key
         */
        public Builder tokenKey(String tokenKey) {
            Utils.checkNotNull(tokenKey, "tokenKey");
            this.tokenKey = tokenKey;
            return this;
        }

        /**
         * Access token secret
         */
        public Builder tokenSecret(String tokenSecret) {
            Utils.checkNotNull(tokenSecret, "tokenSecret");
            this.tokenSecret = tokenSecret;
            return this;
        }

        /**
         * The amount of days used to query the data with date chunks. Set smaller value, if you have lots of data.
         */
        public Builder windowInDays(long windowInDays) {
            Utils.checkNotNull(windowInDays, "windowInDays");
            this.windowInDays = Optional.ofNullable(windowInDays);
            return this;
        }

        /**
         * The amount of days used to query the data with date chunks. Set smaller value, if you have lots of data.
         */
        public Builder windowInDays(Optional<? extends Long> windowInDays) {
            Utils.checkNotNull(windowInDays, "windowInDays");
            this.windowInDays = windowInDays;
            return this;
        }
        
        public SourceNetsuite build() {
            if (windowInDays == null) {
                windowInDays = _SINGLETON_VALUE_WindowInDays.value();
            }
            return new SourceNetsuite(
                consumerKey,
                consumerSecret,
                objectTypes,
                realm,
                startDatetime,
                tokenKey,
                tokenSecret,
                windowInDays);
        }

        private static final LazySingletonValue<Netsuite> _SINGLETON_VALUE_SourceType =
                new LazySingletonValue<>(
                        "sourceType",
                        "\"netsuite\"",
                        new TypeReference<Netsuite>() {});

        private static final LazySingletonValue<Optional<? extends Long>> _SINGLETON_VALUE_WindowInDays =
                new LazySingletonValue<>(
                        "window_in_days",
                        "30",
                        new TypeReference<Optional<? extends Long>>() {});
    }
}

