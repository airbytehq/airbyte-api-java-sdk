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


public class SourceConfluence {

    /**
     * Please follow the Jira confluence for generating an API token: &lt;a href="https://support.atlassian.com/atlassian-account/docs/manage-api-tokens-for-your-atlassian-account/"&gt;generating an API token&lt;/a&gt;.
     */
    @JsonProperty("api_token")
    private String apiToken;

    /**
     * Your Confluence domain name
     */
    @JsonProperty("domain_name")
    private String domainName;

    /**
     * Your Confluence login email
     */
    @JsonProperty("email")
    private String email;

    @JsonProperty("sourceType")
    private Confluence sourceType;

    public SourceConfluence(
            @JsonProperty("api_token") String apiToken,
            @JsonProperty("domain_name") String domainName,
            @JsonProperty("email") String email) {
        Utils.checkNotNull(apiToken, "apiToken");
        Utils.checkNotNull(domainName, "domainName");
        Utils.checkNotNull(email, "email");
        this.apiToken = apiToken;
        this.domainName = domainName;
        this.email = email;
        this.sourceType = Builder._SINGLETON_VALUE_SourceType.value();
    }

    /**
     * Please follow the Jira confluence for generating an API token: &lt;a href="https://support.atlassian.com/atlassian-account/docs/manage-api-tokens-for-your-atlassian-account/"&gt;generating an API token&lt;/a&gt;.
     */
    public String apiToken() {
        return apiToken;
    }

    /**
     * Your Confluence domain name
     */
    public String domainName() {
        return domainName;
    }

    /**
     * Your Confluence login email
     */
    public String email() {
        return email;
    }

    public Confluence sourceType() {
        return sourceType;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Please follow the Jira confluence for generating an API token: &lt;a href="https://support.atlassian.com/atlassian-account/docs/manage-api-tokens-for-your-atlassian-account/"&gt;generating an API token&lt;/a&gt;.
     */
    public SourceConfluence withApiToken(String apiToken) {
        Utils.checkNotNull(apiToken, "apiToken");
        this.apiToken = apiToken;
        return this;
    }

    /**
     * Your Confluence domain name
     */
    public SourceConfluence withDomainName(String domainName) {
        Utils.checkNotNull(domainName, "domainName");
        this.domainName = domainName;
        return this;
    }

    /**
     * Your Confluence login email
     */
    public SourceConfluence withEmail(String email) {
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
        SourceConfluence other = (SourceConfluence) o;
        return 
            java.util.Objects.deepEquals(this.apiToken, other.apiToken) &&
            java.util.Objects.deepEquals(this.domainName, other.domainName) &&
            java.util.Objects.deepEquals(this.email, other.email) &&
            java.util.Objects.deepEquals(this.sourceType, other.sourceType);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            apiToken,
            domainName,
            email,
            sourceType);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceConfluence.class,
                "apiToken", apiToken,
                "domainName", domainName,
                "email", email,
                "sourceType", sourceType);
    }
    
    public final static class Builder {
 
        private String apiToken;
 
        private String domainName;
 
        private String email;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Please follow the Jira confluence for generating an API token: &lt;a href="https://support.atlassian.com/atlassian-account/docs/manage-api-tokens-for-your-atlassian-account/"&gt;generating an API token&lt;/a&gt;.
         */
        public Builder apiToken(String apiToken) {
            Utils.checkNotNull(apiToken, "apiToken");
            this.apiToken = apiToken;
            return this;
        }

        /**
         * Your Confluence domain name
         */
        public Builder domainName(String domainName) {
            Utils.checkNotNull(domainName, "domainName");
            this.domainName = domainName;
            return this;
        }

        /**
         * Your Confluence login email
         */
        public Builder email(String email) {
            Utils.checkNotNull(email, "email");
            this.email = email;
            return this;
        }
        
        public SourceConfluence build() {
            return new SourceConfluence(
                apiToken,
                domainName,
                email);
        }

        private static final LazySingletonValue<Confluence> _SINGLETON_VALUE_SourceType =
                new LazySingletonValue<>(
                        "sourceType",
                        "\"confluence\"",
                        new TypeReference<Confluence>() {});
    }
}

