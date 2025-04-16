/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.airbyte.api.models.shared;

import com.airbyte.api.utils.LazySingletonValue;
import com.airbyte.api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.lang.Double;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

public class SourceSmartreach {

    @JsonProperty("api_key")
    private String apiKey;

    @JsonProperty("sourceType")
    private Smartreach sourceType;

    @JsonProperty("teamid")
    private double teamid;

    @JsonCreator
    public SourceSmartreach(
            @JsonProperty("api_key") String apiKey,
            @JsonProperty("teamid") double teamid) {
        Utils.checkNotNull(apiKey, "apiKey");
        Utils.checkNotNull(teamid, "teamid");
        this.apiKey = apiKey;
        this.sourceType = Builder._SINGLETON_VALUE_SourceType.value();
        this.teamid = teamid;
    }

    @JsonIgnore
    public String apiKey() {
        return apiKey;
    }

    @JsonIgnore
    public Smartreach sourceType() {
        return sourceType;
    }

    @JsonIgnore
    public double teamid() {
        return teamid;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    public SourceSmartreach withApiKey(String apiKey) {
        Utils.checkNotNull(apiKey, "apiKey");
        this.apiKey = apiKey;
        return this;
    }

    public SourceSmartreach withTeamid(double teamid) {
        Utils.checkNotNull(teamid, "teamid");
        this.teamid = teamid;
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
        SourceSmartreach other = (SourceSmartreach) o;
        return 
            Objects.deepEquals(this.apiKey, other.apiKey) &&
            Objects.deepEquals(this.sourceType, other.sourceType) &&
            Objects.deepEquals(this.teamid, other.teamid);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            apiKey,
            sourceType,
            teamid);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceSmartreach.class,
                "apiKey", apiKey,
                "sourceType", sourceType,
                "teamid", teamid);
    }
    
    public final static class Builder {
 
        private String apiKey;
 
        private Double teamid;
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder apiKey(String apiKey) {
            Utils.checkNotNull(apiKey, "apiKey");
            this.apiKey = apiKey;
            return this;
        }

        public Builder teamid(double teamid) {
            Utils.checkNotNull(teamid, "teamid");
            this.teamid = teamid;
            return this;
        }
        
        public SourceSmartreach build() {
            return new SourceSmartreach(
                apiKey,
                teamid);
        }

        private static final LazySingletonValue<Smartreach> _SINGLETON_VALUE_SourceType =
                new LazySingletonValue<>(
                        "sourceType",
                        "\"smartreach\"",
                        new TypeReference<Smartreach>() {});
    }
}
