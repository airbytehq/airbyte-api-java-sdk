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

/**
 * MetricsFilter - Metrics filter
 */

@JsonDeserialize(using = MetricsFilter._Deserializer.class)
public class MetricsFilter {

    @JsonValue
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
     * <li>{@code com.airbyte.api.models.shared.SourceGoogleAnalyticsDataApiAndGroup}</li>
     * <li>{@code com.airbyte.api.models.shared.SourceGoogleAnalyticsDataApiOrGroup}</li>
     * <li>{@code com.airbyte.api.models.shared.SourceGoogleAnalyticsDataApiNotExpression}</li>
     * <li>{@code com.airbyte.api.models.shared.SourceGoogleAnalyticsDataApiFilter}</li>
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
        return Objects.deepEquals(this.value.value(), other.value.value()); 
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(value.value());
    }
    
    @SuppressWarnings("serial")
    public static final class _Deserializer extends OneOfDeserializer<MetricsFilter> {

        public _Deserializer() {
            super(MetricsFilter.class, false,
                  TypeReferenceWithShape.of(new TypeReference<com.airbyte.api.models.shared.SourceGoogleAnalyticsDataApiFilter>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<com.airbyte.api.models.shared.SourceGoogleAnalyticsDataApiNotExpression>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<com.airbyte.api.models.shared.SourceGoogleAnalyticsDataApiOrGroup>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<com.airbyte.api.models.shared.SourceGoogleAnalyticsDataApiAndGroup>() {}, JsonShape.DEFAULT));
        }
    }
    
    @Override
    public String toString() {
        return Utils.toString(MetricsFilter.class,
                "value", value);
    }
 
}
