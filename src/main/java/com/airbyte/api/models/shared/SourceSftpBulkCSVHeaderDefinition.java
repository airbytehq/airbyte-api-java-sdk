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
 * SourceSftpBulkCSVHeaderDefinition
 * 
 * <p>How headers will be defined. `User Provided` assumes the CSV does not have a header row and uses the headers provided and `Autogenerated` assumes the CSV does not have a header row and the CDK will generate headers using for `f{i}` where `i` is the index starting from 0. Else, the default behavior is to use the header from the CSV file. If a user wants to autogenerate or provide column names for a CSV having headers, they can skip rows.
 */
@JsonDeserialize(using = SourceSftpBulkCSVHeaderDefinition._Deserializer.class)
public class SourceSftpBulkCSVHeaderDefinition {

    @JsonValue
    private TypedObject value;
    
    private SourceSftpBulkCSVHeaderDefinition(TypedObject value) {
        this.value = value;
    }

    public static SourceSftpBulkCSVHeaderDefinition of(SourceSftpBulkFromCSV value) {
        Utils.checkNotNull(value, "value");
        return new SourceSftpBulkCSVHeaderDefinition(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<SourceSftpBulkFromCSV>(){}));
    }

    public static SourceSftpBulkCSVHeaderDefinition of(SourceSftpBulkAutogenerated value) {
        Utils.checkNotNull(value, "value");
        return new SourceSftpBulkCSVHeaderDefinition(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<SourceSftpBulkAutogenerated>(){}));
    }

    public static SourceSftpBulkCSVHeaderDefinition of(SourceSftpBulkUserProvided value) {
        Utils.checkNotNull(value, "value");
        return new SourceSftpBulkCSVHeaderDefinition(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<SourceSftpBulkUserProvided>(){}));
    }
    
    /**
     * Returns an instance of one of these types:
     * <ul>
     * <li>{@code com.airbyte.api.models.shared.SourceSftpBulkFromCSV}</li>
     * <li>{@code com.airbyte.api.models.shared.SourceSftpBulkAutogenerated}</li>
     * <li>{@code com.airbyte.api.models.shared.SourceSftpBulkUserProvided}</li>
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
        SourceSftpBulkCSVHeaderDefinition other = (SourceSftpBulkCSVHeaderDefinition) o;
        return Objects.deepEquals(this.value.value(), other.value.value()); 
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(value.value());
    }
    
    @SuppressWarnings("serial")
    public static final class _Deserializer extends OneOfDeserializer<SourceSftpBulkCSVHeaderDefinition> {

        public _Deserializer() {
            super(SourceSftpBulkCSVHeaderDefinition.class, false,
                  TypeReferenceWithShape.of(new TypeReference<SourceSftpBulkUserProvided>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<SourceSftpBulkAutogenerated>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<SourceSftpBulkFromCSV>() {}, JsonShape.DEFAULT));
        }
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceSftpBulkCSVHeaderDefinition.class,
                "value", value);
    }
 
}

