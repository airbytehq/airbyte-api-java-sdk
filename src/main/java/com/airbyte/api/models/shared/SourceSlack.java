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

public class SourceSlack {

    /**
     * A channel name list (without leading '#' char) which limit the channels from which you'd like to sync. Empty list means no filter.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("channel_filter")
    private Optional<? extends java.util.List<String>> channelFilter;

    /**
     * Choose how to authenticate into Slack
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("credentials")
    private Optional<? extends SourceSlackAuthenticationMechanism> credentials;

    /**
     * Whether to read information from private channels that the bot is already in.  If false, only public channels will be read.  If true, the bot must be manually added to private channels. 
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("include_private_channels")
    private Optional<? extends Boolean> includePrivateChannels;

    /**
     * Whether to join all channels or to sync data only from channels the bot is already in.  If false, you'll need to manually add the bot to all the channels from which you'd like to sync messages. 
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("join_channels")
    private Optional<? extends Boolean> joinChannels;

    /**
     * How far into the past to look for messages in threads, default is 0 days
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("lookback_window")
    private Optional<? extends Long> lookbackWindow;

    @JsonProperty("sourceType")
    private SourceSlackSlack sourceType;

    /**
     * UTC date and time in the format 2017-01-25T00:00:00Z. Any data before this date will not be replicated.
     */
    @JsonProperty("start_date")
    private OffsetDateTime startDate;

    @JsonCreator
    public SourceSlack(
            @JsonProperty("channel_filter") Optional<? extends java.util.List<String>> channelFilter,
            @JsonProperty("credentials") Optional<? extends SourceSlackAuthenticationMechanism> credentials,
            @JsonProperty("include_private_channels") Optional<? extends Boolean> includePrivateChannels,
            @JsonProperty("join_channels") Optional<? extends Boolean> joinChannels,
            @JsonProperty("lookback_window") Optional<? extends Long> lookbackWindow,
            @JsonProperty("start_date") OffsetDateTime startDate) {
        Utils.checkNotNull(channelFilter, "channelFilter");
        Utils.checkNotNull(credentials, "credentials");
        Utils.checkNotNull(includePrivateChannels, "includePrivateChannels");
        Utils.checkNotNull(joinChannels, "joinChannels");
        Utils.checkNotNull(lookbackWindow, "lookbackWindow");
        Utils.checkNotNull(startDate, "startDate");
        this.channelFilter = channelFilter;
        this.credentials = credentials;
        this.includePrivateChannels = includePrivateChannels;
        this.joinChannels = joinChannels;
        this.lookbackWindow = lookbackWindow;
        this.sourceType = Builder._SINGLETON_VALUE_SourceType.value();
        this.startDate = startDate;
    }
    
