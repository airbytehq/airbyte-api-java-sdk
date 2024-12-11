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


public class TiktokMarketing {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("credentials")
    private Optional<? extends TiktokMarketingCredentials> credentials;

    @JsonCreator
    public TiktokMarketing(
            @JsonProperty("credentials") Optional<? extends TiktokMarketingCredentials> credentials) {
        Utils.checkNotNull(credentials, "credentials");
        this.credentials = credentials;
    }
    
    public TiktokMarketing() {
        this(Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<TiktokMarketingCredentials> credentials() {
        return (Optional<TiktokMarketingCredentials>) credentials;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public TiktokMarketing withCredentials(TiktokMarketingCredentials credentials) {
        Utils.checkNotNull(credentials, "credentials");
        this.credentials = Optional.ofNullable(credentials);
        return this;
    }

    public TiktokMarketing withCredentials(Optional<? extends TiktokMarketingCredentials> credentials) {
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
        TiktokMarketing other = (TiktokMarketing) o;
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
        return Utils.toString(TiktokMarketing.class,
                "credentials", credentials);
    }
    
    public final static class Builder {
 
        private Optional<? extends TiktokMarketingCredentials> credentials = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder credentials(TiktokMarketingCredentials credentials) {
            Utils.checkNotNull(credentials, "credentials");
            this.credentials = Optional.ofNullable(credentials);
            return this;
        }

        public Builder credentials(Optional<? extends TiktokMarketingCredentials> credentials) {
            Utils.checkNotNull(credentials, "credentials");
            this.credentials = credentials;
            return this;
        }
        
        public TiktokMarketing build() {
            return new TiktokMarketing(
                credentials);
        }
    }
}

