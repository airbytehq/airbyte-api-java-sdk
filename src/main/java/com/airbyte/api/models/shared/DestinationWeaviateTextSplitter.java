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
 * DestinationWeaviateTextSplitter
 * 
 * <p>Split text fields into chunks based on the specified method.
 */
@JsonDeserialize(using = DestinationWeaviateTextSplitter._Deserializer.class)
public class DestinationWeaviateTextSplitter {

    @JsonValue
    private TypedObject value;
    
    private DestinationWeaviateTextSplitter(TypedObject value) {
        this.value = value;
    }

    public static DestinationWeaviateTextSplitter of(DestinationWeaviateBySeparator value) {
        Utils.checkNotNull(value, "value");
        return new DestinationWeaviateTextSplitter(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<DestinationWeaviateBySeparator>(){}));
    }

    public static DestinationWeaviateTextSplitter of(DestinationWeaviateByMarkdownHeader value) {
        Utils.checkNotNull(value, "value");
        return new DestinationWeaviateTextSplitter(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<DestinationWeaviateByMarkdownHeader>(){}));
    }

    public static DestinationWeaviateTextSplitter of(DestinationWeaviateByProgrammingLanguage value) {
        Utils.checkNotNull(value, "value");
        return new DestinationWeaviateTextSplitter(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<DestinationWeaviateByProgrammingLanguage>(){}));
    }
    
    /**
     * Returns an instance of one of these types:
     * <ul>
     * <li>{@code com.airbyte.api.models.shared.DestinationWeaviateBySeparator}</li>
     * <li>{@code com.airbyte.api.models.shared.DestinationWeaviateByMarkdownHeader}</li>
     * <li>{@code com.airbyte.api.models.shared.DestinationWeaviateByProgrammingLanguage}</li>
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
        DestinationWeaviateTextSplitter other = (DestinationWeaviateTextSplitter) o;
        return Objects.deepEquals(this.value.value(), other.value.value()); 
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(value.value());
    }
    
    @SuppressWarnings("serial")
    public static final class _Deserializer extends OneOfDeserializer<DestinationWeaviateTextSplitter> {

        public _Deserializer() {
            super(DestinationWeaviateTextSplitter.class, false,
                  TypeReferenceWithShape.of(new TypeReference<DestinationWeaviateBySeparator>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<DestinationWeaviateByProgrammingLanguage>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<DestinationWeaviateByMarkdownHeader>() {}, JsonShape.DEFAULT));
        }
    }
    
    @Override
    public String toString() {
        return Utils.toString(DestinationWeaviateTextSplitter.class,
                "value", value);
    }
 
}

