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
 * MongoDbInstanceType
 * 
 * <p>MongoDb instance to connect to. For MongoDB Atlas and Replica Set TLS connection is used by default.
 */
@JsonDeserialize(using = MongoDbInstanceType._Deserializer.class)
public class MongoDbInstanceType {

    @JsonValue
    private TypedObject value;
    
    private MongoDbInstanceType(TypedObject value) {
        this.value = value;
    }

    public static MongoDbInstanceType of(StandaloneMongoDbInstance value) {
        Utils.checkNotNull(value, "value");
        return new MongoDbInstanceType(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<StandaloneMongoDbInstance>(){}));
    }

    public static MongoDbInstanceType of(ReplicaSet value) {
        Utils.checkNotNull(value, "value");
        return new MongoDbInstanceType(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<ReplicaSet>(){}));
    }

    public static MongoDbInstanceType of(MongoDBAtlas value) {
        Utils.checkNotNull(value, "value");
        return new MongoDbInstanceType(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<MongoDBAtlas>(){}));
    }
    
    /**
     * Returns an instance of one of these types:
     * <ul>
     * <li>{@code com.airbyte.api.models.shared.StandaloneMongoDbInstance}</li>
     * <li>{@code com.airbyte.api.models.shared.ReplicaSet}</li>
     * <li>{@code com.airbyte.api.models.shared.MongoDBAtlas}</li>
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
        MongoDbInstanceType other = (MongoDbInstanceType) o;
        return Objects.deepEquals(this.value.value(), other.value.value()); 
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(value.value());
    }
    
    @SuppressWarnings("serial")
    public static final class _Deserializer extends OneOfDeserializer<MongoDbInstanceType> {

        public _Deserializer() {
            super(MongoDbInstanceType.class, false,
                  TypeReferenceWithShape.of(new TypeReference<StandaloneMongoDbInstance>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<ReplicaSet>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<MongoDBAtlas>() {}, JsonShape.DEFAULT));
        }
    }
    
    @Override
    public String toString() {
        return Utils.toString(MongoDbInstanceType.class,
                "value", value);
    }
 
}

