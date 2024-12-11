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
 * SourceMicrosoftSharepointAuthentication - Credentials for connecting to the One Drive API
 */

@JsonDeserialize(using = SourceMicrosoftSharepointAuthentication._Deserializer.class)
public class SourceMicrosoftSharepointAuthentication {

    @JsonValue
    private TypedObject value;
    
    private SourceMicrosoftSharepointAuthentication(TypedObject value) {
        this.value = value;
    }

    public static SourceMicrosoftSharepointAuthentication of(SourceMicrosoftSharepointAuthenticateViaMicrosoftOAuth value) {
        Utils.checkNotNull(value, "value");
        return new SourceMicrosoftSharepointAuthentication(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<SourceMicrosoftSharepointAuthenticateViaMicrosoftOAuth>(){}));
    }

    public static SourceMicrosoftSharepointAuthentication of(SourceMicrosoftSharepointServiceKeyAuthentication value) {
        Utils.checkNotNull(value, "value");
        return new SourceMicrosoftSharepointAuthentication(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<SourceMicrosoftSharepointServiceKeyAuthentication>(){}));
    }
    
    /**
     * Returns an instance of one of these types:
     * <ul>
     * <li>{@code com.airbyte.api.models.shared.SourceMicrosoftSharepointAuthenticateViaMicrosoftOAuth}</li>
     * <li>{@code com.airbyte.api.models.shared.SourceMicrosoftSharepointServiceKeyAuthentication}</li>
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
        SourceMicrosoftSharepointAuthentication other = (SourceMicrosoftSharepointAuthentication) o;
        return Objects.deepEquals(this.value.value(), other.value.value()); 
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(value.value());
    }
    
    @SuppressWarnings("serial")
    public static final class _Deserializer extends OneOfDeserializer<SourceMicrosoftSharepointAuthentication> {

        public _Deserializer() {
            super(SourceMicrosoftSharepointAuthentication.class, false,
                  TypeReferenceWithShape.of(new TypeReference<SourceMicrosoftSharepointServiceKeyAuthentication>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<SourceMicrosoftSharepointAuthenticateViaMicrosoftOAuth>() {}, JsonShape.DEFAULT));
        }
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceMicrosoftSharepointAuthentication.class,
                "value", value);
    }
 
}
