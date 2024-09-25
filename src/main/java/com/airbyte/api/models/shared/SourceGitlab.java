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

public class SourceGitlab {

    /**
     * Please enter your basic URL from GitLab instance.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("api_url")
    private Optional<? extends String> apiUrl;

    @JsonProperty("credentials")
    private SourceGitlabAuthorizationMethod credentials;

    /**
     * List of groups. e.g. airbyte.io.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("groups_list")
    private Optional<? extends java.util.List<String>> groupsList;

    /**
     * Space-delimited list of projects. e.g. airbyte.io/documentation meltano/tap-gitlab.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("projects_list")
    private Optional<? extends java.util.List<String>> projectsList;

    @JsonProperty("sourceType")
    private SourceGitlabGitlab sourceType;

    /**
     * The date from which you'd like to replicate data for GitLab API, in the format YYYY-MM-DDT00:00:00Z. Optional. If not set, all data will be replicated. All data generated after this date will be replicated.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("start_date")
    private Optional<? extends OffsetDateTime> startDate;

    @JsonCreator
    public SourceGitlab(
            @JsonProperty("api_url") Optional<? extends String> apiUrl,
            @JsonProperty("credentials") SourceGitlabAuthorizationMethod credentials,
            @JsonProperty("groups_list") Optional<? extends java.util.List<String>> groupsList,
            @JsonProperty("projects_list") Optional<? extends java.util.List<String>> projectsList,
            @JsonProperty("start_date") Optional<? extends OffsetDateTime> startDate) {
        Utils.checkNotNull(apiUrl, "apiUrl");
        Utils.checkNotNull(credentials, "credentials");
        Utils.checkNotNull(groupsList, "groupsList");
        Utils.checkNotNull(projectsList, "projectsList");
        Utils.checkNotNull(startDate, "startDate");
        this.apiUrl = apiUrl;
        this.credentials = credentials;
        this.groupsList = groupsList;
        this.projectsList = projectsList;
        this.sourceType = Builder._SINGLETON_VALUE_SourceType.value();
        this.startDate = startDate;
    }
    
    public SourceGitlab(
            SourceGitlabAuthorizationMethod credentials) {
        this(Optional.empty(), credentials, Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * Please enter your basic URL from GitLab instance.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> apiUrl() {
        return (Optional<String>) apiUrl;
    }

    @JsonIgnore
    public SourceGitlabAuthorizationMethod credentials() {
        return credentials;
    }

    /**
     * List of groups. e.g. airbyte.io.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<java.util.List<String>> groupsList() {
        return (Optional<java.util.List<String>>) groupsList;
    }

    /**
     * Space-delimited list of projects. e.g. airbyte.io/documentation meltano/tap-gitlab.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<java.util.List<String>> projectsList() {
        return (Optional<java.util.List<String>>) projectsList;
    }

    @JsonIgnore
    public SourceGitlabGitlab sourceType() {
        return sourceType;
    }

    /**
     * The date from which you'd like to replicate data for GitLab API, in the format YYYY-MM-DDT00:00:00Z. Optional. If not set, all data will be replicated. All data generated after this date will be replicated.
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
     * Please enter your basic URL from GitLab instance.
     */
    public SourceGitlab withApiUrl(String apiUrl) {
        Utils.checkNotNull(apiUrl, "apiUrl");
        this.apiUrl = Optional.ofNullable(apiUrl);
        return this;
    }

    /**
     * Please enter your basic URL from GitLab instance.
     */
    public SourceGitlab withApiUrl(Optional<? extends String> apiUrl) {
        Utils.checkNotNull(apiUrl, "apiUrl");
        this.apiUrl = apiUrl;
        return this;
    }

    public SourceGitlab withCredentials(SourceGitlabAuthorizationMethod credentials) {
        Utils.checkNotNull(credentials, "credentials");
        this.credentials = credentials;
        return this;
    }

    /**
     * List of groups. e.g. airbyte.io.
     */
    public SourceGitlab withGroupsList(java.util.List<String> groupsList) {
        Utils.checkNotNull(groupsList, "groupsList");
        this.groupsList = Optional.ofNullable(groupsList);
        return this;
    }

    /**
     * List of groups. e.g. airbyte.io.
     */
    public SourceGitlab withGroupsList(Optional<? extends java.util.List<String>> groupsList) {
        Utils.checkNotNull(groupsList, "groupsList");
        this.groupsList = groupsList;
        return this;
    }

    /**
     * Space-delimited list of projects. e.g. airbyte.io/documentation meltano/tap-gitlab.
     */
    public SourceGitlab withProjectsList(java.util.List<String> projectsList) {
        Utils.checkNotNull(projectsList, "projectsList");
        this.projectsList = Optional.ofNullable(projectsList);
        return this;
    }

    /**
     * Space-delimited list of projects. e.g. airbyte.io/documentation meltano/tap-gitlab.
     */
    public SourceGitlab withProjectsList(Optional<? extends java.util.List<String>> projectsList) {
        Utils.checkNotNull(projectsList, "projectsList");
        this.projectsList = projectsList;
        return this;
    }

