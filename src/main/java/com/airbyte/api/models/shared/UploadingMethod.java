/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.airbyte.api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonFormat;
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
 * UploadingMethod - The way data will be uploaded to Redshift.
 */

@JsonDeserialize(using = UploadingMethod._Deserializer.class)
public class UploadingMethod {

    @com.fasterxml.jackson.annotation.JsonValue
    private TypedObject value;
    
    private UploadingMethod(TypedObject value) {
        this.value = value;
    }

    public static UploadingMethod of(AWSS3Staging value) {
        Utils.checkNotNull(value, "value");
        return new UploadingMethod(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<AWSS3Staging>(){}));
    }

    public static UploadingMethod of(Standard value) {
        Utils.checkNotNull(value, "value");
        return new UploadingMethod(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<Standard>(){}));
    }
    
    /**
     * Returns an instance of one of these types:
     * <ul>
     * <li>{@code AWSS3Staging}</li>
     * <li>{@code Standard}</li>
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
        UploadingMethod other = (UploadingMethod) o;
        return java.util.Objects.deepEquals(this.value.value(), other.value.value()); 
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(value.value());
    }
    
    @SuppressWarnings("serial")
    public static final class _Deserializer extends com.airbyte.api.utils.OneOfDeserializer<UploadingMethod> {

        public _Deserializer() {
            super(UploadingMethod.class,
                  Utils.TypeReferenceWithShape.of(new TypeReference<AWSS3Staging>() {}, Utils.JsonShape.DEFAULT),
                  Utils.TypeReferenceWithShape.of(new TypeReference<Standard>() {}, Utils.JsonShape.DEFAULT));
        }
    }
    
    @Override
    public String toString() {
        return Utils.toString(UploadingMethod.class,
                "value", value);
    }
 
}
