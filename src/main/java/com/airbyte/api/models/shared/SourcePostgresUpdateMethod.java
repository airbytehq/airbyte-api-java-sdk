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
 * SourcePostgresUpdateMethod - Configures how data is extracted from the database.
 */

@JsonDeserialize(using = SourcePostgresUpdateMethod._Deserializer.class)
public class SourcePostgresUpdateMethod {

    @com.fasterxml.jackson.annotation.JsonValue
    private TypedObject value;
    
    private SourcePostgresUpdateMethod(TypedObject value) {
        this.value = value;
    }

    public static SourcePostgresUpdateMethod of(java.util.Map<String, java.lang.Object> value) {
        Utils.checkNotNull(value, "value");
        return new SourcePostgresUpdateMethod(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<java.util.Map<String, java.lang.Object>>(){}));
    }

    public static SourcePostgresUpdateMethod of(DetectChangesWithXminSystemColumn value) {
        Utils.checkNotNull(value, "value");
        return new SourcePostgresUpdateMethod(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<DetectChangesWithXminSystemColumn>(){}));
    }

    public static SourcePostgresUpdateMethod of(SourcePostgresScanChangesWithUserDefinedCursor value) {
        Utils.checkNotNull(value, "value");
        return new SourcePostgresUpdateMethod(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<SourcePostgresScanChangesWithUserDefinedCursor>(){}));
    }
    
    /**
     * Returns an instance of one of these types:
     * <ul>
     * <li>{@code java.util.Map<String, java.lang.Object>}</li>
     * <li>{@code DetectChangesWithXminSystemColumn}</li>
     * <li>{@code SourcePostgresScanChangesWithUserDefinedCursor}</li>
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
        SourcePostgresUpdateMethod other = (SourcePostgresUpdateMethod) o;
        return java.util.Objects.deepEquals(this.value.value(), other.value.value()); 
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(value.value());
    }
    
    @SuppressWarnings("serial")
    public static final class _Deserializer extends com.airbyte.api.utils.OneOfDeserializer<SourcePostgresUpdateMethod> {

        public _Deserializer() {
            super(SourcePostgresUpdateMethod.class,
                  Utils.TypeReferenceWithShape.of(new TypeReference<java.util.Map<String, java.lang.Object>>() {}, Utils.JsonShape.DEFAULT),
                  Utils.TypeReferenceWithShape.of(new TypeReference<DetectChangesWithXminSystemColumn>() {}, Utils.JsonShape.DEFAULT),
                  Utils.TypeReferenceWithShape.of(new TypeReference<SourcePostgresScanChangesWithUserDefinedCursor>() {}, Utils.JsonShape.DEFAULT));
        }
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourcePostgresUpdateMethod.class,
                "value", value);
    }
 
}
