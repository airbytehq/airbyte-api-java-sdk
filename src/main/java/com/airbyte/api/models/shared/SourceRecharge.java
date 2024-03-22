/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.airbyte.api.utils.LazySingletonValue;
import com.airbyte.api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonFormat;
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


public class SourceRecharge {

    /**
     * The value of the Access Token generated. See the &lt;a href="https://docs.airbyte.com/integrations/sources/recharge"&gt;docs&lt;/a&gt; for more information.
     */
    @JsonProperty("access_token")
    private String accessToken;

    @JsonProperty("sourceType")
    private Recharge sourceType;

    /**
     * The date from which you'd like to replicate data for Recharge API, in the format YYYY-MM-DDT00:00:00Z. Any data before this date will not be replicated.
     */
    @JsonProperty("start_date")
    private OffsetDateTime startDate;

    /**
     * Define whether or not the `Orders` stream should use the deprecated `2021-01` API version, or use `2021-11`, otherwise.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("use_orders_deprecated_api")
    private Optional<? extends Boolean> useOrdersDeprecatedApi;

    public SourceRecharge(
            @JsonProperty("access_token") String accessToken,
            @JsonProperty("start_date") OffsetDateTime startDate,
            @JsonProperty("use_orders_deprecated_api") Optional<? extends Boolean> useOrdersDeprecatedApi) {
        Utils.checkNotNull(accessToken, "accessToken");
        Utils.checkNotNull(startDate, "startDate");
        Utils.checkNotNull(useOrdersDeprecatedApi, "useOrdersDeprecatedApi");
        this.accessToken = accessToken;
        this.sourceType = Builder._SINGLETON_VALUE_SourceType.value();
        this.startDate = startDate;
        this.useOrdersDeprecatedApi = useOrdersDeprecatedApi;
    }

    /**
     * The value of the Access Token generated. See the &lt;a href="https://docs.airbyte.com/integrations/sources/recharge"&gt;docs&lt;/a&gt; for more information.
     */
    public String accessToken() {
        return accessToken;
    }

    public Recharge sourceType() {
        return sourceType;
    }

    /**
     * The date from which you'd like to replicate data for Recharge API, in the format YYYY-MM-DDT00:00:00Z. Any data before this date will not be replicated.
     */
    public OffsetDateTime startDate() {
        return startDate;
    }

    /**
     * Define whether or not the `Orders` stream should use the deprecated `2021-01` API version, or use `2021-11`, otherwise.
     */
    public Optional<? extends Boolean> useOrdersDeprecatedApi() {
        return useOrdersDeprecatedApi;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The value of the Access Token generated. See the &lt;a href="https://docs.airbyte.com/integrations/sources/recharge"&gt;docs&lt;/a&gt; for more information.
     */
    public SourceRecharge withAccessToken(String accessToken) {
        Utils.checkNotNull(accessToken, "accessToken");
        this.accessToken = accessToken;
        return this;
    }

    /**
     * The date from which you'd like to replicate data for Recharge API, in the format YYYY-MM-DDT00:00:00Z. Any data before this date will not be replicated.
     */
    public SourceRecharge withStartDate(OffsetDateTime startDate) {
        Utils.checkNotNull(startDate, "startDate");
        this.startDate = startDate;
        return this;
    }

    /**
     * Define whether or not the `Orders` stream should use the deprecated `2021-01` API version, or use `2021-11`, otherwise.
     */
    public SourceRecharge withUseOrdersDeprecatedApi(boolean useOrdersDeprecatedApi) {
        Utils.checkNotNull(useOrdersDeprecatedApi, "useOrdersDeprecatedApi");
        this.useOrdersDeprecatedApi = Optional.ofNullable(useOrdersDeprecatedApi);
        return this;
    }

    /**
     * Define whether or not the `Orders` stream should use the deprecated `2021-01` API version, or use `2021-11`, otherwise.
     */
    public SourceRecharge withUseOrdersDeprecatedApi(Optional<? extends Boolean> useOrdersDeprecatedApi) {
        Utils.checkNotNull(useOrdersDeprecatedApi, "useOrdersDeprecatedApi");
        this.useOrdersDeprecatedApi = useOrdersDeprecatedApi;
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
        SourceRecharge other = (SourceRecharge) o;
        return 
            java.util.Objects.deepEquals(this.accessToken, other.accessToken) &&
            java.util.Objects.deepEquals(this.sourceType, other.sourceType) &&
            java.util.Objects.deepEquals(this.startDate, other.startDate) &&
            java.util.Objects.deepEquals(this.useOrdersDeprecatedApi, other.useOrdersDeprecatedApi);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            accessToken,
            sourceType,
            startDate,
            useOrdersDeprecatedApi);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceRecharge.class,
                "accessToken", accessToken,
                "sourceType", sourceType,
                "startDate", startDate,
                "useOrdersDeprecatedApi", useOrdersDeprecatedApi);
    }
    
    public final static class Builder {
 
        private String accessToken;
 
        private OffsetDateTime startDate;
 
        private Optional<? extends Boolean> useOrdersDeprecatedApi;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The value of the Access Token generated. See the &lt;a href="https://docs.airbyte.com/integrations/sources/recharge"&gt;docs&lt;/a&gt; for more information.
         */
        public Builder accessToken(String accessToken) {
            Utils.checkNotNull(accessToken, "accessToken");
            this.accessToken = accessToken;
            return this;
        }

        /**
         * The date from which you'd like to replicate data for Recharge API, in the format YYYY-MM-DDT00:00:00Z. Any data before this date will not be replicated.
         */
        public Builder startDate(OffsetDateTime startDate) {
            Utils.checkNotNull(startDate, "startDate");
            this.startDate = startDate;
            return this;
        }

        /**
         * Define whether or not the `Orders` stream should use the deprecated `2021-01` API version, or use `2021-11`, otherwise.
         */
        public Builder useOrdersDeprecatedApi(boolean useOrdersDeprecatedApi) {
            Utils.checkNotNull(useOrdersDeprecatedApi, "useOrdersDeprecatedApi");
            this.useOrdersDeprecatedApi = Optional.ofNullable(useOrdersDeprecatedApi);
            return this;
        }

        /**
         * Define whether or not the `Orders` stream should use the deprecated `2021-01` API version, or use `2021-11`, otherwise.
         */
        public Builder useOrdersDeprecatedApi(Optional<? extends Boolean> useOrdersDeprecatedApi) {
            Utils.checkNotNull(useOrdersDeprecatedApi, "useOrdersDeprecatedApi");
            this.useOrdersDeprecatedApi = useOrdersDeprecatedApi;
            return this;
        }
        
        public SourceRecharge build() {
            if (useOrdersDeprecatedApi == null) {
                useOrdersDeprecatedApi = _SINGLETON_VALUE_UseOrdersDeprecatedApi.value();
            }
            return new SourceRecharge(
                accessToken,
                startDate,
                useOrdersDeprecatedApi);
        }

        private static final LazySingletonValue<Recharge> _SINGLETON_VALUE_SourceType =
                new LazySingletonValue<>(
                        "sourceType",
                        "\"recharge\"",
                        new TypeReference<Recharge>() {});

        private static final LazySingletonValue<Optional<? extends Boolean>> _SINGLETON_VALUE_UseOrdersDeprecatedApi =
                new LazySingletonValue<>(
                        "use_orders_deprecated_api",
                        "true",
                        new TypeReference<Optional<? extends Boolean>>() {});
    }
}

