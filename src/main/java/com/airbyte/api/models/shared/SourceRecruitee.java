/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.airbyte.api.utils.LazySingletonValue;
import com.airbyte.api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;


public class SourceRecruitee {

    /**
     * Recruitee API Key. See &lt;a href="https://docs.recruitee.com/reference/getting-started#generate-api-token"&gt;here&lt;/a&gt;.
     */
    @JsonProperty("api_key")
    private String apiKey;

    /**
     * Recruitee Company ID. You can also find this ID on the &lt;a href="https://app.recruitee.com/#/settings/api_tokens"&gt;Recruitee API tokens page&lt;/a&gt;.
     */
    @JsonProperty("company_id")
    private long companyId;

    @JsonProperty("sourceType")
    private Recruitee sourceType;

    @JsonCreator
    public SourceRecruitee(
            @JsonProperty("api_key") String apiKey,
            @JsonProperty("company_id") long companyId) {
        Utils.checkNotNull(apiKey, "apiKey");
        Utils.checkNotNull(companyId, "companyId");
        this.apiKey = apiKey;
        this.companyId = companyId;
        this.sourceType = Builder._SINGLETON_VALUE_SourceType.value();
    }

    /**
     * Recruitee API Key. See &lt;a href="https://docs.recruitee.com/reference/getting-started#generate-api-token"&gt;here&lt;/a&gt;.
     */
    @JsonIgnore
    public String apiKey() {
        return apiKey;
    }

    /**
     * Recruitee Company ID. You can also find this ID on the &lt;a href="https://app.recruitee.com/#/settings/api_tokens"&gt;Recruitee API tokens page&lt;/a&gt;.
     */
    @JsonIgnore
    public long companyId() {
        return companyId;
    }

    @JsonIgnore
    public Recruitee sourceType() {
        return sourceType;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Recruitee API Key. See &lt;a href="https://docs.recruitee.com/reference/getting-started#generate-api-token"&gt;here&lt;/a&gt;.
     */
    public SourceRecruitee withApiKey(String apiKey) {
        Utils.checkNotNull(apiKey, "apiKey");
        this.apiKey = apiKey;
        return this;
    }

    /**
     * Recruitee Company ID. You can also find this ID on the &lt;a href="https://app.recruitee.com/#/settings/api_tokens"&gt;Recruitee API tokens page&lt;/a&gt;.
     */
    public SourceRecruitee withCompanyId(long companyId) {
        Utils.checkNotNull(companyId, "companyId");
        this.companyId = companyId;
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
        SourceRecruitee other = (SourceRecruitee) o;
        return 
            java.util.Objects.deepEquals(this.apiKey, other.apiKey) &&
            java.util.Objects.deepEquals(this.companyId, other.companyId) &&
            java.util.Objects.deepEquals(this.sourceType, other.sourceType);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            apiKey,
            companyId,
            sourceType);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceRecruitee.class,
                "apiKey", apiKey,
                "companyId", companyId,
                "sourceType", sourceType);
    }
    
    public final static class Builder {
 
        private String apiKey;
 
        private Long companyId;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Recruitee API Key. See &lt;a href="https://docs.recruitee.com/reference/getting-started#generate-api-token"&gt;here&lt;/a&gt;.
         */
        public Builder apiKey(String apiKey) {
            Utils.checkNotNull(apiKey, "apiKey");
            this.apiKey = apiKey;
            return this;
        }

        /**
         * Recruitee Company ID. You can also find this ID on the &lt;a href="https://app.recruitee.com/#/settings/api_tokens"&gt;Recruitee API tokens page&lt;/a&gt;.
         */
        public Builder companyId(long companyId) {
            Utils.checkNotNull(companyId, "companyId");
            this.companyId = companyId;
            return this;
        }
        
        public SourceRecruitee build() {
            return new SourceRecruitee(
                apiKey,
                companyId);
        }

        private static final LazySingletonValue<Recruitee> _SINGLETON_VALUE_SourceType =
                new LazySingletonValue<>(
                        "sourceType",
                        "\"recruitee\"",
                        new TypeReference<Recruitee>() {});
    }
}

