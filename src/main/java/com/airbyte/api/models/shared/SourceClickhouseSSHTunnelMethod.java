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
 * SourceClickhouseSSHTunnelMethod - Whether to initiate an SSH tunnel before connecting to the database, and if so, which kind of authentication to use.
 */

@JsonDeserialize(using = SourceClickhouseSSHTunnelMethod._Deserializer.class)
public class SourceClickhouseSSHTunnelMethod {

    @com.fasterxml.jackson.annotation.JsonValue
    private TypedObject value;
    
    private SourceClickhouseSSHTunnelMethod(TypedObject value) {
        this.value = value;
    }

    public static SourceClickhouseSSHTunnelMethod of(SourceClickhouseNoTunnel value) {
        Utils.checkNotNull(value, "value");
        return new SourceClickhouseSSHTunnelMethod(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<SourceClickhouseNoTunnel>(){}));
    }

    public static SourceClickhouseSSHTunnelMethod of(SourceClickhouseSSHKeyAuthentication value) {
        Utils.checkNotNull(value, "value");
        return new SourceClickhouseSSHTunnelMethod(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<SourceClickhouseSSHKeyAuthentication>(){}));
    }

    public static SourceClickhouseSSHTunnelMethod of(SourceClickhousePasswordAuthentication value) {
        Utils.checkNotNull(value, "value");
        return new SourceClickhouseSSHTunnelMethod(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<SourceClickhousePasswordAuthentication>(){}));
    }
    
    /**
     * Returns an instance of one of these types:
     * <ul>
     * <li>{@code SourceClickhouseNoTunnel}</li>
     * <li>{@code SourceClickhouseSSHKeyAuthentication}</li>
     * <li>{@code SourceClickhousePasswordAuthentication}</li>
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
        SourceClickhouseSSHTunnelMethod other = (SourceClickhouseSSHTunnelMethod) o;
        return java.util.Objects.deepEquals(this.value.value(), other.value.value()); 
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(value.value());
    }
    
    @SuppressWarnings("serial")
    public static final class _Deserializer extends com.airbyte.api.utils.OneOfDeserializer<SourceClickhouseSSHTunnelMethod> {

        public _Deserializer() {
            super(SourceClickhouseSSHTunnelMethod.class,
                  Utils.TypeReferenceWithShape.of(new TypeReference<SourceClickhouseNoTunnel>() {}, Utils.JsonShape.DEFAULT),
                  Utils.TypeReferenceWithShape.of(new TypeReference<SourceClickhouseSSHKeyAuthentication>() {}, Utils.JsonShape.DEFAULT),
                  Utils.TypeReferenceWithShape.of(new TypeReference<SourceClickhousePasswordAuthentication>() {}, Utils.JsonShape.DEFAULT));
        }
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceClickhouseSSHTunnelMethod.class,
                "value", value);
    }
 
}
