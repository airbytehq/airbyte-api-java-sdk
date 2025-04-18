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

    @JsonCreator
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
    @JsonIgnore
    public String apiToken() {
        return apiToken;
    }

    /**
     * Your Confluence domain name
     */
    @JsonIgnore
    public String domainName() {
        return domainName;
    }

    /**
     * Your Confluence login email
     */
    @JsonIgnore
    public String email() {
        return email;
    }

    @JsonIgnore
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
            Objects.deepEquals(this.apiToken, other.apiToken) &&
            Objects.deepEquals(this.domainName, other.domainName) &&
            Objects.deepEquals(this.email, other.email) &&
            Objects.deepEquals(this.sourceType, other.sourceType);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
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
