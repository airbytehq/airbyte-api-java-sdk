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


@JsonDeserialize(using = SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayDimensionFilterDimensionsFilter1Filter._Deserializer.class)
public class SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayDimensionFilterDimensionsFilter1Filter {

    @com.fasterxml.jackson.annotation.JsonValue
    private TypedObject value;
    
    private SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayDimensionFilterDimensionsFilter1Filter(TypedObject value) {
        this.value = value;
    }

    public static SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayDimensionFilterDimensionsFilter1Filter of(SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayStringFilter value) {
        Utils.checkNotNull(value, "value");
        return new SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayDimensionFilterDimensionsFilter1Filter(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayStringFilter>(){}));
    }

    public static SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayDimensionFilterDimensionsFilter1Filter of(SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayInListFilter value) {
        Utils.checkNotNull(value, "value");
        return new SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayDimensionFilterDimensionsFilter1Filter(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayInListFilter>(){}));
    }

    public static SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayDimensionFilterDimensionsFilter1Filter of(SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayNumericFilter value) {
        Utils.checkNotNull(value, "value");
        return new SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayDimensionFilterDimensionsFilter1Filter(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayNumericFilter>(){}));
    }

    public static SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayDimensionFilterDimensionsFilter1Filter of(SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayBetweenFilter value) {
        Utils.checkNotNull(value, "value");
        return new SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayDimensionFilterDimensionsFilter1Filter(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayBetweenFilter>(){}));
    }
    
    /**
     * Returns an instance of one of these types:
     * <ul>
     * <li>{@code SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayStringFilter}</li>
     * <li>{@code SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayInListFilter}</li>
     * <li>{@code SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayNumericFilter}</li>
     * <li>{@code SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayBetweenFilter}</li>
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
        SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayDimensionFilterDimensionsFilter1Filter other = (SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayDimensionFilterDimensionsFilter1Filter) o;
        return java.util.Objects.deepEquals(this.value.value(), other.value.value()); 
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(value.value());
    }
    
    @SuppressWarnings("serial")
    public static final class _Deserializer extends com.airbyte.api.utils.OneOfDeserializer<SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayDimensionFilterDimensionsFilter1Filter> {

        public _Deserializer() {
            super(SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayDimensionFilterDimensionsFilter1Filter.class,
                  Utils.TypeReferenceWithShape.of(new TypeReference<SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayStringFilter>() {}, Utils.JsonShape.DEFAULT),
                  Utils.TypeReferenceWithShape.of(new TypeReference<SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayInListFilter>() {}, Utils.JsonShape.DEFAULT),
                  Utils.TypeReferenceWithShape.of(new TypeReference<SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayNumericFilter>() {}, Utils.JsonShape.DEFAULT),
                  Utils.TypeReferenceWithShape.of(new TypeReference<SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayBetweenFilter>() {}, Utils.JsonShape.DEFAULT));
        }
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayDimensionFilterDimensionsFilter1Filter.class,
                "value", value);
    }
 
}
