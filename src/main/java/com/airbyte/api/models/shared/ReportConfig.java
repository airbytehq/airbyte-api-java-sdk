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
import java.time.LocalDate;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

/**
 * ReportConfig
 * 
 * <p>Config for custom report
 */
public class ReportConfig {

    /**
     * List of types of attribution for the conversion report
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("attribution_types")
    private Optional<? extends List<SourcePinterestValidEnums>> attributionTypes;

    /**
     * Number of days to use as the conversion attribution window for a pin click action.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("click_window_days")
    private Optional<? extends ClickWindowDays> clickWindowDays;

    /**
     * A list of chosen columns
     */
    @JsonProperty("columns")
    private List<SourcePinterestSchemasValidEnums> columns;

    /**
     * The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event..
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("conversion_report_time")
    private Optional<? extends ConversionReportTime> conversionReportTime;

    /**
     * Number of days to use as the conversion attribution window for an engagement action.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("engagement_window_days")
    private Optional<? extends EngagementWindowDays> engagementWindowDays;

    /**
     * Chosen granularity for API
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("granularity")
    private Optional<? extends Granularity> granularity;

    /**
     * Chosen level for API
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("level")
    private Optional<? extends SourcePinterestLevel> level;

    /**
     * The name value of report
     */
    @JsonProperty("name")
    private String name;

    /**
     * A date in the format YYYY-MM-DD. If you have not set a date, it would be defaulted to latest allowed date by report api (913 days from today).
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("start_date")
    private Optional<LocalDate> startDate;

    /**
     * Number of days to use as the conversion attribution window for a view action.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("view_window_days")
    private Optional<? extends ViewWindowDays> viewWindowDays;

    @JsonCreator
    public ReportConfig(
            @JsonProperty("attribution_types") Optional<? extends List<SourcePinterestValidEnums>> attributionTypes,
            @JsonProperty("click_window_days") Optional<? extends ClickWindowDays> clickWindowDays,
            @JsonProperty("columns") List<SourcePinterestSchemasValidEnums> columns,
            @JsonProperty("conversion_report_time") Optional<? extends ConversionReportTime> conversionReportTime,
            @JsonProperty("engagement_window_days") Optional<? extends EngagementWindowDays> engagementWindowDays,
            @JsonProperty("granularity") Optional<? extends Granularity> granularity,
            @JsonProperty("level") Optional<? extends SourcePinterestLevel> level,
            @JsonProperty("name") String name,
            @JsonProperty("start_date") Optional<LocalDate> startDate,
            @JsonProperty("view_window_days") Optional<? extends ViewWindowDays> viewWindowDays) {
        Utils.checkNotNull(attributionTypes, "attributionTypes");
        Utils.checkNotNull(clickWindowDays, "clickWindowDays");
        Utils.checkNotNull(columns, "columns");
        Utils.checkNotNull(conversionReportTime, "conversionReportTime");
        Utils.checkNotNull(engagementWindowDays, "engagementWindowDays");
        Utils.checkNotNull(granularity, "granularity");
        Utils.checkNotNull(level, "level");
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(startDate, "startDate");
        Utils.checkNotNull(viewWindowDays, "viewWindowDays");
        this.attributionTypes = attributionTypes;
        this.clickWindowDays = clickWindowDays;
        this.columns = columns;
        this.conversionReportTime = conversionReportTime;
        this.engagementWindowDays = engagementWindowDays;
        this.granularity = granularity;
        this.level = level;
        this.name = name;
        this.startDate = startDate;
        this.viewWindowDays = viewWindowDays;
    }
    
    public ReportConfig(
            List<SourcePinterestSchemasValidEnums> columns,
            String name) {
        this(Optional.empty(), Optional.empty(), columns, Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), name, Optional.empty(), Optional.empty());
    }

    /**
     * List of types of attribution for the conversion report
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<SourcePinterestValidEnums>> attributionTypes() {
        return (Optional<List<SourcePinterestValidEnums>>) attributionTypes;
    }

    /**
     * Number of days to use as the conversion attribution window for a pin click action.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<ClickWindowDays> clickWindowDays() {
        return (Optional<ClickWindowDays>) clickWindowDays;
    }

    /**
     * A list of chosen columns
     */
    @JsonIgnore
    public List<SourcePinterestSchemasValidEnums> columns() {
        return columns;
    }

