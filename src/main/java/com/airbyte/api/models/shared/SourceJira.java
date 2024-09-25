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

public class SourceJira {

    /**
     * Jira API Token. See the &lt;a href="https://docs.airbyte.com/integrations/sources/jira"&gt;docs&lt;/a&gt; for more information on how to generate this key. API Token is used for Authorization to your account by BasicAuth.
     */
    @JsonProperty("api_token")
    private String apiToken;

    /**
     * The Domain for your Jira account, e.g. airbyteio.atlassian.net, airbyteio.jira.com, jira.your-domain.com
     */
    @JsonProperty("domain")
    private String domain;

    /**
     * The user email for your Jira account which you used to generate the API token. This field is used for Authorization to your account by BasicAuth.
     */
    @JsonProperty("email")
    private String email;

    /**
     * Allow the use of experimental streams which rely on undocumented Jira API endpoints. See https://docs.airbyte.com/integrations/sources/jira#experimental-tables for more info.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("enable_experimental_streams")
    private Optional<? extends Boolean> enableExperimentalStreams;

    /**
     * When set to N, the connector will always refresh resources created within the past N minutes. By default, updated objects that are not newly created are not incrementally synced.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("lookback_window_minutes")
    private Optional<? extends Long> lookbackWindowMinutes;

    /**
     * List of Jira project keys to replicate data for, or leave it empty if you want to replicate data for all projects.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("projects")
    private Optional<? extends java.util.List<String>> projects;

    @JsonProperty("sourceType")
    private Jira sourceType;

    /**
     * The date from which you want to replicate data from Jira, use the format YYYY-MM-DDT00:00:00Z. Note that this field only applies to certain streams, and only data generated on or after the start date will be replicated. Or leave it empty if you want to replicate all data. For more information, refer to the &lt;a href="https://docs.airbyte.com/integrations/sources/jira/"&gt;documentation&lt;/a&gt;.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("start_date")
    private Optional<? extends OffsetDateTime> startDate;

    @JsonCreator
    public SourceJira(
            @JsonProperty("api_token") String apiToken,
            @JsonProperty("domain") String domain,
            @JsonProperty("email") String email,
            @JsonProperty("enable_experimental_streams") Optional<? extends Boolean> enableExperimentalStreams,
            @JsonProperty("lookback_window_minutes") Optional<? extends Long> lookbackWindowMinutes,
            @JsonProperty("projects") Optional<? extends java.util.List<String>> projects,
            @JsonProperty("start_date") Optional<? extends OffsetDateTime> startDate) {
        Utils.checkNotNull(apiToken, "apiToken");
        Utils.checkNotNull(domain, "domain");
        Utils.checkNotNull(email, "email");
        Utils.checkNotNull(enableExperimentalStreams, "enableExperimentalStreams");
        Utils.checkNotNull(lookbackWindowMinutes, "lookbackWindowMinutes");
        Utils.checkNotNull(projects, "projects");
        Utils.checkNotNull(startDate, "startDate");
        this.apiToken = apiToken;
        this.domain = domain;
        this.email = email;
        this.enableExperimentalStreams = enableExperimentalStreams;
        this.lookbackWindowMinutes = lookbackWindowMinutes;
        this.projects = projects;
        this.sourceType = Builder._SINGLETON_VALUE_SourceType.value();
        this.startDate = startDate;
    }
    
    public SourceJira(
            String apiToken,
            String domain,
            String email) {
        this(apiToken, domain, email, Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * Jira API Token. See the &lt;a href="https://docs.airbyte.com/integrations/sources/jira"&gt;docs&lt;/a&gt; for more information on how to generate this key. API Token is used for Authorization to your account by BasicAuth.
     */
    @JsonIgnore
    public String apiToken() {
        return apiToken;
    }

    /**
     * The Domain for your Jira account, e.g. airbyteio.atlassian.net, airbyteio.jira.com, jira.your-domain.com
     */
    @JsonIgnore
    public String domain() {
        return domain;
    }

    /**
     * The user email for your Jira account which you used to generate the API token. This field is used for Authorization to your account by BasicAuth.
     */
    @JsonIgnore
    public String email() {
        return email;
    }

