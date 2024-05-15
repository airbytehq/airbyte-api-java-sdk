/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.airbyte.api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;

import java.time.OffsetDateTime;
import java.time.LocalDate;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.airbyte.api.utils.TypedObject;
import com.airbyte.api.utils.Utils.JsonShape;

/**
 * MetricsFilter - Metrics filter
 */

@JsonDeserialize(using = MetricsFilter._Deserializer.class)
public class MetricsFilter {

    @com.fasterxml.jackson.annotation.JsonValue
    private TypedObject value;
    
    private MetricsFilter(TypedObject value) {
        this.value = value;
    }

    public static MetricsFilter of(SourceGoogleAnalyticsDataApiAndGroup value) {
        Utils.checkNotNull(value, "value");
        return new MetricsFilter(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<SourceGoogleAnalyticsDataApiAndGroup>(){}));
    }

    public static MetricsFilter of(SourceGoogleAnalyticsDataApiOrGroup value) {
        Utils.checkNotNull(value, "value");
        return new MetricsFilter(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<SourceGoogleAnalyticsDataApiOrGroup>(){}));
    }

    public static MetricsFilter of(SourceGoogleAnalyticsDataApiNotExpression value) {
        Utils.checkNotNull(value, "value");
        return new MetricsFilter(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<SourceGoogleAnalyticsDataApiNotExpression>(){}));
    }

    public static MetricsFilter of(SourceGoogleAnalyticsDataApiFilter value) {
        Utils.checkNotNull(value, "value");
        return new MetricsFilter(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<SourceGoogleAnalyticsDataApiFilter>(){}));
    }
    
    /**
     * Returns an instance of one of these types:
     * <ul>
     * <li>{@code SourceGoogleAnalyticsDataApiAndGroup}</li>
     * <li>{@code SourceGoogleAnalyticsDataApiOrGroup}</li>
     * <li>{@code SourceGoogleAnalyticsDataApiNotExpression}</li>
     * <li>{@code SourceGoogleAnalyticsDataApiFilter}</li>
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
        MetricsFilter other = (MetricsFilter) o;
        return java.util.Objects.deepEquals(this.value.value(), other.value.value()); 
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(value.value());
    }
    
    @SuppressWarnings("serial")
    public static final class _Deserializer extends com.airbyte.api.utils.OneOfDeserializer<MetricsFilter> {

        public _Deserializer() {
            super(MetricsFilter.class,
                  Utils.TypeReferenceWithShape.of(new TypeReference<SourceGoogleAnalyticsDataApiAndGroup>() {}, Utils.JsonShape.DEFAULT),
                  Utils.TypeReferenceWithShape.of(new TypeReference<SourceGoogleAnalyticsDataApiOrGroup>() {}, Utils.JsonShape.DEFAULT),
                  Utils.TypeReferenceWithShape.of(new TypeReference<SourceGoogleAnalyticsDataApiNotExpression>() {}, Utils.JsonShape.DEFAULT),
                  Utils.TypeReferenceWithShape.of(new TypeReference<SourceGoogleAnalyticsDataApiFilter>() {}, Utils.JsonShape.DEFAULT));
        }
    }
    
    @Override
    public String toString() {
        return Utils.toString(MetricsFilter.class,
                "value", value);
    }
 
}
