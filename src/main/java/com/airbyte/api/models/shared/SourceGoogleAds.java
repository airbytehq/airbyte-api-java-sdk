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
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.util.Optional;

public class SourceGoogleAds {

    /**
     * A conversion window is the number of days after an ad interaction (such as an ad click or video view) during which a conversion, such as a purchase, is recorded in Google Ads. For more information, see &lt;a href="https://support.google.com/google-ads/answer/3123169?hl=en"&gt;Google's documentation&lt;/a&gt;.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("conversion_window_days")
    private Optional<? extends Long> conversionWindowDays;

    @JsonProperty("credentials")
    private GoogleCredentials credentials;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("custom_queries_array")
    private Optional<? extends java.util.List<CustomQueriesArray>> customQueriesArray;

    /**
     * Comma-separated list of (client) customer IDs. Each customer ID must be specified as a 10-digit number without dashes. For detailed instructions on finding this value, refer to our &lt;a href="https://docs.airbyte.com/integrations/sources/google-ads#setup-guide"&gt;documentation&lt;/a&gt;.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("customer_id")
    private Optional<? extends String> customerId;

    /**
     * A list of customer statuses to filter on. For detailed info about what each status mean refer to Google Ads &lt;a href="https://developers.google.com/google-ads/api/reference/rpc/v15/CustomerStatusEnum.CustomerStatus"&gt;documentation&lt;/a&gt;.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("customer_status_filter")
    private Optional<? extends java.util.List<CustomerStatus>> customerStatusFilter;

    /**
     * UTC date in the format YYYY-MM-DD. Any data after this date will not be replicated. (Default value of today is used if not set)
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("end_date")
    private Optional<? extends LocalDate> endDate;

    @JsonProperty("sourceType")
    private SourceGoogleAdsGoogleAds sourceType;

    /**
     * UTC date in the format YYYY-MM-DD. Any data before this date will not be replicated. (Default value of two years ago is used if not set)
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("start_date")
    private Optional<? extends LocalDate> startDate;

    @JsonCreator
    public SourceGoogleAds(
            @JsonProperty("conversion_window_days") Optional<? extends Long> conversionWindowDays,
            @JsonProperty("credentials") GoogleCredentials credentials,
            @JsonProperty("custom_queries_array") Optional<? extends java.util.List<CustomQueriesArray>> customQueriesArray,
            @JsonProperty("customer_id") Optional<? extends String> customerId,
            @JsonProperty("customer_status_filter") Optional<? extends java.util.List<CustomerStatus>> customerStatusFilter,
            @JsonProperty("end_date") Optional<? extends LocalDate> endDate,
            @JsonProperty("start_date") Optional<? extends LocalDate> startDate) {
        Utils.checkNotNull(conversionWindowDays, "conversionWindowDays");
        Utils.checkNotNull(credentials, "credentials");
        Utils.checkNotNull(customQueriesArray, "customQueriesArray");
        Utils.checkNotNull(customerId, "customerId");
        Utils.checkNotNull(customerStatusFilter, "customerStatusFilter");
        Utils.checkNotNull(endDate, "endDate");
        Utils.checkNotNull(startDate, "startDate");
        this.conversionWindowDays = conversionWindowDays;
        this.credentials = credentials;
        this.customQueriesArray = customQueriesArray;
        this.customerId = customerId;
        this.customerStatusFilter = customerStatusFilter;
        this.endDate = endDate;
        this.sourceType = Builder._SINGLETON_VALUE_SourceType.value();
        this.startDate = startDate;
    }
    
    public SourceGoogleAds(
            GoogleCredentials credentials) {
        this(Optional.empty(), credentials, Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * A conversion window is the number of days after an ad interaction (such as an ad click or video view) during which a conversion, such as a purchase, is recorded in Google Ads. For more information, see &lt;a href="https://support.google.com/google-ads/answer/3123169?hl=en"&gt;Google's documentation&lt;/a&gt;.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Long> conversionWindowDays() {
        return (Optional<Long>) conversionWindowDays;
    }

    @JsonIgnore
    public GoogleCredentials credentials() {
        return credentials;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<java.util.List<CustomQueriesArray>> customQueriesArray() {
        return (Optional<java.util.List<CustomQueriesArray>>) customQueriesArray;
    }

    /**
     * Comma-separated list of (client) customer IDs. Each customer ID must be specified as a 10-digit number without dashes. For detailed instructions on finding this value, refer to our &lt;a href="https://docs.airbyte.com/integrations/sources/google-ads#setup-guide"&gt;documentation&lt;/a&gt;.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> customerId() {
        return (Optional<String>) customerId;
    }

    /**
     * A list of customer statuses to filter on. For detailed info about what each status mean refer to Google Ads &lt;a href="https://developers.google.com/google-ads/api/reference/rpc/v15/CustomerStatusEnum.CustomerStatus"&gt;documentation&lt;/a&gt;.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<java.util.List<CustomerStatus>> customerStatusFilter() {
        return (Optional<java.util.List<CustomerStatus>>) customerStatusFilter;
    }

    /**
     * UTC date in the format YYYY-MM-DD. Any data after this date will not be replicated. (Default value of today is used if not set)
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<LocalDate> endDate() {
        return (Optional<LocalDate>) endDate;
    }

    @JsonIgnore
    public SourceGoogleAdsGoogleAds sourceType() {
        return sourceType;
    }

    /**
     * UTC date in the format YYYY-MM-DD. Any data before this date will not be replicated. (Default value of two years ago is used if not set)
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<LocalDate> startDate() {
        return (Optional<LocalDate>) startDate;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * A conversion window is the number of days after an ad interaction (such as an ad click or video view) during which a conversion, such as a purchase, is recorded in Google Ads. For more information, see &lt;a href="https://support.google.com/google-ads/answer/3123169?hl=en"&gt;Google's documentation&lt;/a&gt;.
     */
    public SourceGoogleAds withConversionWindowDays(long conversionWindowDays) {
        Utils.checkNotNull(conversionWindowDays, "conversionWindowDays");
        this.conversionWindowDays = Optional.ofNullable(conversionWindowDays);
        return this;
    }

