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
 * DestinationLangchainIndexing - Indexing configuration
 */

@JsonDeserialize(using = DestinationLangchainIndexing._Deserializer.class)
public class DestinationLangchainIndexing {

    @com.fasterxml.jackson.annotation.JsonValue
    private TypedObject value;
    
    private DestinationLangchainIndexing(TypedObject value) {
        this.value = value;
    }

    public static DestinationLangchainIndexing of(DestinationLangchainPinecone value) {
        Utils.checkNotNull(value, "value");
        return new DestinationLangchainIndexing(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<DestinationLangchainPinecone>(){}));
    }

    public static DestinationLangchainIndexing of(DocArrayHnswSearch value) {
        Utils.checkNotNull(value, "value");
        return new DestinationLangchainIndexing(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<DocArrayHnswSearch>(){}));
    }

    public static DestinationLangchainIndexing of(ChromaLocalPersistance value) {
        Utils.checkNotNull(value, "value");
        return new DestinationLangchainIndexing(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<ChromaLocalPersistance>(){}));
    }
    
    /**
     * Returns an instance of one of these types:
     * <ul>
     * <li>{@code DestinationLangchainPinecone}</li>
     * <li>{@code DocArrayHnswSearch}</li>
     * <li>{@code ChromaLocalPersistance}</li>
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
        DestinationLangchainIndexing other = (DestinationLangchainIndexing) o;
        return java.util.Objects.deepEquals(this.value.value(), other.value.value()); 
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(value.value());
    }
    
    @SuppressWarnings("serial")
    public static final class _Deserializer extends com.airbyte.api.utils.OneOfDeserializer<DestinationLangchainIndexing> {

        public _Deserializer() {
            super(DestinationLangchainIndexing.class,
                  Utils.TypeReferenceWithShape.of(new TypeReference<DestinationLangchainPinecone>() {}, Utils.JsonShape.DEFAULT),
                  Utils.TypeReferenceWithShape.of(new TypeReference<DocArrayHnswSearch>() {}, Utils.JsonShape.DEFAULT),
                  Utils.TypeReferenceWithShape.of(new TypeReference<ChromaLocalPersistance>() {}, Utils.JsonShape.DEFAULT));
        }
    }
    
    @Override
    public String toString() {
        return Utils.toString(DestinationLangchainIndexing.class,
                "value", value);
    }
 
}
