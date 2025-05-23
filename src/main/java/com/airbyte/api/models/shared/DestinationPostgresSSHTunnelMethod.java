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
 * DestinationPostgresSSHTunnelMethod
 * 
 * <p>Whether to initiate an SSH tunnel before connecting to the database, and if so, which kind of authentication to use.
 */
@JsonDeserialize(using = DestinationPostgresSSHTunnelMethod._Deserializer.class)
public class DestinationPostgresSSHTunnelMethod {

    @JsonValue
    private TypedObject value;
    
    private DestinationPostgresSSHTunnelMethod(TypedObject value) {
        this.value = value;
    }

    public static DestinationPostgresSSHTunnelMethod of(DestinationPostgresNoTunnel value) {
        Utils.checkNotNull(value, "value");
        return new DestinationPostgresSSHTunnelMethod(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<DestinationPostgresNoTunnel>(){}));
    }

    public static DestinationPostgresSSHTunnelMethod of(DestinationPostgresSSHKeyAuthentication value) {
        Utils.checkNotNull(value, "value");
        return new DestinationPostgresSSHTunnelMethod(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<DestinationPostgresSSHKeyAuthentication>(){}));
    }

    public static DestinationPostgresSSHTunnelMethod of(DestinationPostgresPasswordAuthentication value) {
        Utils.checkNotNull(value, "value");
        return new DestinationPostgresSSHTunnelMethod(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<DestinationPostgresPasswordAuthentication>(){}));
    }
    
    /**
     * Returns an instance of one of these types:
     * <ul>
     * <li>{@code com.airbyte.api.models.shared.DestinationPostgresNoTunnel}</li>
     * <li>{@code com.airbyte.api.models.shared.DestinationPostgresSSHKeyAuthentication}</li>
     * <li>{@code com.airbyte.api.models.shared.DestinationPostgresPasswordAuthentication}</li>
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
        DestinationPostgresSSHTunnelMethod other = (DestinationPostgresSSHTunnelMethod) o;
        return Objects.deepEquals(this.value.value(), other.value.value()); 
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(value.value());
    }
    
    @SuppressWarnings("serial")
    public static final class _Deserializer extends OneOfDeserializer<DestinationPostgresSSHTunnelMethod> {

        public _Deserializer() {
            super(DestinationPostgresSSHTunnelMethod.class, false,
                  TypeReferenceWithShape.of(new TypeReference<DestinationPostgresPasswordAuthentication>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<DestinationPostgresSSHKeyAuthentication>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<DestinationPostgresNoTunnel>() {}, JsonShape.DEFAULT));
        }
    }
    
    @Override
    public String toString() {
        return Utils.toString(DestinationPostgresSSHTunnelMethod.class,
                "value", value);
    }
 
}