    /**
     * A conversion window is the number of days after an ad interaction (such as an ad click or video view) during which a conversion, such as a purchase, is recorded in Google Ads. For more information, see &lt;a href="https://support.google.com/google-ads/answer/3123169?hl=en"&gt;Google's documentation&lt;/a&gt;.
     */
    public SourceGoogleAds withConversionWindowDays(Optional<? extends Long> conversionWindowDays) {
        Utils.checkNotNull(conversionWindowDays, "conversionWindowDays");
        this.conversionWindowDays = conversionWindowDays;
        return this;
    }

    public SourceGoogleAds withCredentials(GoogleCredentials credentials) {
        Utils.checkNotNull(credentials, "credentials");
        this.credentials = credentials;
        return this;
    }

    public SourceGoogleAds withCustomQueriesArray(java.util.List<CustomQueriesArray> customQueriesArray) {
        Utils.checkNotNull(customQueriesArray, "customQueriesArray");
        this.customQueriesArray = Optional.ofNullable(customQueriesArray);
        return this;
    }

    public SourceGoogleAds withCustomQueriesArray(Optional<? extends java.util.List<CustomQueriesArray>> customQueriesArray) {
        Utils.checkNotNull(customQueriesArray, "customQueriesArray");
        this.customQueriesArray = customQueriesArray;
        return this;
    }

    /**
     * Comma-separated list of (client) customer IDs. Each customer ID must be specified as a 10-digit number without dashes. For detailed instructions on finding this value, refer to our &lt;a href="https://docs.airbyte.com/integrations/sources/google-ads#setup-guide"&gt;documentation&lt;/a&gt;.
     */
    public SourceGoogleAds withCustomerId(String customerId) {
        Utils.checkNotNull(customerId, "customerId");
        this.customerId = Optional.ofNullable(customerId);
        return this;
    }

    /**
     * Comma-separated list of (client) customer IDs. Each customer ID must be specified as a 10-digit number without dashes. For detailed instructions on finding this value, refer to our &lt;a href="https://docs.airbyte.com/integrations/sources/google-ads#setup-guide"&gt;documentation&lt;/a&gt;.
     */
    public SourceGoogleAds withCustomerId(Optional<? extends String> customerId) {
        Utils.checkNotNull(customerId, "customerId");
        this.customerId = customerId;
        return this;
    }

    /**
     * A list of customer statuses to filter on. For detailed info about what each status mean refer to Google Ads &lt;a href="https://developers.google.com/google-ads/api/reference/rpc/v15/CustomerStatusEnum.CustomerStatus"&gt;documentation&lt;/a&gt;.
     */
    public SourceGoogleAds withCustomerStatusFilter(java.util.List<CustomerStatus> customerStatusFilter) {
        Utils.checkNotNull(customerStatusFilter, "customerStatusFilter");
        this.customerStatusFilter = Optional.ofNullable(customerStatusFilter);
        return this;
    }

    /**
     * A list of customer statuses to filter on. For detailed info about what each status mean refer to Google Ads &lt;a href="https://developers.google.com/google-ads/api/reference/rpc/v15/CustomerStatusEnum.CustomerStatus"&gt;documentation&lt;/a&gt;.
     */
    public SourceGoogleAds withCustomerStatusFilter(Optional<? extends java.util.List<CustomerStatus>> customerStatusFilter) {
        Utils.checkNotNull(customerStatusFilter, "customerStatusFilter");
        this.customerStatusFilter = customerStatusFilter;
        return this;
    }

