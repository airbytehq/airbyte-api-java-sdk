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
import java.time.OffsetDateTime;
import java.util.Objects;
import java.util.Optional;

public class SourceMendeley {

    /**
     * Could be found at `https://dev.mendeley.com/myapps.html`
     */
    @JsonProperty("client_id")
    private String clientId;

    /**
     * Use cURL or Postman with the OAuth 2.0 Authorization tab. Set the Auth URL to https://api.mendeley.com/oauth/authorize, the Token URL to https://api.mendeley.com/oauth/token, and use all as the scope.
     */
    @JsonProperty("client_refresh_token")
    private String clientRefreshToken;

    /**
     * Could be found at `https://dev.mendeley.com/myapps.html`
     */
    @JsonProperty("client_secret")
    private String clientSecret;

    /**
     * The name parameter for institutions search
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name_for_institution")
    private Optional<String> nameForInstitution;

    /**
     * Query for catalog search
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("query_for_catalog")
    private Optional<String> queryForCatalog;

    @JsonProperty("sourceType")
    private Mendeley sourceType;

    @JsonProperty("start_date")
    private OffsetDateTime startDate;

    @JsonCreator
    public SourceMendeley(
            @JsonProperty("client_id") String clientId,
            @JsonProperty("client_refresh_token") String clientRefreshToken,
            @JsonProperty("client_secret") String clientSecret,
            @JsonProperty("name_for_institution") Optional<String> nameForInstitution,
            @JsonProperty("query_for_catalog") Optional<String> queryForCatalog,
            @JsonProperty("start_date") OffsetDateTime startDate) {
        Utils.checkNotNull(clientId, "clientId");
        Utils.checkNotNull(clientRefreshToken, "clientRefreshToken");
        Utils.checkNotNull(clientSecret, "clientSecret");
        Utils.checkNotNull(nameForInstitution, "nameForInstitution");
        Utils.checkNotNull(queryForCatalog, "queryForCatalog");
        Utils.checkNotNull(startDate, "startDate");
        this.clientId = clientId;
        this.clientRefreshToken = clientRefreshToken;
        this.clientSecret = clientSecret;
        this.nameForInstitution = nameForInstitution;
        this.queryForCatalog = queryForCatalog;
        this.sourceType = Builder._SINGLETON_VALUE_SourceType.value();
        this.startDate = startDate;
    }
    
    public SourceMendeley(
            String clientId,
            String clientRefreshToken,
            String clientSecret,
            OffsetDateTime startDate) {
        this(clientId, clientRefreshToken, clientSecret, Optional.empty(), Optional.empty(), startDate);
    }

    /**
     * Could be found at `https://dev.mendeley.com/myapps.html`
     */
    @JsonIgnore
    public String clientId() {
        return clientId;
    }

    /**
     * Use cURL or Postman with the OAuth 2.0 Authorization tab. Set the Auth URL to https://api.mendeley.com/oauth/authorize, the Token URL to https://api.mendeley.com/oauth/token, and use all as the scope.
     */
    @JsonIgnore
    public String clientRefreshToken() {
        return clientRefreshToken;
    }

    /**
     * Could be found at `https://dev.mendeley.com/myapps.html`
     */
    @JsonIgnore
    public String clientSecret() {
        return clientSecret;
    }

    /**
     * The name parameter for institutions search
     */
    @JsonIgnore
    public Optional<String> nameForInstitution() {
        return nameForInstitution;
    }

    /**
     * Query for catalog search
     */
    @JsonIgnore
    public Optional<String> queryForCatalog() {
        return queryForCatalog;
    }

    @JsonIgnore
    public Mendeley sourceType() {
        return sourceType;
    }

