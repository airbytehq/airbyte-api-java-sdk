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


public class Typeform {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("credentials")
    private Optional<? extends TypeformCredentials> credentials;

    @JsonCreator
    public Typeform(
            @JsonProperty("credentials") Optional<? extends TypeformCredentials> credentials) {
        Utils.checkNotNull(credentials, "credentials");
        this.credentials = credentials;
    }
    
    public Typeform() {
        this(Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<TypeformCredentials> credentials() {
        return (Optional<TypeformCredentials>) credentials;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public Typeform withCredentials(TypeformCredentials credentials) {
        Utils.checkNotNull(credentials, "credentials");
        this.credentials = Optional.ofNullable(credentials);
        return this;
    }

    public Typeform withCredentials(Optional<? extends TypeformCredentials> credentials) {
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
        Typeform other = (Typeform) o;
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
        return Utils.toString(Typeform.class,
                "credentials", credentials);
    }
    
    public final static class Builder {
 
        private Optional<? extends TypeformCredentials> credentials = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder credentials(TypeformCredentials credentials) {
            Utils.checkNotNull(credentials, "credentials");
            this.credentials = Optional.ofNullable(credentials);
            return this;
        }

        public Builder credentials(Optional<? extends TypeformCredentials> credentials) {
            Utils.checkNotNull(credentials, "credentials");
            this.credentials = credentials;
            return this;
        }
        
        public Typeform build() {
            return new Typeform(
                credentials);
        }
    }
}

