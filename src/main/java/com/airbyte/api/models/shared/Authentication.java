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
 * Authentication - Authentication mechanism for Staging files and running queries
 */

@JsonDeserialize(using = Authentication._Deserializer.class)
public class Authentication {

    @com.fasterxml.jackson.annotation.JsonValue
    private TypedObject value;
    
    private Authentication(TypedObject value) {
        this.value = value;
    }

    public static Authentication of(OAuth2Recommended value) {
        Utils.checkNotNull(value, "value");
        return new Authentication(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<OAuth2Recommended>(){}));
    }

    public static Authentication of(PersonalAccessToken value) {
        Utils.checkNotNull(value, "value");
        return new Authentication(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<PersonalAccessToken>(){}));
    }
    
    /**
     * Returns an instance of one of these types:
     * <ul>
     * <li>{@code OAuth2Recommended}</li>
     * <li>{@code PersonalAccessToken}</li>
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
        Authentication other = (Authentication) o;
        return java.util.Objects.deepEquals(this.value.value(), other.value.value()); 
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(value.value());
    }
    
    @SuppressWarnings("serial")
    public static final class _Deserializer extends com.airbyte.api.utils.OneOfDeserializer<Authentication> {

        public _Deserializer() {
            super(Authentication.class,
                  Utils.TypeReferenceWithShape.of(new TypeReference<OAuth2Recommended>() {}, Utils.JsonShape.DEFAULT),
                  Utils.TypeReferenceWithShape.of(new TypeReference<PersonalAccessToken>() {}, Utils.JsonShape.DEFAULT));
        }
    }
    
    @Override
    public String toString() {
        return Utils.toString(Authentication.class,
                "value", value);
    }
 
}
