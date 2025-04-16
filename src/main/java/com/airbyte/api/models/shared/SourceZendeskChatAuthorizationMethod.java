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

@JsonDeserialize(using = SourceZendeskChatAuthorizationMethod._Deserializer.class)
public class SourceZendeskChatAuthorizationMethod {

    @JsonValue
    private TypedObject value;
    
    private SourceZendeskChatAuthorizationMethod(TypedObject value) {
        this.value = value;
    }

    public static SourceZendeskChatAuthorizationMethod of(SourceZendeskChatOAuth20 value) {
        Utils.checkNotNull(value, "value");
        return new SourceZendeskChatAuthorizationMethod(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<SourceZendeskChatOAuth20>(){}));
    }

    public static SourceZendeskChatAuthorizationMethod of(SourceZendeskChatAccessToken value) {
        Utils.checkNotNull(value, "value");
        return new SourceZendeskChatAuthorizationMethod(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<SourceZendeskChatAccessToken>(){}));
    }
    
    /**
     * Returns an instance of one of these types:
     * <ul>
     * <li>{@code com.airbyte.api.models.shared.SourceZendeskChatOAuth20}</li>
     * <li>{@code com.airbyte.api.models.shared.SourceZendeskChatAccessToken}</li>
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
        SourceZendeskChatAuthorizationMethod other = (SourceZendeskChatAuthorizationMethod) o;
        return Objects.deepEquals(this.value.value(), other.value.value()); 
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(value.value());
    }
    
    @SuppressWarnings("serial")
    public static final class _Deserializer extends OneOfDeserializer<SourceZendeskChatAuthorizationMethod> {

        public _Deserializer() {
            super(SourceZendeskChatAuthorizationMethod.class, false,
                  TypeReferenceWithShape.of(new TypeReference<SourceZendeskChatOAuth20>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<SourceZendeskChatAccessToken>() {}, JsonShape.DEFAULT));
        }
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceZendeskChatAuthorizationMethod.class,
                "value", value);
    }
 
}

