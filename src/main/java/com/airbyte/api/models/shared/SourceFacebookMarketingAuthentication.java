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
 * SourceFacebookMarketingAuthentication - Credentials for connecting to the Facebook Marketing API
 */

@JsonDeserialize(using = SourceFacebookMarketingAuthentication._Deserializer.class)
public class SourceFacebookMarketingAuthentication {

    @com.fasterxml.jackson.annotation.JsonValue
    private TypedObject value;
    
    private SourceFacebookMarketingAuthentication(TypedObject value) {
        this.value = value;
    }

    public static SourceFacebookMarketingAuthentication of(AuthenticateViaFacebookMarketingOauth value) {
        Utils.checkNotNull(value, "value");
        return new SourceFacebookMarketingAuthentication(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<AuthenticateViaFacebookMarketingOauth>(){}));
    }

    public static SourceFacebookMarketingAuthentication of(ServiceAccountKeyAuthentication value) {
        Utils.checkNotNull(value, "value");
        return new SourceFacebookMarketingAuthentication(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<ServiceAccountKeyAuthentication>(){}));
    }
    
    /**
     * Returns an instance of one of these types:
     * <ul>
     * <li>{@code AuthenticateViaFacebookMarketingOauth}</li>
     * <li>{@code ServiceAccountKeyAuthentication}</li>
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
        SourceFacebookMarketingAuthentication other = (SourceFacebookMarketingAuthentication) o;
        return java.util.Objects.deepEquals(this.value.value(), other.value.value()); 
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(value.value());
    }
    
    @SuppressWarnings("serial")
    public static final class _Deserializer extends com.airbyte.api.utils.OneOfDeserializer<SourceFacebookMarketingAuthentication> {

        public _Deserializer() {
            super(SourceFacebookMarketingAuthentication.class,
                  Utils.TypeReferenceWithShape.of(new TypeReference<AuthenticateViaFacebookMarketingOauth>() {}, Utils.JsonShape.DEFAULT),
                  Utils.TypeReferenceWithShape.of(new TypeReference<ServiceAccountKeyAuthentication>() {}, Utils.JsonShape.DEFAULT));
        }
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceFacebookMarketingAuthentication.class,
                "value", value);
    }
 
}