    /**
     * The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event..
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<ConversionReportTime> conversionReportTime() {
        return (Optional<ConversionReportTime>) conversionReportTime;
    }

    /**
     * Number of days to use as the conversion attribution window for an engagement action.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<EngagementWindowDays> engagementWindowDays() {
        return (Optional<EngagementWindowDays>) engagementWindowDays;
    }

    /**
     * Chosen granularity for API
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Granularity> granularity() {
        return (Optional<Granularity>) granularity;
    }

    /**
     * Chosen level for API
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<SourcePinterestLevel> level() {
        return (Optional<SourcePinterestLevel>) level;
    }

    /**
     * The name value of report
     */
    @JsonIgnore
    public String name() {
        return name;
    }

    /**
     * A date in the format YYYY-MM-DD. If you have not set a date, it would be defaulted to latest allowed date by report api (913 days from today).
     */
    @JsonIgnore
    public Optional<LocalDate> startDate() {
        return startDate;
    }

    /**
     * Number of days to use as the conversion attribution window for a view action.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<ViewWindowDays> viewWindowDays() {
        return (Optional<ViewWindowDays>) viewWindowDays;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    /**
     * List of types of attribution for the conversion report
     */
    public ReportConfig withAttributionTypes(List<SourcePinterestValidEnums> attributionTypes) {
        Utils.checkNotNull(attributionTypes, "attributionTypes");
        this.attributionTypes = Optional.ofNullable(attributionTypes);
        return this;
    }

    /**
     * List of types of attribution for the conversion report
     */
    public ReportConfig withAttributionTypes(Optional<? extends List<SourcePinterestValidEnums>> attributionTypes) {
        Utils.checkNotNull(attributionTypes, "attributionTypes");
        this.attributionTypes = attributionTypes;
        return this;
    }

    /**
     * Number of days to use as the conversion attribution window for a pin click action.
     */
    public ReportConfig withClickWindowDays(ClickWindowDays clickWindowDays) {
        Utils.checkNotNull(clickWindowDays, "clickWindowDays");
        this.clickWindowDays = Optional.ofNullable(clickWindowDays);
        return this;
    }

    /**
     * Number of days to use as the conversion attribution window for a pin click action.
     */
    public ReportConfig withClickWindowDays(Optional<? extends ClickWindowDays> clickWindowDays) {
        Utils.checkNotNull(clickWindowDays, "clickWindowDays");
        this.clickWindowDays = clickWindowDays;
        return this;
    }

    /**
     * A list of chosen columns
     */
    public ReportConfig withColumns(List<SourcePinterestSchemasValidEnums> columns) {
        Utils.checkNotNull(columns, "columns");
        this.columns = columns;
        return this;
    }

    /**
     * The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event..
     */
    public ReportConfig withConversionReportTime(ConversionReportTime conversionReportTime) {
        Utils.checkNotNull(conversionReportTime, "conversionReportTime");
        this.conversionReportTime = Optional.ofNullable(conversionReportTime);
        return this;
    }

    /**
     * The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event..
     */
    public ReportConfig withConversionReportTime(Optional<? extends ConversionReportTime> conversionReportTime) {
        Utils.checkNotNull(conversionReportTime, "conversionReportTime");
        this.conversionReportTime = conversionReportTime;
        return this;
    }

    /**
     * Number of days to use as the conversion attribution window for an engagement action.
     */
    public ReportConfig withEngagementWindowDays(EngagementWindowDays engagementWindowDays) {
        Utils.checkNotNull(engagementWindowDays, "engagementWindowDays");
        this.engagementWindowDays = Optional.ofNullable(engagementWindowDays);
        return this;
    }

    /**
     * Number of days to use as the conversion attribution window for an engagement action.
     */
    public ReportConfig withEngagementWindowDays(Optional<? extends EngagementWindowDays> engagementWindowDays) {
        Utils.checkNotNull(engagementWindowDays, "engagementWindowDays");
        this.engagementWindowDays = engagementWindowDays;
        return this;
    }

