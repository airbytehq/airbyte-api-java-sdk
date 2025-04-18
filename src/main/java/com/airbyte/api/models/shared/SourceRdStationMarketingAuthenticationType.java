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
 * SourceRdStationMarketingAuthenticationType
 * 
 * <p>Choose one of the possible authorization method
 */
@JsonDeserialize(using = SourceRdStationMarketingAuthenticationType._Deserializer.class)
public class SourceRdStationMarketingAuthenticationType {

    @JsonValue
    private TypedObject value;
    
    private SourceRdStationMarketingAuthenticationType(TypedObject value) {
        this.value = value;
    }

    public static SourceRdStationMarketingAuthenticationType of(SignInViaRDStationOAuth value) {
        Utils.checkNotNull(value, "value");
        return new SourceRdStationMarketingAuthenticationType(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<SignInViaRDStationOAuth>(){}));
    }
    
    /**
     * Returns an instance of one of these types:
     * <ul>
     * <li>{@code com.airbyte.api.models.shared.SignInViaRDStationOAuth}</li>
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
        SourceRdStationMarketingAuthenticationType other = (SourceRdStationMarketingAuthenticationType) o;
        return Objects.deepEquals(this.value.value(), other.value.value()); 
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(value.value());
    }
    
    @SuppressWarnings("serial")
    public static final class _Deserializer extends OneOfDeserializer<SourceRdStationMarketingAuthenticationType> {

        public _Deserializer() {
            super(SourceRdStationMarketingAuthenticationType.class, false,
                  TypeReferenceWithShape.of(new TypeReference<SignInViaRDStationOAuth>() {}, JsonShape.DEFAULT));
        }
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceRdStationMarketingAuthenticationType.class,
                "value", value);
    }
 
}

