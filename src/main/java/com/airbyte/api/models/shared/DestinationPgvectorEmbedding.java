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
 * DestinationPgvectorEmbedding - Embedding configuration
 */

@JsonDeserialize(using = DestinationPgvectorEmbedding._Deserializer.class)
public class DestinationPgvectorEmbedding {

    @com.fasterxml.jackson.annotation.JsonValue
    private TypedObject value;
    
    private DestinationPgvectorEmbedding(TypedObject value) {
        this.value = value;
    }

    public static DestinationPgvectorEmbedding of(DestinationPgvectorOpenAI value) {
        Utils.checkNotNull(value, "value");
        return new DestinationPgvectorEmbedding(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<DestinationPgvectorOpenAI>(){}));
    }

    public static DestinationPgvectorEmbedding of(DestinationPgvectorCohere value) {
        Utils.checkNotNull(value, "value");
        return new DestinationPgvectorEmbedding(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<DestinationPgvectorCohere>(){}));
    }

    public static DestinationPgvectorEmbedding of(DestinationPgvectorFake value) {
        Utils.checkNotNull(value, "value");
        return new DestinationPgvectorEmbedding(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<DestinationPgvectorFake>(){}));
    }

    public static DestinationPgvectorEmbedding of(DestinationPgvectorAzureOpenAI value) {
        Utils.checkNotNull(value, "value");
        return new DestinationPgvectorEmbedding(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<DestinationPgvectorAzureOpenAI>(){}));
    }

    public static DestinationPgvectorEmbedding of(DestinationPgvectorOpenAICompatible value) {
        Utils.checkNotNull(value, "value");
        return new DestinationPgvectorEmbedding(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<DestinationPgvectorOpenAICompatible>(){}));
    }
    
    /**
     * Returns an instance of one of these types:
     * <ul>
     * <li>{@code DestinationPgvectorOpenAI}</li>
     * <li>{@code DestinationPgvectorCohere}</li>
     * <li>{@code DestinationPgvectorFake}</li>
     * <li>{@code DestinationPgvectorAzureOpenAI}</li>
     * <li>{@code DestinationPgvectorOpenAICompatible}</li>
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
        DestinationPgvectorEmbedding other = (DestinationPgvectorEmbedding) o;
        return java.util.Objects.deepEquals(this.value.value(), other.value.value()); 
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(value.value());
    }
    
    @SuppressWarnings("serial")
    public static final class _Deserializer extends com.airbyte.api.utils.OneOfDeserializer<DestinationPgvectorEmbedding> {

        public _Deserializer() {
            super(DestinationPgvectorEmbedding.class,
                  Utils.TypeReferenceWithShape.of(new TypeReference<DestinationPgvectorOpenAI>() {}, Utils.JsonShape.DEFAULT),
                  Utils.TypeReferenceWithShape.of(new TypeReference<DestinationPgvectorCohere>() {}, Utils.JsonShape.DEFAULT),
                  Utils.TypeReferenceWithShape.of(new TypeReference<DestinationPgvectorFake>() {}, Utils.JsonShape.DEFAULT),
                  Utils.TypeReferenceWithShape.of(new TypeReference<DestinationPgvectorAzureOpenAI>() {}, Utils.JsonShape.DEFAULT),
                  Utils.TypeReferenceWithShape.of(new TypeReference<DestinationPgvectorOpenAICompatible>() {}, Utils.JsonShape.DEFAULT));
        }
    }
    
    @Override
    public String toString() {
        return Utils.toString(DestinationPgvectorEmbedding.class,
                "value", value);
    }
 
}