    @JsonIgnore
    public OffsetDateTime startDate() {
        return startDate;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    /**
     * Could be found at `https://dev.mendeley.com/myapps.html`
     */
    public SourceMendeley withClientId(String clientId) {
        Utils.checkNotNull(clientId, "clientId");
        this.clientId = clientId;
        return this;
    }

    /**
     * Use cURL or Postman with the OAuth 2.0 Authorization tab. Set the Auth URL to https://api.mendeley.com/oauth/authorize, the Token URL to https://api.mendeley.com/oauth/token, and use all as the scope.
     */
    public SourceMendeley withClientRefreshToken(String clientRefreshToken) {
        Utils.checkNotNull(clientRefreshToken, "clientRefreshToken");
        this.clientRefreshToken = clientRefreshToken;
        return this;
    }

    /**
     * Could be found at `https://dev.mendeley.com/myapps.html`
     */
    public SourceMendeley withClientSecret(String clientSecret) {
        Utils.checkNotNull(clientSecret, "clientSecret");
        this.clientSecret = clientSecret;
        return this;
    }

    /**
     * The name parameter for institutions search
     */
    public SourceMendeley withNameForInstitution(String nameForInstitution) {
        Utils.checkNotNull(nameForInstitution, "nameForInstitution");
        this.nameForInstitution = Optional.ofNullable(nameForInstitution);
        return this;
    }

    /**
     * The name parameter for institutions search
     */
    public SourceMendeley withNameForInstitution(Optional<String> nameForInstitution) {
        Utils.checkNotNull(nameForInstitution, "nameForInstitution");
        this.nameForInstitution = nameForInstitution;
        return this;
    }

    /**
     * Query for catalog search
     */
    public SourceMendeley withQueryForCatalog(String queryForCatalog) {
        Utils.checkNotNull(queryForCatalog, "queryForCatalog");
        this.queryForCatalog = Optional.ofNullable(queryForCatalog);
        return this;
    }

    /**
     * Query for catalog search
     */
    public SourceMendeley withQueryForCatalog(Optional<String> queryForCatalog) {
        Utils.checkNotNull(queryForCatalog, "queryForCatalog");
        this.queryForCatalog = queryForCatalog;
        return this;
    }

    public SourceMendeley withStartDate(OffsetDateTime startDate) {
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
        SourceMendeley other = (SourceMendeley) o;
        return 
            Objects.deepEquals(this.clientId, other.clientId) &&
            Objects.deepEquals(this.clientRefreshToken, other.clientRefreshToken) &&
            Objects.deepEquals(this.clientSecret, other.clientSecret) &&
            Objects.deepEquals(this.nameForInstitution, other.nameForInstitution) &&
            Objects.deepEquals(this.queryForCatalog, other.queryForCatalog) &&
            Objects.deepEquals(this.sourceType, other.sourceType) &&
            Objects.deepEquals(this.startDate, other.startDate);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            clientId,
            clientRefreshToken,
            clientSecret,
            nameForInstitution,
            queryForCatalog,
            sourceType,
            startDate);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceMendeley.class,
                "clientId", clientId,
                "clientRefreshToken", clientRefreshToken,
                "clientSecret", clientSecret,
                "nameForInstitution", nameForInstitution,
                "queryForCatalog", queryForCatalog,
                "sourceType", sourceType,
                "startDate", startDate);
    }
    
    public final static class Builder {
 
        private String clientId;
 
        private String clientRefreshToken;
 
        private String clientSecret;
 
        private Optional<String> nameForInstitution;
 
        private Optional<String> queryForCatalog;
 
        private OffsetDateTime startDate;
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Could be found at `https://dev.mendeley.com/myapps.html`
         */
        public Builder clientId(String clientId) {
            Utils.checkNotNull(clientId, "clientId");
            this.clientId = clientId;
            return this;
        }

        /**
         * Use cURL or Postman with the OAuth 2.0 Authorization tab. Set the Auth URL to https://api.mendeley.com/oauth/authorize, the Token URL to https://api.mendeley.com/oauth/token, and use all as the scope.
         */
        public Builder clientRefreshToken(String clientRefreshToken) {
            Utils.checkNotNull(clientRefreshToken, "clientRefreshToken");
            this.clientRefreshToken = clientRefreshToken;
            return this;
        }

        /**
         * Could be found at `https://dev.mendeley.com/myapps.html`
         */
        public Builder clientSecret(String clientSecret) {
            Utils.checkNotNull(clientSecret, "clientSecret");
            this.clientSecret = clientSecret;
            return this;
        }

        /**
         * The name parameter for institutions search
         */
        public Builder nameForInstitution(String nameForInstitution) {
            Utils.checkNotNull(nameForInstitution, "nameForInstitution");
            this.nameForInstitution = Optional.ofNullable(nameForInstitution);
            return this;
        }

        /**
         * The name parameter for institutions search
         */
        public Builder nameForInstitution(Optional<String> nameForInstitution) {
            Utils.checkNotNull(nameForInstitution, "nameForInstitution");
            this.nameForInstitution = nameForInstitution;
            return this;
        }

        /**
         * Query for catalog search
         */
        public Builder queryForCatalog(String queryForCatalog) {
            Utils.checkNotNull(queryForCatalog, "queryForCatalog");
            this.queryForCatalog = Optional.ofNullable(queryForCatalog);
            return this;
        }

        /**
         * Query for catalog search
         */
        public Builder queryForCatalog(Optional<String> queryForCatalog) {
            Utils.checkNotNull(queryForCatalog, "queryForCatalog");
            this.queryForCatalog = queryForCatalog;
            return this;
        }

        public Builder startDate(OffsetDateTime startDate) {
            Utils.checkNotNull(startDate, "startDate");
            this.startDate = startDate;
            return this;
        }
        
        public SourceMendeley build() {
            if (nameForInstitution == null) {
                nameForInstitution = _SINGLETON_VALUE_NameForInstitution.value();
            }
            if (queryForCatalog == null) {
                queryForCatalog = _SINGLETON_VALUE_QueryForCatalog.value();
            }
            return new SourceMendeley(
                clientId,
                clientRefreshToken,
                clientSecret,
                nameForInstitution,
                queryForCatalog,
                startDate);
        }

        private static final LazySingletonValue<Optional<String>> _SINGLETON_VALUE_NameForInstitution =
                new LazySingletonValue<>(
                        "name_for_institution",
                        "\"City University\"",
                        new TypeReference<Optional<String>>() {});

        private static final LazySingletonValue<Optional<String>> _SINGLETON_VALUE_QueryForCatalog =
                new LazySingletonValue<>(
                        "query_for_catalog",
                        "\"Polar Bear\"",
                        new TypeReference<Optional<String>>() {});

        private static final LazySingletonValue<Mendeley> _SINGLETON_VALUE_SourceType =
                new LazySingletonValue<>(
                        "sourceType",
                        "\"mendeley\"",
                        new TypeReference<Mendeley>() {});
    }
}
