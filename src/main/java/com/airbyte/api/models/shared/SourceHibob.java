/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.airbyte.api.utils.LazySingletonValue;
import com.airbyte.api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Optional;

public class SourceHibob {

    /**
     * Toggle true if this instance is a HiBob sandbox 
     */
    @JsonProperty("is_sandbox")
    private boolean isSandbox;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("password")
    private Optional<? extends String> password;

    @JsonProperty("sourceType")
    private Hibob sourceType;

    @JsonProperty("username")
    private String username;

    @JsonCreator
    public SourceHibob(
            @JsonProperty("is_sandbox") boolean isSandbox,
            @JsonProperty("password") Optional<? extends String> password,
            @JsonProperty("username") String username) {
        Utils.checkNotNull(isSandbox, "isSandbox");
        Utils.checkNotNull(password, "password");
        Utils.checkNotNull(username, "username");
        this.isSandbox = isSandbox;
        this.password = password;
        this.sourceType = Builder._SINGLETON_VALUE_SourceType.value();
        this.username = username;
    }
    
    public SourceHibob(
            boolean isSandbox,
            String username) {
        this(isSandbox, Optional.empty(), username);
    }

    /**
     * Toggle true if this instance is a HiBob sandbox 
     */
    @JsonIgnore
    public boolean isSandbox() {
        return isSandbox;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> password() {
        return (Optional<String>) password;
    }

    @JsonIgnore
    public Hibob sourceType() {
        return sourceType;
    }

    @JsonIgnore
    public String username() {
        return username;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Toggle true if this instance is a HiBob sandbox 
     */
    public SourceHibob withIsSandbox(boolean isSandbox) {
        Utils.checkNotNull(isSandbox, "isSandbox");
        this.isSandbox = isSandbox;
        return this;
    }

    public SourceHibob withPassword(String password) {
        Utils.checkNotNull(password, "password");
        this.password = Optional.ofNullable(password);
        return this;
    }

    public SourceHibob withPassword(Optional<? extends String> password) {
        Utils.checkNotNull(password, "password");
        this.password = password;
        return this;
    }

    public SourceHibob withUsername(String username) {
        Utils.checkNotNull(username, "username");
        this.username = username;
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
        SourceHibob other = (SourceHibob) o;
        return 
            java.util.Objects.deepEquals(this.isSandbox, other.isSandbox) &&
            java.util.Objects.deepEquals(this.password, other.password) &&
            java.util.Objects.deepEquals(this.sourceType, other.sourceType) &&
            java.util.Objects.deepEquals(this.username, other.username);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            isSandbox,
            password,
            sourceType,
            username);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceHibob.class,
                "isSandbox", isSandbox,
                "password", password,
                "sourceType", sourceType,
                "username", username);
    }
    
    public final static class Builder {
 
        private Boolean isSandbox;
 
        private Optional<? extends String> password = Optional.empty();
 
        private String username;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Toggle true if this instance is a HiBob sandbox 
         */
        public Builder isSandbox(boolean isSandbox) {
            Utils.checkNotNull(isSandbox, "isSandbox");
            this.isSandbox = isSandbox;
            return this;
        }

        public Builder password(String password) {
            Utils.checkNotNull(password, "password");
            this.password = Optional.ofNullable(password);
            return this;
        }

        public Builder password(Optional<? extends String> password) {
            Utils.checkNotNull(password, "password");
            this.password = password;
            return this;
        }

        public Builder username(String username) {
            Utils.checkNotNull(username, "username");
            this.username = username;
            return this;
        }
        
        public SourceHibob build() {
            return new SourceHibob(
                isSandbox,
                password,
                username);
        }

        private static final LazySingletonValue<Hibob> _SINGLETON_VALUE_SourceType =
                new LazySingletonValue<>(
                        "sourceType",
                        "\"hibob\"",
                        new TypeReference<Hibob>() {});
    }
}

