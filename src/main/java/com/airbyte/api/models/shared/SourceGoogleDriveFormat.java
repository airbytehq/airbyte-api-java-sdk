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
 * SourceGoogleDriveFormat - The configuration options that are used to alter how to read incoming files that deviate from the standard formatting.
 */

@JsonDeserialize(using = SourceGoogleDriveFormat._Deserializer.class)
public class SourceGoogleDriveFormat {

    @com.fasterxml.jackson.annotation.JsonValue
    private TypedObject value;
    
    private SourceGoogleDriveFormat(TypedObject value) {
        this.value = value;
    }

    public static SourceGoogleDriveFormat of(SourceGoogleDriveAvroFormat value) {
        Utils.checkNotNull(value, "value");
        return new SourceGoogleDriveFormat(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<SourceGoogleDriveAvroFormat>(){}));
    }

    public static SourceGoogleDriveFormat of(SourceGoogleDriveCSVFormat value) {
        Utils.checkNotNull(value, "value");
        return new SourceGoogleDriveFormat(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<SourceGoogleDriveCSVFormat>(){}));
    }

    public static SourceGoogleDriveFormat of(SourceGoogleDriveJsonlFormat value) {
        Utils.checkNotNull(value, "value");
        return new SourceGoogleDriveFormat(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<SourceGoogleDriveJsonlFormat>(){}));
    }

    public static SourceGoogleDriveFormat of(SourceGoogleDriveParquetFormat value) {
        Utils.checkNotNull(value, "value");
        return new SourceGoogleDriveFormat(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<SourceGoogleDriveParquetFormat>(){}));
    }

    public static SourceGoogleDriveFormat of(SourceGoogleDriveDocumentFileTypeFormatExperimental value) {
        Utils.checkNotNull(value, "value");
        return new SourceGoogleDriveFormat(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<SourceGoogleDriveDocumentFileTypeFormatExperimental>(){}));
    }
    
    /**
     * Returns an instance of one of these types:
     * <ul>
     * <li>{@code SourceGoogleDriveAvroFormat}</li>
     * <li>{@code SourceGoogleDriveCSVFormat}</li>
     * <li>{@code SourceGoogleDriveJsonlFormat}</li>
     * <li>{@code SourceGoogleDriveParquetFormat}</li>
     * <li>{@code SourceGoogleDriveDocumentFileTypeFormatExperimental}</li>
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
        SourceGoogleDriveFormat other = (SourceGoogleDriveFormat) o;
        return java.util.Objects.deepEquals(this.value.value(), other.value.value()); 
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(value.value());
    }
    
    @SuppressWarnings("serial")
    public static final class _Deserializer extends com.airbyte.api.utils.OneOfDeserializer<SourceGoogleDriveFormat> {

        public _Deserializer() {
            super(SourceGoogleDriveFormat.class,
                  Utils.TypeReferenceWithShape.of(new TypeReference<SourceGoogleDriveAvroFormat>() {}, Utils.JsonShape.DEFAULT),
                  Utils.TypeReferenceWithShape.of(new TypeReference<SourceGoogleDriveCSVFormat>() {}, Utils.JsonShape.DEFAULT),
                  Utils.TypeReferenceWithShape.of(new TypeReference<SourceGoogleDriveJsonlFormat>() {}, Utils.JsonShape.DEFAULT),
                  Utils.TypeReferenceWithShape.of(new TypeReference<SourceGoogleDriveParquetFormat>() {}, Utils.JsonShape.DEFAULT),
                  Utils.TypeReferenceWithShape.of(new TypeReference<SourceGoogleDriveDocumentFileTypeFormatExperimental>() {}, Utils.JsonShape.DEFAULT));
        }
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceGoogleDriveFormat.class,
                "value", value);
    }
 
}
