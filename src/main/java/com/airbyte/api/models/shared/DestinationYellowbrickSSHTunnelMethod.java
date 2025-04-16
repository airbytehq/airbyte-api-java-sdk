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
 * DestinationYellowbrickSSHTunnelMethod
 * 
 * <p>Whether to initiate an SSH tunnel before connecting to the database, and if so, which kind of authentication to use.
 */
@JsonDeserialize(using = DestinationYellowbrickSSHTunnelMethod._Deserializer.class)
public class DestinationYellowbrickSSHTunnelMethod {

    @JsonValue
    private TypedObject value;
    
    private DestinationYellowbrickSSHTunnelMethod(TypedObject value) {
        this.value = value;
    }

    public static DestinationYellowbrickSSHTunnelMethod of(DestinationYellowbrickNoTunnel value) {
        Utils.checkNotNull(value, "value");
        return new DestinationYellowbrickSSHTunnelMethod(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<DestinationYellowbrickNoTunnel>(){}));
    }

    public static DestinationYellowbrickSSHTunnelMethod of(DestinationYellowbrickSSHKeyAuthentication value) {
        Utils.checkNotNull(value, "value");
        return new DestinationYellowbrickSSHTunnelMethod(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<DestinationYellowbrickSSHKeyAuthentication>(){}));
    }

    public static DestinationYellowbrickSSHTunnelMethod of(DestinationYellowbrickPasswordAuthentication value) {
        Utils.checkNotNull(value, "value");
        return new DestinationYellowbrickSSHTunnelMethod(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<DestinationYellowbrickPasswordAuthentication>(){}));
    }
    
    /**
     * Returns an instance of one of these types:
     * <ul>
     * <li>{@code com.airbyte.api.models.shared.DestinationYellowbrickNoTunnel}</li>
     * <li>{@code com.airbyte.api.models.shared.DestinationYellowbrickSSHKeyAuthentication}</li>
     * <li>{@code com.airbyte.api.models.shared.DestinationYellowbrickPasswordAuthentication}</li>
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
        DestinationYellowbrickSSHTunnelMethod other = (DestinationYellowbrickSSHTunnelMethod) o;
        return Objects.deepEquals(this.value.value(), other.value.value()); 
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(value.value());
    }
    
    @SuppressWarnings("serial")
    public static final class _Deserializer extends OneOfDeserializer<DestinationYellowbrickSSHTunnelMethod> {

        public _Deserializer() {
            super(DestinationYellowbrickSSHTunnelMethod.class, false,
                  TypeReferenceWithShape.of(new TypeReference<DestinationYellowbrickPasswordAuthentication>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<DestinationYellowbrickSSHKeyAuthentication>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<DestinationYellowbrickNoTunnel>() {}, JsonShape.DEFAULT));
        }
    }
    
    @Override
    public String toString() {
        return Utils.toString(DestinationYellowbrickSSHTunnelMethod.class,
                "value", value);
    }
 
}

