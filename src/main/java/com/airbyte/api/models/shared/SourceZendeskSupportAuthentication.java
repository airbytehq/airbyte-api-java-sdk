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
 * SourceZendeskSupportAuthentication - Zendesk allows two authentication methods. We recommend using `OAuth2.0` for Airbyte Cloud users and `API token` for Airbyte Open Source users.
 */

@JsonDeserialize(using = SourceZendeskSupportAuthentication._Deserializer.class)
public class SourceZendeskSupportAuthentication {

    @JsonValue
    private TypedObject value;
    
    private SourceZendeskSupportAuthentication(TypedObject value) {
        this.value = value;
    }

    public static SourceZendeskSupportAuthentication of(SourceZendeskSupportOAuth20 value) {
        Utils.checkNotNull(value, "value");
        return new SourceZendeskSupportAuthentication(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<SourceZendeskSupportOAuth20>(){}));
    }

    public static SourceZendeskSupportAuthentication of(SourceZendeskSupportAPIToken value) {
        Utils.checkNotNull(value, "value");
        return new SourceZendeskSupportAuthentication(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<SourceZendeskSupportAPIToken>(){}));
    }
    
    /**
     * Returns an instance of one of these types:
     * <ul>
     * <li>{@code com.airbyte.api.models.shared.SourceZendeskSupportOAuth20}</li>
     * <li>{@code com.airbyte.api.models.shared.SourceZendeskSupportAPIToken}</li>
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
        SourceZendeskSupportAuthentication other = (SourceZendeskSupportAuthentication) o;
        return Objects.deepEquals(this.value.value(), other.value.value()); 
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(value.value());
    }
    
    @SuppressWarnings("serial")
    public static final class _Deserializer extends OneOfDeserializer<SourceZendeskSupportAuthentication> {

        public _Deserializer() {
            super(SourceZendeskSupportAuthentication.class, false,
                  TypeReferenceWithShape.of(new TypeReference<SourceZendeskSupportOAuth20>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<SourceZendeskSupportAPIToken>() {}, JsonShape.DEFAULT));
        }
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceZendeskSupportAuthentication.class,
                "value", value);
    }
 
}