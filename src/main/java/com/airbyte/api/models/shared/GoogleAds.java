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


public class GoogleAds {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("credentials")
    private Optional<? extends GoogleAdsCredentials> credentials;

    @JsonCreator
    public GoogleAds(
            @JsonProperty("credentials") Optional<? extends GoogleAdsCredentials> credentials) {
        Utils.checkNotNull(credentials, "credentials");
        this.credentials = credentials;
    }
    
    public GoogleAds() {
        this(Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<GoogleAdsCredentials> credentials() {
        return (Optional<GoogleAdsCredentials>) credentials;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public GoogleAds withCredentials(GoogleAdsCredentials credentials) {
        Utils.checkNotNull(credentials, "credentials");
        this.credentials = Optional.ofNullable(credentials);
        return this;
    }

    public GoogleAds withCredentials(Optional<? extends GoogleAdsCredentials> credentials) {
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
        GoogleAds other = (GoogleAds) o;
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
        return Utils.toString(GoogleAds.class,
                "credentials", credentials);
    }
    
    public final static class Builder {
 
        private Optional<? extends GoogleAdsCredentials> credentials = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder credentials(GoogleAdsCredentials credentials) {
            Utils.checkNotNull(credentials, "credentials");
            this.credentials = Optional.ofNullable(credentials);
            return this;
        }

        public Builder credentials(Optional<? extends GoogleAdsCredentials> credentials) {
            Utils.checkNotNull(credentials, "credentials");
            this.credentials = credentials;
            return this;
        }
        
        public GoogleAds build() {
            return new GoogleAds(
                credentials);
        }
    }
}

