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


public class SourceMux {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("password")
    private Optional<String> password;

    /**
     * The playback id for your video asset shown in website details
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("playback_id")
    private Optional<String> playbackId;

    @JsonProperty("sourceType")
    private Mux sourceType;

    @JsonProperty("start_date")
    private OffsetDateTime startDate;

    @JsonProperty("username")
    private String username;

    @JsonCreator
    public SourceMux(
            @JsonProperty("password") Optional<String> password,
            @JsonProperty("playback_id") Optional<String> playbackId,
            @JsonProperty("start_date") OffsetDateTime startDate,
            @JsonProperty("username") String username) {
        Utils.checkNotNull(password, "password");
        Utils.checkNotNull(playbackId, "playbackId");
        Utils.checkNotNull(startDate, "startDate");
        Utils.checkNotNull(username, "username");
        this.password = password;
        this.playbackId = playbackId;
        this.sourceType = Builder._SINGLETON_VALUE_SourceType.value();
        this.startDate = startDate;
        this.username = username;
    }
    
    public SourceMux(
            OffsetDateTime startDate,
            String username) {
        this(Optional.empty(), Optional.empty(), startDate, username);
    }

    @JsonIgnore
    public Optional<String> password() {
        return password;
    }

    /**
     * The playback id for your video asset shown in website details
     */
    @JsonIgnore
    public Optional<String> playbackId() {
        return playbackId;
    }

    @JsonIgnore
    public Mux sourceType() {
        return sourceType;
    }

    @JsonIgnore
    public OffsetDateTime startDate() {
        return startDate;
    }

    @JsonIgnore
    public String username() {
        return username;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public SourceMux withPassword(String password) {
        Utils.checkNotNull(password, "password");
        this.password = Optional.ofNullable(password);
        return this;
    }

    public SourceMux withPassword(Optional<String> password) {
        Utils.checkNotNull(password, "password");
        this.password = password;
        return this;
    }

    /**
     * The playback id for your video asset shown in website details
     */
    public SourceMux withPlaybackId(String playbackId) {
        Utils.checkNotNull(playbackId, "playbackId");
        this.playbackId = Optional.ofNullable(playbackId);
        return this;
    }

    /**
     * The playback id for your video asset shown in website details
     */
    public SourceMux withPlaybackId(Optional<String> playbackId) {
        Utils.checkNotNull(playbackId, "playbackId");
        this.playbackId = playbackId;
        return this;
    }

    public SourceMux withStartDate(OffsetDateTime startDate) {
        Utils.checkNotNull(startDate, "startDate");
        this.startDate = startDate;
        return this;
    }

    public SourceMux withUsername(String username) {
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
        SourceMux other = (SourceMux) o;
        return 
            Objects.deepEquals(this.password, other.password) &&
            Objects.deepEquals(this.playbackId, other.playbackId) &&
            Objects.deepEquals(this.sourceType, other.sourceType) &&
            Objects.deepEquals(this.startDate, other.startDate) &&
            Objects.deepEquals(this.username, other.username);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            password,
            playbackId,
            sourceType,
            startDate,
            username);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceMux.class,
                "password", password,
                "playbackId", playbackId,
                "sourceType", sourceType,
                "startDate", startDate,
                "username", username);
    }
    
    public final static class Builder {
 
        private Optional<String> password = Optional.empty();
 
        private Optional<String> playbackId = Optional.empty();
 
        private OffsetDateTime startDate;
 
        private String username;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder password(String password) {
            Utils.checkNotNull(password, "password");
            this.password = Optional.ofNullable(password);
            return this;
        }

        public Builder password(Optional<String> password) {
            Utils.checkNotNull(password, "password");
            this.password = password;
            return this;
        }

        /**
         * The playback id for your video asset shown in website details
         */
        public Builder playbackId(String playbackId) {
            Utils.checkNotNull(playbackId, "playbackId");
            this.playbackId = Optional.ofNullable(playbackId);
            return this;
        }

        /**
         * The playback id for your video asset shown in website details
         */
        public Builder playbackId(Optional<String> playbackId) {
            Utils.checkNotNull(playbackId, "playbackId");
            this.playbackId = playbackId;
            return this;
        }

        public Builder startDate(OffsetDateTime startDate) {
            Utils.checkNotNull(startDate, "startDate");
            this.startDate = startDate;
            return this;
        }

        public Builder username(String username) {
            Utils.checkNotNull(username, "username");
            this.username = username;
            return this;
        }
        
        public SourceMux build() {
            return new SourceMux(
                password,
                playbackId,
                startDate,
                username);
        }

        private static final LazySingletonValue<Mux> _SINGLETON_VALUE_SourceType =
                new LazySingletonValue<>(
                        "sourceType",
                        "\"mux\"",
                        new TypeReference<Mux>() {});
    }
}
