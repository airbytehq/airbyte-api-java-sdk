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
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

public class SourceBreezometer {

    /**
     * Your API Access Key. See &lt;a href="https://docs.breezometer.com/api-documentation/introduction/#authentication/"&gt;here&lt;/a&gt;.
     */
    @JsonProperty("api_key")
    private String apiKey;

    /**
     * Number of days to forecast. Minimum 1, maximum 3. Valid for Polen and Weather Forecast streams.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("days_to_forecast")
    private Optional<Long> daysToForecast;

    /**
     * Number of hours retireve from Air Quality History stream. Minimum 1, maximum 720.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("historic_hours")
    private Optional<Long> historicHours;

    /**
     * Number of hours to forecast. Minimum 1, maximum 96. Valid for Air Quality Forecast stream.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("hours_to_forecast")
    private Optional<Long> hoursToForecast;

    /**
     * Latitude of the monitored location.
     */
    @JsonProperty("latitude")
    private String latitude;

    /**
     * Longitude of the monitored location.
     */
    @JsonProperty("longitude")
    private String longitude;

    /**
     * Desired radius from the location provided. Minimum 5, maximum 100. Valid for Wildfires streams.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("radius")
    private Optional<Long> radius;

    @JsonProperty("sourceType")
    private Breezometer sourceType;

    @JsonCreator
    public SourceBreezometer(
            @JsonProperty("api_key") String apiKey,
            @JsonProperty("days_to_forecast") Optional<Long> daysToForecast,
            @JsonProperty("historic_hours") Optional<Long> historicHours,
            @JsonProperty("hours_to_forecast") Optional<Long> hoursToForecast,
            @JsonProperty("latitude") String latitude,
            @JsonProperty("longitude") String longitude,
            @JsonProperty("radius") Optional<Long> radius) {
        Utils.checkNotNull(apiKey, "apiKey");
        Utils.checkNotNull(daysToForecast, "daysToForecast");
        Utils.checkNotNull(historicHours, "historicHours");
        Utils.checkNotNull(hoursToForecast, "hoursToForecast");
        Utils.checkNotNull(latitude, "latitude");
        Utils.checkNotNull(longitude, "longitude");
        Utils.checkNotNull(radius, "radius");
        this.apiKey = apiKey;
        this.daysToForecast = daysToForecast;
        this.historicHours = historicHours;
        this.hoursToForecast = hoursToForecast;
        this.latitude = latitude;
        this.longitude = longitude;
        this.radius = radius;
        this.sourceType = Builder._SINGLETON_VALUE_SourceType.value();
    }
    
    public SourceBreezometer(
            String apiKey,
            String latitude,
            String longitude) {
        this(apiKey, Optional.empty(), Optional.empty(), Optional.empty(), latitude, longitude, Optional.empty());
    }

    /**
     * Your API Access Key. See &lt;a href="https://docs.breezometer.com/api-documentation/introduction/#authentication/"&gt;here&lt;/a&gt;.
     */
    @JsonIgnore
    public String apiKey() {
        return apiKey;
    }

    /**
     * Number of days to forecast. Minimum 1, maximum 3. Valid for Polen and Weather Forecast streams.
     */
    @JsonIgnore
    public Optional<Long> daysToForecast() {
        return daysToForecast;
    }

    /**
     * Number of hours retireve from Air Quality History stream. Minimum 1, maximum 720.
     */
    @JsonIgnore
    public Optional<Long> historicHours() {
        return historicHours;
    }

    /**
     * Number of hours to forecast. Minimum 1, maximum 96. Valid for Air Quality Forecast stream.
     */
    @JsonIgnore
    public Optional<Long> hoursToForecast() {
        return hoursToForecast;
    }

    /**
     * Latitude of the monitored location.
     */
    @JsonIgnore
    public String latitude() {
        return latitude;
    }

    /**
     * Longitude of the monitored location.
     */
    @JsonIgnore
    public String longitude() {
        return longitude;
    }

    /**
     * Desired radius from the location provided. Minimum 5, maximum 100. Valid for Wildfires streams.
     */
    @JsonIgnore
    public Optional<Long> radius() {
        return radius;
    }

