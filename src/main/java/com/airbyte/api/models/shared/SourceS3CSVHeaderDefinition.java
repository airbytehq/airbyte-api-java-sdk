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
 * SourceS3CSVHeaderDefinition
 * 
 * <p>How headers will be defined. `User Provided` assumes the CSV does not have a header row and uses the headers provided and `Autogenerated` assumes the CSV does not have a header row and the CDK will generate headers using for `f{i}` where `i` is the index starting from 0. Else, the default behavior is to use the header from the CSV file. If a user wants to autogenerate or provide column names for a CSV having headers, they can skip rows.
 */
@JsonDeserialize(using = SourceS3CSVHeaderDefinition._Deserializer.class)
public class SourceS3CSVHeaderDefinition {

    @JsonValue
    private TypedObject value;
    
    private SourceS3CSVHeaderDefinition(TypedObject value) {
        this.value = value;
    }

    public static SourceS3CSVHeaderDefinition of(SourceS3FromCSV value) {
        Utils.checkNotNull(value, "value");
        return new SourceS3CSVHeaderDefinition(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<SourceS3FromCSV>(){}));
    }

    public static SourceS3CSVHeaderDefinition of(SourceS3Autogenerated value) {
        Utils.checkNotNull(value, "value");
        return new SourceS3CSVHeaderDefinition(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<SourceS3Autogenerated>(){}));
    }

    public static SourceS3CSVHeaderDefinition of(SourceS3UserProvided value) {
        Utils.checkNotNull(value, "value");
        return new SourceS3CSVHeaderDefinition(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<SourceS3UserProvided>(){}));
    }
    
    /**
     * Returns an instance of one of these types:
     * <ul>
     * <li>{@code com.airbyte.api.models.shared.SourceS3FromCSV}</li>
     * <li>{@code com.airbyte.api.models.shared.SourceS3Autogenerated}</li>
     * <li>{@code com.airbyte.api.models.shared.SourceS3UserProvided}</li>
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
        SourceS3CSVHeaderDefinition other = (SourceS3CSVHeaderDefinition) o;
        return Objects.deepEquals(this.value.value(), other.value.value()); 
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(value.value());
    }
    
    @SuppressWarnings("serial")
    public static final class _Deserializer extends OneOfDeserializer<SourceS3CSVHeaderDefinition> {

        public _Deserializer() {
            super(SourceS3CSVHeaderDefinition.class, false,
                  TypeReferenceWithShape.of(new TypeReference<SourceS3UserProvided>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<SourceS3Autogenerated>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<SourceS3FromCSV>() {}, JsonShape.DEFAULT));
        }
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceS3CSVHeaderDefinition.class,
                "value", value);
    }
 
}

