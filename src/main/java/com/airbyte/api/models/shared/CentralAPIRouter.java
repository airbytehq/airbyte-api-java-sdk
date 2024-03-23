/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.airbyte.api.utils.LazySingletonValue;
import com.airbyte.api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;


public class CentralAPIRouter {

    @JsonProperty("auth_type")
    private SourceCartAuthType authType;

    /**
     * You can determine a site provisioning site Id by hitting https://site.com/store/sitemonitor.aspx and reading the response param PSID
     */
    @JsonProperty("site_id")
    private String siteId;

    /**
     * Enter your application's User Name
     */
    @JsonProperty("user_name")
    private String userName;

    /**
     * Enter your application's User Secret
     */
    @JsonProperty("user_secret")
    private String userSecret;

    public CentralAPIRouter(
            @JsonProperty("site_id") String siteId,
            @JsonProperty("user_name") String userName,
            @JsonProperty("user_secret") String userSecret) {
        Utils.checkNotNull(siteId, "siteId");
        Utils.checkNotNull(userName, "userName");
        Utils.checkNotNull(userSecret, "userSecret");
        this.authType = Builder._SINGLETON_VALUE_AuthType.value();
        this.siteId = siteId;
        this.userName = userName;
        this.userSecret = userSecret;
    }

    public SourceCartAuthType authType() {
        return authType;
    }

    /**
     * You can determine a site provisioning site Id by hitting https://site.com/store/sitemonitor.aspx and reading the response param PSID
     */
    public String siteId() {
        return siteId;
    }

    /**
     * Enter your application's User Name
     */
    public String userName() {
        return userName;
    }

    /**
     * Enter your application's User Secret
     */
    public String userSecret() {
        return userSecret;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * You can determine a site provisioning site Id by hitting https://site.com/store/sitemonitor.aspx and reading the response param PSID
     */
    public CentralAPIRouter withSiteId(String siteId) {
        Utils.checkNotNull(siteId, "siteId");
        this.siteId = siteId;
        return this;
    }

    /**
     * Enter your application's User Name
     */
    public CentralAPIRouter withUserName(String userName) {
        Utils.checkNotNull(userName, "userName");
        this.userName = userName;
        return this;
    }

    /**
     * Enter your application's User Secret
     */
    public CentralAPIRouter withUserSecret(String userSecret) {
        Utils.checkNotNull(userSecret, "userSecret");
        this.userSecret = userSecret;
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
        CentralAPIRouter other = (CentralAPIRouter) o;
        return 
            java.util.Objects.deepEquals(this.authType, other.authType) &&
            java.util.Objects.deepEquals(this.siteId, other.siteId) &&
            java.util.Objects.deepEquals(this.userName, other.userName) &&
            java.util.Objects.deepEquals(this.userSecret, other.userSecret);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            authType,
            siteId,
            userName,
            userSecret);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CentralAPIRouter.class,
                "authType", authType,
                "siteId", siteId,
                "userName", userName,
                "userSecret", userSecret);
    }
    
    public final static class Builder {
 
        private String siteId;
 
        private String userName;
 
        private String userSecret;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * You can determine a site provisioning site Id by hitting https://site.com/store/sitemonitor.aspx and reading the response param PSID
         */
        public Builder siteId(String siteId) {
            Utils.checkNotNull(siteId, "siteId");
            this.siteId = siteId;
            return this;
        }

        /**
         * Enter your application's User Name
         */
        public Builder userName(String userName) {
            Utils.checkNotNull(userName, "userName");
            this.userName = userName;
            return this;
        }

        /**
         * Enter your application's User Secret
         */
        public Builder userSecret(String userSecret) {
            Utils.checkNotNull(userSecret, "userSecret");
            this.userSecret = userSecret;
            return this;
        }
        
        public CentralAPIRouter build() {
            return new CentralAPIRouter(
                siteId,
                userName,
                userSecret);
        }

        private static final LazySingletonValue<SourceCartAuthType> _SINGLETON_VALUE_AuthType =
                new LazySingletonValue<>(
                        "auth_type",
                        "\"CENTRAL_API_ROUTER\"",
                        new TypeReference<SourceCartAuthType>() {});
    }
}