    /**
     * Allow the use of experimental streams which rely on undocumented Jira API endpoints. See https://docs.airbyte.com/integrations/sources/jira#experimental-tables for more info.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Boolean> enableExperimentalStreams() {
        return (Optional<Boolean>) enableExperimentalStreams;
    }

    /**
     * When set to N, the connector will always refresh resources created within the past N minutes. By default, updated objects that are not newly created are not incrementally synced.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Long> lookbackWindowMinutes() {
        return (Optional<Long>) lookbackWindowMinutes;
    }

    /**
     * List of Jira project keys to replicate data for, or leave it empty if you want to replicate data for all projects.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<java.util.List<String>> projects() {
        return (Optional<java.util.List<String>>) projects;
    }

    @JsonIgnore
    public Jira sourceType() {
        return sourceType;
    }

    /**
     * The date from which you want to replicate data from Jira, use the format YYYY-MM-DDT00:00:00Z. Note that this field only applies to certain streams, and only data generated on or after the start date will be replicated. Or leave it empty if you want to replicate all data. For more information, refer to the &lt;a href="https://docs.airbyte.com/integrations/sources/jira/"&gt;documentation&lt;/a&gt;.
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
     * Jira API Token. See the &lt;a href="https://docs.airbyte.com/integrations/sources/jira"&gt;docs&lt;/a&gt; for more information on how to generate this key. API Token is used for Authorization to your account by BasicAuth.
     */
    public SourceJira withApiToken(String apiToken) {
        Utils.checkNotNull(apiToken, "apiToken");
        this.apiToken = apiToken;
        return this;
    }

    /**
     * The Domain for your Jira account, e.g. airbyteio.atlassian.net, airbyteio.jira.com, jira.your-domain.com
     */
    public SourceJira withDomain(String domain) {
        Utils.checkNotNull(domain, "domain");
        this.domain = domain;
        return this;
    }

    /**
     * The user email for your Jira account which you used to generate the API token. This field is used for Authorization to your account by BasicAuth.
     */
    public SourceJira withEmail(String email) {
        Utils.checkNotNull(email, "email");
        this.email = email;
        return this;
    }

    /**
     * Allow the use of experimental streams which rely on undocumented Jira API endpoints. See https://docs.airbyte.com/integrations/sources/jira#experimental-tables for more info.
     */
    public SourceJira withEnableExperimentalStreams(boolean enableExperimentalStreams) {
        Utils.checkNotNull(enableExperimentalStreams, "enableExperimentalStreams");
        this.enableExperimentalStreams = Optional.ofNullable(enableExperimentalStreams);
        return this;
    }

    /**
     * Allow the use of experimental streams which rely on undocumented Jira API endpoints. See https://docs.airbyte.com/integrations/sources/jira#experimental-tables for more info.
     */
    public SourceJira withEnableExperimentalStreams(Optional<? extends Boolean> enableExperimentalStreams) {
        Utils.checkNotNull(enableExperimentalStreams, "enableExperimentalStreams");
        this.enableExperimentalStreams = enableExperimentalStreams;
        return this;
    }

    /**
     * When set to N, the connector will always refresh resources created within the past N minutes. By default, updated objects that are not newly created are not incrementally synced.
     */
    public SourceJira withLookbackWindowMinutes(long lookbackWindowMinutes) {
        Utils.checkNotNull(lookbackWindowMinutes, "lookbackWindowMinutes");
        this.lookbackWindowMinutes = Optional.ofNullable(lookbackWindowMinutes);
        return this;
    }

    /**
     * When set to N, the connector will always refresh resources created within the past N minutes. By default, updated objects that are not newly created are not incrementally synced.
     */
    public SourceJira withLookbackWindowMinutes(Optional<? extends Long> lookbackWindowMinutes) {
        Utils.checkNotNull(lookbackWindowMinutes, "lookbackWindowMinutes");
        this.lookbackWindowMinutes = lookbackWindowMinutes;
        return this;
    }

    /**
     * List of Jira project keys to replicate data for, or leave it empty if you want to replicate data for all projects.
     */
    public SourceJira withProjects(java.util.List<String> projects) {
        Utils.checkNotNull(projects, "projects");
        this.projects = Optional.ofNullable(projects);
        return this;
    }

