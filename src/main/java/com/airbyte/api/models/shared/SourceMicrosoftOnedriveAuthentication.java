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
 * SourceMicrosoftOnedriveAuthentication - Credentials for connecting to the One Drive API
 */

@JsonDeserialize(using = SourceMicrosoftOnedriveAuthentication._Deserializer.class)
public class SourceMicrosoftOnedriveAuthentication {

    @JsonValue
    private TypedObject value;
    
    private SourceMicrosoftOnedriveAuthentication(TypedObject value) {
        this.value = value;
    }

    public static SourceMicrosoftOnedriveAuthentication of(AuthenticateViaMicrosoftOAuth value) {
        Utils.checkNotNull(value, "value");
        return new SourceMicrosoftOnedriveAuthentication(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<AuthenticateViaMicrosoftOAuth>(){}));
    }

    public static SourceMicrosoftOnedriveAuthentication of(ServiceKeyAuthentication value) {
        Utils.checkNotNull(value, "value");
        return new SourceMicrosoftOnedriveAuthentication(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<ServiceKeyAuthentication>(){}));
    }
    
    /**
     * Returns an instance of one of these types:
     * <ul>
     * <li>{@code com.airbyte.api.models.shared.AuthenticateViaMicrosoftOAuth}</li>
     * <li>{@code com.airbyte.api.models.shared.ServiceKeyAuthentication}</li>
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
        SourceMicrosoftOnedriveAuthentication other = (SourceMicrosoftOnedriveAuthentication) o;
        return Objects.deepEquals(this.value.value(), other.value.value()); 
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(value.value());
    }
    
    @SuppressWarnings("serial")
    public static final class _Deserializer extends OneOfDeserializer<SourceMicrosoftOnedriveAuthentication> {

        public _Deserializer() {
            super(SourceMicrosoftOnedriveAuthentication.class, false,
                  TypeReferenceWithShape.of(new TypeReference<ServiceKeyAuthentication>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<AuthenticateViaMicrosoftOAuth>() {}, JsonShape.DEFAULT));
        }
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceMicrosoftOnedriveAuthentication.class,
                "value", value);
    }
 
}
