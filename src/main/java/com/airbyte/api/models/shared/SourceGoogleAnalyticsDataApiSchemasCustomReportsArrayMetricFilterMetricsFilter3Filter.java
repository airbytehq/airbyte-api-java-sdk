/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;


import com.airbyte.api.utils.OneOfDeserializer;
import com.airbyte.api.utils.TypedObject;
import com.airbyte.api.utils.Utils.JsonShape;
import com.airbyte.api.utils.Utils.TypeReferenceWithShape;
import com.airbyte.api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;


@JsonDeserialize(using = SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterMetricsFilter3Filter._Deserializer.class)
public class SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterMetricsFilter3Filter {

    @JsonValue
    private TypedObject value;
    
    private SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterMetricsFilter3Filter(TypedObject value) {
        this.value = value;
    }

    public static SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterMetricsFilter3Filter of(SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterMetricsFilter3StringFilter value) {
        Utils.checkNotNull(value, "value");
        return new SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterMetricsFilter3Filter(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterMetricsFilter3StringFilter>(){}));
    }

    public static SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterMetricsFilter3Filter of(SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterMetricsFilter3InListFilter value) {
        Utils.checkNotNull(value, "value");
        return new SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterMetricsFilter3Filter(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterMetricsFilter3InListFilter>(){}));
    }

    public static SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterMetricsFilter3Filter of(SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterMetricsFilter3NumericFilter value) {
        Utils.checkNotNull(value, "value");
        return new SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterMetricsFilter3Filter(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterMetricsFilter3NumericFilter>(){}));
    }

    public static SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterMetricsFilter3Filter of(SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterMetricsFilter3BetweenFilter value) {
        Utils.checkNotNull(value, "value");
        return new SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterMetricsFilter3Filter(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterMetricsFilter3BetweenFilter>(){}));
    }
    
    /**
     * Returns an instance of one of these types:
     * <ul>
     * <li>{@code com.airbyte.api.models.shared.SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterMetricsFilter3StringFilter}</li>
     * <li>{@code com.airbyte.api.models.shared.SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterMetricsFilter3InListFilter}</li>
     * <li>{@code com.airbyte.api.models.shared.SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterMetricsFilter3NumericFilter}</li>
     * <li>{@code com.airbyte.api.models.shared.SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterMetricsFilter3BetweenFilter}</li>
     * </ul>
     * 
     * <p>Use {@code instanceof} to determine what type is returned. For example:
     * 
     * <pre>
     * if (obj.value() instanceof String) {
     *     String answer = (String) obj.value();
     *     System.out.println("answer=" + answer);
     * }
     * </pre>
     * 
     * @return value of oneOf type
     **/ 
    public java.lang.Object value() {
        return value.value();
    }    
    
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterMetricsFilter3Filter other = (SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterMetricsFilter3Filter) o;
        return Objects.deepEquals(this.value.value(), other.value.value()); 
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(value.value());
    }
    
    @SuppressWarnings("serial")
    public static final class _Deserializer extends OneOfDeserializer<SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterMetricsFilter3Filter> {

        public _Deserializer() {
            super(SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterMetricsFilter3Filter.class, false,
                  TypeReferenceWithShape.of(new TypeReference<com.airbyte.api.models.shared.SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterMetricsFilter3StringFilter>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<com.airbyte.api.models.shared.SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterMetricsFilter3BetweenFilter>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<com.airbyte.api.models.shared.SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterMetricsFilter3NumericFilter>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<com.airbyte.api.models.shared.SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterMetricsFilter3InListFilter>() {}, JsonShape.DEFAULT));
        }
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterMetricsFilter3Filter.class,
                "value", value);
    }
 
}
