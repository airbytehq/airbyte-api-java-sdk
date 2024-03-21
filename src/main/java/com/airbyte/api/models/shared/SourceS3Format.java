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
 * SourceS3Format - The configuration options that are used to alter how to read incoming files that deviate from the standard formatting.
 */

@JsonDeserialize(using = SourceS3Format._Deserializer.class)
public class SourceS3Format {

    @com.fasterxml.jackson.annotation.JsonValue
    private TypedObject value;
    
    private SourceS3Format(TypedObject value) {
        this.value = value;
    }

    public static SourceS3Format of(SourceS3AvroFormat value) {
        Utils.checkNotNull(value, "value");
        return new SourceS3Format(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<SourceS3AvroFormat>(){}));
    }

    public static SourceS3Format of(SourceS3CSVFormat value) {
        Utils.checkNotNull(value, "value");
        return new SourceS3Format(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<SourceS3CSVFormat>(){}));
    }

    public static SourceS3Format of(SourceS3JsonlFormat value) {
        Utils.checkNotNull(value, "value");
        return new SourceS3Format(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<SourceS3JsonlFormat>(){}));
    }

    public static SourceS3Format of(SourceS3ParquetFormat value) {
        Utils.checkNotNull(value, "value");
        return new SourceS3Format(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<SourceS3ParquetFormat>(){}));
    }

    public static SourceS3Format of(SourceS3DocumentFileTypeFormatExperimental value) {
        Utils.checkNotNull(value, "value");
        return new SourceS3Format(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<SourceS3DocumentFileTypeFormatExperimental>(){}));
    }
    
    /**
     * Returns an instance of one of these types:
     * <ul>
     * <li>{@code SourceS3AvroFormat}</li>
     * <li>{@code SourceS3CSVFormat}</li>
     * <li>{@code SourceS3JsonlFormat}</li>
     * <li>{@code SourceS3ParquetFormat}</li>
     * <li>{@code SourceS3DocumentFileTypeFormatExperimental}</li>
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
        SourceS3Format other = (SourceS3Format) o;
        return java.util.Objects.deepEquals(this.value.value(), other.value.value()); 
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(value.value());
    }
    
    @SuppressWarnings("serial")
    public static final class _Deserializer extends com.airbyte.api.utils.OneOfDeserializer<SourceS3Format> {

        public _Deserializer() {
            super(SourceS3Format.class,
                  Utils.TypeReferenceWithShape.of(new TypeReference<SourceS3AvroFormat>() {}, Utils.JsonShape.DEFAULT),
                  Utils.TypeReferenceWithShape.of(new TypeReference<SourceS3CSVFormat>() {}, Utils.JsonShape.DEFAULT),
                  Utils.TypeReferenceWithShape.of(new TypeReference<SourceS3JsonlFormat>() {}, Utils.JsonShape.DEFAULT),
                  Utils.TypeReferenceWithShape.of(new TypeReference<SourceS3ParquetFormat>() {}, Utils.JsonShape.DEFAULT),
                  Utils.TypeReferenceWithShape.of(new TypeReference<SourceS3DocumentFileTypeFormatExperimental>() {}, Utils.JsonShape.DEFAULT));
        }
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceS3Format.class,
                "value", value);
    }
 
}
