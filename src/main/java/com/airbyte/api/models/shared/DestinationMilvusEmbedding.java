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
 * DestinationMilvusEmbedding - Embedding configuration
 */

@JsonDeserialize(using = DestinationMilvusEmbedding._Deserializer.class)
public class DestinationMilvusEmbedding {

    @com.fasterxml.jackson.annotation.JsonValue
    private TypedObject value;
    
    private DestinationMilvusEmbedding(TypedObject value) {
        this.value = value;
    }

    public static DestinationMilvusEmbedding of(DestinationMilvusOpenAI value) {
        Utils.checkNotNull(value, "value");
        return new DestinationMilvusEmbedding(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<DestinationMilvusOpenAI>(){}));
    }

    public static DestinationMilvusEmbedding of(DestinationMilvusCohere value) {
        Utils.checkNotNull(value, "value");
        return new DestinationMilvusEmbedding(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<DestinationMilvusCohere>(){}));
    }

    public static DestinationMilvusEmbedding of(DestinationMilvusFake value) {
        Utils.checkNotNull(value, "value");
        return new DestinationMilvusEmbedding(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<DestinationMilvusFake>(){}));
    }

    public static DestinationMilvusEmbedding of(DestinationMilvusAzureOpenAI value) {
        Utils.checkNotNull(value, "value");
        return new DestinationMilvusEmbedding(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<DestinationMilvusAzureOpenAI>(){}));
    }

    public static DestinationMilvusEmbedding of(DestinationMilvusOpenAICompatible value) {
        Utils.checkNotNull(value, "value");
        return new DestinationMilvusEmbedding(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<DestinationMilvusOpenAICompatible>(){}));
    }
    
    /**
     * Returns an instance of one of these types:
     * <ul>
     * <li>{@code DestinationMilvusOpenAI}</li>
     * <li>{@code DestinationMilvusCohere}</li>
     * <li>{@code DestinationMilvusFake}</li>
     * <li>{@code DestinationMilvusAzureOpenAI}</li>
     * <li>{@code DestinationMilvusOpenAICompatible}</li>
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
        DestinationMilvusEmbedding other = (DestinationMilvusEmbedding) o;
        return java.util.Objects.deepEquals(this.value.value(), other.value.value()); 
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(value.value());
    }
    
    @SuppressWarnings("serial")
    public static final class _Deserializer extends com.airbyte.api.utils.OneOfDeserializer<DestinationMilvusEmbedding> {

        public _Deserializer() {
            super(DestinationMilvusEmbedding.class,
                  Utils.TypeReferenceWithShape.of(new TypeReference<DestinationMilvusOpenAI>() {}, Utils.JsonShape.DEFAULT),
                  Utils.TypeReferenceWithShape.of(new TypeReference<DestinationMilvusCohere>() {}, Utils.JsonShape.DEFAULT),
                  Utils.TypeReferenceWithShape.of(new TypeReference<DestinationMilvusFake>() {}, Utils.JsonShape.DEFAULT),
                  Utils.TypeReferenceWithShape.of(new TypeReference<DestinationMilvusAzureOpenAI>() {}, Utils.JsonShape.DEFAULT),
                  Utils.TypeReferenceWithShape.of(new TypeReference<DestinationMilvusOpenAICompatible>() {}, Utils.JsonShape.DEFAULT));
        }
    }
    
    @Override
    public String toString() {
        return Utils.toString(DestinationMilvusEmbedding.class,
                "value", value);
    }
 
}
