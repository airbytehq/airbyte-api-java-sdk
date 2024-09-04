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


@JsonDeserialize(using = SourceGoogleAnalyticsDataApiFromValue._Deserializer.class)
public class SourceGoogleAnalyticsDataApiFromValue {

    @JsonValue
    private TypedObject value;
    
    private SourceGoogleAnalyticsDataApiFromValue(TypedObject value) {
        this.value = value;
    }

    public static SourceGoogleAnalyticsDataApiFromValue of(SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterInt64Value value) {
        Utils.checkNotNull(value, "value");
        return new SourceGoogleAnalyticsDataApiFromValue(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterInt64Value>(){}));
    }

    public static SourceGoogleAnalyticsDataApiFromValue of(SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterDoubleValue value) {
        Utils.checkNotNull(value, "value");
        return new SourceGoogleAnalyticsDataApiFromValue(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterDoubleValue>(){}));
    }
    
    /**
     * Returns an instance of one of these types:
     * <ul>
     * <li>{@code com.airbyte.api.models.shared.SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterInt64Value}</li>
     * <li>{@code com.airbyte.api.models.shared.SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterDoubleValue}</li>
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
        SourceGoogleAnalyticsDataApiFromValue other = (SourceGoogleAnalyticsDataApiFromValue) o;
        return Objects.deepEquals(this.value.value(), other.value.value()); 
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(value.value());
    }
    
    @SuppressWarnings("serial")
    public static final class _Deserializer extends OneOfDeserializer<SourceGoogleAnalyticsDataApiFromValue> {

        public _Deserializer() {
            super(SourceGoogleAnalyticsDataApiFromValue.class, false,
                  TypeReferenceWithShape.of(new TypeReference<com.airbyte.api.models.shared.SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterDoubleValue>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<com.airbyte.api.models.shared.SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayMetricFilterInt64Value>() {}, JsonShape.DEFAULT));
        }
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceGoogleAnalyticsDataApiFromValue.class,
                "value", value);
    }
 
}
