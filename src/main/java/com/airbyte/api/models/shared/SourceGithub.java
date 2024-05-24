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
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.OffsetDateTime;
import java.util.Optional;

public class SourceGithub {

    /**
     * Please enter your basic URL from self-hosted GitHub instance or leave it empty to use GitHub.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("api_url")
    private Optional<? extends String> apiUrl;

    /**
     * (DEPRCATED) Space-delimited list of GitHub repository branches to pull commits for, e.g. `airbytehq/airbyte/master`. If no branches are specified for a repository, the default branch will be pulled.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("branch")
    private Optional<? extends String> branch;

    /**
     * List of GitHub repository branches to pull commits for, e.g. `airbytehq/airbyte/master`. If no branches are specified for a repository, the default branch will be pulled.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("branches")
    private Optional<? extends java.util.List<String>> branches;

    /**
     * Choose how to authenticate to GitHub
     */
    @JsonProperty("credentials")
    private SourceGithubAuthentication credentials;

    /**
     * List of GitHub organizations/repositories, e.g. `airbytehq/airbyte` for single repository, `airbytehq/*` for get all repositories from organization and `airbytehq/a* for matching multiple repositories by pattern.
     */
    @JsonProperty("repositories")
    private java.util.List<String> repositories;

    /**
     * (DEPRCATED) Space-delimited list of GitHub organizations/repositories, e.g. `airbytehq/airbyte` for single repository, `airbytehq/*` for get all repositories from organization and `airbytehq/airbyte airbytehq/another-repo` for multiple repositories.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("repository")
    private Optional<? extends String> repository;

    @JsonProperty("sourceType")
    private SourceGithubGithub sourceType;

    /**
     * The date from which you'd like to replicate data from GitHub in the format YYYY-MM-DDT00:00:00Z. If the date is not set, all data will be replicated.  For the streams which support this configuration, only data generated on or after the start date will be replicated. This field doesn't apply to all streams, see the &lt;a href="https://docs.airbyte.com/integrations/sources/github"&gt;docs&lt;/a&gt; for more info
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("start_date")
    private Optional<? extends OffsetDateTime> startDate;

    @JsonCreator
    public SourceGithub(
            @JsonProperty("api_url") Optional<? extends String> apiUrl,
            @JsonProperty("branch") Optional<? extends String> branch,
            @JsonProperty("branches") Optional<? extends java.util.List<String>> branches,
            @JsonProperty("credentials") SourceGithubAuthentication credentials,
            @JsonProperty("repositories") java.util.List<String> repositories,
            @JsonProperty("repository") Optional<? extends String> repository,
            @JsonProperty("start_date") Optional<? extends OffsetDateTime> startDate) {
        Utils.checkNotNull(apiUrl, "apiUrl");
        Utils.checkNotNull(branch, "branch");
        Utils.checkNotNull(branches, "branches");
        Utils.checkNotNull(credentials, "credentials");
        Utils.checkNotNull(repositories, "repositories");
        Utils.checkNotNull(repository, "repository");
        Utils.checkNotNull(startDate, "startDate");
        this.apiUrl = apiUrl;
        this.branch = branch;
        this.branches = branches;
        this.credentials = credentials;
        this.repositories = repositories;
        this.repository = repository;
        this.sourceType = Builder._SINGLETON_VALUE_SourceType.value();
        this.startDate = startDate;
    }
    
    public SourceGithub(
            SourceGithubAuthentication credentials,
            java.util.List<String> repositories) {
        this(Optional.empty(), Optional.empty(), Optional.empty(), credentials, repositories, Optional.empty(), Optional.empty());
    }

    /**
     * Please enter your basic URL from self-hosted GitHub instance or leave it empty to use GitHub.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> apiUrl() {
        return (Optional<String>) apiUrl;
    }

    /**
     * (DEPRCATED) Space-delimited list of GitHub repository branches to pull commits for, e.g. `airbytehq/airbyte/master`. If no branches are specified for a repository, the default branch will be pulled.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> branch() {
        return (Optional<String>) branch;
    }

    /**
     * List of GitHub repository branches to pull commits for, e.g. `airbytehq/airbyte/master`. If no branches are specified for a repository, the default branch will be pulled.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<java.util.List<String>> branches() {
        return (Optional<java.util.List<String>>) branches;
    }

    /**
     * Choose how to authenticate to GitHub
     */
    @JsonIgnore
    public SourceGithubAuthentication credentials() {
        return credentials;
    }

