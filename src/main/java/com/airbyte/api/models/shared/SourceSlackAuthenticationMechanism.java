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
 * SourceSlackAuthenticationMechanism
 * 
 * <p>Choose how to authenticate into Slack
 */
@JsonDeserialize(using = SourceSlackAuthenticationMechanism._Deserializer.class)
public class SourceSlackAuthenticationMechanism {

    @JsonValue
    private TypedObject value;
    
    private SourceSlackAuthenticationMechanism(TypedObject value) {
        this.value = value;
    }

    public static SourceSlackAuthenticationMechanism of(SignInViaSlackOAuth value) {
        Utils.checkNotNull(value, "value");
        return new SourceSlackAuthenticationMechanism(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<SignInViaSlackOAuth>(){}));
    }

    public static SourceSlackAuthenticationMechanism of(SourceSlackAPIToken value) {
        Utils.checkNotNull(value, "value");
        return new SourceSlackAuthenticationMechanism(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<SourceSlackAPIToken>(){}));
    }
    
    /**
     * Returns an instance of one of these types:
     * <ul>
     * <li>{@code com.airbyte.api.models.shared.SignInViaSlackOAuth}</li>
     * <li>{@code com.airbyte.api.models.shared.SourceSlackAPIToken}</li>
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
        SourceSlackAuthenticationMechanism other = (SourceSlackAuthenticationMechanism) o;
        return Objects.deepEquals(this.value.value(), other.value.value()); 
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(value.value());
    }
    
    @SuppressWarnings("serial")
    public static final class _Deserializer extends OneOfDeserializer<SourceSlackAuthenticationMechanism> {

        public _Deserializer() {
            super(SourceSlackAuthenticationMechanism.class, false,
                  TypeReferenceWithShape.of(new TypeReference<SignInViaSlackOAuth>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<SourceSlackAPIToken>() {}, JsonShape.DEFAULT));
        }
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceSlackAuthenticationMechanism.class,
                "value", value);
    }
 
}

