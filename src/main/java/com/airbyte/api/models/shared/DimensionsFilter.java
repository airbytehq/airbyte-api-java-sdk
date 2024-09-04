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
 * DimensionsFilter - Dimensions filter
 */

@JsonDeserialize(using = DimensionsFilter._Deserializer.class)
public class DimensionsFilter {

    @JsonValue
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
     * <li>{@code com.airbyte.api.models.shared.AndGroup}</li>
     * <li>{@code com.airbyte.api.models.shared.OrGroup}</li>
     * <li>{@code com.airbyte.api.models.shared.NotExpression}</li>
     * <li>{@code com.airbyte.api.models.shared.Filter}</li>
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
        return Objects.deepEquals(this.value.value(), other.value.value()); 
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(value.value());
    }
    
    @SuppressWarnings("serial")
    public static final class _Deserializer extends OneOfDeserializer<DimensionsFilter> {

        public _Deserializer() {
            super(DimensionsFilter.class, false,
                  TypeReferenceWithShape.of(new TypeReference<com.airbyte.api.models.shared.Filter>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<com.airbyte.api.models.shared.NotExpression>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<com.airbyte.api.models.shared.OrGroup>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<com.airbyte.api.models.shared.AndGroup>() {}, JsonShape.DEFAULT));
        }
    }
    
    @Override
    public String toString() {
        return Utils.toString(DimensionsFilter.class,
                "value", value);
    }
 
}
