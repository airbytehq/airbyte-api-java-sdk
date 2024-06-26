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

public class SourceTrello {

    /**
     * IDs of the boards to replicate data from. If left empty, data from all boards to which you have access will be replicated. Please note that this is not the 8-character ID in the board's shortLink (URL of the board). Rather, what is required here is the 24-character ID usually returned by the API
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("board_ids")
    private Optional<? extends java.util.List<String>> boardIds;

    /**
     * Trello API key. See the &lt;a href="https://developer.atlassian.com/cloud/trello/guides/rest-api/authorization/#using-basic-oauth"&gt;docs&lt;/a&gt; for instructions on how to generate it.
     */
    @JsonProperty("key")
    private String key;

    @JsonProperty("sourceType")
    private Trello sourceType;

    /**
     * UTC date and time in the format 2017-01-25T00:00:00Z. Any data before this date will not be replicated.
     */
    @JsonProperty("start_date")
    private OffsetDateTime startDate;

    /**
     * Trello API token. See the &lt;a href="https://developer.atlassian.com/cloud/trello/guides/rest-api/authorization/#using-basic-oauth"&gt;docs&lt;/a&gt; for instructions on how to generate it.
     */
    @JsonProperty("token")
    private String token;

    @JsonCreator
    public SourceTrello(
            @JsonProperty("board_ids") Optional<? extends java.util.List<String>> boardIds,
            @JsonProperty("key") String key,
            @JsonProperty("start_date") OffsetDateTime startDate,
            @JsonProperty("token") String token) {
        Utils.checkNotNull(boardIds, "boardIds");
        Utils.checkNotNull(key, "key");
        Utils.checkNotNull(startDate, "startDate");
        Utils.checkNotNull(token, "token");
        this.boardIds = boardIds;
        this.key = key;
        this.sourceType = Builder._SINGLETON_VALUE_SourceType.value();
        this.startDate = startDate;
        this.token = token;
    }
    
    public SourceTrello(
            String key,
            OffsetDateTime startDate,
            String token) {
        this(Optional.empty(), key, startDate, token);
    }

    /**
     * IDs of the boards to replicate data from. If left empty, data from all boards to which you have access will be replicated. Please note that this is not the 8-character ID in the board's shortLink (URL of the board). Rather, what is required here is the 24-character ID usually returned by the API
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<java.util.List<String>> boardIds() {
        return (Optional<java.util.List<String>>) boardIds;
    }

    /**
     * Trello API key. See the &lt;a href="https://developer.atlassian.com/cloud/trello/guides/rest-api/authorization/#using-basic-oauth"&gt;docs&lt;/a&gt; for instructions on how to generate it.
     */
    @JsonIgnore
    public String key() {
        return key;
    }

    @JsonIgnore
    public Trello sourceType() {
        return sourceType;
    }

    /**
     * UTC date and time in the format 2017-01-25T00:00:00Z. Any data before this date will not be replicated.
     */
    @JsonIgnore
    public OffsetDateTime startDate() {
        return startDate;
    }

