/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.airbyte.api.utils.LazySingletonValue;
import com.airbyte.api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Optional;


public class HMACKey {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("credential_type")
    private Optional<? extends CredentialType> credentialType;

    /**
     * When linked to a service account, this ID is 61 characters long; when linked to a user account, it is 24 characters long. Read more &lt;a href="https://cloud.google.com/storage/docs/authentication/hmackeys#overview"&gt;here&lt;/a&gt;.
     */
    @JsonProperty("hmac_key_access_id")
    private String hmacKeyAccessId;

    /**
     * The corresponding secret for the access ID. It is a 40-character base-64 encoded string.  Read more &lt;a href="https://cloud.google.com/storage/docs/authentication/hmackeys#secrets"&gt;here&lt;/a&gt;.
     */
    @JsonProperty("hmac_key_secret")
    private String hmacKeySecret;

    public HMACKey(
            @JsonProperty("credential_type") Optional<? extends CredentialType> credentialType,
            @JsonProperty("hmac_key_access_id") String hmacKeyAccessId,
            @JsonProperty("hmac_key_secret") String hmacKeySecret) {
        Utils.checkNotNull(credentialType, "credentialType");
        Utils.checkNotNull(hmacKeyAccessId, "hmacKeyAccessId");
        Utils.checkNotNull(hmacKeySecret, "hmacKeySecret");
        this.credentialType = credentialType;
        this.hmacKeyAccessId = hmacKeyAccessId;
        this.hmacKeySecret = hmacKeySecret;
    }

    public Optional<? extends CredentialType> credentialType() {
        return credentialType;
    }

    /**
     * When linked to a service account, this ID is 61 characters long; when linked to a user account, it is 24 characters long. Read more &lt;a href="https://cloud.google.com/storage/docs/authentication/hmackeys#overview"&gt;here&lt;/a&gt;.
     */
    public String hmacKeyAccessId() {
        return hmacKeyAccessId;
    }

    /**
     * The corresponding secret for the access ID. It is a 40-character base-64 encoded string.  Read more &lt;a href="https://cloud.google.com/storage/docs/authentication/hmackeys#secrets"&gt;here&lt;/a&gt;.
     */
    public String hmacKeySecret() {
        return hmacKeySecret;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public HMACKey withCredentialType(CredentialType credentialType) {
        Utils.checkNotNull(credentialType, "credentialType");
        this.credentialType = Optional.ofNullable(credentialType);
        return this;
    }

    public HMACKey withCredentialType(Optional<? extends CredentialType> credentialType) {
        Utils.checkNotNull(credentialType, "credentialType");
        this.credentialType = credentialType;
        return this;
    }

    /**
     * When linked to a service account, this ID is 61 characters long; when linked to a user account, it is 24 characters long. Read more &lt;a href="https://cloud.google.com/storage/docs/authentication/hmackeys#overview"&gt;here&lt;/a&gt;.
     */
    public HMACKey withHmacKeyAccessId(String hmacKeyAccessId) {
        Utils.checkNotNull(hmacKeyAccessId, "hmacKeyAccessId");
        this.hmacKeyAccessId = hmacKeyAccessId;
        return this;
    }

    /**
     * The corresponding secret for the access ID. It is a 40-character base-64 encoded string.  Read more &lt;a href="https://cloud.google.com/storage/docs/authentication/hmackeys#secrets"&gt;here&lt;/a&gt;.
     */
    public HMACKey withHmacKeySecret(String hmacKeySecret) {
        Utils.checkNotNull(hmacKeySecret, "hmacKeySecret");
        this.hmacKeySecret = hmacKeySecret;
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
        HMACKey other = (HMACKey) o;
        return 
            java.util.Objects.deepEquals(this.credentialType, other.credentialType) &&
            java.util.Objects.deepEquals(this.hmacKeyAccessId, other.hmacKeyAccessId) &&
            java.util.Objects.deepEquals(this.hmacKeySecret, other.hmacKeySecret);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            credentialType,
            hmacKeyAccessId,
            hmacKeySecret);
    }
    
    @Override
    public String toString() {
        return Utils.toString(HMACKey.class,
                "credentialType", credentialType,
                "hmacKeyAccessId", hmacKeyAccessId,
                "hmacKeySecret", hmacKeySecret);
    }
    
    public final static class Builder {
 
        private Optional<? extends CredentialType> credentialType;
 
        private String hmacKeyAccessId;
 
        private String hmacKeySecret;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder credentialType(CredentialType credentialType) {
            Utils.checkNotNull(credentialType, "credentialType");
            this.credentialType = Optional.ofNullable(credentialType);
            return this;
        }

        public Builder credentialType(Optional<? extends CredentialType> credentialType) {
            Utils.checkNotNull(credentialType, "credentialType");
            this.credentialType = credentialType;
            return this;
        }

        /**
         * When linked to a service account, this ID is 61 characters long; when linked to a user account, it is 24 characters long. Read more &lt;a href="https://cloud.google.com/storage/docs/authentication/hmackeys#overview"&gt;here&lt;/a&gt;.
         */
        public Builder hmacKeyAccessId(String hmacKeyAccessId) {
            Utils.checkNotNull(hmacKeyAccessId, "hmacKeyAccessId");
            this.hmacKeyAccessId = hmacKeyAccessId;
            return this;
        }

        /**
         * The corresponding secret for the access ID. It is a 40-character base-64 encoded string.  Read more &lt;a href="https://cloud.google.com/storage/docs/authentication/hmackeys#secrets"&gt;here&lt;/a&gt;.
         */
        public Builder hmacKeySecret(String hmacKeySecret) {
            Utils.checkNotNull(hmacKeySecret, "hmacKeySecret");
            this.hmacKeySecret = hmacKeySecret;
            return this;
        }
        
        public HMACKey build() {
            if (credentialType == null) {
                credentialType = _SINGLETON_VALUE_CredentialType.value();
            }
            return new HMACKey(
                credentialType,
                hmacKeyAccessId,
                hmacKeySecret);
        }

        private static final LazySingletonValue<Optional<? extends CredentialType>> _SINGLETON_VALUE_CredentialType =
                new LazySingletonValue<>(
                        "credential_type",
                        "\"HMAC_KEY\"",
                        new TypeReference<Optional<? extends CredentialType>>() {});
    }
}

