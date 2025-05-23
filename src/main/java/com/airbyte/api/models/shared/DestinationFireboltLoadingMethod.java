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
 * DestinationFireboltLoadingMethod
 * 
 * <p>Loading method used to select the way data will be uploaded to Firebolt
 */
@JsonDeserialize(using = DestinationFireboltLoadingMethod._Deserializer.class)
public class DestinationFireboltLoadingMethod {

    @JsonValue
    private TypedObject value;
    
    private DestinationFireboltLoadingMethod(TypedObject value) {
        this.value = value;
    }

    public static DestinationFireboltLoadingMethod of(SQLInserts value) {
        Utils.checkNotNull(value, "value");
        return new DestinationFireboltLoadingMethod(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<SQLInserts>(){}));
    }

    public static DestinationFireboltLoadingMethod of(ExternalTableViaS3 value) {
        Utils.checkNotNull(value, "value");
        return new DestinationFireboltLoadingMethod(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<ExternalTableViaS3>(){}));
    }
    
    /**
     * Returns an instance of one of these types:
     * <ul>
     * <li>{@code com.airbyte.api.models.shared.SQLInserts}</li>
     * <li>{@code com.airbyte.api.models.shared.ExternalTableViaS3}</li>
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
        DestinationFireboltLoadingMethod other = (DestinationFireboltLoadingMethod) o;
        return Objects.deepEquals(this.value.value(), other.value.value()); 
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(value.value());
    }
    
    @SuppressWarnings("serial")
    public static final class _Deserializer extends OneOfDeserializer<DestinationFireboltLoadingMethod> {

        public _Deserializer() {
            super(DestinationFireboltLoadingMethod.class, false,
                  TypeReferenceWithShape.of(new TypeReference<ExternalTableViaS3>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<SQLInserts>() {}, JsonShape.DEFAULT));
        }
    }
    
    @Override
    public String toString() {
        return Utils.toString(DestinationFireboltLoadingMethod.class,
                "value", value);
    }
 
}

