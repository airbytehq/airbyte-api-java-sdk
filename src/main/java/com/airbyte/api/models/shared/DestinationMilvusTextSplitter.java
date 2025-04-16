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
 * DestinationMilvusTextSplitter
 * 
 * <p>Split text fields into chunks based on the specified method.
 */
@JsonDeserialize(using = DestinationMilvusTextSplitter._Deserializer.class)
public class DestinationMilvusTextSplitter {

    @JsonValue
    private TypedObject value;
    
    private DestinationMilvusTextSplitter(TypedObject value) {
        this.value = value;
    }

    public static DestinationMilvusTextSplitter of(DestinationMilvusBySeparator value) {
        Utils.checkNotNull(value, "value");
        return new DestinationMilvusTextSplitter(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<DestinationMilvusBySeparator>(){}));
    }

    public static DestinationMilvusTextSplitter of(DestinationMilvusByMarkdownHeader value) {
        Utils.checkNotNull(value, "value");
        return new DestinationMilvusTextSplitter(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<DestinationMilvusByMarkdownHeader>(){}));
    }

    public static DestinationMilvusTextSplitter of(DestinationMilvusByProgrammingLanguage value) {
        Utils.checkNotNull(value, "value");
        return new DestinationMilvusTextSplitter(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<DestinationMilvusByProgrammingLanguage>(){}));
    }
    
    /**
     * Returns an instance of one of these types:
     * <ul>
     * <li>{@code com.airbyte.api.models.shared.DestinationMilvusBySeparator}</li>
     * <li>{@code com.airbyte.api.models.shared.DestinationMilvusByMarkdownHeader}</li>
     * <li>{@code com.airbyte.api.models.shared.DestinationMilvusByProgrammingLanguage}</li>
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
        DestinationMilvusTextSplitter other = (DestinationMilvusTextSplitter) o;
        return Objects.deepEquals(this.value.value(), other.value.value()); 
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(value.value());
    }
    
    @SuppressWarnings("serial")
    public static final class _Deserializer extends OneOfDeserializer<DestinationMilvusTextSplitter> {

        public _Deserializer() {
            super(DestinationMilvusTextSplitter.class, false,
                  TypeReferenceWithShape.of(new TypeReference<DestinationMilvusBySeparator>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<DestinationMilvusByProgrammingLanguage>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<DestinationMilvusByMarkdownHeader>() {}, JsonShape.DEFAULT));
        }
    }
    
    @Override
    public String toString() {
        return Utils.toString(DestinationMilvusTextSplitter.class,
                "value", value);
    }
 
}