    public SourceSlack(
            OffsetDateTime startDate) {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), startDate);
    }

    /**
     * A channel name list (without leading '#' char) which limit the channels from which you'd like to sync. Empty list means no filter.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<java.util.List<String>> channelFilter() {
        return (Optional<java.util.List<String>>) channelFilter;
    }

    /**
     * Choose how to authenticate into Slack
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<SourceSlackAuthenticationMechanism> credentials() {
        return (Optional<SourceSlackAuthenticationMechanism>) credentials;
    }

    /**
     * Whether to read information from private channels that the bot is already in.  If false, only public channels will be read.  If true, the bot must be manually added to private channels. 
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Boolean> includePrivateChannels() {
        return (Optional<Boolean>) includePrivateChannels;
    }

    /**
     * Whether to join all channels or to sync data only from channels the bot is already in.  If false, you'll need to manually add the bot to all the channels from which you'd like to sync messages. 
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Boolean> joinChannels() {
        return (Optional<Boolean>) joinChannels;
    }

    /**
     * How far into the past to look for messages in threads, default is 0 days
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Long> lookbackWindow() {
        return (Optional<Long>) lookbackWindow;
    }

    @JsonIgnore
    public SourceSlackSlack sourceType() {
        return sourceType;
    }

    /**
     * UTC date and time in the format 2017-01-25T00:00:00Z. Any data before this date will not be replicated.
     */
    @JsonIgnore
    public OffsetDateTime startDate() {
        return startDate;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * A channel name list (without leading '#' char) which limit the channels from which you'd like to sync. Empty list means no filter.
     */
    public SourceSlack withChannelFilter(java.util.List<String> channelFilter) {
        Utils.checkNotNull(channelFilter, "channelFilter");
        this.channelFilter = Optional.ofNullable(channelFilter);
        return this;
    }

    /**
     * A channel name list (without leading '#' char) which limit the channels from which you'd like to sync. Empty list means no filter.
     */
    public SourceSlack withChannelFilter(Optional<? extends java.util.List<String>> channelFilter) {
        Utils.checkNotNull(channelFilter, "channelFilter");
        this.channelFilter = channelFilter;
        return this;
    }

    /**
     * Choose how to authenticate into Slack
     */
    public SourceSlack withCredentials(SourceSlackAuthenticationMechanism credentials) {
        Utils.checkNotNull(credentials, "credentials");
        this.credentials = Optional.ofNullable(credentials);
        return this;
    }

    /**
     * Choose how to authenticate into Slack
     */
    public SourceSlack withCredentials(Optional<? extends SourceSlackAuthenticationMechanism> credentials) {
        Utils.checkNotNull(credentials, "credentials");
        this.credentials = credentials;
        return this;
    }

    /**
     * Whether to read information from private channels that the bot is already in.  If false, only public channels will be read.  If true, the bot must be manually added to private channels. 
     */
    public SourceSlack withIncludePrivateChannels(boolean includePrivateChannels) {
        Utils.checkNotNull(includePrivateChannels, "includePrivateChannels");
        this.includePrivateChannels = Optional.ofNullable(includePrivateChannels);
        return this;
    }

    /**
     * Whether to read information from private channels that the bot is already in.  If false, only public channels will be read.  If true, the bot must be manually added to private channels. 
     */
    public SourceSlack withIncludePrivateChannels(Optional<? extends Boolean> includePrivateChannels) {
        Utils.checkNotNull(includePrivateChannels, "includePrivateChannels");
        this.includePrivateChannels = includePrivateChannels;
        return this;
    }

    /**
     * Whether to join all channels or to sync data only from channels the bot is already in.  If false, you'll need to manually add the bot to all the channels from which you'd like to sync messages. 
     */
    public SourceSlack withJoinChannels(boolean joinChannels) {
        Utils.checkNotNull(joinChannels, "joinChannels");
        this.joinChannels = Optional.ofNullable(joinChannels);
        return this;
    }

    /**
     * Whether to join all channels or to sync data only from channels the bot is already in.  If false, you'll need to manually add the bot to all the channels from which you'd like to sync messages. 
     */
    public SourceSlack withJoinChannels(Optional<? extends Boolean> joinChannels) {
        Utils.checkNotNull(joinChannels, "joinChannels");
        this.joinChannels = joinChannels;
        return this;
    }

    /**
     * How far into the past to look for messages in threads, default is 0 days
     */
    public SourceSlack withLookbackWindow(long lookbackWindow) {
        Utils.checkNotNull(lookbackWindow, "lookbackWindow");
        this.lookbackWindow = Optional.ofNullable(lookbackWindow);
        return this;
    }

    /**
     * How far into the past to look for messages in threads, default is 0 days
     */
    public SourceSlack withLookbackWindow(Optional<? extends Long> lookbackWindow) {
        Utils.checkNotNull(lookbackWindow, "lookbackWindow");
        this.lookbackWindow = lookbackWindow;
        return this;
    }

    /**
     * UTC date and time in the format 2017-01-25T00:00:00Z. Any data before this date will not be replicated.
     */
    public SourceSlack withStartDate(OffsetDateTime startDate) {
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
        SourceSlack other = (SourceSlack) o;
        return 
            java.util.Objects.deepEquals(this.channelFilter, other.channelFilter) &&
            java.util.Objects.deepEquals(this.credentials, other.credentials) &&
            java.util.Objects.deepEquals(this.includePrivateChannels, other.includePrivateChannels) &&
            java.util.Objects.deepEquals(this.joinChannels, other.joinChannels) &&
            java.util.Objects.deepEquals(this.lookbackWindow, other.lookbackWindow) &&
            java.util.Objects.deepEquals(this.sourceType, other.sourceType) &&
            java.util.Objects.deepEquals(this.startDate, other.startDate);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            channelFilter,
            credentials,
            includePrivateChannels,
            joinChannels,
            lookbackWindow,
            sourceType,
            startDate);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceSlack.class,
                "channelFilter", channelFilter,
                "credentials", credentials,
                "includePrivateChannels", includePrivateChannels,
                "joinChannels", joinChannels,
                "lookbackWindow", lookbackWindow,
                "sourceType", sourceType,
                "startDate", startDate);
    }
    
    public final static class Builder {
 
        private Optional<? extends java.util.List<String>> channelFilter = Optional.empty();
 
        private Optional<? extends SourceSlackAuthenticationMechanism> credentials = Optional.empty();
 
        private Optional<? extends Boolean> includePrivateChannels;
 
        private Optional<? extends Boolean> joinChannels;
 
        private Optional<? extends Long> lookbackWindow;
 
        private OffsetDateTime startDate;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * A channel name list (without leading '#' char) which limit the channels from which you'd like to sync. Empty list means no filter.
         */
        public Builder channelFilter(java.util.List<String> channelFilter) {
            Utils.checkNotNull(channelFilter, "channelFilter");
            this.channelFilter = Optional.ofNullable(channelFilter);
            return this;
        }

        /**
         * A channel name list (without leading '#' char) which limit the channels from which you'd like to sync. Empty list means no filter.
         */
        public Builder channelFilter(Optional<? extends java.util.List<String>> channelFilter) {
            Utils.checkNotNull(channelFilter, "channelFilter");
            this.channelFilter = channelFilter;
            return this;
        }

        /**
         * Choose how to authenticate into Slack
         */
        public Builder credentials(SourceSlackAuthenticationMechanism credentials) {
            Utils.checkNotNull(credentials, "credentials");
            this.credentials = Optional.ofNullable(credentials);
            return this;
        }

        /**
         * Choose how to authenticate into Slack
         */
        public Builder credentials(Optional<? extends SourceSlackAuthenticationMechanism> credentials) {
            Utils.checkNotNull(credentials, "credentials");
            this.credentials = credentials;
            return this;
        }

        /**
         * Whether to read information from private channels that the bot is already in.  If false, only public channels will be read.  If true, the bot must be manually added to private channels. 
         */
        public Builder includePrivateChannels(boolean includePrivateChannels) {
            Utils.checkNotNull(includePrivateChannels, "includePrivateChannels");
            this.includePrivateChannels = Optional.ofNullable(includePrivateChannels);
            return this;
        }

        /**
         * Whether to read information from private channels that the bot is already in.  If false, only public channels will be read.  If true, the bot must be manually added to private channels. 
         */
        public Builder includePrivateChannels(Optional<? extends Boolean> includePrivateChannels) {
            Utils.checkNotNull(includePrivateChannels, "includePrivateChannels");
            this.includePrivateChannels = includePrivateChannels;
            return this;
        }

        /**
         * Whether to join all channels or to sync data only from channels the bot is already in.  If false, you'll need to manually add the bot to all the channels from which you'd like to sync messages. 
         */
        public Builder joinChannels(boolean joinChannels) {
            Utils.checkNotNull(joinChannels, "joinChannels");
            this.joinChannels = Optional.ofNullable(joinChannels);
            return this;
        }

        /**
         * Whether to join all channels or to sync data only from channels the bot is already in.  If false, you'll need to manually add the bot to all the channels from which you'd like to sync messages. 
         */
        public Builder joinChannels(Optional<? extends Boolean> joinChannels) {
            Utils.checkNotNull(joinChannels, "joinChannels");
            this.joinChannels = joinChannels;
            return this;
        }

        /**
         * How far into the past to look for messages in threads, default is 0 days
         */
        public Builder lookbackWindow(long lookbackWindow) {
            Utils.checkNotNull(lookbackWindow, "lookbackWindow");
            this.lookbackWindow = Optional.ofNullable(lookbackWindow);
            return this;
        }

        /**
         * How far into the past to look for messages in threads, default is 0 days
         */
        public Builder lookbackWindow(Optional<? extends Long> lookbackWindow) {
            Utils.checkNotNull(lookbackWindow, "lookbackWindow");
            this.lookbackWindow = lookbackWindow;
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
        
        public SourceSlack build() {
            if (includePrivateChannels == null) {
                includePrivateChannels = _SINGLETON_VALUE_IncludePrivateChannels.value();
            }
            if (joinChannels == null) {
                joinChannels = _SINGLETON_VALUE_JoinChannels.value();
            }
            if (lookbackWindow == null) {
                lookbackWindow = _SINGLETON_VALUE_LookbackWindow.value();
            }
            return new SourceSlack(
                channelFilter,
                credentials,
                includePrivateChannels,
                joinChannels,
                lookbackWindow,
                startDate);
        }

        private static final LazySingletonValue<Optional<? extends Boolean>> _SINGLETON_VALUE_IncludePrivateChannels =
                new LazySingletonValue<>(
                        "include_private_channels",
                        "false",
                        new TypeReference<Optional<? extends Boolean>>() {});

        private static final LazySingletonValue<Optional<? extends Boolean>> _SINGLETON_VALUE_JoinChannels =
                new LazySingletonValue<>(
                        "join_channels",
                        "true",
                        new TypeReference<Optional<? extends Boolean>>() {});

        private static final LazySingletonValue<Optional<? extends Long>> _SINGLETON_VALUE_LookbackWindow =
                new LazySingletonValue<>(
                        "lookback_window",
                        "0",
                        new TypeReference<Optional<? extends Long>>() {});

        private static final LazySingletonValue<SourceSlackSlack> _SINGLETON_VALUE_SourceType =
                new LazySingletonValue<>(
                        "sourceType",
                        "\"slack\"",
                        new TypeReference<SourceSlackSlack>() {});
    }
}

