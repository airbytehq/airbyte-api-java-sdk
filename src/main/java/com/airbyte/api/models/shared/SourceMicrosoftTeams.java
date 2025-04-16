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
import java.util.Objects;
import java.util.Optional;

public class SourceMicrosoftTeams {

    /**
     * Choose how to authenticate to Microsoft
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("credentials")
    private Optional<? extends SourceMicrosoftTeamsAuthenticationMechanism> credentials;

    /**
     * Specifies the length of time over which the Team Device Report stream is aggregated. The supported values are: D7, D30, D90, and D180.
     */
    @JsonProperty("period")
    private String period;

    @JsonProperty("sourceType")
    private SourceMicrosoftTeamsMicrosoftTeams sourceType;

    @JsonCreator
    public SourceMicrosoftTeams(
            @JsonProperty("credentials") Optional<? extends SourceMicrosoftTeamsAuthenticationMechanism> credentials,
            @JsonProperty("period") String period) {
        Utils.checkNotNull(credentials, "credentials");
        Utils.checkNotNull(period, "period");
        this.credentials = credentials;
        this.period = period;
        this.sourceType = Builder._SINGLETON_VALUE_SourceType.value();
    }
    
    public SourceMicrosoftTeams(
            String period) {
        this(Optional.empty(), period);
    }

    /**
     * Choose how to authenticate to Microsoft
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<SourceMicrosoftTeamsAuthenticationMechanism> credentials() {
        return (Optional<SourceMicrosoftTeamsAuthenticationMechanism>) credentials;
    }

    /**
     * Specifies the length of time over which the Team Device Report stream is aggregated. The supported values are: D7, D30, D90, and D180.
     */
    @JsonIgnore
    public String period() {
        return period;
    }

    @JsonIgnore
    public SourceMicrosoftTeamsMicrosoftTeams sourceType() {
        return sourceType;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    /**
     * Choose how to authenticate to Microsoft
     */
    public SourceMicrosoftTeams withCredentials(SourceMicrosoftTeamsAuthenticationMechanism credentials) {
        Utils.checkNotNull(credentials, "credentials");
        this.credentials = Optional.ofNullable(credentials);
        return this;
    }

    /**
     * Choose how to authenticate to Microsoft
     */
    public SourceMicrosoftTeams withCredentials(Optional<? extends SourceMicrosoftTeamsAuthenticationMechanism> credentials) {
        Utils.checkNotNull(credentials, "credentials");
        this.credentials = credentials;
        return this;
    }

    /**
     * Specifies the length of time over which the Team Device Report stream is aggregated. The supported values are: D7, D30, D90, and D180.
     */
    public SourceMicrosoftTeams withPeriod(String period) {
        Utils.checkNotNull(period, "period");
        this.period = period;
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
        SourceMicrosoftTeams other = (SourceMicrosoftTeams) o;
        return 
            Objects.deepEquals(this.credentials, other.credentials) &&
            Objects.deepEquals(this.period, other.period) &&
            Objects.deepEquals(this.sourceType, other.sourceType);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            credentials,
            period,
            sourceType);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceMicrosoftTeams.class,
                "credentials", credentials,
                "period", period,
                "sourceType", sourceType);
    }
    
    public final static class Builder {
 
        private Optional<? extends SourceMicrosoftTeamsAuthenticationMechanism> credentials = Optional.empty();
 
        private String period;
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Choose how to authenticate to Microsoft
         */
        public Builder credentials(SourceMicrosoftTeamsAuthenticationMechanism credentials) {
            Utils.checkNotNull(credentials, "credentials");
            this.credentials = Optional.ofNullable(credentials);
            return this;
        }

        /**
         * Choose how to authenticate to Microsoft
         */
        public Builder credentials(Optional<? extends SourceMicrosoftTeamsAuthenticationMechanism> credentials) {
            Utils.checkNotNull(credentials, "credentials");
            this.credentials = credentials;
            return this;
        }

        /**
         * Specifies the length of time over which the Team Device Report stream is aggregated. The supported values are: D7, D30, D90, and D180.
         */
        public Builder period(String period) {
            Utils.checkNotNull(period, "period");
            this.period = period;
            return this;
        }
        
        public SourceMicrosoftTeams build() {
            return new SourceMicrosoftTeams(
                credentials,
                period);
        }

        private static final LazySingletonValue<SourceMicrosoftTeamsMicrosoftTeams> _SINGLETON_VALUE_SourceType =
                new LazySingletonValue<>(
                        "sourceType",
                        "\"microsoft-teams\"",
                        new TypeReference<SourceMicrosoftTeamsMicrosoftTeams>() {});
    }
}
