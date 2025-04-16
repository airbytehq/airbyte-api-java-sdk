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
 * SourceMicrosoftOnedriveFormat
 * 
 * <p>The configuration options that are used to alter how to read incoming files that deviate from the standard formatting.
 */
@JsonDeserialize(using = SourceMicrosoftOnedriveFormat._Deserializer.class)
public class SourceMicrosoftOnedriveFormat {

    @JsonValue
    private TypedObject value;
    
    private SourceMicrosoftOnedriveFormat(TypedObject value) {
        this.value = value;
    }

    public static SourceMicrosoftOnedriveFormat of(SourceMicrosoftOnedriveAvroFormat value) {
        Utils.checkNotNull(value, "value");
        return new SourceMicrosoftOnedriveFormat(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<SourceMicrosoftOnedriveAvroFormat>(){}));
    }

    public static SourceMicrosoftOnedriveFormat of(SourceMicrosoftOnedriveCSVFormat value) {
        Utils.checkNotNull(value, "value");
        return new SourceMicrosoftOnedriveFormat(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<SourceMicrosoftOnedriveCSVFormat>(){}));
    }

    public static SourceMicrosoftOnedriveFormat of(SourceMicrosoftOnedriveJsonlFormat value) {
        Utils.checkNotNull(value, "value");
        return new SourceMicrosoftOnedriveFormat(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<SourceMicrosoftOnedriveJsonlFormat>(){}));
    }

    public static SourceMicrosoftOnedriveFormat of(SourceMicrosoftOnedriveParquetFormat value) {
        Utils.checkNotNull(value, "value");
        return new SourceMicrosoftOnedriveFormat(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<SourceMicrosoftOnedriveParquetFormat>(){}));
    }

    public static SourceMicrosoftOnedriveFormat of(SourceMicrosoftOnedriveUnstructuredDocumentFormat value) {
        Utils.checkNotNull(value, "value");
        return new SourceMicrosoftOnedriveFormat(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<SourceMicrosoftOnedriveUnstructuredDocumentFormat>(){}));
    }
    
    /**
     * Returns an instance of one of these types:
     * <ul>
     * <li>{@code com.airbyte.api.models.shared.SourceMicrosoftOnedriveAvroFormat}</li>
     * <li>{@code com.airbyte.api.models.shared.SourceMicrosoftOnedriveCSVFormat}</li>
     * <li>{@code com.airbyte.api.models.shared.SourceMicrosoftOnedriveJsonlFormat}</li>
     * <li>{@code com.airbyte.api.models.shared.SourceMicrosoftOnedriveParquetFormat}</li>
     * <li>{@code com.airbyte.api.models.shared.SourceMicrosoftOnedriveUnstructuredDocumentFormat}</li>
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
        SourceMicrosoftOnedriveFormat other = (SourceMicrosoftOnedriveFormat) o;
        return Objects.deepEquals(this.value.value(), other.value.value()); 
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(value.value());
    }
    
    @SuppressWarnings("serial")
    public static final class _Deserializer extends OneOfDeserializer<SourceMicrosoftOnedriveFormat> {

        public _Deserializer() {
            super(SourceMicrosoftOnedriveFormat.class, false,
                  TypeReferenceWithShape.of(new TypeReference<SourceMicrosoftOnedriveCSVFormat>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<SourceMicrosoftOnedriveUnstructuredDocumentFormat>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<SourceMicrosoftOnedriveParquetFormat>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<SourceMicrosoftOnedriveAvroFormat>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<SourceMicrosoftOnedriveJsonlFormat>() {}, JsonShape.DEFAULT));
        }
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceMicrosoftOnedriveFormat.class,
                "value", value);
    }
 
}

