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
import java.lang.SuppressWarnings;
import java.time.OffsetDateTime;
import java.util.Objects;
import java.util.Optional;


public class SourceZendeskTalk {

    /**
     * Zendesk service provides two authentication methods. Choose between: `OAuth2.0` or `API token`.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("credentials")
    private Optional<? extends SourceZendeskTalkAuthentication> credentials;

    @JsonProperty("sourceType")
    private SourceZendeskTalkZendeskTalk sourceType;

    /**
     * The date from which you'd like to replicate data for Zendesk Talk API, in the format YYYY-MM-DDT00:00:00Z. All data generated after this date will be replicated.
     */
    @JsonProperty("start_date")
    private OffsetDateTime startDate;

    /**
     * This is your Zendesk subdomain that can be found in your account URL. For example, in https://{MY_SUBDOMAIN}.zendesk.com/, where MY_SUBDOMAIN is the value of your subdomain.
     */
    @JsonProperty("subdomain")
    private String subdomain;

    @JsonCreator
    public SourceZendeskTalk(
            @JsonProperty("credentials") Optional<? extends SourceZendeskTalkAuthentication> credentials,
            @JsonProperty("start_date") OffsetDateTime startDate,
            @JsonProperty("subdomain") String subdomain) {
        Utils.checkNotNull(credentials, "credentials");
        Utils.checkNotNull(startDate, "startDate");
        Utils.checkNotNull(subdomain, "subdomain");
        this.credentials = credentials;
        this.sourceType = Builder._SINGLETON_VALUE_SourceType.value();
        this.startDate = startDate;
        this.subdomain = subdomain;
    }
    
    public SourceZendeskTalk(
            OffsetDateTime startDate,
            String subdomain) {
        this(Optional.empty(), startDate, subdomain);
    }

    /**
     * Zendesk service provides two authentication methods. Choose between: `OAuth2.0` or `API token`.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<SourceZendeskTalkAuthentication> credentials() {
        return (Optional<SourceZendeskTalkAuthentication>) credentials;
    }

    @JsonIgnore
    public SourceZendeskTalkZendeskTalk sourceType() {
        return sourceType;
    }

    /**
     * The date from which you'd like to replicate data for Zendesk Talk API, in the format YYYY-MM-DDT00:00:00Z. All data generated after this date will be replicated.
     */
    @JsonIgnore
    public OffsetDateTime startDate() {
        return startDate;
    }

    /**
     * This is your Zendesk subdomain that can be found in your account URL. For example, in https://{MY_SUBDOMAIN}.zendesk.com/, where MY_SUBDOMAIN is the value of your subdomain.
     */
    @JsonIgnore
    public String subdomain() {
        return subdomain;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Zendesk service provides two authentication methods. Choose between: `OAuth2.0` or `API token`.
     */
    public SourceZendeskTalk withCredentials(SourceZendeskTalkAuthentication credentials) {
        Utils.checkNotNull(credentials, "credentials");
        this.credentials = Optional.ofNullable(credentials);
        return this;
    }

    /**
     * Zendesk service provides two authentication methods. Choose between: `OAuth2.0` or `API token`.
     */
    public SourceZendeskTalk withCredentials(Optional<? extends SourceZendeskTalkAuthentication> credentials) {
        Utils.checkNotNull(credentials, "credentials");
        this.credentials = credentials;
        return this;
    }

    /**
     * The date from which you'd like to replicate data for Zendesk Talk API, in the format YYYY-MM-DDT00:00:00Z. All data generated after this date will be replicated.
     */
    public SourceZendeskTalk withStartDate(OffsetDateTime startDate) {
        Utils.checkNotNull(startDate, "startDate");
        this.startDate = startDate;
        return this;
    }

    /**
     * This is your Zendesk subdomain that can be found in your account URL. For example, in https://{MY_SUBDOMAIN}.zendesk.com/, where MY_SUBDOMAIN is the value of your subdomain.
     */
    public SourceZendeskTalk withSubdomain(String subdomain) {
        Utils.checkNotNull(subdomain, "subdomain");
        this.subdomain = subdomain;
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
        SourceZendeskTalk other = (SourceZendeskTalk) o;
        return 
            Objects.deepEquals(this.credentials, other.credentials) &&
            Objects.deepEquals(this.sourceType, other.sourceType) &&
            Objects.deepEquals(this.startDate, other.startDate) &&
            Objects.deepEquals(this.subdomain, other.subdomain);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            credentials,
            sourceType,
            startDate,
            subdomain);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceZendeskTalk.class,
                "credentials", credentials,
                "sourceType", sourceType,
                "startDate", startDate,
                "subdomain", subdomain);
    }
    
    public final static class Builder {
 
        private Optional<? extends SourceZendeskTalkAuthentication> credentials = Optional.empty();
 
        private OffsetDateTime startDate;
 
        private String subdomain;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Zendesk service provides two authentication methods. Choose between: `OAuth2.0` or `API token`.
         */
        public Builder credentials(SourceZendeskTalkAuthentication credentials) {
            Utils.checkNotNull(credentials, "credentials");
            this.credentials = Optional.ofNullable(credentials);
            return this;
        }

        /**
         * Zendesk service provides two authentication methods. Choose between: `OAuth2.0` or `API token`.
         */
        public Builder credentials(Optional<? extends SourceZendeskTalkAuthentication> credentials) {
            Utils.checkNotNull(credentials, "credentials");
            this.credentials = credentials;
            return this;
        }

        /**
         * The date from which you'd like to replicate data for Zendesk Talk API, in the format YYYY-MM-DDT00:00:00Z. All data generated after this date will be replicated.
         */
        public Builder startDate(OffsetDateTime startDate) {
            Utils.checkNotNull(startDate, "startDate");
            this.startDate = startDate;
            return this;
        }

        /**
         * This is your Zendesk subdomain that can be found in your account URL. For example, in https://{MY_SUBDOMAIN}.zendesk.com/, where MY_SUBDOMAIN is the value of your subdomain.
         */
        public Builder subdomain(String subdomain) {
            Utils.checkNotNull(subdomain, "subdomain");
            this.subdomain = subdomain;
            return this;
        }
        
        public SourceZendeskTalk build() {
            return new SourceZendeskTalk(
                credentials,
                startDate,
                subdomain);
        }

        private static final LazySingletonValue<SourceZendeskTalkZendeskTalk> _SINGLETON_VALUE_SourceType =
                new LazySingletonValue<>(
                        "sourceType",
                        "\"zendesk-talk\"",
                        new TypeReference<SourceZendeskTalkZendeskTalk>() {});
    }
}

