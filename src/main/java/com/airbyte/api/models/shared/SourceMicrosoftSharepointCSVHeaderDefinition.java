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
 * SourceMicrosoftSharepointCSVHeaderDefinition
 * 
 * <p>How headers will be defined. `User Provided` assumes the CSV does not have a header row and uses the headers provided and `Autogenerated` assumes the CSV does not have a header row and the CDK will generate headers using for `f{i}` where `i` is the index starting from 0. Else, the default behavior is to use the header from the CSV file. If a user wants to autogenerate or provide column names for a CSV having headers, they can skip rows.
 */
@JsonDeserialize(using = SourceMicrosoftSharepointCSVHeaderDefinition._Deserializer.class)
public class SourceMicrosoftSharepointCSVHeaderDefinition {

    @JsonValue
    private TypedObject value;
    
    private SourceMicrosoftSharepointCSVHeaderDefinition(TypedObject value) {
        this.value = value;
    }

    public static SourceMicrosoftSharepointCSVHeaderDefinition of(SourceMicrosoftSharepointFromCSV value) {
        Utils.checkNotNull(value, "value");
        return new SourceMicrosoftSharepointCSVHeaderDefinition(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<SourceMicrosoftSharepointFromCSV>(){}));
    }

    public static SourceMicrosoftSharepointCSVHeaderDefinition of(SourceMicrosoftSharepointAutogenerated value) {
        Utils.checkNotNull(value, "value");
        return new SourceMicrosoftSharepointCSVHeaderDefinition(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<SourceMicrosoftSharepointAutogenerated>(){}));
    }

    public static SourceMicrosoftSharepointCSVHeaderDefinition of(SourceMicrosoftSharepointUserProvided value) {
        Utils.checkNotNull(value, "value");
        return new SourceMicrosoftSharepointCSVHeaderDefinition(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<SourceMicrosoftSharepointUserProvided>(){}));
    }
    
    /**
     * Returns an instance of one of these types:
     * <ul>
     * <li>{@code com.airbyte.api.models.shared.SourceMicrosoftSharepointFromCSV}</li>
     * <li>{@code com.airbyte.api.models.shared.SourceMicrosoftSharepointAutogenerated}</li>
     * <li>{@code com.airbyte.api.models.shared.SourceMicrosoftSharepointUserProvided}</li>
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
        SourceMicrosoftSharepointCSVHeaderDefinition other = (SourceMicrosoftSharepointCSVHeaderDefinition) o;
        return Objects.deepEquals(this.value.value(), other.value.value()); 
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(value.value());
    }
    
    @SuppressWarnings("serial")
    public static final class _Deserializer extends OneOfDeserializer<SourceMicrosoftSharepointCSVHeaderDefinition> {

        public _Deserializer() {
            super(SourceMicrosoftSharepointCSVHeaderDefinition.class, false,
                  TypeReferenceWithShape.of(new TypeReference<SourceMicrosoftSharepointUserProvided>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<SourceMicrosoftSharepointAutogenerated>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<SourceMicrosoftSharepointFromCSV>() {}, JsonShape.DEFAULT));
        }
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceMicrosoftSharepointCSVHeaderDefinition.class,
                "value", value);
    }
 
}

