/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

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


public class GoogleSheets {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("credentials")
    private Optional<? extends GoogleSheetsCredentials> credentials;

    public GoogleSheets(
            @JsonProperty("credentials") Optional<? extends GoogleSheetsCredentials> credentials) {
        Utils.checkNotNull(credentials, "credentials");
        this.credentials = credentials;
    }

    public Optional<? extends GoogleSheetsCredentials> credentials() {
        return credentials;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public GoogleSheets withCredentials(GoogleSheetsCredentials credentials) {
        Utils.checkNotNull(credentials, "credentials");
        this.credentials = Optional.ofNullable(credentials);
        return this;
    }

    public GoogleSheets withCredentials(Optional<? extends GoogleSheetsCredentials> credentials) {
        Utils.checkNotNull(credentials, "credentials");
        this.credentials = credentials;
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
        GoogleSheets other = (GoogleSheets) o;
        return 
            java.util.Objects.deepEquals(this.credentials, other.credentials);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            credentials);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GoogleSheets.class,
                "credentials", credentials);
    }
    
    public final static class Builder {
 
        private Optional<? extends GoogleSheetsCredentials> credentials = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder credentials(GoogleSheetsCredentials credentials) {
            Utils.checkNotNull(credentials, "credentials");
            this.credentials = Optional.ofNullable(credentials);
            return this;
        }

        public Builder credentials(Optional<? extends GoogleSheetsCredentials> credentials) {
            Utils.checkNotNull(credentials, "credentials");
            this.credentials = credentials;
            return this;
        }
        
        public GoogleSheets build() {
            return new GoogleSheets(
                credentials);
        }
    }
}