    /**
     * Trello API token. See the &lt;a href="https://developer.atlassian.com/cloud/trello/guides/rest-api/authorization/#using-basic-oauth"&gt;docs&lt;/a&gt; for instructions on how to generate it.
     */
    @JsonIgnore
    public String token() {
        return token;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * IDs of the boards to replicate data from. If left empty, data from all boards to which you have access will be replicated. Please note that this is not the 8-character ID in the board's shortLink (URL of the board). Rather, what is required here is the 24-character ID usually returned by the API
     */
    public SourceTrello withBoardIds(java.util.List<String> boardIds) {
        Utils.checkNotNull(boardIds, "boardIds");
        this.boardIds = Optional.ofNullable(boardIds);
        return this;
    }

    /**
     * IDs of the boards to replicate data from. If left empty, data from all boards to which you have access will be replicated. Please note that this is not the 8-character ID in the board's shortLink (URL of the board). Rather, what is required here is the 24-character ID usually returned by the API
     */
    public SourceTrello withBoardIds(Optional<? extends java.util.List<String>> boardIds) {
        Utils.checkNotNull(boardIds, "boardIds");
        this.boardIds = boardIds;
        return this;
    }

    /**
     * Trello API key. See the &lt;a href="https://developer.atlassian.com/cloud/trello/guides/rest-api/authorization/#using-basic-oauth"&gt;docs&lt;/a&gt; for instructions on how to generate it.
     */
    public SourceTrello withKey(String key) {
        Utils.checkNotNull(key, "key");
        this.key = key;
        return this;
    }

    /**
     * UTC date and time in the format 2017-01-25T00:00:00Z. Any data before this date will not be replicated.
     */
    public SourceTrello withStartDate(OffsetDateTime startDate) {
        Utils.checkNotNull(startDate, "startDate");
        this.startDate = startDate;
        return this;
    }

    /**
     * Trello API token. See the &lt;a href="https://developer.atlassian.com/cloud/trello/guides/rest-api/authorization/#using-basic-oauth"&gt;docs&lt;/a&gt; for instructions on how to generate it.
     */
    public SourceTrello withToken(String token) {
        Utils.checkNotNull(token, "token");
        this.token = token;
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
        SourceTrello other = (SourceTrello) o;
        return 
            java.util.Objects.deepEquals(this.boardIds, other.boardIds) &&
            java.util.Objects.deepEquals(this.key, other.key) &&
            java.util.Objects.deepEquals(this.sourceType, other.sourceType) &&
            java.util.Objects.deepEquals(this.startDate, other.startDate) &&
            java.util.Objects.deepEquals(this.token, other.token);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            boardIds,
            key,
            sourceType,
            startDate,
            token);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceTrello.class,
                "boardIds", boardIds,
                "key", key,
                "sourceType", sourceType,
                "startDate", startDate,
                "token", token);
    }
    
    public final static class Builder {
 
        private Optional<? extends java.util.List<String>> boardIds = Optional.empty();
 
        private String key;
 
        private OffsetDateTime startDate;
 
        private String token;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * IDs of the boards to replicate data from. If left empty, data from all boards to which you have access will be replicated. Please note that this is not the 8-character ID in the board's shortLink (URL of the board). Rather, what is required here is the 24-character ID usually returned by the API
         */
        public Builder boardIds(java.util.List<String> boardIds) {
            Utils.checkNotNull(boardIds, "boardIds");
            this.boardIds = Optional.ofNullable(boardIds);
            return this;
        }

        /**
         * IDs of the boards to replicate data from. If left empty, data from all boards to which you have access will be replicated. Please note that this is not the 8-character ID in the board's shortLink (URL of the board). Rather, what is required here is the 24-character ID usually returned by the API
         */
        public Builder boardIds(Optional<? extends java.util.List<String>> boardIds) {
            Utils.checkNotNull(boardIds, "boardIds");
            this.boardIds = boardIds;
            return this;
        }

        /**
         * Trello API key. See the &lt;a href="https://developer.atlassian.com/cloud/trello/guides/rest-api/authorization/#using-basic-oauth"&gt;docs&lt;/a&gt; for instructions on how to generate it.
         */
        public Builder key(String key) {
            Utils.checkNotNull(key, "key");
            this.key = key;
            return this;
        }

        /**
         * UTC date and time in the format 2017-01-25T00:00:00Z. Any data before this date will not be replicated.
         */
        public Builder startDate(OffsetDateTime startDate) {
            Utils.checkNotNull(startDate, "startDate");
            this.startDate = startDate;
            return this;
        }

        /**
         * Trello API token. See the &lt;a href="https://developer.atlassian.com/cloud/trello/guides/rest-api/authorization/#using-basic-oauth"&gt;docs&lt;/a&gt; for instructions on how to generate it.
         */
        public Builder token(String token) {
            Utils.checkNotNull(token, "token");
            this.token = token;
            return this;
        }
        
        public SourceTrello build() {
            return new SourceTrello(
                boardIds,
                key,
                startDate,
                token);
        }

        private static final LazySingletonValue<Trello> _SINGLETON_VALUE_SourceType =
                new LazySingletonValue<>(
                        "sourceType",
                        "\"trello\"",
                        new TypeReference<Trello>() {});
    }
}