    /**
     * List of Jira project keys to replicate data for, or leave it empty if you want to replicate data for all projects.
     */
    public SourceJira withProjects(Optional<? extends java.util.List<String>> projects) {
        Utils.checkNotNull(projects, "projects");
        this.projects = projects;
        return this;
    }

    /**
     * The date from which you want to replicate data from Jira, use the format YYYY-MM-DDT00:00:00Z. Note that this field only applies to certain streams, and only data generated on or after the start date will be replicated. Or leave it empty if you want to replicate all data. For more information, refer to the &lt;a href="https://docs.airbyte.com/integrations/sources/jira/"&gt;documentation&lt;/a&gt;.
     */
    public SourceJira withStartDate(OffsetDateTime startDate) {
        Utils.checkNotNull(startDate, "startDate");
        this.startDate = Optional.ofNullable(startDate);
        return this;
    }

    /**
     * The date from which you want to replicate data from Jira, use the format YYYY-MM-DDT00:00:00Z. Note that this field only applies to certain streams, and only data generated on or after the start date will be replicated. Or leave it empty if you want to replicate all data. For more information, refer to the &lt;a href="https://docs.airbyte.com/integrations/sources/jira/"&gt;documentation&lt;/a&gt;.
     */
    public SourceJira withStartDate(Optional<? extends OffsetDateTime> startDate) {
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
        SourceJira other = (SourceJira) o;
        return 
            java.util.Objects.deepEquals(this.apiToken, other.apiToken) &&
            java.util.Objects.deepEquals(this.domain, other.domain) &&
            java.util.Objects.deepEquals(this.email, other.email) &&
            java.util.Objects.deepEquals(this.enableExperimentalStreams, other.enableExperimentalStreams) &&
            java.util.Objects.deepEquals(this.lookbackWindowMinutes, other.lookbackWindowMinutes) &&
            java.util.Objects.deepEquals(this.projects, other.projects) &&
            java.util.Objects.deepEquals(this.sourceType, other.sourceType) &&
            java.util.Objects.deepEquals(this.startDate, other.startDate);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            apiToken,
            domain,
            email,
            enableExperimentalStreams,
            lookbackWindowMinutes,
            projects,
            sourceType,
            startDate);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceJira.class,
                "apiToken", apiToken,
                "domain", domain,
                "email", email,
                "enableExperimentalStreams", enableExperimentalStreams,
                "lookbackWindowMinutes", lookbackWindowMinutes,
                "projects", projects,
                "sourceType", sourceType,
                "startDate", startDate);
    }
    
    public final static class Builder {
 
        private String apiToken;
 
        private String domain;
 
        private String email;
 
        private Optional<? extends Boolean> enableExperimentalStreams;
 
        private Optional<? extends Long> lookbackWindowMinutes;
 
        private Optional<? extends java.util.List<String>> projects = Optional.empty();
 
        private Optional<? extends OffsetDateTime> startDate = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Jira API Token. See the &lt;a href="https://docs.airbyte.com/integrations/sources/jira"&gt;docs&lt;/a&gt; for more information on how to generate this key. API Token is used for Authorization to your account by BasicAuth.
         */
        public Builder apiToken(String apiToken) {
            Utils.checkNotNull(apiToken, "apiToken");
            this.apiToken = apiToken;
            return this;
        }

        /**
         * The Domain for your Jira account, e.g. airbyteio.atlassian.net, airbyteio.jira.com, jira.your-domain.com
         */
        public Builder domain(String domain) {
            Utils.checkNotNull(domain, "domain");
            this.domain = domain;
            return this;
        }

        /**
         * The user email for your Jira account which you used to generate the API token. This field is used for Authorization to your account by BasicAuth.
         */
        public Builder email(String email) {
            Utils.checkNotNull(email, "email");
            this.email = email;
            return this;
        }

        /**
         * Allow the use of experimental streams which rely on undocumented Jira API endpoints. See https://docs.airbyte.com/integrations/sources/jira#experimental-tables for more info.
         */
        public Builder enableExperimentalStreams(boolean enableExperimentalStreams) {
            Utils.checkNotNull(enableExperimentalStreams, "enableExperimentalStreams");
            this.enableExperimentalStreams = Optional.ofNullable(enableExperimentalStreams);
            return this;
        }

        /**
         * Allow the use of experimental streams which rely on undocumented Jira API endpoints. See https://docs.airbyte.com/integrations/sources/jira#experimental-tables for more info.
         */
        public Builder enableExperimentalStreams(Optional<? extends Boolean> enableExperimentalStreams) {
            Utils.checkNotNull(enableExperimentalStreams, "enableExperimentalStreams");
            this.enableExperimentalStreams = enableExperimentalStreams;
            return this;
        }

        /**
         * When set to N, the connector will always refresh resources created within the past N minutes. By default, updated objects that are not newly created are not incrementally synced.
         */
        public Builder lookbackWindowMinutes(long lookbackWindowMinutes) {
            Utils.checkNotNull(lookbackWindowMinutes, "lookbackWindowMinutes");
            this.lookbackWindowMinutes = Optional.ofNullable(lookbackWindowMinutes);
            return this;
        }

        /**
         * When set to N, the connector will always refresh resources created within the past N minutes. By default, updated objects that are not newly created are not incrementally synced.
         */
        public Builder lookbackWindowMinutes(Optional<? extends Long> lookbackWindowMinutes) {
            Utils.checkNotNull(lookbackWindowMinutes, "lookbackWindowMinutes");
            this.lookbackWindowMinutes = lookbackWindowMinutes;
            return this;
        }

        /**
         * List of Jira project keys to replicate data for, or leave it empty if you want to replicate data for all projects.
         */
        public Builder projects(java.util.List<String> projects) {
            Utils.checkNotNull(projects, "projects");
            this.projects = Optional.ofNullable(projects);
            return this;
        }

        /**
         * List of Jira project keys to replicate data for, or leave it empty if you want to replicate data for all projects.
         */
        public Builder projects(Optional<? extends java.util.List<String>> projects) {
            Utils.checkNotNull(projects, "projects");
            this.projects = projects;
            return this;
        }

        /**
         * The date from which you want to replicate data from Jira, use the format YYYY-MM-DDT00:00:00Z. Note that this field only applies to certain streams, and only data generated on or after the start date will be replicated. Or leave it empty if you want to replicate all data. For more information, refer to the &lt;a href="https://docs.airbyte.com/integrations/sources/jira/"&gt;documentation&lt;/a&gt;.
         */
        public Builder startDate(OffsetDateTime startDate) {
            Utils.checkNotNull(startDate, "startDate");
            this.startDate = Optional.ofNullable(startDate);
            return this;
        }

        /**
         * The date from which you want to replicate data from Jira, use the format YYYY-MM-DDT00:00:00Z. Note that this field only applies to certain streams, and only data generated on or after the start date will be replicated. Or leave it empty if you want to replicate all data. For more information, refer to the &lt;a href="https://docs.airbyte.com/integrations/sources/jira/"&gt;documentation&lt;/a&gt;.
         */
        public Builder startDate(Optional<? extends OffsetDateTime> startDate) {
            Utils.checkNotNull(startDate, "startDate");
            this.startDate = startDate;
            return this;
        }
        
        public SourceJira build() {
            if (enableExperimentalStreams == null) {
                enableExperimentalStreams = _SINGLETON_VALUE_EnableExperimentalStreams.value();
            }
            if (lookbackWindowMinutes == null) {
                lookbackWindowMinutes = _SINGLETON_VALUE_LookbackWindowMinutes.value();
            }
            return new SourceJira(
                apiToken,
                domain,
                email,
                enableExperimentalStreams,
                lookbackWindowMinutes,
                projects,
                startDate);
        }

        private static final LazySingletonValue<Optional<? extends Boolean>> _SINGLETON_VALUE_EnableExperimentalStreams =
                new LazySingletonValue<>(
                        "enable_experimental_streams",
                        "false",
                        new TypeReference<Optional<? extends Boolean>>() {});

        private static final LazySingletonValue<Optional<? extends Long>> _SINGLETON_VALUE_LookbackWindowMinutes =
                new LazySingletonValue<>(
                        "lookback_window_minutes",
                        "0",
                        new TypeReference<Optional<? extends Long>>() {});

        private static final LazySingletonValue<Jira> _SINGLETON_VALUE_SourceType =
                new LazySingletonValue<>(
                        "sourceType",
                        "\"jira\"",
                        new TypeReference<Jira>() {});
    }
}

