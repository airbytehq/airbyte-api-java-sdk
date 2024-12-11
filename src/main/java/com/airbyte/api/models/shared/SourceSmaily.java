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


public class SourceSmaily {

    /**
     * API user password. See https://smaily.com/help/api/general/create-api-user/
     */
    @JsonProperty("api_password")
    private String apiPassword;

    /**
     * API Subdomain. See https://smaily.com/help/api/general/create-api-user/
     */
    @JsonProperty("api_subdomain")
    private String apiSubdomain;

    /**
     * API user username. See https://smaily.com/help/api/general/create-api-user/
     */
    @JsonProperty("api_username")
    private String apiUsername;

    @JsonProperty("sourceType")
    private Smaily sourceType;

    @JsonCreator
    public SourceSmaily(
            @JsonProperty("api_password") String apiPassword,
            @JsonProperty("api_subdomain") String apiSubdomain,
            @JsonProperty("api_username") String apiUsername) {
        Utils.checkNotNull(apiPassword, "apiPassword");
        Utils.checkNotNull(apiSubdomain, "apiSubdomain");
        Utils.checkNotNull(apiUsername, "apiUsername");
        this.apiPassword = apiPassword;
        this.apiSubdomain = apiSubdomain;
        this.apiUsername = apiUsername;
        this.sourceType = Builder._SINGLETON_VALUE_SourceType.value();
    }

    /**
     * API user password. See https://smaily.com/help/api/general/create-api-user/
     */
    @JsonIgnore
    public String apiPassword() {
        return apiPassword;
    }

    /**
     * API Subdomain. See https://smaily.com/help/api/general/create-api-user/
     */
    @JsonIgnore
    public String apiSubdomain() {
        return apiSubdomain;
    }

    /**
     * API user username. See https://smaily.com/help/api/general/create-api-user/
     */
    @JsonIgnore
    public String apiUsername() {
        return apiUsername;
    }

    @JsonIgnore
    public Smaily sourceType() {
        return sourceType;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * API user password. See https://smaily.com/help/api/general/create-api-user/
     */
    public SourceSmaily withApiPassword(String apiPassword) {
        Utils.checkNotNull(apiPassword, "apiPassword");
        this.apiPassword = apiPassword;
        return this;
    }

    /**
     * API Subdomain. See https://smaily.com/help/api/general/create-api-user/
     */
    public SourceSmaily withApiSubdomain(String apiSubdomain) {
        Utils.checkNotNull(apiSubdomain, "apiSubdomain");
        this.apiSubdomain = apiSubdomain;
        return this;
    }

    /**
     * API user username. See https://smaily.com/help/api/general/create-api-user/
     */
    public SourceSmaily withApiUsername(String apiUsername) {
        Utils.checkNotNull(apiUsername, "apiUsername");
        this.apiUsername = apiUsername;
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
        SourceSmaily other = (SourceSmaily) o;
        return 
            Objects.deepEquals(this.apiPassword, other.apiPassword) &&
            Objects.deepEquals(this.apiSubdomain, other.apiSubdomain) &&
            Objects.deepEquals(this.apiUsername, other.apiUsername) &&
            Objects.deepEquals(this.sourceType, other.sourceType);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            apiPassword,
            apiSubdomain,
            apiUsername,
            sourceType);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceSmaily.class,
                "apiPassword", apiPassword,
                "apiSubdomain", apiSubdomain,
                "apiUsername", apiUsername,
                "sourceType", sourceType);
    }
    
    public final static class Builder {
 
        private String apiPassword;
 
        private String apiSubdomain;
 
        private String apiUsername;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * API user password. See https://smaily.com/help/api/general/create-api-user/
         */
        public Builder apiPassword(String apiPassword) {
            Utils.checkNotNull(apiPassword, "apiPassword");
            this.apiPassword = apiPassword;
            return this;
        }

        /**
         * API Subdomain. See https://smaily.com/help/api/general/create-api-user/
         */
        public Builder apiSubdomain(String apiSubdomain) {
            Utils.checkNotNull(apiSubdomain, "apiSubdomain");
            this.apiSubdomain = apiSubdomain;
            return this;
        }

        /**
         * API user username. See https://smaily.com/help/api/general/create-api-user/
         */
        public Builder apiUsername(String apiUsername) {
            Utils.checkNotNull(apiUsername, "apiUsername");
            this.apiUsername = apiUsername;
            return this;
        }
        
        public SourceSmaily build() {
            return new SourceSmaily(
                apiPassword,
                apiSubdomain,
                apiUsername);
        }

        private static final LazySingletonValue<Smaily> _SINGLETON_VALUE_SourceType =
                new LazySingletonValue<>(
                        "sourceType",
                        "\"smaily\"",
                        new TypeReference<Smaily>() {});
    }
}

