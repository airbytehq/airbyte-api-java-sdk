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
 * SourcePostgresUpdateMethod
 * 
 * <p>Configures how data is extracted from the database.
 */
@JsonDeserialize(using = SourcePostgresUpdateMethod._Deserializer.class)
public class SourcePostgresUpdateMethod {

    @JsonValue
    private TypedObject value;
    
    private SourcePostgresUpdateMethod(TypedObject value) {
        this.value = value;
    }

    public static SourcePostgresUpdateMethod of(ReadChangesUsingWriteAheadLogCDC value) {
        Utils.checkNotNull(value, "value");
        return new SourcePostgresUpdateMethod(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<ReadChangesUsingWriteAheadLogCDC>(){}));
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
     * <li>{@code com.airbyte.api.models.shared.ReadChangesUsingWriteAheadLogCDC}</li>
     * <li>{@code com.airbyte.api.models.shared.DetectChangesWithXminSystemColumn}</li>
     * <li>{@code com.airbyte.api.models.shared.SourcePostgresScanChangesWithUserDefinedCursor}</li>
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
        return Objects.deepEquals(this.value.value(), other.value.value()); 
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(value.value());
    }
    
    @SuppressWarnings("serial")
    public static final class _Deserializer extends OneOfDeserializer<SourcePostgresUpdateMethod> {

        public _Deserializer() {
            super(SourcePostgresUpdateMethod.class, false,
                  TypeReferenceWithShape.of(new TypeReference<ReadChangesUsingWriteAheadLogCDC>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<SourcePostgresScanChangesWithUserDefinedCursor>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<DetectChangesWithXminSystemColumn>() {}, JsonShape.DEFAULT));
        }
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourcePostgresUpdateMethod.class,
                "value", value);
    }
 
}