    /**
     * UTC date in the format YYYY-MM-DD. Any data after this date will not be replicated. (Default value of today is used if not set)
     */
    public SourceGoogleAds withEndDate(LocalDate endDate) {
        Utils.checkNotNull(endDate, "endDate");
        this.endDate = Optional.ofNullable(endDate);
        return this;
    }

    /**
     * UTC date in the format YYYY-MM-DD. Any data after this date will not be replicated. (Default value of today is used if not set)
     */
    public SourceGoogleAds withEndDate(Optional<? extends LocalDate> endDate) {
        Utils.checkNotNull(endDate, "endDate");
        this.endDate = endDate;
        return this;
    }

    /**
     * UTC date in the format YYYY-MM-DD. Any data before this date will not be replicated. (Default value of two years ago is used if not set)
     */
    public SourceGoogleAds withStartDate(LocalDate startDate) {
        Utils.checkNotNull(startDate, "startDate");
        this.startDate = Optional.ofNullable(startDate);
        return this;
    }

    /**
     * UTC date in the format YYYY-MM-DD. Any data before this date will not be replicated. (Default value of two years ago is used if not set)
     */
    public SourceGoogleAds withStartDate(Optional<? extends LocalDate> startDate) {
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
        SourceGoogleAds other = (SourceGoogleAds) o;
        return 
            java.util.Objects.deepEquals(this.conversionWindowDays, other.conversionWindowDays) &&
            java.util.Objects.deepEquals(this.credentials, other.credentials) &&
            java.util.Objects.deepEquals(this.customQueriesArray, other.customQueriesArray) &&
            java.util.Objects.deepEquals(this.customerId, other.customerId) &&
            java.util.Objects.deepEquals(this.customerStatusFilter, other.customerStatusFilter) &&
            java.util.Objects.deepEquals(this.endDate, other.endDate) &&
            java.util.Objects.deepEquals(this.sourceType, other.sourceType) &&
            java.util.Objects.deepEquals(this.startDate, other.startDate);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            conversionWindowDays,
            credentials,
            customQueriesArray,
            customerId,
            customerStatusFilter,
            endDate,
            sourceType,
            startDate);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceGoogleAds.class,
                "conversionWindowDays", conversionWindowDays,
                "credentials", credentials,
                "customQueriesArray", customQueriesArray,
                "customerId", customerId,
                "customerStatusFilter", customerStatusFilter,
                "endDate", endDate,
                "sourceType", sourceType,
                "startDate", startDate);
    }
    
    public final static class Builder {
 
        private Optional<? extends Long> conversionWindowDays;
 
        private GoogleCredentials credentials;
 
        private Optional<? extends java.util.List<CustomQueriesArray>> customQueriesArray = Optional.empty();
 
        private Optional<? extends String> customerId = Optional.empty();
 
        private Optional<? extends java.util.List<CustomerStatus>> customerStatusFilter = Optional.empty();
 
        private Optional<? extends LocalDate> endDate = Optional.empty();
 
        private Optional<? extends LocalDate> startDate = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * A conversion window is the number of days after an ad interaction (such as an ad click or video view) during which a conversion, such as a purchase, is recorded in Google Ads. For more information, see &lt;a href="https://support.google.com/google-ads/answer/3123169?hl=en"&gt;Google's documentation&lt;/a&gt;.
         */
        public Builder conversionWindowDays(long conversionWindowDays) {
            Utils.checkNotNull(conversionWindowDays, "conversionWindowDays");
            this.conversionWindowDays = Optional.ofNullable(conversionWindowDays);
            return this;
        }

        /**
         * A conversion window is the number of days after an ad interaction (such as an ad click or video view) during which a conversion, such as a purchase, is recorded in Google Ads. For more information, see &lt;a href="https://support.google.com/google-ads/answer/3123169?hl=en"&gt;Google's documentation&lt;/a&gt;.
         */
        public Builder conversionWindowDays(Optional<? extends Long> conversionWindowDays) {
            Utils.checkNotNull(conversionWindowDays, "conversionWindowDays");
            this.conversionWindowDays = conversionWindowDays;
            return this;
        }

        public Builder credentials(GoogleCredentials credentials) {
            Utils.checkNotNull(credentials, "credentials");
            this.credentials = credentials;
            return this;
        }

        public Builder customQueriesArray(java.util.List<CustomQueriesArray> customQueriesArray) {
            Utils.checkNotNull(customQueriesArray, "customQueriesArray");
            this.customQueriesArray = Optional.ofNullable(customQueriesArray);
            return this;
        }

        public Builder customQueriesArray(Optional<? extends java.util.List<CustomQueriesArray>> customQueriesArray) {
            Utils.checkNotNull(customQueriesArray, "customQueriesArray");
            this.customQueriesArray = customQueriesArray;
            return this;
        }

        /**
         * Comma-separated list of (client) customer IDs. Each customer ID must be specified as a 10-digit number without dashes. For detailed instructions on finding this value, refer to our &lt;a href="https://docs.airbyte.com/integrations/sources/google-ads#setup-guide"&gt;documentation&lt;/a&gt;.
         */
        public Builder customerId(String customerId) {
            Utils.checkNotNull(customerId, "customerId");
            this.customerId = Optional.ofNullable(customerId);
            return this;
        }

        /**
         * Comma-separated list of (client) customer IDs. Each customer ID must be specified as a 10-digit number without dashes. For detailed instructions on finding this value, refer to our &lt;a href="https://docs.airbyte.com/integrations/sources/google-ads#setup-guide"&gt;documentation&lt;/a&gt;.
         */
        public Builder customerId(Optional<? extends String> customerId) {
            Utils.checkNotNull(customerId, "customerId");
            this.customerId = customerId;
            return this;
        }

        /**
         * A list of customer statuses to filter on. For detailed info about what each status mean refer to Google Ads &lt;a href="https://developers.google.com/google-ads/api/reference/rpc/v15/CustomerStatusEnum.CustomerStatus"&gt;documentation&lt;/a&gt;.
         */
        public Builder customerStatusFilter(java.util.List<CustomerStatus> customerStatusFilter) {
            Utils.checkNotNull(customerStatusFilter, "customerStatusFilter");
            this.customerStatusFilter = Optional.ofNullable(customerStatusFilter);
            return this;
        }

        /**
         * A list of customer statuses to filter on. For detailed info about what each status mean refer to Google Ads &lt;a href="https://developers.google.com/google-ads/api/reference/rpc/v15/CustomerStatusEnum.CustomerStatus"&gt;documentation&lt;/a&gt;.
         */
        public Builder customerStatusFilter(Optional<? extends java.util.List<CustomerStatus>> customerStatusFilter) {
            Utils.checkNotNull(customerStatusFilter, "customerStatusFilter");
            this.customerStatusFilter = customerStatusFilter;
            return this;
        }

        /**
         * UTC date in the format YYYY-MM-DD. Any data after this date will not be replicated. (Default value of today is used if not set)
         */
        public Builder endDate(LocalDate endDate) {
            Utils.checkNotNull(endDate, "endDate");
            this.endDate = Optional.ofNullable(endDate);
            return this;
        }

        /**
         * UTC date in the format YYYY-MM-DD. Any data after this date will not be replicated. (Default value of today is used if not set)
         */
        public Builder endDate(Optional<? extends LocalDate> endDate) {
            Utils.checkNotNull(endDate, "endDate");
            this.endDate = endDate;
            return this;
        }

        /**
         * UTC date in the format YYYY-MM-DD. Any data before this date will not be replicated. (Default value of two years ago is used if not set)
         */
        public Builder startDate(LocalDate startDate) {
            Utils.checkNotNull(startDate, "startDate");
            this.startDate = Optional.ofNullable(startDate);
            return this;
        }

        /**
         * UTC date in the format YYYY-MM-DD. Any data before this date will not be replicated. (Default value of two years ago is used if not set)
         */
        public Builder startDate(Optional<? extends LocalDate> startDate) {
            Utils.checkNotNull(startDate, "startDate");
            this.startDate = startDate;
            return this;
        }
        
        public SourceGoogleAds build() {
            if (conversionWindowDays == null) {
                conversionWindowDays = _SINGLETON_VALUE_ConversionWindowDays.value();
            }
            return new SourceGoogleAds(
                conversionWindowDays,
                credentials,
                customQueriesArray,
                customerId,
                customerStatusFilter,
                endDate,
                startDate);
        }

        private static final LazySingletonValue<Optional<? extends Long>> _SINGLETON_VALUE_ConversionWindowDays =
                new LazySingletonValue<>(
                        "conversion_window_days",
                        "14",
                        new TypeReference<Optional<? extends Long>>() {});

        private static final LazySingletonValue<SourceGoogleAdsGoogleAds> _SINGLETON_VALUE_SourceType =
                new LazySingletonValue<>(
                        "sourceType",
                        "\"google-ads\"",
                        new TypeReference<SourceGoogleAdsGoogleAds>() {});
    }
}

