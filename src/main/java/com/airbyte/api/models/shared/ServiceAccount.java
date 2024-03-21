/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.airbyte.api.utils.LazySingletonValue;
import com.airbyte.api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Optional;


public class ServiceAccount {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("option_title")
    private Optional<? extends SourceMixpanelOptionTitle> optionTitle;

    /**
     * Your project ID number. See the &lt;a href="https://help.mixpanel.com/hc/en-us/articles/115004490503-Project-Settings#project-id"&gt;docs&lt;/a&gt; for more information on how to obtain this.
     */
    @JsonProperty("project_id")
    private long projectId;

    /**
     * Mixpanel Service Account Secret. See the &lt;a href="https://developer.mixpanel.com/reference/service-accounts"&gt;docs&lt;/a&gt; for more information on how to obtain this.
     */
    @JsonProperty("secret")
    private String secret;

    /**
     * Mixpanel Service Account Username. See the &lt;a href="https://developer.mixpanel.com/reference/service-accounts"&gt;docs&lt;/a&gt; for more information on how to obtain this.
     */
    @JsonProperty("username")
    private String username;

    public ServiceAccount(
            @JsonProperty("project_id") long projectId,
            @JsonProperty("secret") String secret,
            @JsonProperty("username") String username) {
        Utils.checkNotNull(projectId, "projectId");
        Utils.checkNotNull(secret, "secret");
        Utils.checkNotNull(username, "username");
        this.optionTitle = Builder._SINGLETON_VALUE_OptionTitle.value();
        this.projectId = projectId;
        this.secret = secret;
        this.username = username;
    }

    public Optional<? extends SourceMixpanelOptionTitle> optionTitle() {
        return optionTitle;
    }

    /**
     * Your project ID number. See the &lt;a href="https://help.mixpanel.com/hc/en-us/articles/115004490503-Project-Settings#project-id"&gt;docs&lt;/a&gt; for more information on how to obtain this.
     */
    public long projectId() {
        return projectId;
    }

    /**
     * Mixpanel Service Account Secret. See the &lt;a href="https://developer.mixpanel.com/reference/service-accounts"&gt;docs&lt;/a&gt; for more information on how to obtain this.
     */
    public String secret() {
        return secret;
    }

    /**
     * Mixpanel Service Account Username. See the &lt;a href="https://developer.mixpanel.com/reference/service-accounts"&gt;docs&lt;/a&gt; for more information on how to obtain this.
     */
    public String username() {
        return username;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Your project ID number. See the &lt;a href="https://help.mixpanel.com/hc/en-us/articles/115004490503-Project-Settings#project-id"&gt;docs&lt;/a&gt; for more information on how to obtain this.
     */
    public ServiceAccount withProjectId(long projectId) {
        Utils.checkNotNull(projectId, "projectId");
        this.projectId = projectId;
        return this;
    }

    /**
     * Mixpanel Service Account Secret. See the &lt;a href="https://developer.mixpanel.com/reference/service-accounts"&gt;docs&lt;/a&gt; for more information on how to obtain this.
     */
    public ServiceAccount withSecret(String secret) {
        Utils.checkNotNull(secret, "secret");
        this.secret = secret;
        return this;
    }

    /**
     * Mixpanel Service Account Username. See the &lt;a href="https://developer.mixpanel.com/reference/service-accounts"&gt;docs&lt;/a&gt; for more information on how to obtain this.
     */
    public ServiceAccount withUsername(String username) {
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
        ServiceAccount other = (ServiceAccount) o;
        return 
            java.util.Objects.deepEquals(this.optionTitle, other.optionTitle) &&
            java.util.Objects.deepEquals(this.projectId, other.projectId) &&
            java.util.Objects.deepEquals(this.secret, other.secret) &&
            java.util.Objects.deepEquals(this.username, other.username);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            optionTitle,
            projectId,
            secret,
            username);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ServiceAccount.class,
                "optionTitle", optionTitle,
                "projectId", projectId,
                "secret", secret,
                "username", username);
    }
    
    public final static class Builder {
 
        private Long projectId;
 
        private String secret;
 
        private String username;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Your project ID number. See the &lt;a href="https://help.mixpanel.com/hc/en-us/articles/115004490503-Project-Settings#project-id"&gt;docs&lt;/a&gt; for more information on how to obtain this.
         */
        public Builder projectId(long projectId) {
            Utils.checkNotNull(projectId, "projectId");
            this.projectId = projectId;
            return this;
        }

        /**
         * Mixpanel Service Account Secret. See the &lt;a href="https://developer.mixpanel.com/reference/service-accounts"&gt;docs&lt;/a&gt; for more information on how to obtain this.
         */
        public Builder secret(String secret) {
            Utils.checkNotNull(secret, "secret");
            this.secret = secret;
            return this;
        }

        /**
         * Mixpanel Service Account Username. See the &lt;a href="https://developer.mixpanel.com/reference/service-accounts"&gt;docs&lt;/a&gt; for more information on how to obtain this.
         */
        public Builder username(String username) {
            Utils.checkNotNull(username, "username");
            this.username = username;
            return this;
        }
        
        public ServiceAccount build() {
            return new ServiceAccount(
                projectId,
                secret,
                username);
        }

        private static final LazySingletonValue<Optional<? extends SourceMixpanelOptionTitle>> _SINGLETON_VALUE_OptionTitle =
                new LazySingletonValue<>(
                        "option_title",
                        "\"Service Account\"",
                        new TypeReference<Optional<? extends SourceMixpanelOptionTitle>>() {});
    }
}

