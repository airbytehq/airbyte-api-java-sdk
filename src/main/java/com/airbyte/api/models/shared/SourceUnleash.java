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

public class SourceUnleash {

    /**
     * Your API Token (Server-Side SDK [Client]). See &lt;a href="https://docs.getunleash.io/how-to/how-to-create-api-tokens/"&gt;here&lt;/a&gt;. The token is case sensitive.
     */
    @JsonProperty("api_token")
    private String apiToken;

    /**
     * Your API URL. No trailing slash. ex: https://unleash.host.com/api
     */
    @JsonProperty("api_url")
    private String apiUrl;

    /**
     * Use this if you want to filter the API call for only one given project (can be used in addition to the "Feature Name Prefix" field). See &lt;a href="https://docs.getunleash.io/reference/api/legacy/unleash/client/features#filter-feature-toggles"&gt;here&lt;/a&gt;
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("nameprefix")
    private Optional<? extends String> nameprefix;

    /**
     * Use this if you want to filter the API call for only one given project (can be used in addition to the "Feature Name Prefix" field). See &lt;a href="https://docs.getunleash.io/reference/api/legacy/unleash/client/features#filter-feature-toggles"&gt;here&lt;/a&gt;
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("project_name")
    private Optional<? extends String> projectName;

    @JsonProperty("sourceType")
    private Unleash sourceType;

    @JsonCreator
    public SourceUnleash(
            @JsonProperty("api_token") String apiToken,
            @JsonProperty("api_url") String apiUrl,
            @JsonProperty("nameprefix") Optional<? extends String> nameprefix,
            @JsonProperty("project_name") Optional<? extends String> projectName) {
        Utils.checkNotNull(apiToken, "apiToken");
        Utils.checkNotNull(apiUrl, "apiUrl");
        Utils.checkNotNull(nameprefix, "nameprefix");
        Utils.checkNotNull(projectName, "projectName");
        this.apiToken = apiToken;
        this.apiUrl = apiUrl;
        this.nameprefix = nameprefix;
        this.projectName = projectName;
        this.sourceType = Builder._SINGLETON_VALUE_SourceType.value();
    }
    
    public SourceUnleash(
            String apiToken,
            String apiUrl) {
        this(apiToken, apiUrl, Optional.empty(), Optional.empty());
    }

    /**
     * Your API Token (Server-Side SDK [Client]). See &lt;a href="https://docs.getunleash.io/how-to/how-to-create-api-tokens/"&gt;here&lt;/a&gt;. The token is case sensitive.
     */
    @JsonIgnore
    public String apiToken() {
        return apiToken;
    }

    /**
     * Your API URL. No trailing slash. ex: https://unleash.host.com/api
     */
    @JsonIgnore
    public String apiUrl() {
        return apiUrl;
    }

    /**
     * Use this if you want to filter the API call for only one given project (can be used in addition to the "Feature Name Prefix" field). See &lt;a href="https://docs.getunleash.io/reference/api/legacy/unleash/client/features#filter-feature-toggles"&gt;here&lt;/a&gt;
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> nameprefix() {
        return (Optional<String>) nameprefix;
    }

    /**
     * Use this if you want to filter the API call for only one given project (can be used in addition to the "Feature Name Prefix" field). See &lt;a href="https://docs.getunleash.io/reference/api/legacy/unleash/client/features#filter-feature-toggles"&gt;here&lt;/a&gt;
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> projectName() {
        return (Optional<String>) projectName;
    }

    @JsonIgnore
    public Unleash sourceType() {
        return sourceType;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Your API Token (Server-Side SDK [Client]). See &lt;a href="https://docs.getunleash.io/how-to/how-to-create-api-tokens/"&gt;here&lt;/a&gt;. The token is case sensitive.
     */
    public SourceUnleash withApiToken(String apiToken) {
        Utils.checkNotNull(apiToken, "apiToken");
        this.apiToken = apiToken;
        return this;
    }

    /**
     * Your API URL. No trailing slash. ex: https://unleash.host.com/api
     */
    public SourceUnleash withApiUrl(String apiUrl) {
        Utils.checkNotNull(apiUrl, "apiUrl");
        this.apiUrl = apiUrl;
        return this;
    }

    /**
     * Use this if you want to filter the API call for only one given project (can be used in addition to the "Feature Name Prefix" field). See &lt;a href="https://docs.getunleash.io/reference/api/legacy/unleash/client/features#filter-feature-toggles"&gt;here&lt;/a&gt;
     */
    public SourceUnleash withNameprefix(String nameprefix) {
        Utils.checkNotNull(nameprefix, "nameprefix");
        this.nameprefix = Optional.ofNullable(nameprefix);
        return this;
    }

    /**
     * Use this if you want to filter the API call for only one given project (can be used in addition to the "Feature Name Prefix" field). See &lt;a href="https://docs.getunleash.io/reference/api/legacy/unleash/client/features#filter-feature-toggles"&gt;here&lt;/a&gt;
     */
    public SourceUnleash withNameprefix(Optional<? extends String> nameprefix) {
        Utils.checkNotNull(nameprefix, "nameprefix");
        this.nameprefix = nameprefix;
        return this;
    }

