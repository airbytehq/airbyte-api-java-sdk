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
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;

public class SourceJustcall {

    @JsonProperty("api_key_2")
    private String apiKey2;

    @JsonProperty("sourceType")
    private Justcall sourceType;

    @JsonProperty("start_date")
    private OffsetDateTime startDate;

    @JsonCreator
    public SourceJustcall(
            @JsonProperty("api_key_2") String apiKey2,
            @JsonProperty("start_date") OffsetDateTime startDate) {
        Utils.checkNotNull(apiKey2, "apiKey2");
        Utils.checkNotNull(startDate, "startDate");
        this.apiKey2 = apiKey2;
        this.sourceType = Builder._SINGLETON_VALUE_SourceType.value();
        this.startDate = startDate;
    }

    @JsonIgnore
    public String apiKey2() {
        return apiKey2;
    }

    @JsonIgnore
    public Justcall sourceType() {
        return sourceType;
    }

    @JsonIgnore
    public OffsetDateTime startDate() {
        return startDate;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    public SourceJustcall withApiKey2(String apiKey2) {
        Utils.checkNotNull(apiKey2, "apiKey2");
        this.apiKey2 = apiKey2;
        return this;
    }

    public SourceJustcall withStartDate(OffsetDateTime startDate) {
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
        SourceJustcall other = (SourceJustcall) o;
        return 
            Objects.deepEquals(this.apiKey2, other.apiKey2) &&
            Objects.deepEquals(this.sourceType, other.sourceType) &&
            Objects.deepEquals(this.startDate, other.startDate);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            apiKey2,
            sourceType,
            startDate);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceJustcall.class,
                "apiKey2", apiKey2,
                "sourceType", sourceType,
                "startDate", startDate);
    }
    
    public final static class Builder {
 
        private String apiKey2;
 
        private OffsetDateTime startDate;
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder apiKey2(String apiKey2) {
            Utils.checkNotNull(apiKey2, "apiKey2");
            this.apiKey2 = apiKey2;
            return this;
        }

        public Builder startDate(OffsetDateTime startDate) {
            Utils.checkNotNull(startDate, "startDate");
            this.startDate = startDate;
            return this;
        }
        
        public SourceJustcall build() {
            return new SourceJustcall(
                apiKey2,
                startDate);
        }

        private static final LazySingletonValue<Justcall> _SINGLETON_VALUE_SourceType =
                new LazySingletonValue<>(
                        "sourceType",
                        "\"justcall\"",
                        new TypeReference<Justcall>() {});
    }
}
