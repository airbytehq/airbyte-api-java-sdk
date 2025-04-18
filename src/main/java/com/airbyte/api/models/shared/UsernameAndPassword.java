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

public class UsernameAndPassword {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("auth_type")
    private Optional<? extends DestinationSnowflakeSchemasAuthType> authType;

    /**
     * Enter the password associated with the username.
     */
    @JsonProperty("password")
    private String password;

    @JsonCreator
    public UsernameAndPassword(
            @JsonProperty("password") String password) {
        Utils.checkNotNull(password, "password");
        this.authType = Builder._SINGLETON_VALUE_AuthType.value();
        this.password = password;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<DestinationSnowflakeSchemasAuthType> authType() {
        return (Optional<DestinationSnowflakeSchemasAuthType>) authType;
    }

    /**
     * Enter the password associated with the username.
     */
    @JsonIgnore
    public String password() {
        return password;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    /**
     * Enter the password associated with the username.
     */
    public UsernameAndPassword withPassword(String password) {
        Utils.checkNotNull(password, "password");
        this.password = password;
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
        UsernameAndPassword other = (UsernameAndPassword) o;
        return 
            Objects.deepEquals(this.authType, other.authType) &&
            Objects.deepEquals(this.password, other.password);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            authType,
            password);
    }
    
    @Override
    public String toString() {
        return Utils.toString(UsernameAndPassword.class,
                "authType", authType,
                "password", password);
    }
    
    public final static class Builder {
 
        private String password;
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Enter the password associated with the username.
         */
        public Builder password(String password) {
            Utils.checkNotNull(password, "password");
            this.password = password;
            return this;
        }
        
        public UsernameAndPassword build() {
            return new UsernameAndPassword(
                password);
        }

        private static final LazySingletonValue<Optional<? extends DestinationSnowflakeSchemasAuthType>> _SINGLETON_VALUE_AuthType =
                new LazySingletonValue<>(
                        "auth_type",
                        "\"Username and Password\"",
                        new TypeReference<Optional<? extends DestinationSnowflakeSchemasAuthType>>() {});
    }
}
