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
 * DestinationMysqlSSHTunnelMethod - Whether to initiate an SSH tunnel before connecting to the database, and if so, which kind of authentication to use.
 */

@JsonDeserialize(using = DestinationMysqlSSHTunnelMethod._Deserializer.class)
public class DestinationMysqlSSHTunnelMethod {

    @JsonValue
    private TypedObject value;
    
    private DestinationMysqlSSHTunnelMethod(TypedObject value) {
        this.value = value;
    }

    public static DestinationMysqlSSHTunnelMethod of(DestinationMysqlNoTunnel value) {
        Utils.checkNotNull(value, "value");
        return new DestinationMysqlSSHTunnelMethod(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<DestinationMysqlNoTunnel>(){}));
    }

    public static DestinationMysqlSSHTunnelMethod of(DestinationMysqlSSHKeyAuthentication value) {
        Utils.checkNotNull(value, "value");
        return new DestinationMysqlSSHTunnelMethod(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<DestinationMysqlSSHKeyAuthentication>(){}));
    }

    public static DestinationMysqlSSHTunnelMethod of(DestinationMysqlPasswordAuthentication value) {
        Utils.checkNotNull(value, "value");
        return new DestinationMysqlSSHTunnelMethod(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<DestinationMysqlPasswordAuthentication>(){}));
    }
    
    /**
     * Returns an instance of one of these types:
     * <ul>
     * <li>{@code com.airbyte.api.models.shared.DestinationMysqlNoTunnel}</li>
     * <li>{@code com.airbyte.api.models.shared.DestinationMysqlSSHKeyAuthentication}</li>
     * <li>{@code com.airbyte.api.models.shared.DestinationMysqlPasswordAuthentication}</li>
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
        DestinationMysqlSSHTunnelMethod other = (DestinationMysqlSSHTunnelMethod) o;
        return Objects.deepEquals(this.value.value(), other.value.value()); 
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(value.value());
    }
    
    @SuppressWarnings("serial")
    public static final class _Deserializer extends OneOfDeserializer<DestinationMysqlSSHTunnelMethod> {

        public _Deserializer() {
            super(DestinationMysqlSSHTunnelMethod.class, false,
                  TypeReferenceWithShape.of(new TypeReference<DestinationMysqlPasswordAuthentication>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<DestinationMysqlSSHKeyAuthentication>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<DestinationMysqlNoTunnel>() {}, JsonShape.DEFAULT));
        }
    }
    
    @Override
    public String toString() {
        return Utils.toString(DestinationMysqlSSHTunnelMethod.class,
                "value", value);
    }
 
}
