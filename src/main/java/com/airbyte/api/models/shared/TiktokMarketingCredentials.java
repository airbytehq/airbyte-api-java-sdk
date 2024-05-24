/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

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

public class TiktokMarketingCredentials {

    /**
     * The Developer Application App ID.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("app_id")
    private Optional<? extends String> appId;

    /**
     * The Developer Application Secret.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("secret")
    private Optional<? extends String> secret;

    @JsonCreator
    public TiktokMarketingCredentials(
            @JsonProperty("app_id") Optional<? extends String> appId,
            @JsonProperty("secret") Optional<? extends String> secret) {
        Utils.checkNotNull(appId, "appId");
        Utils.checkNotNull(secret, "secret");
        this.appId = appId;
        this.secret = secret;
    }
    
    public TiktokMarketingCredentials() {
        this(Optional.empty(), Optional.empty());
    }

    /**
     * The Developer Application App ID.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> appId() {
        return (Optional<String>) appId;
    }

    /**
     * The Developer Application Secret.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> secret() {
        return (Optional<String>) secret;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The Developer Application App ID.
     */
    public TiktokMarketingCredentials withAppId(String appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = Optional.ofNullable(appId);
        return this;
    }

    /**
     * The Developer Application App ID.
     */
    public TiktokMarketingCredentials withAppId(Optional<? extends String> appId) {
        Utils.checkNotNull(appId, "appId");
        this.appId = appId;
        return this;
    }

    /**
     * The Developer Application Secret.
     */
    public TiktokMarketingCredentials withSecret(String secret) {
        Utils.checkNotNull(secret, "secret");
        this.secret = Optional.ofNullable(secret);
        return this;
    }

    /**
     * The Developer Application Secret.
     */
    public TiktokMarketingCredentials withSecret(Optional<? extends String> secret) {
        Utils.checkNotNull(secret, "secret");
        this.secret = secret;
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
        TiktokMarketingCredentials other = (TiktokMarketingCredentials) o;
        return 
            java.util.Objects.deepEquals(this.appId, other.appId) &&
            java.util.Objects.deepEquals(this.secret, other.secret);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            appId,
            secret);
    }
    
    @Override
    public String toString() {
        return Utils.toString(TiktokMarketingCredentials.class,
                "appId", appId,
                "secret", secret);
    }
    
    public final static class Builder {
 
        private Optional<? extends String> appId = Optional.empty();
 
        private Optional<? extends String> secret = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The Developer Application App ID.
         */
        public Builder appId(String appId) {
            Utils.checkNotNull(appId, "appId");
            this.appId = Optional.ofNullable(appId);
            return this;
        }

        /**
         * The Developer Application App ID.
         */
        public Builder appId(Optional<? extends String> appId) {
            Utils.checkNotNull(appId, "appId");
            this.appId = appId;
            return this;
        }

        /**
         * The Developer Application Secret.
         */
        public Builder secret(String secret) {
            Utils.checkNotNull(secret, "secret");
            this.secret = Optional.ofNullable(secret);
            return this;
        }

        /**
         * The Developer Application Secret.
         */
        public Builder secret(Optional<? extends String> secret) {
            Utils.checkNotNull(secret, "secret");
            this.secret = secret;
            return this;
        }
        
        public TiktokMarketingCredentials build() {
            return new TiktokMarketingCredentials(
                appId,
                secret);
        }
    }
}

