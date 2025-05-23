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
import java.util.Objects;

public class SourceTwilioTaskrouter {

    /**
     * Twilio Account ID
     */
    @JsonProperty("account_sid")
    private String accountSid;

    /**
     * Twilio Auth Token
     */
    @JsonProperty("auth_token")
    private String authToken;

    @JsonProperty("sourceType")
    private TwilioTaskrouter sourceType;

    @JsonCreator
    public SourceTwilioTaskrouter(
            @JsonProperty("account_sid") String accountSid,
            @JsonProperty("auth_token") String authToken) {
        Utils.checkNotNull(accountSid, "accountSid");
        Utils.checkNotNull(authToken, "authToken");
        this.accountSid = accountSid;
        this.authToken = authToken;
        this.sourceType = Builder._SINGLETON_VALUE_SourceType.value();
    }

    /**
     * Twilio Account ID
     */
    @JsonIgnore
    public String accountSid() {
        return accountSid;
    }

    /**
     * Twilio Auth Token
     */
    @JsonIgnore
    public String authToken() {
        return authToken;
    }

    @JsonIgnore
    public TwilioTaskrouter sourceType() {
        return sourceType;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    /**
     * Twilio Account ID
     */
    public SourceTwilioTaskrouter withAccountSid(String accountSid) {
        Utils.checkNotNull(accountSid, "accountSid");
        this.accountSid = accountSid;
        return this;
    }

    /**
     * Twilio Auth Token
     */
    public SourceTwilioTaskrouter withAuthToken(String authToken) {
        Utils.checkNotNull(authToken, "authToken");
        this.authToken = authToken;
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
        SourceTwilioTaskrouter other = (SourceTwilioTaskrouter) o;
        return 
            Objects.deepEquals(this.accountSid, other.accountSid) &&
            Objects.deepEquals(this.authToken, other.authToken) &&
            Objects.deepEquals(this.sourceType, other.sourceType);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            accountSid,
            authToken,
            sourceType);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceTwilioTaskrouter.class,
                "accountSid", accountSid,
                "authToken", authToken,
                "sourceType", sourceType);
    }
    
    public final static class Builder {
 
        private String accountSid;
 
        private String authToken;
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Twilio Account ID
         */
        public Builder accountSid(String accountSid) {
            Utils.checkNotNull(accountSid, "accountSid");
            this.accountSid = accountSid;
            return this;
        }

        /**
         * Twilio Auth Token
         */
        public Builder authToken(String authToken) {
            Utils.checkNotNull(authToken, "authToken");
            this.authToken = authToken;
            return this;
        }
        
        public SourceTwilioTaskrouter build() {
            return new SourceTwilioTaskrouter(
                accountSid,
                authToken);
        }

        private static final LazySingletonValue<TwilioTaskrouter> _SINGLETON_VALUE_SourceType =
                new LazySingletonValue<>(
                        "sourceType",
                        "\"twilio-taskrouter\"",
                        new TypeReference<TwilioTaskrouter>() {});
    }
}
