/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;


import com.airbyte.api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;


public class AmazonSellerPartner {

    /**
     * Your Login with Amazon Client ID.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("lwa_app_id")
    private Optional<String> lwaAppId;

    /**
     * Your Login with Amazon Client Secret.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("lwa_client_secret")
    private Optional<String> lwaClientSecret;

    @JsonCreator
    public AmazonSellerPartner(
            @JsonProperty("lwa_app_id") Optional<String> lwaAppId,
            @JsonProperty("lwa_client_secret") Optional<String> lwaClientSecret) {
        Utils.checkNotNull(lwaAppId, "lwaAppId");
        Utils.checkNotNull(lwaClientSecret, "lwaClientSecret");
        this.lwaAppId = lwaAppId;
        this.lwaClientSecret = lwaClientSecret;
    }
    
    public AmazonSellerPartner() {
        this(Optional.empty(), Optional.empty());
    }

    /**
     * Your Login with Amazon Client ID.
     */
    @JsonIgnore
    public Optional<String> lwaAppId() {
        return lwaAppId;
    }

    /**
     * Your Login with Amazon Client Secret.
     */
    @JsonIgnore
    public Optional<String> lwaClientSecret() {
        return lwaClientSecret;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Your Login with Amazon Client ID.
     */
    public AmazonSellerPartner withLwaAppId(String lwaAppId) {
        Utils.checkNotNull(lwaAppId, "lwaAppId");
        this.lwaAppId = Optional.ofNullable(lwaAppId);
        return this;
    }

    /**
     * Your Login with Amazon Client ID.
     */
    public AmazonSellerPartner withLwaAppId(Optional<String> lwaAppId) {
        Utils.checkNotNull(lwaAppId, "lwaAppId");
        this.lwaAppId = lwaAppId;
        return this;
    }

    /**
     * Your Login with Amazon Client Secret.
     */
    public AmazonSellerPartner withLwaClientSecret(String lwaClientSecret) {
        Utils.checkNotNull(lwaClientSecret, "lwaClientSecret");
        this.lwaClientSecret = Optional.ofNullable(lwaClientSecret);
        return this;
    }

    /**
     * Your Login with Amazon Client Secret.
     */
    public AmazonSellerPartner withLwaClientSecret(Optional<String> lwaClientSecret) {
        Utils.checkNotNull(lwaClientSecret, "lwaClientSecret");
        this.lwaClientSecret = lwaClientSecret;
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
        AmazonSellerPartner other = (AmazonSellerPartner) o;
        return 
            Objects.deepEquals(this.lwaAppId, other.lwaAppId) &&
            Objects.deepEquals(this.lwaClientSecret, other.lwaClientSecret);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            lwaAppId,
            lwaClientSecret);
    }
    
    @Override
    public String toString() {
        return Utils.toString(AmazonSellerPartner.class,
                "lwaAppId", lwaAppId,
                "lwaClientSecret", lwaClientSecret);
    }
    
    public final static class Builder {
 
        private Optional<String> lwaAppId = Optional.empty();
 
        private Optional<String> lwaClientSecret = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Your Login with Amazon Client ID.
         */
        public Builder lwaAppId(String lwaAppId) {
            Utils.checkNotNull(lwaAppId, "lwaAppId");
            this.lwaAppId = Optional.ofNullable(lwaAppId);
            return this;
        }

        /**
         * Your Login with Amazon Client ID.
         */
        public Builder lwaAppId(Optional<String> lwaAppId) {
            Utils.checkNotNull(lwaAppId, "lwaAppId");
            this.lwaAppId = lwaAppId;
            return this;
        }

        /**
         * Your Login with Amazon Client Secret.
         */
        public Builder lwaClientSecret(String lwaClientSecret) {
            Utils.checkNotNull(lwaClientSecret, "lwaClientSecret");
            this.lwaClientSecret = Optional.ofNullable(lwaClientSecret);
            return this;
        }

        /**
         * Your Login with Amazon Client Secret.
         */
        public Builder lwaClientSecret(Optional<String> lwaClientSecret) {
            Utils.checkNotNull(lwaClientSecret, "lwaClientSecret");
            this.lwaClientSecret = lwaClientSecret;
            return this;
        }
        
        public AmazonSellerPartner build() {
            return new AmazonSellerPartner(
                lwaAppId,
                lwaClientSecret);
        }
    }
}

