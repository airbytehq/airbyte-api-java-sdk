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

public class SourceGmail {

    @JsonProperty("client_id")
    private String clientId;

    @JsonProperty("client_refresh_token")
    private String clientRefreshToken;

    @JsonProperty("client_secret")
    private String clientSecret;

    /**
     * Include drafts/messages from SPAM and TRASH in the results. Defaults to false.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("include_spam_and_trash")
    private Optional<? extends Boolean> includeSpamAndTrash;

    @JsonProperty("sourceType")
    private Gmail sourceType;

    @JsonCreator
    public SourceGmail(
            @JsonProperty("client_id") String clientId,
            @JsonProperty("client_refresh_token") String clientRefreshToken,
            @JsonProperty("client_secret") String clientSecret,
            @JsonProperty("include_spam_and_trash") Optional<? extends Boolean> includeSpamAndTrash) {
        Utils.checkNotNull(clientId, "clientId");
        Utils.checkNotNull(clientRefreshToken, "clientRefreshToken");
        Utils.checkNotNull(clientSecret, "clientSecret");
        Utils.checkNotNull(includeSpamAndTrash, "includeSpamAndTrash");
        this.clientId = clientId;
        this.clientRefreshToken = clientRefreshToken;
        this.clientSecret = clientSecret;
        this.includeSpamAndTrash = includeSpamAndTrash;
        this.sourceType = Builder._SINGLETON_VALUE_SourceType.value();
    }
    
    public SourceGmail(
            String clientId,
            String clientRefreshToken,
            String clientSecret) {
        this(clientId, clientRefreshToken, clientSecret, Optional.empty());
    }

    @JsonIgnore
    public String clientId() {
        return clientId;
    }

    @JsonIgnore
    public String clientRefreshToken() {
        return clientRefreshToken;
    }

    @JsonIgnore
    public String clientSecret() {
        return clientSecret;
    }

    /**
     * Include drafts/messages from SPAM and TRASH in the results. Defaults to false.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Boolean> includeSpamAndTrash() {
        return (Optional<Boolean>) includeSpamAndTrash;
    }

    @JsonIgnore
    public Gmail sourceType() {
        return sourceType;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public SourceGmail withClientId(String clientId) {
        Utils.checkNotNull(clientId, "clientId");
        this.clientId = clientId;
        return this;
    }

    public SourceGmail withClientRefreshToken(String clientRefreshToken) {
        Utils.checkNotNull(clientRefreshToken, "clientRefreshToken");
        this.clientRefreshToken = clientRefreshToken;
        return this;
    }

    public SourceGmail withClientSecret(String clientSecret) {
        Utils.checkNotNull(clientSecret, "clientSecret");
        this.clientSecret = clientSecret;
        return this;
    }

    /**
     * Include drafts/messages from SPAM and TRASH in the results. Defaults to false.
     */
    public SourceGmail withIncludeSpamAndTrash(boolean includeSpamAndTrash) {
        Utils.checkNotNull(includeSpamAndTrash, "includeSpamAndTrash");
        this.includeSpamAndTrash = Optional.ofNullable(includeSpamAndTrash);
        return this;
    }

    /**
     * Include drafts/messages from SPAM and TRASH in the results. Defaults to false.
     */
    public SourceGmail withIncludeSpamAndTrash(Optional<? extends Boolean> includeSpamAndTrash) {
        Utils.checkNotNull(includeSpamAndTrash, "includeSpamAndTrash");
        this.includeSpamAndTrash = includeSpamAndTrash;
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
        SourceGmail other = (SourceGmail) o;
        return 
            java.util.Objects.deepEquals(this.clientId, other.clientId) &&
            java.util.Objects.deepEquals(this.clientRefreshToken, other.clientRefreshToken) &&
            java.util.Objects.deepEquals(this.clientSecret, other.clientSecret) &&
            java.util.Objects.deepEquals(this.includeSpamAndTrash, other.includeSpamAndTrash) &&
            java.util.Objects.deepEquals(this.sourceType, other.sourceType);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            clientId,
            clientRefreshToken,
            clientSecret,
            includeSpamAndTrash,
            sourceType);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceGmail.class,
                "clientId", clientId,
                "clientRefreshToken", clientRefreshToken,
                "clientSecret", clientSecret,
                "includeSpamAndTrash", includeSpamAndTrash,
                "sourceType", sourceType);
    }
    
    public final static class Builder {
 
        private String clientId;
 
        private String clientRefreshToken;
 
        private String clientSecret;
 
        private Optional<? extends Boolean> includeSpamAndTrash;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder clientId(String clientId) {
            Utils.checkNotNull(clientId, "clientId");
            this.clientId = clientId;
            return this;
        }

        public Builder clientRefreshToken(String clientRefreshToken) {
            Utils.checkNotNull(clientRefreshToken, "clientRefreshToken");
            this.clientRefreshToken = clientRefreshToken;
            return this;
        }

        public Builder clientSecret(String clientSecret) {
            Utils.checkNotNull(clientSecret, "clientSecret");
            this.clientSecret = clientSecret;
            return this;
        }

        /**
         * Include drafts/messages from SPAM and TRASH in the results. Defaults to false.
         */
        public Builder includeSpamAndTrash(boolean includeSpamAndTrash) {
            Utils.checkNotNull(includeSpamAndTrash, "includeSpamAndTrash");
            this.includeSpamAndTrash = Optional.ofNullable(includeSpamAndTrash);
            return this;
        }

        /**
         * Include drafts/messages from SPAM and TRASH in the results. Defaults to false.
         */
        public Builder includeSpamAndTrash(Optional<? extends Boolean> includeSpamAndTrash) {
            Utils.checkNotNull(includeSpamAndTrash, "includeSpamAndTrash");
            this.includeSpamAndTrash = includeSpamAndTrash;
            return this;
        }
        
        public SourceGmail build() {
            if (includeSpamAndTrash == null) {
                includeSpamAndTrash = _SINGLETON_VALUE_IncludeSpamAndTrash.value();
            }
            return new SourceGmail(
                clientId,
                clientRefreshToken,
                clientSecret,
                includeSpamAndTrash);
        }

        private static final LazySingletonValue<Optional<? extends Boolean>> _SINGLETON_VALUE_IncludeSpamAndTrash =
                new LazySingletonValue<>(
                        "include_spam_and_trash",
                        "false",
                        new TypeReference<Optional<? extends Boolean>>() {});

        private static final LazySingletonValue<Gmail> _SINGLETON_VALUE_SourceType =
                new LazySingletonValue<>(
                        "sourceType",
                        "\"gmail\"",
                        new TypeReference<Gmail>() {});
    }
}

