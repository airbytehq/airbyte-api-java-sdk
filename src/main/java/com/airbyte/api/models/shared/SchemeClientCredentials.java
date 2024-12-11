/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;


import com.airbyte.api.utils.LazySingletonValue;
import com.airbyte.api.utils.SpeakeasyMetadata;
import com.airbyte.api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.type.TypeReference;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class SchemeClientCredentials {

    @SpeakeasyMetadata("security:name=clientID")
    private String clientID;

    @SpeakeasyMetadata("security:name=clientSecret")
    private String clientSecret;

    private String tokenURL;

    @JsonCreator
    public SchemeClientCredentials(
            String clientID,
            String clientSecret,
            String tokenURL) {
        Utils.checkNotNull(clientID, "clientID");
        Utils.checkNotNull(clientSecret, "clientSecret");
        Utils.checkNotNull(tokenURL, "tokenURL");
        this.clientID = clientID;
        this.clientSecret = clientSecret;
        this.tokenURL = tokenURL;
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

    public SchemeClientCredentials withTokenURL(String tokenURL) {
        Utils.checkNotNull(tokenURL, "tokenURL");
        this.tokenURL = tokenURL;
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
            Objects.deepEquals(this.clientID, other.clientID) &&
            Objects.deepEquals(this.clientSecret, other.clientSecret) &&
            Objects.deepEquals(this.tokenURL, other.tokenURL);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
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
 
        private String tokenURL;  
        
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

        public Builder tokenURL(String tokenURL) {
            Utils.checkNotNull(tokenURL, "tokenURL");
            this.tokenURL = tokenURL;
            return this;
        }
        
        public SchemeClientCredentials build() {
            if (tokenURL == null) {
                tokenURL = _SINGLETON_VALUE_TokenURL.value();
            }            return new SchemeClientCredentials(
                clientID,
                clientSecret,
                tokenURL);
        }

        private static final LazySingletonValue<String> _SINGLETON_VALUE_TokenURL =
                new LazySingletonValue<>(
                        "TokenURL",
                        "\"/applications/token\"",
                        new TypeReference<String>() {});
    }
}

