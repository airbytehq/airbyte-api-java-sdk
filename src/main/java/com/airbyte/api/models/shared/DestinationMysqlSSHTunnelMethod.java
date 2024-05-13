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
 * DestinationMysqlSSHTunnelMethod - Whether to initiate an SSH tunnel before connecting to the database, and if so, which kind of authentication to use.
 */

@JsonDeserialize(using = DestinationMysqlSSHTunnelMethod._Deserializer.class)
public class DestinationMysqlSSHTunnelMethod {

    @com.fasterxml.jackson.annotation.JsonValue
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
     * <li>{@code DestinationMysqlNoTunnel}</li>
     * <li>{@code DestinationMysqlSSHKeyAuthentication}</li>
     * <li>{@code DestinationMysqlPasswordAuthentication}</li>
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
        return java.util.Objects.deepEquals(this.value.value(), other.value.value()); 
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(value.value());
    }
    
    @SuppressWarnings("serial")
    public static final class _Deserializer extends com.airbyte.api.utils.OneOfDeserializer<DestinationMysqlSSHTunnelMethod> {

        public _Deserializer() {
            super(DestinationMysqlSSHTunnelMethod.class,
                  Utils.TypeReferenceWithShape.of(new TypeReference<DestinationMysqlNoTunnel>() {}, Utils.JsonShape.DEFAULT),
                  Utils.TypeReferenceWithShape.of(new TypeReference<DestinationMysqlSSHKeyAuthentication>() {}, Utils.JsonShape.DEFAULT),
                  Utils.TypeReferenceWithShape.of(new TypeReference<DestinationMysqlPasswordAuthentication>() {}, Utils.JsonShape.DEFAULT));
        }
    }
    
    @Override
    public String toString() {
        return Utils.toString(DestinationMysqlSSHTunnelMethod.class,
                "value", value);
    }
 
}
