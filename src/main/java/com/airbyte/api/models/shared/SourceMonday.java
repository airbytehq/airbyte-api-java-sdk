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


public class SourceMonday {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("credentials")
    private Optional<? extends SourceMondayAuthorizationMethod> credentials;

    @JsonProperty("sourceType")
    private SourceMondayMonday sourceType;

    @JsonCreator
    public SourceMonday(
            @JsonProperty("credentials") Optional<? extends SourceMondayAuthorizationMethod> credentials) {
        Utils.checkNotNull(credentials, "credentials");
        this.credentials = credentials;
        this.sourceType = Builder._SINGLETON_VALUE_SourceType.value();
    }
    
    public SourceMonday() {
        this(Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<SourceMondayAuthorizationMethod> credentials() {
        return (Optional<SourceMondayAuthorizationMethod>) credentials;
    }

    @JsonIgnore
    public SourceMondayMonday sourceType() {
        return sourceType;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public SourceMonday withCredentials(SourceMondayAuthorizationMethod credentials) {
        Utils.checkNotNull(credentials, "credentials");
        this.credentials = Optional.ofNullable(credentials);
        return this;
    }

    public SourceMonday withCredentials(Optional<? extends SourceMondayAuthorizationMethod> credentials) {
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
        SourceMonday other = (SourceMonday) o;
        return 
            Objects.deepEquals(this.credentials, other.credentials) &&
            Objects.deepEquals(this.sourceType, other.sourceType);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            credentials,
            sourceType);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceMonday.class,
                "credentials", credentials,
                "sourceType", sourceType);
    }
    
    public final static class Builder {
 
        private Optional<? extends SourceMondayAuthorizationMethod> credentials = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder credentials(SourceMondayAuthorizationMethod credentials) {
            Utils.checkNotNull(credentials, "credentials");
            this.credentials = Optional.ofNullable(credentials);
            return this;
        }

        public Builder credentials(Optional<? extends SourceMondayAuthorizationMethod> credentials) {
            Utils.checkNotNull(credentials, "credentials");
            this.credentials = credentials;
            return this;
        }
        
        public SourceMonday build() {
            return new SourceMonday(
                credentials);
        }

        private static final LazySingletonValue<SourceMondayMonday> _SINGLETON_VALUE_SourceType =
                new LazySingletonValue<>(
                        "sourceType",
                        "\"monday\"",
                        new TypeReference<SourceMondayMonday>() {});
    }
}