    /**
     * The date from which you'd like to replicate data for GitLab API, in the format YYYY-MM-DDT00:00:00Z. Optional. If not set, all data will be replicated. All data generated after this date will be replicated.
     */
    public SourceGitlab withStartDate(OffsetDateTime startDate) {
        Utils.checkNotNull(startDate, "startDate");
        this.startDate = Optional.ofNullable(startDate);
        return this;
    }

    /**
     * The date from which you'd like to replicate data for GitLab API, in the format YYYY-MM-DDT00:00:00Z. Optional. If not set, all data will be replicated. All data generated after this date will be replicated.
     */
    public SourceGitlab withStartDate(Optional<? extends OffsetDateTime> startDate) {
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
        SourceGitlab other = (SourceGitlab) o;
        return 
            java.util.Objects.deepEquals(this.apiUrl, other.apiUrl) &&
            java.util.Objects.deepEquals(this.credentials, other.credentials) &&
            java.util.Objects.deepEquals(this.groupsList, other.groupsList) &&
            java.util.Objects.deepEquals(this.projectsList, other.projectsList) &&
            java.util.Objects.deepEquals(this.sourceType, other.sourceType) &&
            java.util.Objects.deepEquals(this.startDate, other.startDate);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            apiUrl,
            credentials,
            groupsList,
            projectsList,
            sourceType,
            startDate);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceGitlab.class,
                "apiUrl", apiUrl,
                "credentials", credentials,
                "groupsList", groupsList,
                "projectsList", projectsList,
                "sourceType", sourceType,
                "startDate", startDate);
    }
    
    public final static class Builder {
 
        private Optional<? extends String> apiUrl;
 
        private SourceGitlabAuthorizationMethod credentials;
 
        private Optional<? extends java.util.List<String>> groupsList = Optional.empty();
 
        private Optional<? extends java.util.List<String>> projectsList = Optional.empty();
 
        private Optional<? extends OffsetDateTime> startDate = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Please enter your basic URL from GitLab instance.
         */
        public Builder apiUrl(String apiUrl) {
            Utils.checkNotNull(apiUrl, "apiUrl");
            this.apiUrl = Optional.ofNullable(apiUrl);
            return this;
        }

        /**
         * Please enter your basic URL from GitLab instance.
         */
        public Builder apiUrl(Optional<? extends String> apiUrl) {
            Utils.checkNotNull(apiUrl, "apiUrl");
            this.apiUrl = apiUrl;
            return this;
        }

        public Builder credentials(SourceGitlabAuthorizationMethod credentials) {
            Utils.checkNotNull(credentials, "credentials");
            this.credentials = credentials;
            return this;
        }

        /**
         * List of groups. e.g. airbyte.io.
         */
        public Builder groupsList(java.util.List<String> groupsList) {
            Utils.checkNotNull(groupsList, "groupsList");
            this.groupsList = Optional.ofNullable(groupsList);
            return this;
        }

        /**
         * List of groups. e.g. airbyte.io.
         */
        public Builder groupsList(Optional<? extends java.util.List<String>> groupsList) {
            Utils.checkNotNull(groupsList, "groupsList");
            this.groupsList = groupsList;
            return this;
        }

        /**
         * Space-delimited list of projects. e.g. airbyte.io/documentation meltano/tap-gitlab.
         */
        public Builder projectsList(java.util.List<String> projectsList) {
            Utils.checkNotNull(projectsList, "projectsList");
            this.projectsList = Optional.ofNullable(projectsList);
            return this;
        }

        /**
         * Space-delimited list of projects. e.g. airbyte.io/documentation meltano/tap-gitlab.
         */
        public Builder projectsList(Optional<? extends java.util.List<String>> projectsList) {
            Utils.checkNotNull(projectsList, "projectsList");
            this.projectsList = projectsList;
            return this;
        }

        /**
         * The date from which you'd like to replicate data for GitLab API, in the format YYYY-MM-DDT00:00:00Z. Optional. If not set, all data will be replicated. All data generated after this date will be replicated.
         */
        public Builder startDate(OffsetDateTime startDate) {
            Utils.checkNotNull(startDate, "startDate");
            this.startDate = Optional.ofNullable(startDate);
            return this;
        }

        /**
         * The date from which you'd like to replicate data for GitLab API, in the format YYYY-MM-DDT00:00:00Z. Optional. If not set, all data will be replicated. All data generated after this date will be replicated.
         */
        public Builder startDate(Optional<? extends OffsetDateTime> startDate) {
            Utils.checkNotNull(startDate, "startDate");
            this.startDate = startDate;
            return this;
        }
        
        public SourceGitlab build() {
            if (apiUrl == null) {
                apiUrl = _SINGLETON_VALUE_ApiUrl.value();
            }
            return new SourceGitlab(
                apiUrl,
                credentials,
                groupsList,
                projectsList,
                startDate);
        }

        private static final LazySingletonValue<Optional<? extends String>> _SINGLETON_VALUE_ApiUrl =
                new LazySingletonValue<>(
                        "api_url",
                        "\"gitlab.com\"",
                        new TypeReference<Optional<? extends String>>() {});

        private static final LazySingletonValue<SourceGitlabGitlab> _SINGLETON_VALUE_SourceType =
                new LazySingletonValue<>(
                        "sourceType",
                        "\"gitlab\"",
                        new TypeReference<SourceGitlabGitlab>() {});
    }
}

