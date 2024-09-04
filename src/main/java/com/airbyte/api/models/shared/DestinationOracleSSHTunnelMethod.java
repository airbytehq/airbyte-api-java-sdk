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
 * DestinationOracleSSHTunnelMethod - Whether to initiate an SSH tunnel before connecting to the database, and if so, which kind of authentication to use.
 */

@JsonDeserialize(using = DestinationOracleSSHTunnelMethod._Deserializer.class)
public class DestinationOracleSSHTunnelMethod {

    @JsonValue
    private TypedObject value;
    
    private DestinationOracleSSHTunnelMethod(TypedObject value) {
        this.value = value;
    }

    public static DestinationOracleSSHTunnelMethod of(DestinationOracleNoTunnel value) {
        Utils.checkNotNull(value, "value");
        return new DestinationOracleSSHTunnelMethod(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<DestinationOracleNoTunnel>(){}));
    }

    public static DestinationOracleSSHTunnelMethod of(DestinationOracleSSHKeyAuthentication value) {
        Utils.checkNotNull(value, "value");
        return new DestinationOracleSSHTunnelMethod(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<DestinationOracleSSHKeyAuthentication>(){}));
    }

    public static DestinationOracleSSHTunnelMethod of(DestinationOraclePasswordAuthentication value) {
        Utils.checkNotNull(value, "value");
        return new DestinationOracleSSHTunnelMethod(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<DestinationOraclePasswordAuthentication>(){}));
    }
    
    /**
     * Returns an instance of one of these types:
     * <ul>
     * <li>{@code com.airbyte.api.models.shared.DestinationOracleNoTunnel}</li>
     * <li>{@code com.airbyte.api.models.shared.DestinationOracleSSHKeyAuthentication}</li>
     * <li>{@code com.airbyte.api.models.shared.DestinationOraclePasswordAuthentication}</li>
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
        DestinationOracleSSHTunnelMethod other = (DestinationOracleSSHTunnelMethod) o;
        return Objects.deepEquals(this.value.value(), other.value.value()); 
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(value.value());
    }
    
    @SuppressWarnings("serial")
    public static final class _Deserializer extends OneOfDeserializer<DestinationOracleSSHTunnelMethod> {

        public _Deserializer() {
            super(DestinationOracleSSHTunnelMethod.class, false,
                  TypeReferenceWithShape.of(new TypeReference<com.airbyte.api.models.shared.DestinationOraclePasswordAuthentication>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<com.airbyte.api.models.shared.DestinationOracleSSHKeyAuthentication>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<com.airbyte.api.models.shared.DestinationOracleNoTunnel>() {}, JsonShape.DEFAULT));
        }
    }
    
    @Override
    public String toString() {
        return Utils.toString(DestinationOracleSSHTunnelMethod.class,
                "value", value);
    }
 
}
