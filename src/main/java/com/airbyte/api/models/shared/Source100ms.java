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

public class Source100ms {

    /**
     * The management token used for authenticating API requests. You can find or generate this token in your 100ms dashboard under the API section. Refer to the documentation at https://www.100ms.live/docs/concepts/v2/concepts/security-and-tokens#management-token-for-rest-api for more details.
     */
    @JsonProperty("management_token")
    private String managementToken;

    @JsonProperty("sourceType")
    private OneHundredms sourceType;

    @JsonProperty("start_date")
    private OffsetDateTime startDate;

    @JsonCreator
    public Source100ms(
            @JsonProperty("management_token") String managementToken,
            @JsonProperty("start_date") OffsetDateTime startDate) {
        Utils.checkNotNull(managementToken, "managementToken");
        Utils.checkNotNull(startDate, "startDate");
        this.managementToken = managementToken;
        this.sourceType = Builder._SINGLETON_VALUE_SourceType.value();
        this.startDate = startDate;
    }

    /**
     * The management token used for authenticating API requests. You can find or generate this token in your 100ms dashboard under the API section. Refer to the documentation at https://www.100ms.live/docs/concepts/v2/concepts/security-and-tokens#management-token-for-rest-api for more details.
     */
    @JsonIgnore
    public String managementToken() {
        return managementToken;
    }

    @JsonIgnore
    public OneHundredms sourceType() {
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
     * The management token used for authenticating API requests. You can find or generate this token in your 100ms dashboard under the API section. Refer to the documentation at https://www.100ms.live/docs/concepts/v2/concepts/security-and-tokens#management-token-for-rest-api for more details.
     */
    public Source100ms withManagementToken(String managementToken) {
        Utils.checkNotNull(managementToken, "managementToken");
        this.managementToken = managementToken;
        return this;
    }

    public Source100ms withStartDate(OffsetDateTime startDate) {
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
        Source100ms other = (Source100ms) o;
        return 
            Objects.deepEquals(this.managementToken, other.managementToken) &&
            Objects.deepEquals(this.sourceType, other.sourceType) &&
            Objects.deepEquals(this.startDate, other.startDate);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            managementToken,
            sourceType,
            startDate);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Source100ms.class,
                "managementToken", managementToken,
                "sourceType", sourceType,
                "startDate", startDate);
    }
    
    public final static class Builder {
 
        private String managementToken;
 
        private OffsetDateTime startDate;
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The management token used for authenticating API requests. You can find or generate this token in your 100ms dashboard under the API section. Refer to the documentation at https://www.100ms.live/docs/concepts/v2/concepts/security-and-tokens#management-token-for-rest-api for more details.
         */
        public Builder managementToken(String managementToken) {
            Utils.checkNotNull(managementToken, "managementToken");
            this.managementToken = managementToken;
            return this;
        }

        public Builder startDate(OffsetDateTime startDate) {
            Utils.checkNotNull(startDate, "startDate");
            this.startDate = startDate;
            return this;
        }
        
        public Source100ms build() {
            return new Source100ms(
                managementToken,
                startDate);
        }

        private static final LazySingletonValue<OneHundredms> _SINGLETON_VALUE_SourceType =
                new LazySingletonValue<>(
                        "sourceType",
                        "\"100ms\"",
                        new TypeReference<OneHundredms>() {});
    }
}
