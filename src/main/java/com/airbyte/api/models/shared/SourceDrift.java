/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.airbyte.api.models.shared;

import com.airbyte.api.utils.LazySingletonValue;
import com.airbyte.api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;

public class SourceDrift {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("credentials")
    private Optional<? extends SourceDriftAuthorizationMethod> credentials;

    /**
     * Email used as parameter for contacts stream
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("email")
    private Optional<String> email;

    @JsonProperty("sourceType")
    private SourceDriftDrift sourceType;

    @JsonCreator
    public SourceDrift(
            @JsonProperty("credentials") Optional<? extends SourceDriftAuthorizationMethod> credentials,
            @JsonProperty("email") Optional<String> email) {
        Utils.checkNotNull(credentials, "credentials");
        Utils.checkNotNull(email, "email");
        this.credentials = credentials;
        this.email = email;
        this.sourceType = Builder._SINGLETON_VALUE_SourceType.value();
    }
    
    public SourceDrift() {
        this(Optional.empty(), Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<SourceDriftAuthorizationMethod> credentials() {
        return (Optional<SourceDriftAuthorizationMethod>) credentials;
    }

    /**
     * Email used as parameter for contacts stream
     */
    @JsonIgnore
    public Optional<String> email() {
        return email;
    }

    @JsonIgnore
    public SourceDriftDrift sourceType() {
        return sourceType;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    public SourceDrift withCredentials(SourceDriftAuthorizationMethod credentials) {
        Utils.checkNotNull(credentials, "credentials");
        this.credentials = Optional.ofNullable(credentials);
        return this;
    }

    public SourceDrift withCredentials(Optional<? extends SourceDriftAuthorizationMethod> credentials) {
        Utils.checkNotNull(credentials, "credentials");
        this.credentials = credentials;
        return this;
    }

    /**
     * Email used as parameter for contacts stream
     */
    public SourceDrift withEmail(String email) {
        Utils.checkNotNull(email, "email");
        this.email = Optional.ofNullable(email);
        return this;
    }

    /**
     * Email used as parameter for contacts stream
     */
    public SourceDrift withEmail(Optional<String> email) {
        Utils.checkNotNull(email, "email");
        this.email = email;
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
        SourceDrift other = (SourceDrift) o;
        return 
            Objects.deepEquals(this.credentials, other.credentials) &&
            Objects.deepEquals(this.email, other.email) &&
            Objects.deepEquals(this.sourceType, other.sourceType);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            credentials,
            email,
            sourceType);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceDrift.class,
                "credentials", credentials,
                "email", email,
                "sourceType", sourceType);
    }
    
    public final static class Builder {
 
        private Optional<? extends SourceDriftAuthorizationMethod> credentials = Optional.empty();
 
        private Optional<String> email;
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder credentials(SourceDriftAuthorizationMethod credentials) {
            Utils.checkNotNull(credentials, "credentials");
            this.credentials = Optional.ofNullable(credentials);
            return this;
        }

        public Builder credentials(Optional<? extends SourceDriftAuthorizationMethod> credentials) {
            Utils.checkNotNull(credentials, "credentials");
            this.credentials = credentials;
            return this;
        }

        /**
         * Email used as parameter for contacts stream
         */
        public Builder email(String email) {
            Utils.checkNotNull(email, "email");
            this.email = Optional.ofNullable(email);
            return this;
        }

        /**
         * Email used as parameter for contacts stream
         */
        public Builder email(Optional<String> email) {
            Utils.checkNotNull(email, "email");
            this.email = email;
            return this;
        }
        
        public SourceDrift build() {
            if (email == null) {
                email = _SINGLETON_VALUE_Email.value();
            }
            return new SourceDrift(
                credentials,
                email);
        }

        private static final LazySingletonValue<Optional<String>> _SINGLETON_VALUE_Email =
                new LazySingletonValue<>(
                        "email",
                        "\"test@test.com\"",
                        new TypeReference<Optional<String>>() {});

        private static final LazySingletonValue<SourceDriftDrift> _SINGLETON_VALUE_SourceType =
                new LazySingletonValue<>(
                        "sourceType",
                        "\"drift\"",
                        new TypeReference<SourceDriftDrift>() {});
    }
}
