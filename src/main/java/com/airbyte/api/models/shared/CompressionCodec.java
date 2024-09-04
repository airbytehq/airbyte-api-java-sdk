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
 * CompressionCodec - The compression algorithm used to compress data. Default to no compression.
 */

@JsonDeserialize(using = CompressionCodec._Deserializer.class)
public class CompressionCodec {

    @JsonValue
    private TypedObject value;
    
    private CompressionCodec(TypedObject value) {
        this.value = value;
    }

    public static CompressionCodec of(NoCompression value) {
        Utils.checkNotNull(value, "value");
        return new CompressionCodec(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<NoCompression>(){}));
    }

    public static CompressionCodec of(Deflate value) {
        Utils.checkNotNull(value, "value");
        return new CompressionCodec(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<Deflate>(){}));
    }

    public static CompressionCodec of(Bzip2 value) {
        Utils.checkNotNull(value, "value");
        return new CompressionCodec(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<Bzip2>(){}));
    }

    public static CompressionCodec of(Xz value) {
        Utils.checkNotNull(value, "value");
        return new CompressionCodec(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<Xz>(){}));
    }

    public static CompressionCodec of(Zstandard value) {
        Utils.checkNotNull(value, "value");
        return new CompressionCodec(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<Zstandard>(){}));
    }

    public static CompressionCodec of(Snappy value) {
        Utils.checkNotNull(value, "value");
        return new CompressionCodec(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<Snappy>(){}));
    }
    
    /**
     * Returns an instance of one of these types:
     * <ul>
     * <li>{@code com.airbyte.api.models.shared.NoCompression}</li>
     * <li>{@code com.airbyte.api.models.shared.Deflate}</li>
     * <li>{@code com.airbyte.api.models.shared.Bzip2}</li>
     * <li>{@code com.airbyte.api.models.shared.Xz}</li>
     * <li>{@code com.airbyte.api.models.shared.Zstandard}</li>
     * <li>{@code com.airbyte.api.models.shared.Snappy}</li>
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
        CompressionCodec other = (CompressionCodec) o;
        return Objects.deepEquals(this.value.value(), other.value.value()); 
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(value.value());
    }
    
    @SuppressWarnings("serial")
    public static final class _Deserializer extends OneOfDeserializer<CompressionCodec> {

        public _Deserializer() {
            super(CompressionCodec.class, false,
                  TypeReferenceWithShape.of(new TypeReference<com.airbyte.api.models.shared.Zstandard>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<com.airbyte.api.models.shared.Xz>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<com.airbyte.api.models.shared.Deflate>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<com.airbyte.api.models.shared.Snappy>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<com.airbyte.api.models.shared.Bzip2>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<com.airbyte.api.models.shared.NoCompression>() {}, JsonShape.DEFAULT));
        }
    }
    
    @Override
    public String toString() {
        return Utils.toString(CompressionCodec.class,
                "value", value);
    }
 
}
