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
 * DestinationElasticsearchSSHTunnelMethod
 * 
 * <p>Whether to initiate an SSH tunnel before connecting to the database, and if so, which kind of authentication to use.
 */
@JsonDeserialize(using = DestinationElasticsearchSSHTunnelMethod._Deserializer.class)
public class DestinationElasticsearchSSHTunnelMethod {

    @JsonValue
    private TypedObject value;
    
    private DestinationElasticsearchSSHTunnelMethod(TypedObject value) {
        this.value = value;
    }

    public static DestinationElasticsearchSSHTunnelMethod of(DestinationElasticsearchNoTunnel value) {
        Utils.checkNotNull(value, "value");
        return new DestinationElasticsearchSSHTunnelMethod(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<DestinationElasticsearchNoTunnel>(){}));
    }

    public static DestinationElasticsearchSSHTunnelMethod of(DestinationElasticsearchSSHKeyAuthentication value) {
        Utils.checkNotNull(value, "value");
        return new DestinationElasticsearchSSHTunnelMethod(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<DestinationElasticsearchSSHKeyAuthentication>(){}));
    }

    public static DestinationElasticsearchSSHTunnelMethod of(DestinationElasticsearchPasswordAuthentication value) {
        Utils.checkNotNull(value, "value");
        return new DestinationElasticsearchSSHTunnelMethod(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<DestinationElasticsearchPasswordAuthentication>(){}));
    }
    
    /**
     * Returns an instance of one of these types:
     * <ul>
     * <li>{@code com.airbyte.api.models.shared.DestinationElasticsearchNoTunnel}</li>
     * <li>{@code com.airbyte.api.models.shared.DestinationElasticsearchSSHKeyAuthentication}</li>
     * <li>{@code com.airbyte.api.models.shared.DestinationElasticsearchPasswordAuthentication}</li>
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
        DestinationElasticsearchSSHTunnelMethod other = (DestinationElasticsearchSSHTunnelMethod) o;
        return Objects.deepEquals(this.value.value(), other.value.value()); 
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(value.value());
    }
    
    @SuppressWarnings("serial")
    public static final class _Deserializer extends OneOfDeserializer<DestinationElasticsearchSSHTunnelMethod> {

        public _Deserializer() {
            super(DestinationElasticsearchSSHTunnelMethod.class, false,
                  TypeReferenceWithShape.of(new TypeReference<DestinationElasticsearchPasswordAuthentication>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<DestinationElasticsearchSSHKeyAuthentication>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<DestinationElasticsearchNoTunnel>() {}, JsonShape.DEFAULT));
        }
    }
    
    @Override
    public String toString() {
        return Utils.toString(DestinationElasticsearchSSHTunnelMethod.class,
                "value", value);
    }
 
}