    /**
     * List of GitHub organizations/repositories, e.g. `airbytehq/airbyte` for single repository, `airbytehq/*` for get all repositories from organization and `airbytehq/a* for matching multiple repositories by pattern.
     */
    @JsonIgnore
    public java.util.List<String> repositories() {
        return repositories;
    }

    /**
     * (DEPRCATED) Space-delimited list of GitHub organizations/repositories, e.g. `airbytehq/airbyte` for single repository, `airbytehq/*` for get all repositories from organization and `airbytehq/airbyte airbytehq/another-repo` for multiple repositories.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> repository() {
        return (Optional<String>) repository;
    }

    @JsonIgnore
    public SourceGithubGithub sourceType() {
        return sourceType;
    }

    /**
     * The date from which you'd like to replicate data from GitHub in the format YYYY-MM-DDT00:00:00Z. If the date is not set, all data will be replicated.  For the streams which support this configuration, only data generated on or after the start date will be replicated. This field doesn't apply to all streams, see the &lt;a href="https://docs.airbyte.com/integrations/sources/github"&gt;docs&lt;/a&gt; for more info
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<OffsetDateTime> startDate() {
        return (Optional<OffsetDateTime>) startDate;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Please enter your basic URL from self-hosted GitHub instance or leave it empty to use GitHub.
     */
    public SourceGithub withApiUrl(String apiUrl) {
        Utils.checkNotNull(apiUrl, "apiUrl");
        this.apiUrl = Optional.ofNullable(apiUrl);
        return this;
    }

    /**
     * Please enter your basic URL from self-hosted GitHub instance or leave it empty to use GitHub.
     */
    public SourceGithub withApiUrl(Optional<? extends String> apiUrl) {
        Utils.checkNotNull(apiUrl, "apiUrl");
        this.apiUrl = apiUrl;
        return this;
    }

    /**
     * (DEPRCATED) Space-delimited list of GitHub repository branches to pull commits for, e.g. `airbytehq/airbyte/master`. If no branches are specified for a repository, the default branch will be pulled.
     */
    public SourceGithub withBranch(String branch) {
        Utils.checkNotNull(branch, "branch");
        this.branch = Optional.ofNullable(branch);
        return this;
    }

    /**
     * (DEPRCATED) Space-delimited list of GitHub repository branches to pull commits for, e.g. `airbytehq/airbyte/master`. If no branches are specified for a repository, the default branch will be pulled.
     */
    public SourceGithub withBranch(Optional<? extends String> branch) {
        Utils.checkNotNull(branch, "branch");
        this.branch = branch;
        return this;
    }

    /**
     * List of GitHub repository branches to pull commits for, e.g. `airbytehq/airbyte/master`. If no branches are specified for a repository, the default branch will be pulled.
     */
    public SourceGithub withBranches(java.util.List<String> branches) {
        Utils.checkNotNull(branches, "branches");
        this.branches = Optional.ofNullable(branches);
        return this;
    }

    /**
     * List of GitHub repository branches to pull commits for, e.g. `airbytehq/airbyte/master`. If no branches are specified for a repository, the default branch will be pulled.
     */
    public SourceGithub withBranches(Optional<? extends java.util.List<String>> branches) {
        Utils.checkNotNull(branches, "branches");
        this.branches = branches;
        return this;
    }

    /**
     * Choose how to authenticate to GitHub
     */
    public SourceGithub withCredentials(SourceGithubAuthentication credentials) {
        Utils.checkNotNull(credentials, "credentials");
        this.credentials = credentials;
        return this;
    }

    /**
     * List of GitHub organizations/repositories, e.g. `airbytehq/airbyte` for single repository, `airbytehq/*` for get all repositories from organization and `airbytehq/a* for matching multiple repositories by pattern.
     */
    public SourceGithub withRepositories(java.util.List<String> repositories) {
        Utils.checkNotNull(repositories, "repositories");
        this.repositories = repositories;
        return this;
    }

    /**
     * (DEPRCATED) Space-delimited list of GitHub organizations/repositories, e.g. `airbytehq/airbyte` for single repository, `airbytehq/*` for get all repositories from organization and `airbytehq/airbyte airbytehq/another-repo` for multiple repositories.
     */
    public SourceGithub withRepository(String repository) {
        Utils.checkNotNull(repository, "repository");
        this.repository = Optional.ofNullable(repository);
        return this;
    }