    /**
     * Chosen granularity for API
     */
    public ReportConfig withGranularity(Granularity granularity) {
        Utils.checkNotNull(granularity, "granularity");
        this.granularity = Optional.ofNullable(granularity);
        return this;
    }

    /**
     * Chosen granularity for API
     */
    public ReportConfig withGranularity(Optional<? extends Granularity> granularity) {
        Utils.checkNotNull(granularity, "granularity");
        this.granularity = granularity;
        return this;
    }

    /**
     * Chosen level for API
     */
    public ReportConfig withLevel(SourcePinterestLevel level) {
        Utils.checkNotNull(level, "level");
        this.level = Optional.ofNullable(level);
        return this;
    }

    /**
     * Chosen level for API
     */
    public ReportConfig withLevel(Optional<? extends SourcePinterestLevel> level) {
        Utils.checkNotNull(level, "level");
        this.level = level;
        return this;
    }

    /**
     * The name value of report
     */
    public ReportConfig withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    /**
     * A date in the format YYYY-MM-DD. If you have not set a date, it would be defaulted to latest allowed date by report api (913 days from today).
     */
    public ReportConfig withStartDate(LocalDate startDate) {
        Utils.checkNotNull(startDate, "startDate");
        this.startDate = Optional.ofNullable(startDate);
        return this;
    }

    /**
     * A date in the format YYYY-MM-DD. If you have not set a date, it would be defaulted to latest allowed date by report api (913 days from today).
     */
    public ReportConfig withStartDate(Optional<LocalDate> startDate) {
        Utils.checkNotNull(startDate, "startDate");
        this.startDate = startDate;
        return this;
    }

    /**
     * Number of days to use as the conversion attribution window for a view action.
     */
    public ReportConfig withViewWindowDays(ViewWindowDays viewWindowDays) {
        Utils.checkNotNull(viewWindowDays, "viewWindowDays");
        this.viewWindowDays = Optional.ofNullable(viewWindowDays);
        return this;
    }

