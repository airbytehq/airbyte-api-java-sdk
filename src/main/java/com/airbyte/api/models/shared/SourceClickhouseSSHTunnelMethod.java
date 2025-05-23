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
 * SourceClickhouseSSHTunnelMethod
 * 
 * <p>Whether to initiate an SSH tunnel before connecting to the database, and if so, which kind of authentication to use.
 */
@JsonDeserialize(using = SourceClickhouseSSHTunnelMethod._Deserializer.class)
public class SourceClickhouseSSHTunnelMethod {

    @JsonValue
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
     * <li>{@code com.airbyte.api.models.shared.SourceClickhouseNoTunnel}</li>
     * <li>{@code com.airbyte.api.models.shared.SourceClickhouseSSHKeyAuthentication}</li>
     * <li>{@code com.airbyte.api.models.shared.SourceClickhousePasswordAuthentication}</li>
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
        return Objects.deepEquals(this.value.value(), other.value.value()); 
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(value.value());
    }
    
    @SuppressWarnings("serial")
    public static final class _Deserializer extends OneOfDeserializer<SourceClickhouseSSHTunnelMethod> {

        public _Deserializer() {
            super(SourceClickhouseSSHTunnelMethod.class, false,
                  TypeReferenceWithShape.of(new TypeReference<SourceClickhousePasswordAuthentication>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<SourceClickhouseSSHKeyAuthentication>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<SourceClickhouseNoTunnel>() {}, JsonShape.DEFAULT));
        }
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceClickhouseSSHTunnelMethod.class,
                "value", value);
    }
 
}

