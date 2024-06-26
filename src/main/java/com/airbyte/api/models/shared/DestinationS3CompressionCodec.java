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
 * DestinationS3CompressionCodec - The compression algorithm used to compress data. Default to no compression.
 */

@JsonDeserialize(using = DestinationS3CompressionCodec._Deserializer.class)
public class DestinationS3CompressionCodec {

    @com.fasterxml.jackson.annotation.JsonValue
    private TypedObject value;
    
    private DestinationS3CompressionCodec(TypedObject value) {
        this.value = value;
    }

    public static DestinationS3CompressionCodec of(DestinationS3SchemasFormatNoCompression value) {
        Utils.checkNotNull(value, "value");
        return new DestinationS3CompressionCodec(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<DestinationS3SchemasFormatNoCompression>(){}));
    }

    public static DestinationS3CompressionCodec of(DestinationS3Deflate value) {
        Utils.checkNotNull(value, "value");
        return new DestinationS3CompressionCodec(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<DestinationS3Deflate>(){}));
    }

    public static DestinationS3CompressionCodec of(DestinationS3Bzip2 value) {
        Utils.checkNotNull(value, "value");
        return new DestinationS3CompressionCodec(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<DestinationS3Bzip2>(){}));
    }

    public static DestinationS3CompressionCodec of(DestinationS3Xz value) {
        Utils.checkNotNull(value, "value");
        return new DestinationS3CompressionCodec(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<DestinationS3Xz>(){}));
    }

    public static DestinationS3CompressionCodec of(DestinationS3Zstandard value) {
        Utils.checkNotNull(value, "value");
        return new DestinationS3CompressionCodec(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<DestinationS3Zstandard>(){}));
    }

    public static DestinationS3CompressionCodec of(DestinationS3Snappy value) {
        Utils.checkNotNull(value, "value");
        return new DestinationS3CompressionCodec(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<DestinationS3Snappy>(){}));
    }
    
    /**
     * Returns an instance of one of these types:
     * <ul>
     * <li>{@code DestinationS3SchemasFormatNoCompression}</li>
     * <li>{@code DestinationS3Deflate}</li>
     * <li>{@code DestinationS3Bzip2}</li>
     * <li>{@code DestinationS3Xz}</li>
     * <li>{@code DestinationS3Zstandard}</li>
     * <li>{@code DestinationS3Snappy}</li>
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
        DestinationS3CompressionCodec other = (DestinationS3CompressionCodec) o;
        return java.util.Objects.deepEquals(this.value.value(), other.value.value()); 
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(value.value());
    }
    
    @SuppressWarnings("serial")
    public static final class _Deserializer extends com.airbyte.api.utils.OneOfDeserializer<DestinationS3CompressionCodec> {

        public _Deserializer() {
            super(DestinationS3CompressionCodec.class,
                  Utils.TypeReferenceWithShape.of(new TypeReference<DestinationS3SchemasFormatNoCompression>() {}, Utils.JsonShape.DEFAULT),
                  Utils.TypeReferenceWithShape.of(new TypeReference<DestinationS3Deflate>() {}, Utils.JsonShape.DEFAULT),
                  Utils.TypeReferenceWithShape.of(new TypeReference<DestinationS3Bzip2>() {}, Utils.JsonShape.DEFAULT),
                  Utils.TypeReferenceWithShape.of(new TypeReference<DestinationS3Xz>() {}, Utils.JsonShape.DEFAULT),
                  Utils.TypeReferenceWithShape.of(new TypeReference<DestinationS3Zstandard>() {}, Utils.JsonShape.DEFAULT),
                  Utils.TypeReferenceWithShape.of(new TypeReference<DestinationS3Snappy>() {}, Utils.JsonShape.DEFAULT));
        }
    }
    
    @Override
    public String toString() {
        return Utils.toString(DestinationS3CompressionCodec.class,
                "value", value);
    }
 
}
