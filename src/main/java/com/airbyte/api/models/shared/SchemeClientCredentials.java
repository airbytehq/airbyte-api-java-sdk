/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.airbyte.api.utils.LazySingletonValue;
import com.airbyte.api.utils.SpeakeasyMetadata;
import com.airbyte.api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;

public class SchemeClientCredentials {

    @SpeakeasyMetadata("security:name=clientID")
    private String clientID;

    @SpeakeasyMetadata("security:name=clientSecret")
    private String clientSecret;

    private String tokenURL;

    @JsonCreator
    public SchemeClientCredentials(
            String clientID,
            String clientSecret) {
        Utils.checkNotNull(clientID, "clientID");
        Utils.checkNotNull(clientSecret, "clientSecret");
        this.clientID = clientID;
        this.clientSecret = clientSecret;
        this.tokenURL = Builder._SINGLETON_VALUE_TokenURL.value();
    }

    @JsonIgnore
    public String clientID() {
        return clientID;
    }

    @JsonIgnore
    public String clientSecret() {
        return clientSecret;
    }

    @JsonIgnore
    public String tokenURL() {
        return tokenURL;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public SchemeClientCredentials withClientID(String clientID) {
        Utils.checkNotNull(clientID, "clientID");
        this.clientID = clientID;
        return this;
    }

    public SchemeClientCredentials withClientSecret(String clientSecret) {
        Utils.checkNotNull(clientSecret, "clientSecret");
        this.clientSecret = clientSecret;
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
        SchemeClientCredentials other = (SchemeClientCredentials) o;
        return 
            java.util.Objects.deepEquals(this.clientID, other.clientID) &&
            java.util.Objects.deepEquals(this.clientSecret, other.clientSecret) &&
            java.util.Objects.deepEquals(this.tokenURL, other.tokenURL);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            clientID,
            clientSecret,
            tokenURL);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SchemeClientCredentials.class,
                "clientID", clientID,
                "clientSecret", clientSecret,
                "tokenURL", tokenURL);
    }
    
    public final static class Builder {
 
        private String clientID;
 
        private String clientSecret;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder clientID(String clientID) {
            Utils.checkNotNull(clientID, "clientID");
            this.clientID = clientID;
            return this;
        }

        public Builder clientSecret(String clientSecret) {
            Utils.checkNotNull(clientSecret, "clientSecret");
            this.clientSecret = clientSecret;
            return this;
        }
        
        public SchemeClientCredentials build() {
            return new SchemeClientCredentials(
                clientID,
                clientSecret);
        }

        private static final LazySingletonValue<String> _SINGLETON_VALUE_TokenURL =
                new LazySingletonValue<>(
                        "TokenURL",
                        "\"/applications/token\"",
                        new TypeReference<String>() {});
    }
}

