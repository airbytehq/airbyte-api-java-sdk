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
 * SourceSapHanaEnterpriseSSHTunnelMethod
 * 
 * <p>Whether to initiate an SSH tunnel before connecting to the database, and if so, which kind of authentication to use.
 */
@JsonDeserialize(using = SourceSapHanaEnterpriseSSHTunnelMethod._Deserializer.class)
public class SourceSapHanaEnterpriseSSHTunnelMethod {

    @JsonValue
    private TypedObject value;
    
    private SourceSapHanaEnterpriseSSHTunnelMethod(TypedObject value) {
        this.value = value;
    }

    public static SourceSapHanaEnterpriseSSHTunnelMethod of(SourceSapHanaEnterpriseNoTunnel value) {
        Utils.checkNotNull(value, "value");
        return new SourceSapHanaEnterpriseSSHTunnelMethod(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<SourceSapHanaEnterpriseNoTunnel>(){}));
    }

    public static SourceSapHanaEnterpriseSSHTunnelMethod of(SourceSapHanaEnterpriseSSHKeyAuthentication value) {
        Utils.checkNotNull(value, "value");
        return new SourceSapHanaEnterpriseSSHTunnelMethod(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<SourceSapHanaEnterpriseSSHKeyAuthentication>(){}));
    }

    public static SourceSapHanaEnterpriseSSHTunnelMethod of(SourceSapHanaEnterprisePasswordAuthentication value) {
        Utils.checkNotNull(value, "value");
        return new SourceSapHanaEnterpriseSSHTunnelMethod(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<SourceSapHanaEnterprisePasswordAuthentication>(){}));
    }
    
    /**
     * Returns an instance of one of these types:
     * <ul>
     * <li>{@code com.airbyte.api.models.shared.SourceSapHanaEnterpriseNoTunnel}</li>
     * <li>{@code com.airbyte.api.models.shared.SourceSapHanaEnterpriseSSHKeyAuthentication}</li>
     * <li>{@code com.airbyte.api.models.shared.SourceSapHanaEnterprisePasswordAuthentication}</li>
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
        SourceSapHanaEnterpriseSSHTunnelMethod other = (SourceSapHanaEnterpriseSSHTunnelMethod) o;
        return Objects.deepEquals(this.value.value(), other.value.value()); 
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(value.value());
    }
    
    @SuppressWarnings("serial")
    public static final class _Deserializer extends OneOfDeserializer<SourceSapHanaEnterpriseSSHTunnelMethod> {

        public _Deserializer() {
            super(SourceSapHanaEnterpriseSSHTunnelMethod.class, false,
                  TypeReferenceWithShape.of(new TypeReference<SourceSapHanaEnterprisePasswordAuthentication>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<SourceSapHanaEnterpriseSSHKeyAuthentication>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<SourceSapHanaEnterpriseNoTunnel>() {}, JsonShape.DEFAULT));
        }
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceSapHanaEnterpriseSSHTunnelMethod.class,
                "value", value);
    }
 
}

