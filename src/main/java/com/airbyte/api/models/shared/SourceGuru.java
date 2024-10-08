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

public class SourceGuru {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("password")
    private Optional<? extends String> password;

    /**
     * Query for searching cards
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("search_cards_query")
    private Optional<? extends String> searchCardsQuery;

    @JsonProperty("sourceType")
    private Guru sourceType;

    @JsonProperty("start_date")
    private OffsetDateTime startDate;

    /**
     * Team ID received through response of /teams streams, make sure about access to the team
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("team_id")
    private Optional<? extends String> teamId;

    @JsonProperty("username")
    private String username;

    @JsonCreator
    public SourceGuru(
            @JsonProperty("password") Optional<? extends String> password,
            @JsonProperty("search_cards_query") Optional<? extends String> searchCardsQuery,
            @JsonProperty("start_date") OffsetDateTime startDate,
            @JsonProperty("team_id") Optional<? extends String> teamId,
            @JsonProperty("username") String username) {
        Utils.checkNotNull(password, "password");
        Utils.checkNotNull(searchCardsQuery, "searchCardsQuery");
        Utils.checkNotNull(startDate, "startDate");
        Utils.checkNotNull(teamId, "teamId");
        Utils.checkNotNull(username, "username");
        this.password = password;
        this.searchCardsQuery = searchCardsQuery;
        this.sourceType = Builder._SINGLETON_VALUE_SourceType.value();
        this.startDate = startDate;
        this.teamId = teamId;
        this.username = username;
    }
    
    public SourceGuru(
            OffsetDateTime startDate,
            String username) {
        this(Optional.empty(), Optional.empty(), startDate, Optional.empty(), username);
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> password() {
        return (Optional<String>) password;
    }

    /**
     * Query for searching cards
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> searchCardsQuery() {
        return (Optional<String>) searchCardsQuery;
    }

    @JsonIgnore
    public Guru sourceType() {
        return sourceType;
    }

    @JsonIgnore
    public OffsetDateTime startDate() {
        return startDate;
    }

    /**
     * Team ID received through response of /teams streams, make sure about access to the team
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> teamId() {
        return (Optional<String>) teamId;
    }

    @JsonIgnore
    public String username() {
        return username;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public SourceGuru withPassword(String password) {
        Utils.checkNotNull(password, "password");
        this.password = Optional.ofNullable(password);
        return this;
    }

    public SourceGuru withPassword(Optional<? extends String> password) {
        Utils.checkNotNull(password, "password");
        this.password = password;
        return this;
    }

    /**
     * Query for searching cards
     */
    public SourceGuru withSearchCardsQuery(String searchCardsQuery) {
        Utils.checkNotNull(searchCardsQuery, "searchCardsQuery");
        this.searchCardsQuery = Optional.ofNullable(searchCardsQuery);
        return this;
    }

    /**
     * Query for searching cards
     */
    public SourceGuru withSearchCardsQuery(Optional<? extends String> searchCardsQuery) {
        Utils.checkNotNull(searchCardsQuery, "searchCardsQuery");
        this.searchCardsQuery = searchCardsQuery;
        return this;
    }

    public SourceGuru withStartDate(OffsetDateTime startDate) {
        Utils.checkNotNull(startDate, "startDate");
        this.startDate = startDate;
        return this;
    }

    /**
     * Team ID received through response of /teams streams, make sure about access to the team
     */
    public SourceGuru withTeamId(String teamId) {
        Utils.checkNotNull(teamId, "teamId");
        this.teamId = Optional.ofNullable(teamId);
        return this;
    }

    /**
     * Team ID received through response of /teams streams, make sure about access to the team
     */
    public SourceGuru withTeamId(Optional<? extends String> teamId) {
        Utils.checkNotNull(teamId, "teamId");
        this.teamId = teamId;
        return this;
    }

    public SourceGuru withUsername(String username) {
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
        SourceGuru other = (SourceGuru) o;
        return 
            java.util.Objects.deepEquals(this.password, other.password) &&
            java.util.Objects.deepEquals(this.searchCardsQuery, other.searchCardsQuery) &&
            java.util.Objects.deepEquals(this.sourceType, other.sourceType) &&
            java.util.Objects.deepEquals(this.startDate, other.startDate) &&
            java.util.Objects.deepEquals(this.teamId, other.teamId) &&
            java.util.Objects.deepEquals(this.username, other.username);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            password,
            searchCardsQuery,
            sourceType,
            startDate,
            teamId,
            username);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceGuru.class,
                "password", password,
                "searchCardsQuery", searchCardsQuery,
                "sourceType", sourceType,
                "startDate", startDate,
                "teamId", teamId,
                "username", username);
    }
    
    public final static class Builder {
 
        private Optional<? extends String> password = Optional.empty();
 
        private Optional<? extends String> searchCardsQuery = Optional.empty();
 
        private OffsetDateTime startDate;
 
        private Optional<? extends String> teamId = Optional.empty();
 
        private String username;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder password(String password) {
            Utils.checkNotNull(password, "password");
            this.password = Optional.ofNullable(password);
            return this;
        }

        public Builder password(Optional<? extends String> password) {
            Utils.checkNotNull(password, "password");
            this.password = password;
            return this;
        }

        /**
         * Query for searching cards
         */
        public Builder searchCardsQuery(String searchCardsQuery) {
            Utils.checkNotNull(searchCardsQuery, "searchCardsQuery");
            this.searchCardsQuery = Optional.ofNullable(searchCardsQuery);
            return this;
        }

        /**
         * Query for searching cards
         */
        public Builder searchCardsQuery(Optional<? extends String> searchCardsQuery) {
            Utils.checkNotNull(searchCardsQuery, "searchCardsQuery");
            this.searchCardsQuery = searchCardsQuery;
            return this;
        }

        public Builder startDate(OffsetDateTime startDate) {
            Utils.checkNotNull(startDate, "startDate");
            this.startDate = startDate;
            return this;
        }

        /**
         * Team ID received through response of /teams streams, make sure about access to the team
         */
        public Builder teamId(String teamId) {
            Utils.checkNotNull(teamId, "teamId");
            this.teamId = Optional.ofNullable(teamId);
            return this;
        }

        /**
         * Team ID received through response of /teams streams, make sure about access to the team
         */
        public Builder teamId(Optional<? extends String> teamId) {
            Utils.checkNotNull(teamId, "teamId");
            this.teamId = teamId;
            return this;
        }

        public Builder username(String username) {
            Utils.checkNotNull(username, "username");
            this.username = username;
            return this;
        }
        
        public SourceGuru build() {
            return new SourceGuru(
                password,
                searchCardsQuery,
                startDate,
                teamId,
                username);
        }

        private static final LazySingletonValue<Guru> _SINGLETON_VALUE_SourceType =
                new LazySingletonValue<>(
                        "sourceType",
                        "\"guru\"",
                        new TypeReference<Guru>() {});
    }
}

