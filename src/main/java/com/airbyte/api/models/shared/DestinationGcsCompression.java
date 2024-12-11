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
 * DestinationGcsCompression - Whether the output files should be compressed. If compression is selected, the output filename will have an extra extension (GZIP: ".jsonl.gz").
 */

@JsonDeserialize(using = DestinationGcsCompression._Deserializer.class)
public class DestinationGcsCompression {

    @JsonValue
    private TypedObject value;
    
    private DestinationGcsCompression(TypedObject value) {
        this.value = value;
    }

    public static DestinationGcsCompression of(DestinationGcsSchemasNoCompression value) {
        Utils.checkNotNull(value, "value");
        return new DestinationGcsCompression(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<DestinationGcsSchemasNoCompression>(){}));
    }

    public static DestinationGcsCompression of(DestinationGcsGZIP value) {
        Utils.checkNotNull(value, "value");
        return new DestinationGcsCompression(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<DestinationGcsGZIP>(){}));
    }
    
    /**
     * Returns an instance of one of these types:
     * <ul>
     * <li>{@code com.airbyte.api.models.shared.DestinationGcsSchemasNoCompression}</li>
     * <li>{@code com.airbyte.api.models.shared.DestinationGcsGZIP}</li>
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
        DestinationGcsCompression other = (DestinationGcsCompression) o;
        return Objects.deepEquals(this.value.value(), other.value.value()); 
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(value.value());
    }
    
    @SuppressWarnings("serial")
    public static final class _Deserializer extends OneOfDeserializer<DestinationGcsCompression> {

        public _Deserializer() {
            super(DestinationGcsCompression.class, false,
                  TypeReferenceWithShape.of(new TypeReference<DestinationGcsGZIP>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<DestinationGcsSchemasNoCompression>() {}, JsonShape.DEFAULT));
        }
    }
    
    @Override
    public String toString() {
        return Utils.toString(DestinationGcsCompression.class,
                "value", value);
    }
 
}
