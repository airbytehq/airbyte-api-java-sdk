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
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;
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
    private Optional<Boolean> useOrdersDeprecatedApi;

    @JsonCreator
    public SourceRecharge(
            @JsonProperty("access_token") String accessToken,
            @JsonProperty("start_date") OffsetDateTime startDate,
            @JsonProperty("use_orders_deprecated_api") Optional<Boolean> useOrdersDeprecatedApi) {
        Utils.checkNotNull(accessToken, "accessToken");
        Utils.checkNotNull(startDate, "startDate");
        Utils.checkNotNull(useOrdersDeprecatedApi, "useOrdersDeprecatedApi");
        this.accessToken = accessToken;
        this.sourceType = Builder._SINGLETON_VALUE_SourceType.value();
        this.startDate = startDate;
        this.useOrdersDeprecatedApi = useOrdersDeprecatedApi;
    }
    
    public SourceRecharge(
            String accessToken,
            OffsetDateTime startDate) {
        this(accessToken, startDate, Optional.empty());
    }

    /**
     * The value of the Access Token generated. See the &lt;a href="https://docs.airbyte.com/integrations/sources/recharge"&gt;docs&lt;/a&gt; for more information.
     */
    @JsonIgnore
    public String accessToken() {
        return accessToken;
    }

    @JsonIgnore
    public Recharge sourceType() {
        return sourceType;
    }

    /**
     * The date from which you'd like to replicate data for Recharge API, in the format YYYY-MM-DDT00:00:00Z. Any data before this date will not be replicated.
     */
    @JsonIgnore
    public OffsetDateTime startDate() {
        return startDate;
    }

    /**
     * Define whether or not the `Orders` stream should use the deprecated `2021-01` API version, or use `2021-11`, otherwise.
     */
    @JsonIgnore
    public Optional<Boolean> useOrdersDeprecatedApi() {
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
    public SourceRecharge withUseOrdersDeprecatedApi(Optional<Boolean> useOrdersDeprecatedApi) {
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
            Objects.deepEquals(this.accessToken, other.accessToken) &&
            Objects.deepEquals(this.sourceType, other.sourceType) &&
            Objects.deepEquals(this.startDate, other.startDate) &&
            Objects.deepEquals(this.useOrdersDeprecatedApi, other.useOrdersDeprecatedApi);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
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
 
        private Optional<Boolean> useOrdersDeprecatedApi;  
        
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
        public Builder useOrdersDeprecatedApi(Optional<Boolean> useOrdersDeprecatedApi) {
            Utils.checkNotNull(useOrdersDeprecatedApi, "useOrdersDeprecatedApi");
            this.useOrdersDeprecatedApi = useOrdersDeprecatedApi;
            return this;
        }
        
        public SourceRecharge build() {
            if (useOrdersDeprecatedApi == null) {
                useOrdersDeprecatedApi = _SINGLETON_VALUE_UseOrdersDeprecatedApi.value();
            }            return new SourceRecharge(
                accessToken,
                startDate,
                useOrdersDeprecatedApi);
        }

        private static final LazySingletonValue<Recharge> _SINGLETON_VALUE_SourceType =
                new LazySingletonValue<>(
                        "sourceType",
                        "\"recharge\"",
                        new TypeReference<Recharge>() {});

        private static final LazySingletonValue<Optional<Boolean>> _SINGLETON_VALUE_UseOrdersDeprecatedApi =
                new LazySingletonValue<>(
                        "use_orders_deprecated_api",
                        "true",
                        new TypeReference<Optional<Boolean>>() {});
    }
}