    @JsonIgnore
    public Breezometer sourceType() {
        return sourceType;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    /**
     * Your API Access Key. See &lt;a href="https://docs.breezometer.com/api-documentation/introduction/#authentication/"&gt;here&lt;/a&gt;.
     */
    public SourceBreezometer withApiKey(String apiKey) {
        Utils.checkNotNull(apiKey, "apiKey");
        this.apiKey = apiKey;
        return this;
    }

    /**
     * Number of days to forecast. Minimum 1, maximum 3. Valid for Polen and Weather Forecast streams.
     */
    public SourceBreezometer withDaysToForecast(long daysToForecast) {
        Utils.checkNotNull(daysToForecast, "daysToForecast");
        this.daysToForecast = Optional.ofNullable(daysToForecast);
        return this;
    }

    /**
     * Number of days to forecast. Minimum 1, maximum 3. Valid for Polen and Weather Forecast streams.
     */
    public SourceBreezometer withDaysToForecast(Optional<Long> daysToForecast) {
        Utils.checkNotNull(daysToForecast, "daysToForecast");
        this.daysToForecast = daysToForecast;
        return this;
    }

    /**
     * Number of hours retireve from Air Quality History stream. Minimum 1, maximum 720.
     */
    public SourceBreezometer withHistoricHours(long historicHours) {
        Utils.checkNotNull(historicHours, "historicHours");
        this.historicHours = Optional.ofNullable(historicHours);
        return this;
    }

    /**
     * Number of hours retireve from Air Quality History stream. Minimum 1, maximum 720.
     */
    public SourceBreezometer withHistoricHours(Optional<Long> historicHours) {
        Utils.checkNotNull(historicHours, "historicHours");
        this.historicHours = historicHours;
        return this;
    }

    /**
     * Number of hours to forecast. Minimum 1, maximum 96. Valid for Air Quality Forecast stream.
     */
    public SourceBreezometer withHoursToForecast(long hoursToForecast) {
        Utils.checkNotNull(hoursToForecast, "hoursToForecast");
        this.hoursToForecast = Optional.ofNullable(hoursToForecast);
        return this;
    }

    /**
     * Number of hours to forecast. Minimum 1, maximum 96. Valid for Air Quality Forecast stream.
     */
    public SourceBreezometer withHoursToForecast(Optional<Long> hoursToForecast) {
        Utils.checkNotNull(hoursToForecast, "hoursToForecast");
        this.hoursToForecast = hoursToForecast;
        return this;
    }

    /**
     * Latitude of the monitored location.
     */
    public SourceBreezometer withLatitude(String latitude) {
        Utils.checkNotNull(latitude, "latitude");
        this.latitude = latitude;
        return this;
    }

    /**
     * Longitude of the monitored location.
     */
    public SourceBreezometer withLongitude(String longitude) {
        Utils.checkNotNull(longitude, "longitude");
        this.longitude = longitude;
        return this;
    }

    /**
     * Desired radius from the location provided. Minimum 5, maximum 100. Valid for Wildfires streams.
     */
    public SourceBreezometer withRadius(long radius) {
        Utils.checkNotNull(radius, "radius");
        this.radius = Optional.ofNullable(radius);
        return this;
    }

    /**
     * Desired radius from the location provided. Minimum 5, maximum 100. Valid for Wildfires streams.
     */
    public SourceBreezometer withRadius(Optional<Long> radius) {
        Utils.checkNotNull(radius, "radius");
        this.radius = radius;
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
        SourceBreezometer other = (SourceBreezometer) o;
        return 
            Objects.deepEquals(this.apiKey, other.apiKey) &&
            Objects.deepEquals(this.daysToForecast, other.daysToForecast) &&
            Objects.deepEquals(this.historicHours, other.historicHours) &&
            Objects.deepEquals(this.hoursToForecast, other.hoursToForecast) &&
            Objects.deepEquals(this.latitude, other.latitude) &&
            Objects.deepEquals(this.longitude, other.longitude) &&
            Objects.deepEquals(this.radius, other.radius) &&
            Objects.deepEquals(this.sourceType, other.sourceType);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            apiKey,
            daysToForecast,
            historicHours,
            hoursToForecast,
            latitude,
            longitude,
            radius,
            sourceType);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceBreezometer.class,
                "apiKey", apiKey,
                "daysToForecast", daysToForecast,
                "historicHours", historicHours,
                "hoursToForecast", hoursToForecast,
                "latitude", latitude,
                "longitude", longitude,
                "radius", radius,
                "sourceType", sourceType);
    }
    
    public final static class Builder {
 
        private String apiKey;
 
        private Optional<Long> daysToForecast = Optional.empty();
 
        private Optional<Long> historicHours = Optional.empty();
 
        private Optional<Long> hoursToForecast = Optional.empty();
 
        private String latitude;
 
        private String longitude;
 
        private Optional<Long> radius = Optional.empty();
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Your API Access Key. See &lt;a href="https://docs.breezometer.com/api-documentation/introduction/#authentication/"&gt;here&lt;/a&gt;.
         */
        public Builder apiKey(String apiKey) {
            Utils.checkNotNull(apiKey, "apiKey");
            this.apiKey = apiKey;
            return this;
        }

        /**
         * Number of days to forecast. Minimum 1, maximum 3. Valid for Polen and Weather Forecast streams.
         */
        public Builder daysToForecast(long daysToForecast) {
            Utils.checkNotNull(daysToForecast, "daysToForecast");
            this.daysToForecast = Optional.ofNullable(daysToForecast);
            return this;
        }

        /**
         * Number of days to forecast. Minimum 1, maximum 3. Valid for Polen and Weather Forecast streams.
         */
        public Builder daysToForecast(Optional<Long> daysToForecast) {
            Utils.checkNotNull(daysToForecast, "daysToForecast");
            this.daysToForecast = daysToForecast;
            return this;
        }

        /**
         * Number of hours retireve from Air Quality History stream. Minimum 1, maximum 720.
         */
        public Builder historicHours(long historicHours) {
            Utils.checkNotNull(historicHours, "historicHours");
            this.historicHours = Optional.ofNullable(historicHours);
            return this;
        }

        /**
         * Number of hours retireve from Air Quality History stream. Minimum 1, maximum 720.
         */
        public Builder historicHours(Optional<Long> historicHours) {
            Utils.checkNotNull(historicHours, "historicHours");
            this.historicHours = historicHours;
            return this;
        }

        /**
         * Number of hours to forecast. Minimum 1, maximum 96. Valid for Air Quality Forecast stream.
         */
        public Builder hoursToForecast(long hoursToForecast) {
            Utils.checkNotNull(hoursToForecast, "hoursToForecast");
            this.hoursToForecast = Optional.ofNullable(hoursToForecast);
            return this;
        }

        /**
         * Number of hours to forecast. Minimum 1, maximum 96. Valid for Air Quality Forecast stream.
         */
        public Builder hoursToForecast(Optional<Long> hoursToForecast) {
            Utils.checkNotNull(hoursToForecast, "hoursToForecast");
            this.hoursToForecast = hoursToForecast;
            return this;
        }

        /**
         * Latitude of the monitored location.
         */
        public Builder latitude(String latitude) {
            Utils.checkNotNull(latitude, "latitude");
            this.latitude = latitude;
            return this;
        }

        /**
         * Longitude of the monitored location.
         */
        public Builder longitude(String longitude) {
            Utils.checkNotNull(longitude, "longitude");
            this.longitude = longitude;
            return this;
        }

        /**
         * Desired radius from the location provided. Minimum 5, maximum 100. Valid for Wildfires streams.
         */
        public Builder radius(long radius) {
            Utils.checkNotNull(radius, "radius");
            this.radius = Optional.ofNullable(radius);
            return this;
        }

        /**
         * Desired radius from the location provided. Minimum 5, maximum 100. Valid for Wildfires streams.
         */
        public Builder radius(Optional<Long> radius) {
            Utils.checkNotNull(radius, "radius");
            this.radius = radius;
            return this;
        }
        
        public SourceBreezometer build() {
            return new SourceBreezometer(
                apiKey,
                daysToForecast,
                historicHours,
                hoursToForecast,
                latitude,
                longitude,
                radius);
        }

        private static final LazySingletonValue<Breezometer> _SINGLETON_VALUE_SourceType =
                new LazySingletonValue<>(
                        "sourceType",
                        "\"breezometer\"",
                        new TypeReference<Breezometer>() {});
    }
}