    /**
     * Use this if you want to filter the API call for only one given project (can be used in addition to the "Feature Name Prefix" field). See &lt;a href="https://docs.getunleash.io/reference/api/legacy/unleash/client/features#filter-feature-toggles"&gt;here&lt;/a&gt;
     */
    public SourceUnleash withProjectName(String projectName) {
        Utils.checkNotNull(projectName, "projectName");
        this.projectName = Optional.ofNullable(projectName);
        return this;
    }

    /**
     * Use this if you want to filter the API call for only one given project (can be used in addition to the "Feature Name Prefix" field). See &lt;a href="https://docs.getunleash.io/reference/api/legacy/unleash/client/features#filter-feature-toggles"&gt;here&lt;/a&gt;
     */
    public SourceUnleash withProjectName(Optional<? extends String> projectName) {
        Utils.checkNotNull(projectName, "projectName");
        this.projectName = projectName;
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
        SourceUnleash other = (SourceUnleash) o;
        return 
            java.util.Objects.deepEquals(this.apiToken, other.apiToken) &&
            java.util.Objects.deepEquals(this.apiUrl, other.apiUrl) &&
            java.util.Objects.deepEquals(this.nameprefix, other.nameprefix) &&
            java.util.Objects.deepEquals(this.projectName, other.projectName) &&
            java.util.Objects.deepEquals(this.sourceType, other.sourceType);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            apiToken,
            apiUrl,
            nameprefix,
            projectName,
            sourceType);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceUnleash.class,
                "apiToken", apiToken,
                "apiUrl", apiUrl,
                "nameprefix", nameprefix,
                "projectName", projectName,
                "sourceType", sourceType);
    }
    
    public final static class Builder {
 
        private String apiToken;
 
        private String apiUrl;
 
        private Optional<? extends String> nameprefix = Optional.empty();
 
        private Optional<? extends String> projectName = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Your API Token (Server-Side SDK [Client]). See &lt;a href="https://docs.getunleash.io/how-to/how-to-create-api-tokens/"&gt;here&lt;/a&gt;. The token is case sensitive.
         */
        public Builder apiToken(String apiToken) {
            Utils.checkNotNull(apiToken, "apiToken");
            this.apiToken = apiToken;
            return this;
        }

        /**
         * Your API URL. No trailing slash. ex: https://unleash.host.com/api
         */
        public Builder apiUrl(String apiUrl) {
            Utils.checkNotNull(apiUrl, "apiUrl");
            this.apiUrl = apiUrl;
            return this;
        }

        /**
         * Use this if you want to filter the API call for only one given project (can be used in addition to the "Feature Name Prefix" field). See &lt;a href="https://docs.getunleash.io/reference/api/legacy/unleash/client/features#filter-feature-toggles"&gt;here&lt;/a&gt;
         */
        public Builder nameprefix(String nameprefix) {
            Utils.checkNotNull(nameprefix, "nameprefix");
            this.nameprefix = Optional.ofNullable(nameprefix);
            return this;
        }

        /**
         * Use this if you want to filter the API call for only one given project (can be used in addition to the "Feature Name Prefix" field). See &lt;a href="https://docs.getunleash.io/reference/api/legacy/unleash/client/features#filter-feature-toggles"&gt;here&lt;/a&gt;
         */
        public Builder nameprefix(Optional<? extends String> nameprefix) {
            Utils.checkNotNull(nameprefix, "nameprefix");
            this.nameprefix = nameprefix;
            return this;
        }

        /**
         * Use this if you want to filter the API call for only one given project (can be used in addition to the "Feature Name Prefix" field). See &lt;a href="https://docs.getunleash.io/reference/api/legacy/unleash/client/features#filter-feature-toggles"&gt;here&lt;/a&gt;
         */
        public Builder projectName(String projectName) {
            Utils.checkNotNull(projectName, "projectName");
            this.projectName = Optional.ofNullable(projectName);
            return this;
        }

        /**
         * Use this if you want to filter the API call for only one given project (can be used in addition to the "Feature Name Prefix" field). See &lt;a href="https://docs.getunleash.io/reference/api/legacy/unleash/client/features#filter-feature-toggles"&gt;here&lt;/a&gt;
         */
        public Builder projectName(Optional<? extends String> projectName) {
            Utils.checkNotNull(projectName, "projectName");
            this.projectName = projectName;
            return this;
        }
        
        public SourceUnleash build() {
            return new SourceUnleash(
                apiToken,
                apiUrl,
                nameprefix,
                projectName);
        }

        private static final LazySingletonValue<Unleash> _SINGLETON_VALUE_SourceType =
                new LazySingletonValue<>(
                        "sourceType",
                        "\"unleash\"",
                        new TypeReference<Unleash>() {});
    }
}

