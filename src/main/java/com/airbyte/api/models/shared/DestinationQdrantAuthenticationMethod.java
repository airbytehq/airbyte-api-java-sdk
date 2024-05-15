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
 * DestinationQdrantAuthenticationMethod - Method to authenticate with the Qdrant Instance
 */

@JsonDeserialize(using = DestinationQdrantAuthenticationMethod._Deserializer.class)
public class DestinationQdrantAuthenticationMethod {

    @com.fasterxml.jackson.annotation.JsonValue
    private TypedObject value;
    
    private DestinationQdrantAuthenticationMethod(TypedObject value) {
        this.value = value;
    }

    public static DestinationQdrantAuthenticationMethod of(ApiKeyAuth value) {
        Utils.checkNotNull(value, "value");
        return new DestinationQdrantAuthenticationMethod(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<ApiKeyAuth>(){}));
    }

    public static DestinationQdrantAuthenticationMethod of(DestinationQdrantNoAuth value) {
        Utils.checkNotNull(value, "value");
        return new DestinationQdrantAuthenticationMethod(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<DestinationQdrantNoAuth>(){}));
    }
    
    /**
     * Returns an instance of one of these types:
     * <ul>
     * <li>{@code ApiKeyAuth}</li>
     * <li>{@code DestinationQdrantNoAuth}</li>
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
        DestinationQdrantAuthenticationMethod other = (DestinationQdrantAuthenticationMethod) o;
        return java.util.Objects.deepEquals(this.value.value(), other.value.value()); 
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(value.value());
    }
    
    @SuppressWarnings("serial")
    public static final class _Deserializer extends com.airbyte.api.utils.OneOfDeserializer<DestinationQdrantAuthenticationMethod> {

        public _Deserializer() {
            super(DestinationQdrantAuthenticationMethod.class,
                  Utils.TypeReferenceWithShape.of(new TypeReference<ApiKeyAuth>() {}, Utils.JsonShape.DEFAULT),
                  Utils.TypeReferenceWithShape.of(new TypeReference<DestinationQdrantNoAuth>() {}, Utils.JsonShape.DEFAULT));
        }
    }
    
    @Override
    public String toString() {
        return Utils.toString(DestinationQdrantAuthenticationMethod.class,
                "value", value);
    }
 
}
