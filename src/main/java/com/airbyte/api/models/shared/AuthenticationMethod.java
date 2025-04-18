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
 * AuthenticationMethod
 * 
 * <p>The type of authentication to be used
 */
@JsonDeserialize(using = AuthenticationMethod._Deserializer.class)
public class AuthenticationMethod {

    @JsonValue
    private TypedObject value;
    
    private AuthenticationMethod(TypedObject value) {
        this.value = value;
    }

    public static AuthenticationMethod of(None value) {
        Utils.checkNotNull(value, "value");
        return new AuthenticationMethod(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<None>(){}));
    }

    public static AuthenticationMethod of(ApiKeySecret value) {
        Utils.checkNotNull(value, "value");
        return new AuthenticationMethod(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<ApiKeySecret>(){}));
    }

    public static AuthenticationMethod of(UsernamePassword value) {
        Utils.checkNotNull(value, "value");
        return new AuthenticationMethod(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<UsernamePassword>(){}));
    }
    
    /**
     * Returns an instance of one of these types:
     * <ul>
     * <li>{@code com.airbyte.api.models.shared.None}</li>
     * <li>{@code com.airbyte.api.models.shared.ApiKeySecret}</li>
     * <li>{@code com.airbyte.api.models.shared.UsernamePassword}</li>
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
        AuthenticationMethod other = (AuthenticationMethod) o;
        return Objects.deepEquals(this.value.value(), other.value.value()); 
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(value.value());
    }
    
    @SuppressWarnings("serial")
    public static final class _Deserializer extends OneOfDeserializer<AuthenticationMethod> {

        public _Deserializer() {
            super(AuthenticationMethod.class, false,
                  TypeReferenceWithShape.of(new TypeReference<UsernamePassword>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<ApiKeySecret>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<None>() {}, JsonShape.DEFAULT));
        }
    }
    
    @Override
    public String toString() {
        return Utils.toString(AuthenticationMethod.class,
                "value", value);
    }
 
}

