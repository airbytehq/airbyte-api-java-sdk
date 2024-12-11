/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;


import com.airbyte.api.utils.LazySingletonValue;
import com.airbyte.api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class SourceOveit {

    /**
     * Oveit's login Email
     */
    @JsonProperty("email")
    private String email;

    /**
     * Oveit's login Password
     */
    @JsonProperty("password")
    private String password;

    @JsonProperty("sourceType")
    private Oveit sourceType;

    @JsonCreator
    public SourceOveit(
            @JsonProperty("email") String email,
            @JsonProperty("password") String password) {
        Utils.checkNotNull(email, "email");
        Utils.checkNotNull(password, "password");
        this.email = email;
        this.password = password;
        this.sourceType = Builder._SINGLETON_VALUE_SourceType.value();
    }

    /**
     * Oveit's login Email
     */
    @JsonIgnore
    public String email() {
        return email;
    }

    /**
     * Oveit's login Password
     */
    @JsonIgnore
    public String password() {
        return password;
    }

    @JsonIgnore
    public Oveit sourceType() {
        return sourceType;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Oveit's login Email
     */
    public SourceOveit withEmail(String email) {
        Utils.checkNotNull(email, "email");
        this.email = email;
        return this;
    }

    /**
     * Oveit's login Password
     */
    public SourceOveit withPassword(String password) {
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
        SourceOveit other = (SourceOveit) o;
        return 
            Objects.deepEquals(this.email, other.email) &&
            Objects.deepEquals(this.password, other.password) &&
            Objects.deepEquals(this.sourceType, other.sourceType);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            email,
            password,
            sourceType);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceOveit.class,
                "email", email,
                "password", password,
                "sourceType", sourceType);
    }
    
    public final static class Builder {
 
        private String email;
 
        private String password;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Oveit's login Email
         */
        public Builder email(String email) {
            Utils.checkNotNull(email, "email");
            this.email = email;
            return this;
        }

        /**
         * Oveit's login Password
         */
        public Builder password(String password) {
            Utils.checkNotNull(password, "password");
            this.password = password;
            return this;
        }
        
        public SourceOveit build() {
            return new SourceOveit(
                email,
                password);
        }

        private static final LazySingletonValue<Oveit> _SINGLETON_VALUE_SourceType =
                new LazySingletonValue<>(
                        "sourceType",
                        "\"oveit\"",
                        new TypeReference<Oveit>() {});
    }
}

