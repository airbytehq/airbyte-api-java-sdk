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
 * DestinationS3SchemasCompression - Whether the output files should be compressed. If compression is selected, the output filename will have an extra extension (GZIP: ".jsonl.gz").
 */

@JsonDeserialize(using = DestinationS3SchemasCompression._Deserializer.class)
public class DestinationS3SchemasCompression {

    @JsonValue
    private TypedObject value;
    
    private DestinationS3SchemasCompression(TypedObject value) {
        this.value = value;
    }

    public static DestinationS3SchemasCompression of(DestinationS3SchemasNoCompression value) {
        Utils.checkNotNull(value, "value");
        return new DestinationS3SchemasCompression(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<DestinationS3SchemasNoCompression>(){}));
    }

    public static DestinationS3SchemasCompression of(DestinationS3SchemasGZIP value) {
        Utils.checkNotNull(value, "value");
        return new DestinationS3SchemasCompression(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<DestinationS3SchemasGZIP>(){}));
    }
    
    /**
     * Returns an instance of one of these types:
     * <ul>
     * <li>{@code com.airbyte.api.models.shared.DestinationS3SchemasNoCompression}</li>
     * <li>{@code com.airbyte.api.models.shared.DestinationS3SchemasGZIP}</li>
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
        DestinationS3SchemasCompression other = (DestinationS3SchemasCompression) o;
        return Objects.deepEquals(this.value.value(), other.value.value()); 
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(value.value());
    }
    
    @SuppressWarnings("serial")
    public static final class _Deserializer extends OneOfDeserializer<DestinationS3SchemasCompression> {

        public _Deserializer() {
            super(DestinationS3SchemasCompression.class, false,
                  TypeReferenceWithShape.of(new TypeReference<DestinationS3SchemasGZIP>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<DestinationS3SchemasNoCompression>() {}, JsonShape.DEFAULT));
        }
    }
    
    @Override
    public String toString() {
        return Utils.toString(DestinationS3SchemasCompression.class,
                "value", value);
    }
 
}
