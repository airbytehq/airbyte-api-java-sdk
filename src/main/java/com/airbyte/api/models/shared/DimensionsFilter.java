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
 * DimensionsFilter - Dimensions filter
 */

@JsonDeserialize(using = DimensionsFilter._Deserializer.class)
public class DimensionsFilter {

    @com.fasterxml.jackson.annotation.JsonValue
    private TypedObject value;
    
    private DimensionsFilter(TypedObject value) {
        this.value = value;
    }

    public static DimensionsFilter of(AndGroup value) {
        Utils.checkNotNull(value, "value");
        return new DimensionsFilter(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<AndGroup>(){}));
    }

    public static DimensionsFilter of(OrGroup value) {
        Utils.checkNotNull(value, "value");
        return new DimensionsFilter(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<OrGroup>(){}));
    }

    public static DimensionsFilter of(NotExpression value) {
        Utils.checkNotNull(value, "value");
        return new DimensionsFilter(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<NotExpression>(){}));
    }

    public static DimensionsFilter of(Filter value) {
        Utils.checkNotNull(value, "value");
        return new DimensionsFilter(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<Filter>(){}));
    }
    
    /**
     * Returns an instance of one of these types:
     * <ul>
     * <li>{@code AndGroup}</li>
     * <li>{@code OrGroup}</li>
     * <li>{@code NotExpression}</li>
     * <li>{@code Filter}</li>
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
        DimensionsFilter other = (DimensionsFilter) o;
        return java.util.Objects.deepEquals(this.value.value(), other.value.value()); 
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(value.value());
    }
    
    @SuppressWarnings("serial")
    public static final class _Deserializer extends com.airbyte.api.utils.OneOfDeserializer<DimensionsFilter> {

        public _Deserializer() {
            super(DimensionsFilter.class,
                  Utils.TypeReferenceWithShape.of(new TypeReference<AndGroup>() {}, Utils.JsonShape.DEFAULT),
                  Utils.TypeReferenceWithShape.of(new TypeReference<OrGroup>() {}, Utils.JsonShape.DEFAULT),
                  Utils.TypeReferenceWithShape.of(new TypeReference<NotExpression>() {}, Utils.JsonShape.DEFAULT),
                  Utils.TypeReferenceWithShape.of(new TypeReference<Filter>() {}, Utils.JsonShape.DEFAULT));
        }
    }
    
    @Override
    public String toString() {
        return Utils.toString(DimensionsFilter.class,
                "value", value);
    }
 
}
