/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.airbyte.api.utils.LazySingletonValue;
import com.airbyte.api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;


public class SourceSftpPasswordAuthentication {

    /**
     * Connect through password authentication
     */
    @JsonProperty("auth_method")
    private SourceSftpAuthMethod authMethod;

    /**
     * OS-level password for logging into the jump server host
     */
    @JsonProperty("auth_user_password")
    private String authUserPassword;

    @JsonCreator
    public SourceSftpPasswordAuthentication(
            @JsonProperty("auth_user_password") String authUserPassword) {
        Utils.checkNotNull(authUserPassword, "authUserPassword");
        this.authMethod = Builder._SINGLETON_VALUE_AuthMethod.value();
        this.authUserPassword = authUserPassword;
    }

    /**
     * Connect through password authentication
     */
    @JsonIgnore
    public SourceSftpAuthMethod authMethod() {
        return authMethod;
    }

    /**
     * OS-level password for logging into the jump server host
     */
    @JsonIgnore
    public String authUserPassword() {
        return authUserPassword;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * OS-level password for logging into the jump server host
     */
    public SourceSftpPasswordAuthentication withAuthUserPassword(String authUserPassword) {
        Utils.checkNotNull(authUserPassword, "authUserPassword");
        this.authUserPassword = authUserPassword;
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
        SourceSftpPasswordAuthentication other = (SourceSftpPasswordAuthentication) o;
        return 
            java.util.Objects.deepEquals(this.authMethod, other.authMethod) &&
            java.util.Objects.deepEquals(this.authUserPassword, other.authUserPassword);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            authMethod,
            authUserPassword);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceSftpPasswordAuthentication.class,
                "authMethod", authMethod,
                "authUserPassword", authUserPassword);
    }
    
    public final static class Builder {
 
        private String authUserPassword;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * OS-level password for logging into the jump server host
         */
        public Builder authUserPassword(String authUserPassword) {
            Utils.checkNotNull(authUserPassword, "authUserPassword");
            this.authUserPassword = authUserPassword;
            return this;
        }
        
        public SourceSftpPasswordAuthentication build() {
            return new SourceSftpPasswordAuthentication(
                authUserPassword);
        }

        private static final LazySingletonValue<SourceSftpAuthMethod> _SINGLETON_VALUE_AuthMethod =
                new LazySingletonValue<>(
                        "auth_method",
                        "\"SSH_PASSWORD_AUTH\"",
                        new TypeReference<SourceSftpAuthMethod>() {});
    }
}
