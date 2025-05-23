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

public class AuthenticateViaPassword {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("auth_type")
    private Optional<? extends SourceSftpBulkAuthType> authType;

    /**
     * Password
     */
    @JsonProperty("password")
    private String password;

    @JsonCreator
    public AuthenticateViaPassword(
            @JsonProperty("password") String password) {
        Utils.checkNotNull(password, "password");
        this.authType = Builder._SINGLETON_VALUE_AuthType.value();
        this.password = password;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<SourceSftpBulkAuthType> authType() {
        return (Optional<SourceSftpBulkAuthType>) authType;
    }

    /**
     * Password
     */
    @JsonIgnore
    public String password() {
        return password;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    /**
     * Password
     */
    public AuthenticateViaPassword withPassword(String password) {
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
        AuthenticateViaPassword other = (AuthenticateViaPassword) o;
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
        return Utils.toString(AuthenticateViaPassword.class,
                "authType", authType,
                "password", password);
    }
    
    public final static class Builder {
 
        private String password;
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Password
         */
        public Builder password(String password) {
            Utils.checkNotNull(password, "password");
            this.password = password;
            return this;
        }
        
        public AuthenticateViaPassword build() {
            return new AuthenticateViaPassword(
                password);
        }

        private static final LazySingletonValue<Optional<? extends SourceSftpBulkAuthType>> _SINGLETON_VALUE_AuthType =
                new LazySingletonValue<>(
                        "auth_type",
                        "\"password\"",
                        new TypeReference<Optional<? extends SourceSftpBulkAuthType>>() {});
    }
}
