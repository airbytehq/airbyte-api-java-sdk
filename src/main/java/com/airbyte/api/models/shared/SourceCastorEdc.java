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
import java.lang.SuppressWarnings;
import java.time.OffsetDateTime;
import java.util.Objects;
import java.util.Optional;


public class SourceCastorEdc {

    /**
     * Visit `https://YOUR_REGION.castoredc.com/account/settings`
     */
    @JsonProperty("client_id")
    private String clientId;

    /**
     * Visit `https://YOUR_REGION.castoredc.com/account/settings`
     */
    @JsonProperty("client_secret")
    private String clientSecret;

    @JsonProperty("sourceType")
    private CastorEdc sourceType;

    @JsonProperty("start_date")
    private OffsetDateTime startDate;

    /**
     * The url region given at time of registration
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("url_region")
    private Optional<? extends URLRegion> urlRegion;

    @JsonCreator
    public SourceCastorEdc(
            @JsonProperty("client_id") String clientId,
            @JsonProperty("client_secret") String clientSecret,
            @JsonProperty("start_date") OffsetDateTime startDate,
            @JsonProperty("url_region") Optional<? extends URLRegion> urlRegion) {
        Utils.checkNotNull(clientId, "clientId");
        Utils.checkNotNull(clientSecret, "clientSecret");
        Utils.checkNotNull(startDate, "startDate");
        Utils.checkNotNull(urlRegion, "urlRegion");
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.sourceType = Builder._SINGLETON_VALUE_SourceType.value();
        this.startDate = startDate;
        this.urlRegion = urlRegion;
    }
    
    public SourceCastorEdc(
            String clientId,
            String clientSecret,
            OffsetDateTime startDate) {
        this(clientId, clientSecret, startDate, Optional.empty());
    }

    /**
     * Visit `https://YOUR_REGION.castoredc.com/account/settings`
     */
    @JsonIgnore
    public String clientId() {
        return clientId;
    }

    /**
     * Visit `https://YOUR_REGION.castoredc.com/account/settings`
     */
    @JsonIgnore
    public String clientSecret() {
        return clientSecret;
    }

    @JsonIgnore
    public CastorEdc sourceType() {
        return sourceType;
    }

    @JsonIgnore
    public OffsetDateTime startDate() {
        return startDate;
    }

    /**
     * The url region given at time of registration
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<URLRegion> urlRegion() {
        return (Optional<URLRegion>) urlRegion;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Visit `https://YOUR_REGION.castoredc.com/account/settings`
     */
    public SourceCastorEdc withClientId(String clientId) {
        Utils.checkNotNull(clientId, "clientId");
        this.clientId = clientId;
        return this;
    }

    /**
     * Visit `https://YOUR_REGION.castoredc.com/account/settings`
     */
    public SourceCastorEdc withClientSecret(String clientSecret) {
        Utils.checkNotNull(clientSecret, "clientSecret");
        this.clientSecret = clientSecret;
        return this;
    }

    public SourceCastorEdc withStartDate(OffsetDateTime startDate) {
        Utils.checkNotNull(startDate, "startDate");
        this.startDate = startDate;
        return this;
    }

    /**
     * The url region given at time of registration
     */
    public SourceCastorEdc withUrlRegion(URLRegion urlRegion) {
        Utils.checkNotNull(urlRegion, "urlRegion");
        this.urlRegion = Optional.ofNullable(urlRegion);
        return this;
    }

    /**
     * The url region given at time of registration
     */
    public SourceCastorEdc withUrlRegion(Optional<? extends URLRegion> urlRegion) {
        Utils.checkNotNull(urlRegion, "urlRegion");
        this.urlRegion = urlRegion;
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
        SourceCastorEdc other = (SourceCastorEdc) o;
        return 
            Objects.deepEquals(this.clientId, other.clientId) &&
            Objects.deepEquals(this.clientSecret, other.clientSecret) &&
            Objects.deepEquals(this.sourceType, other.sourceType) &&
            Objects.deepEquals(this.startDate, other.startDate) &&
            Objects.deepEquals(this.urlRegion, other.urlRegion);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            clientId,
            clientSecret,
            sourceType,
            startDate,
            urlRegion);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceCastorEdc.class,
                "clientId", clientId,
                "clientSecret", clientSecret,
                "sourceType", sourceType,
                "startDate", startDate,
                "urlRegion", urlRegion);
    }
    
    public final static class Builder {
 
        private String clientId;
 
        private String clientSecret;
 
        private OffsetDateTime startDate;
 
        private Optional<? extends URLRegion> urlRegion;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Visit `https://YOUR_REGION.castoredc.com/account/settings`
         */
        public Builder clientId(String clientId) {
            Utils.checkNotNull(clientId, "clientId");
            this.clientId = clientId;
            return this;
        }

        /**
         * Visit `https://YOUR_REGION.castoredc.com/account/settings`
         */
        public Builder clientSecret(String clientSecret) {
            Utils.checkNotNull(clientSecret, "clientSecret");
            this.clientSecret = clientSecret;
            return this;
        }

        public Builder startDate(OffsetDateTime startDate) {
            Utils.checkNotNull(startDate, "startDate");
            this.startDate = startDate;
            return this;
        }

        /**
         * The url region given at time of registration
         */
        public Builder urlRegion(URLRegion urlRegion) {
            Utils.checkNotNull(urlRegion, "urlRegion");
            this.urlRegion = Optional.ofNullable(urlRegion);
            return this;
        }

        /**
         * The url region given at time of registration
         */
        public Builder urlRegion(Optional<? extends URLRegion> urlRegion) {
            Utils.checkNotNull(urlRegion, "urlRegion");
            this.urlRegion = urlRegion;
            return this;
        }
        
        public SourceCastorEdc build() {
            if (urlRegion == null) {
                urlRegion = _SINGLETON_VALUE_UrlRegion.value();
            }            return new SourceCastorEdc(
                clientId,
                clientSecret,
                startDate,
                urlRegion);
        }

        private static final LazySingletonValue<CastorEdc> _SINGLETON_VALUE_SourceType =
                new LazySingletonValue<>(
                        "sourceType",
                        "\"castor-edc\"",
                        new TypeReference<CastorEdc>() {});

        private static final LazySingletonValue<Optional<? extends URLRegion>> _SINGLETON_VALUE_UrlRegion =
                new LazySingletonValue<>(
                        "url_region",
                        "\"uk\"",
                        new TypeReference<Optional<? extends URLRegion>>() {});
    }
}

