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
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;

public class GoogleAnalyticsDataApi {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("credentials")
    private Optional<? extends GoogleAnalyticsDataApiCredentials> credentials;

    @JsonCreator
    public GoogleAnalyticsDataApi(
            @JsonProperty("credentials") Optional<? extends GoogleAnalyticsDataApiCredentials> credentials) {
        Utils.checkNotNull(credentials, "credentials");
        this.credentials = credentials;
    }
    
    public GoogleAnalyticsDataApi() {
        this(Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<GoogleAnalyticsDataApiCredentials> credentials() {
        return (Optional<GoogleAnalyticsDataApiCredentials>) credentials;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    public GoogleAnalyticsDataApi withCredentials(GoogleAnalyticsDataApiCredentials credentials) {
        Utils.checkNotNull(credentials, "credentials");
        this.credentials = Optional.ofNullable(credentials);
        return this;
    }

    public GoogleAnalyticsDataApi withCredentials(Optional<? extends GoogleAnalyticsDataApiCredentials> credentials) {
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
        GoogleAnalyticsDataApi other = (GoogleAnalyticsDataApi) o;
        return 
            Objects.deepEquals(this.credentials, other.credentials);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            credentials);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GoogleAnalyticsDataApi.class,
                "credentials", credentials);
    }
    
    public final static class Builder {
 
        private Optional<? extends GoogleAnalyticsDataApiCredentials> credentials = Optional.empty();
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder credentials(GoogleAnalyticsDataApiCredentials credentials) {
            Utils.checkNotNull(credentials, "credentials");
            this.credentials = Optional.ofNullable(credentials);
            return this;
        }

        public Builder credentials(Optional<? extends GoogleAnalyticsDataApiCredentials> credentials) {
            Utils.checkNotNull(credentials, "credentials");
            this.credentials = credentials;
            return this;
        }
        
        public GoogleAnalyticsDataApi build() {
            return new GoogleAnalyticsDataApi(
                credentials);
        }
    }
}
