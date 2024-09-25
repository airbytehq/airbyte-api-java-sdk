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
 * SourceMssqlSSLMethod - The encryption method which is used when communicating with the database.
 */

@JsonDeserialize(using = SourceMssqlSSLMethod._Deserializer.class)
public class SourceMssqlSSLMethod {

    @com.fasterxml.jackson.annotation.JsonValue
    private TypedObject value;
    
    private SourceMssqlSSLMethod(TypedObject value) {
        this.value = value;
    }

    public static SourceMssqlSSLMethod of(SourceMssqlUnencrypted value) {
        Utils.checkNotNull(value, "value");
        return new SourceMssqlSSLMethod(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<SourceMssqlUnencrypted>(){}));
    }

    public static SourceMssqlSSLMethod of(SourceMssqlEncryptedTrustServerCertificate value) {
        Utils.checkNotNull(value, "value");
        return new SourceMssqlSSLMethod(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<SourceMssqlEncryptedTrustServerCertificate>(){}));
    }

    public static SourceMssqlSSLMethod of(SourceMssqlEncryptedVerifyCertificate value) {
        Utils.checkNotNull(value, "value");
        return new SourceMssqlSSLMethod(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<SourceMssqlEncryptedVerifyCertificate>(){}));
    }
    
    /**
     * Returns an instance of one of these types:
     * <ul>
     * <li>{@code SourceMssqlUnencrypted}</li>
     * <li>{@code SourceMssqlEncryptedTrustServerCertificate}</li>
     * <li>{@code SourceMssqlEncryptedVerifyCertificate}</li>
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
        SourceMssqlSSLMethod other = (SourceMssqlSSLMethod) o;
        return java.util.Objects.deepEquals(this.value.value(), other.value.value()); 
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(value.value());
    }
    
    @SuppressWarnings("serial")
    public static final class _Deserializer extends com.airbyte.api.utils.OneOfDeserializer<SourceMssqlSSLMethod> {

        public _Deserializer() {
            super(SourceMssqlSSLMethod.class,
                  Utils.TypeReferenceWithShape.of(new TypeReference<SourceMssqlUnencrypted>() {}, Utils.JsonShape.DEFAULT),
                  Utils.TypeReferenceWithShape.of(new TypeReference<SourceMssqlEncryptedTrustServerCertificate>() {}, Utils.JsonShape.DEFAULT),
                  Utils.TypeReferenceWithShape.of(new TypeReference<SourceMssqlEncryptedVerifyCertificate>() {}, Utils.JsonShape.DEFAULT));
        }
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceMssqlSSLMethod.class,
                "value", value);
    }
 
}