    /**
     * (DEPRCATED) Space-delimited list of GitHub organizations/repositories, e.g. `airbytehq/airbyte` for single repository, `airbytehq/*` for get all repositories from organization and `airbytehq/airbyte airbytehq/another-repo` for multiple repositories.
     */
    public SourceGithub withRepository(Optional<? extends String> repository) {
        Utils.checkNotNull(repository, "repository");
        this.repository = repository;
        return this;
    }

    /**
     * The date from which you'd like to replicate data from GitHub in the format YYYY-MM-DDT00:00:00Z. If the date is not set, all data will be replicated.  For the streams which support this configuration, only data generated on or after the start date will be replicated. This field doesn't apply to all streams, see the &lt;a href="https://docs.airbyte.com/integrations/sources/github"&gt;docs&lt;/a&gt; for more info
     */
    public SourceGithub withStartDate(OffsetDateTime startDate) {
        Utils.checkNotNull(startDate, "startDate");
        this.startDate = Optional.ofNullable(startDate);
        return this;
    }

    /**
     * The date from which you'd like to replicate data from GitHub in the format YYYY-MM-DDT00:00:00Z. If the date is not set, all data will be replicated.  For the streams which support this configuration, only data generated on or after the start date will be replicated. This field doesn't apply to all streams, see the &lt;a href="https://docs.airbyte.com/integrations/sources/github"&gt;docs&lt;/a&gt; for more info
     */
    public SourceGithub withStartDate(Optional<? extends OffsetDateTime> startDate) {
        Utils.checkNotNull(startDate, "startDate");
        this.startDate = startDate;
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
        SourceGithub other = (SourceGithub) o;
        return 
            java.util.Objects.deepEquals(this.apiUrl, other.apiUrl) &&
            java.util.Objects.deepEquals(this.branch, other.branch) &&
            java.util.Objects.deepEquals(this.branches, other.branches) &&
            java.util.Objects.deepEquals(this.credentials, other.credentials) &&
            java.util.Objects.deepEquals(this.repositories, other.repositories) &&
            java.util.Objects.deepEquals(this.repository, other.repository) &&
            java.util.Objects.deepEquals(this.sourceType, other.sourceType) &&
            java.util.Objects.deepEquals(this.startDate, other.startDate);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            apiUrl,
            branch,
            branches,
            credentials,
            repositories,
            repository,
            sourceType,
            startDate);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceGithub.class,
                "apiUrl", apiUrl,
                "branch", branch,
                "branches", branches,
                "credentials", credentials,
                "repositories", repositories,
                "repository", repository,
                "sourceType", sourceType,
                "startDate", startDate);
    }
    
    public final static class Builder {
 
        private Optional<? extends String> apiUrl;
 
        private Optional<? extends String> branch = Optional.empty();
 
        private Optional<? extends java.util.List<String>> branches = Optional.empty();
 
        private SourceGithubAuthentication credentials;
 
        private java.util.List<String> repositories;
 
        private Optional<? extends String> repository = Optional.empty();
 
        private Optional<? extends OffsetDateTime> startDate = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Please enter your basic URL from self-hosted GitHub instance or leave it empty to use GitHub.
         */
        public Builder apiUrl(String apiUrl) {
            Utils.checkNotNull(apiUrl, "apiUrl");
            this.apiUrl = Optional.ofNullable(apiUrl);
            return this;
        }

        /**
         * Please enter your basic URL from self-hosted GitHub instance or leave it empty to use GitHub.
         */
        public Builder apiUrl(Optional<? extends String> apiUrl) {
            Utils.checkNotNull(apiUrl, "apiUrl");
            this.apiUrl = apiUrl;
            return this;
        }

        /**
         * (DEPRCATED) Space-delimited list of GitHub repository branches to pull commits for, e.g. `airbytehq/airbyte/master`. If no branches are specified for a repository, the default branch will be pulled.
         */
        public Builder branch(String branch) {
            Utils.checkNotNull(branch, "branch");
            this.branch = Optional.ofNullable(branch);
            return this;
        }

        /**
         * (DEPRCATED) Space-delimited list of GitHub repository branches to pull commits for, e.g. `airbytehq/airbyte/master`. If no branches are specified for a repository, the default branch will be pulled.
         */
        public Builder branch(Optional<? extends String> branch) {
            Utils.checkNotNull(branch, "branch");
            this.branch = branch;
            return this;
        }

        /**
         * List of GitHub repository branches to pull commits for, e.g. `airbytehq/airbyte/master`. If no branches are specified for a repository, the default branch will be pulled.
         */
        public Builder branches(java.util.List<String> branches) {
            Utils.checkNotNull(branches, "branches");
            this.branches = Optional.ofNullable(branches);
            return this;
        }

        /**
         * List of GitHub repository branches to pull commits for, e.g. `airbytehq/airbyte/master`. If no branches are specified for a repository, the default branch will be pulled.
         */
        public Builder branches(Optional<? extends java.util.List<String>> branches) {
            Utils.checkNotNull(branches, "branches");
            this.branches = branches;
            return this;
        }

        /**
         * Choose how to authenticate to GitHub
         */
        public Builder credentials(SourceGithubAuthentication credentials) {
            Utils.checkNotNull(credentials, "credentials");
            this.credentials = credentials;
            return this;
        }

        /**
         * List of GitHub organizations/repositories, e.g. `airbytehq/airbyte` for single repository, `airbytehq/*` for get all repositories from organization and `airbytehq/a* for matching multiple repositories by pattern.
         */
        public Builder repositories(java.util.List<String> repositories) {
            Utils.checkNotNull(repositories, "repositories");
            this.repositories = repositories;
            return this;
        }

        /**
         * (DEPRCATED) Space-delimited list of GitHub organizations/repositories, e.g. `airbytehq/airbyte` for single repository, `airbytehq/*` for get all repositories from organization and `airbytehq/airbyte airbytehq/another-repo` for multiple repositories.
         */
        public Builder repository(String repository) {
            Utils.checkNotNull(repository, "repository");
            this.repository = Optional.ofNullable(repository);
            return this;
        }

        /**
         * (DEPRCATED) Space-delimited list of GitHub organizations/repositories, e.g. `airbytehq/airbyte` for single repository, `airbytehq/*` for get all repositories from organization and `airbytehq/airbyte airbytehq/another-repo` for multiple repositories.
         */
        public Builder repository(Optional<? extends String> repository) {
            Utils.checkNotNull(repository, "repository");
            this.repository = repository;
            return this;
        }

        /**
         * The date from which you'd like to replicate data from GitHub in the format YYYY-MM-DDT00:00:00Z. If the date is not set, all data will be replicated.  For the streams which support this configuration, only data generated on or after the start date will be replicated. This field doesn't apply to all streams, see the &lt;a href="https://docs.airbyte.com/integrations/sources/github"&gt;docs&lt;/a&gt; for more info
         */
        public Builder startDate(OffsetDateTime startDate) {
            Utils.checkNotNull(startDate, "startDate");
            this.startDate = Optional.ofNullable(startDate);
            return this;
        }

        /**
         * The date from which you'd like to replicate data from GitHub in the format YYYY-MM-DDT00:00:00Z. If the date is not set, all data will be replicated.  For the streams which support this configuration, only data generated on or after the start date will be replicated. This field doesn't apply to all streams, see the &lt;a href="https://docs.airbyte.com/integrations/sources/github"&gt;docs&lt;/a&gt; for more info
         */
        public Builder startDate(Optional<? extends OffsetDateTime> startDate) {
            Utils.checkNotNull(startDate, "startDate");
            this.startDate = startDate;
            return this;
        }
        
        public SourceGithub build() {
            if (apiUrl == null) {
                apiUrl = _SINGLETON_VALUE_ApiUrl.value();
            }
            return new SourceGithub(
                apiUrl,
                branch,
                branches,
                credentials,
                repositories,
                repository,
                startDate);
        }

        private static final LazySingletonValue<Optional<? extends String>> _SINGLETON_VALUE_ApiUrl =
                new LazySingletonValue<>(
                        "api_url",
                        "\"https://api.github.com/\"",
                        new TypeReference<Optional<? extends String>>() {});

        private static final LazySingletonValue<SourceGithubGithub> _SINGLETON_VALUE_SourceType =
                new LazySingletonValue<>(
                        "sourceType",
                        "\"github\"",
                        new TypeReference<SourceGithubGithub>() {});
    }
}

