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
import java.util.Objects;
import java.util.Optional;


public class SourceOnepagecrm {

    /**
     * Enter your API Key of your API app
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("password")
    private Optional<String> password;

    @JsonProperty("sourceType")
    private Onepagecrm sourceType;

    /**
     * Enter the user ID of your API app
     */
    @JsonProperty("username")
    private String username;

    @JsonCreator
    public SourceOnepagecrm(
            @JsonProperty("password") Optional<String> password,
            @JsonProperty("username") String username) {
        Utils.checkNotNull(password, "password");
        Utils.checkNotNull(username, "username");
        this.password = password;
        this.sourceType = Builder._SINGLETON_VALUE_SourceType.value();
        this.username = username;
    }
    
    public SourceOnepagecrm(
            String username) {
        this(Optional.empty(), username);
    }

    /**
     * Enter your API Key of your API app
     */
    @JsonIgnore
    public Optional<String> password() {
        return password;
    }

    @JsonIgnore
    public Onepagecrm sourceType() {
        return sourceType;
    }

    /**
     * Enter the user ID of your API app
     */
    @JsonIgnore
    public String username() {
        return username;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Enter your API Key of your API app
     */
    public SourceOnepagecrm withPassword(String password) {
        Utils.checkNotNull(password, "password");
        this.password = Optional.ofNullable(password);
        return this;
    }

    /**
     * Enter your API Key of your API app
     */
    public SourceOnepagecrm withPassword(Optional<String> password) {
        Utils.checkNotNull(password, "password");
        this.password = password;
        return this;
    }

    /**
     * Enter the user ID of your API app
     */
    public SourceOnepagecrm withUsername(String username) {
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
        SourceOnepagecrm other = (SourceOnepagecrm) o;
        return 
            Objects.deepEquals(this.password, other.password) &&
            Objects.deepEquals(this.sourceType, other.sourceType) &&
            Objects.deepEquals(this.username, other.username);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            password,
            sourceType,
            username);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceOnepagecrm.class,
                "password", password,
                "sourceType", sourceType,
                "username", username);
    }
    
    public final static class Builder {
 
        private Optional<String> password = Optional.empty();
 
        private String username;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Enter your API Key of your API app
         */
        public Builder password(String password) {
            Utils.checkNotNull(password, "password");
            this.password = Optional.ofNullable(password);
            return this;
        }

        /**
         * Enter your API Key of your API app
         */
        public Builder password(Optional<String> password) {
            Utils.checkNotNull(password, "password");
            this.password = password;
            return this;
        }

        /**
         * Enter the user ID of your API app
         */
        public Builder username(String username) {
            Utils.checkNotNull(username, "username");
            this.username = username;
            return this;
        }
        
        public SourceOnepagecrm build() {
            return new SourceOnepagecrm(
                password,
                username);
        }

        private static final LazySingletonValue<Onepagecrm> _SINGLETON_VALUE_SourceType =
                new LazySingletonValue<>(
                        "sourceType",
                        "\"onepagecrm\"",
                        new TypeReference<Onepagecrm>() {});
    }
}

