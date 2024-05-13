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
 * SourceAzureBlobStorageAuthentication - Credentials for connecting to the Azure Blob Storage
 */

@JsonDeserialize(using = SourceAzureBlobStorageAuthentication._Deserializer.class)
public class SourceAzureBlobStorageAuthentication {

    @com.fasterxml.jackson.annotation.JsonValue
    private TypedObject value;
    
    private SourceAzureBlobStorageAuthentication(TypedObject value) {
        this.value = value;
    }

    public static SourceAzureBlobStorageAuthentication of(AuthenticateViaOauth2 value) {
        Utils.checkNotNull(value, "value");
        return new SourceAzureBlobStorageAuthentication(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<AuthenticateViaOauth2>(){}));
    }

    public static SourceAzureBlobStorageAuthentication of(AuthenticateViaStorageAccountKey value) {
        Utils.checkNotNull(value, "value");
        return new SourceAzureBlobStorageAuthentication(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<AuthenticateViaStorageAccountKey>(){}));
    }
    
    /**
     * Returns an instance of one of these types:
     * <ul>
     * <li>{@code AuthenticateViaOauth2}</li>
     * <li>{@code AuthenticateViaStorageAccountKey}</li>
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
        SourceAzureBlobStorageAuthentication other = (SourceAzureBlobStorageAuthentication) o;
        return java.util.Objects.deepEquals(this.value.value(), other.value.value()); 
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(value.value());
    }
    
    @SuppressWarnings("serial")
    public static final class _Deserializer extends com.airbyte.api.utils.OneOfDeserializer<SourceAzureBlobStorageAuthentication> {

        public _Deserializer() {
            super(SourceAzureBlobStorageAuthentication.class,
                  Utils.TypeReferenceWithShape.of(new TypeReference<AuthenticateViaOauth2>() {}, Utils.JsonShape.DEFAULT),
                  Utils.TypeReferenceWithShape.of(new TypeReference<AuthenticateViaStorageAccountKey>() {}, Utils.JsonShape.DEFAULT));
        }
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceAzureBlobStorageAuthentication.class,
                "value", value);
    }
 
}