    /**
     * Number of days to use as the conversion attribution window for a view action.
     */
    public ReportConfig withViewWindowDays(Optional<? extends ViewWindowDays> viewWindowDays) {
        Utils.checkNotNull(viewWindowDays, "viewWindowDays");
        this.viewWindowDays = viewWindowDays;
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
        ReportConfig other = (ReportConfig) o;
        return 
            Objects.deepEquals(this.attributionTypes, other.attributionTypes) &&
            Objects.deepEquals(this.clickWindowDays, other.clickWindowDays) &&
            Objects.deepEquals(this.columns, other.columns) &&
            Objects.deepEquals(this.conversionReportTime, other.conversionReportTime) &&
            Objects.deepEquals(this.engagementWindowDays, other.engagementWindowDays) &&
            Objects.deepEquals(this.granularity, other.granularity) &&
            Objects.deepEquals(this.level, other.level) &&
            Objects.deepEquals(this.name, other.name) &&
            Objects.deepEquals(this.startDate, other.startDate) &&
            Objects.deepEquals(this.viewWindowDays, other.viewWindowDays);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            attributionTypes,
            clickWindowDays,
            columns,
            conversionReportTime,
            engagementWindowDays,
            granularity,
            level,
            name,
            startDate,
            viewWindowDays);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ReportConfig.class,
                "attributionTypes", attributionTypes,
                "clickWindowDays", clickWindowDays,
                "columns", columns,
                "conversionReportTime", conversionReportTime,
                "engagementWindowDays", engagementWindowDays,
                "granularity", granularity,
                "level", level,
                "name", name,
                "startDate", startDate,
                "viewWindowDays", viewWindowDays);
    }
    
    public final static class Builder {
 
        private Optional<? extends List<SourcePinterestValidEnums>> attributionTypes = Optional.empty();
 
        private Optional<? extends ClickWindowDays> clickWindowDays;
 
        private List<SourcePinterestSchemasValidEnums> columns;
 
        private Optional<? extends ConversionReportTime> conversionReportTime;
 
        private Optional<? extends EngagementWindowDays> engagementWindowDays;
 
        private Optional<? extends Granularity> granularity;
 
        private Optional<? extends SourcePinterestLevel> level;
 
        private String name;
 
        private Optional<LocalDate> startDate = Optional.empty();
 
        private Optional<? extends ViewWindowDays> viewWindowDays;
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * List of types of attribution for the conversion report
         */
        public Builder attributionTypes(List<SourcePinterestValidEnums> attributionTypes) {
            Utils.checkNotNull(attributionTypes, "attributionTypes");
            this.attributionTypes = Optional.ofNullable(attributionTypes);
            return this;
        }

        /**
         * List of types of attribution for the conversion report
         */
        public Builder attributionTypes(Optional<? extends List<SourcePinterestValidEnums>> attributionTypes) {
            Utils.checkNotNull(attributionTypes, "attributionTypes");
            this.attributionTypes = attributionTypes;
            return this;
        }

        /**
         * Number of days to use as the conversion attribution window for a pin click action.
         */
        public Builder clickWindowDays(ClickWindowDays clickWindowDays) {
            Utils.checkNotNull(clickWindowDays, "clickWindowDays");
            this.clickWindowDays = Optional.ofNullable(clickWindowDays);
            return this;
        }

        /**
         * Number of days to use as the conversion attribution window for a pin click action.
         */
        public Builder clickWindowDays(Optional<? extends ClickWindowDays> clickWindowDays) {
            Utils.checkNotNull(clickWindowDays, "clickWindowDays");
            this.clickWindowDays = clickWindowDays;
            return this;
        }

        /**
         * A list of chosen columns
         */
        public Builder columns(List<SourcePinterestSchemasValidEnums> columns) {
            Utils.checkNotNull(columns, "columns");
            this.columns = columns;
            return this;
        }

        /**
         * The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event..
         */
        public Builder conversionReportTime(ConversionReportTime conversionReportTime) {
            Utils.checkNotNull(conversionReportTime, "conversionReportTime");
            this.conversionReportTime = Optional.ofNullable(conversionReportTime);
            return this;
        }

        /**
         * The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event..
         */
        public Builder conversionReportTime(Optional<? extends ConversionReportTime> conversionReportTime) {
            Utils.checkNotNull(conversionReportTime, "conversionReportTime");
            this.conversionReportTime = conversionReportTime;
            return this;
        }

        /**
         * Number of days to use as the conversion attribution window for an engagement action.
         */
        public Builder engagementWindowDays(EngagementWindowDays engagementWindowDays) {
            Utils.checkNotNull(engagementWindowDays, "engagementWindowDays");
            this.engagementWindowDays = Optional.ofNullable(engagementWindowDays);
            return this;
        }

        /**
         * Number of days to use as the conversion attribution window for an engagement action.
         */
        public Builder engagementWindowDays(Optional<? extends EngagementWindowDays> engagementWindowDays) {
            Utils.checkNotNull(engagementWindowDays, "engagementWindowDays");
            this.engagementWindowDays = engagementWindowDays;
            return this;
        }

        /**
         * Chosen granularity for API
         */
        public Builder granularity(Granularity granularity) {
            Utils.checkNotNull(granularity, "granularity");
            this.granularity = Optional.ofNullable(granularity);
            return this;
        }

        /**
         * Chosen granularity for API
         */
        public Builder granularity(Optional<? extends Granularity> granularity) {
            Utils.checkNotNull(granularity, "granularity");
            this.granularity = granularity;
            return this;
        }

        /**
         * Chosen level for API
         */
        public Builder level(SourcePinterestLevel level) {
            Utils.checkNotNull(level, "level");
            this.level = Optional.ofNullable(level);
            return this;
        }

        /**
         * Chosen level for API
         */
        public Builder level(Optional<? extends SourcePinterestLevel> level) {
            Utils.checkNotNull(level, "level");
            this.level = level;
            return this;
        }

        /**
         * The name value of report
         */
        public Builder name(String name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
            return this;
        }

        /**
         * A date in the format YYYY-MM-DD. If you have not set a date, it would be defaulted to latest allowed date by report api (913 days from today).
         */
        public Builder startDate(LocalDate startDate) {
            Utils.checkNotNull(startDate, "startDate");
            this.startDate = Optional.ofNullable(startDate);
            return this;
        }

        /**
         * A date in the format YYYY-MM-DD. If you have not set a date, it would be defaulted to latest allowed date by report api (913 days from today).
         */
        public Builder startDate(Optional<LocalDate> startDate) {
            Utils.checkNotNull(startDate, "startDate");
            this.startDate = startDate;
            return this;
        }

        /**
         * Number of days to use as the conversion attribution window for a view action.
         */
        public Builder viewWindowDays(ViewWindowDays viewWindowDays) {
            Utils.checkNotNull(viewWindowDays, "viewWindowDays");
            this.viewWindowDays = Optional.ofNullable(viewWindowDays);
            return this;
        }

        /**
         * Number of days to use as the conversion attribution window for a view action.
         */
        public Builder viewWindowDays(Optional<? extends ViewWindowDays> viewWindowDays) {
            Utils.checkNotNull(viewWindowDays, "viewWindowDays");
            this.viewWindowDays = viewWindowDays;
            return this;
        }
        
        public ReportConfig build() {
            if (clickWindowDays == null) {
                clickWindowDays = _SINGLETON_VALUE_ClickWindowDays.value();
            }
            if (conversionReportTime == null) {
                conversionReportTime = _SINGLETON_VALUE_ConversionReportTime.value();
            }
            if (engagementWindowDays == null) {
                engagementWindowDays = _SINGLETON_VALUE_EngagementWindowDays.value();
            }
            if (granularity == null) {
                granularity = _SINGLETON_VALUE_Granularity.value();
            }
            if (level == null) {
                level = _SINGLETON_VALUE_Level.value();
            }
            if (viewWindowDays == null) {
                viewWindowDays = _SINGLETON_VALUE_ViewWindowDays.value();
            }
            return new ReportConfig(
                attributionTypes,
                clickWindowDays,
                columns,
                conversionReportTime,
                engagementWindowDays,
                granularity,
                level,
                name,
                startDate,
                viewWindowDays);
        }

        private static final LazySingletonValue<Optional<? extends ClickWindowDays>> _SINGLETON_VALUE_ClickWindowDays =
                new LazySingletonValue<>(
                        "click_window_days",
                        "30",
                        new TypeReference<Optional<? extends ClickWindowDays>>() {});

        private static final LazySingletonValue<Optional<? extends ConversionReportTime>> _SINGLETON_VALUE_ConversionReportTime =
                new LazySingletonValue<>(
                        "conversion_report_time",
                        "\"TIME_OF_AD_ACTION\"",
                        new TypeReference<Optional<? extends ConversionReportTime>>() {});

        private static final LazySingletonValue<Optional<? extends EngagementWindowDays>> _SINGLETON_VALUE_EngagementWindowDays =
                new LazySingletonValue<>(
                        "engagement_window_days",
                        "[30]",
                        new TypeReference<Optional<? extends EngagementWindowDays>>() {});

        private static final LazySingletonValue<Optional<? extends Granularity>> _SINGLETON_VALUE_Granularity =
                new LazySingletonValue<>(
                        "granularity",
                        "\"TOTAL\"",
                        new TypeReference<Optional<? extends Granularity>>() {});

        private static final LazySingletonValue<Optional<? extends SourcePinterestLevel>> _SINGLETON_VALUE_Level =
                new LazySingletonValue<>(
                        "level",
                        "\"ADVERTISER\"",
                        new TypeReference<Optional<? extends SourcePinterestLevel>>() {});

        private static final LazySingletonValue<Optional<? extends ViewWindowDays>> _SINGLETON_VALUE_ViewWindowDays =
                new LazySingletonValue<>(
                        "view_window_days",
                        "[30]",
                        new TypeReference<Optional<? extends ViewWindowDays>>() {});
    }
}
