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
 * DestinationConfiguration - The values required to configure the destination.
 */

@JsonDeserialize(using = DestinationConfiguration._Deserializer.class)
public class DestinationConfiguration {

    @JsonValue
    private TypedObject value;
    
    private DestinationConfiguration(TypedObject value) {
        this.value = value;
    }

    public static DestinationConfiguration of(DestinationGoogleSheets value) {
        Utils.checkNotNull(value, "value");
        return new DestinationConfiguration(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<DestinationGoogleSheets>(){}));
    }

    public static DestinationConfiguration of(DestinationAstra value) {
        Utils.checkNotNull(value, "value");
        return new DestinationConfiguration(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<DestinationAstra>(){}));
    }

    public static DestinationConfiguration of(DestinationAwsDatalake value) {
        Utils.checkNotNull(value, "value");
        return new DestinationConfiguration(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<DestinationAwsDatalake>(){}));
    }

    public static DestinationConfiguration of(DestinationAzureBlobStorage value) {
        Utils.checkNotNull(value, "value");
        return new DestinationConfiguration(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<DestinationAzureBlobStorage>(){}));
    }

    public static DestinationConfiguration of(DestinationBigquery value) {
        Utils.checkNotNull(value, "value");
        return new DestinationConfiguration(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<DestinationBigquery>(){}));
    }

    public static DestinationConfiguration of(DestinationClickhouse value) {
        Utils.checkNotNull(value, "value");
        return new DestinationConfiguration(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<DestinationClickhouse>(){}));
    }

    public static DestinationConfiguration of(DestinationConvex value) {
        Utils.checkNotNull(value, "value");
        return new DestinationConfiguration(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<DestinationConvex>(){}));
    }

    public static DestinationConfiguration of(DestinationDatabricks value) {
        Utils.checkNotNull(value, "value");
        return new DestinationConfiguration(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<DestinationDatabricks>(){}));
    }

    public static DestinationConfiguration of(DestinationDevNull value) {
        Utils.checkNotNull(value, "value");
        return new DestinationConfiguration(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<DestinationDevNull>(){}));
    }

    public static DestinationConfiguration of(DestinationDuckdb value) {
        Utils.checkNotNull(value, "value");
        return new DestinationConfiguration(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<DestinationDuckdb>(){}));
    }

    public static DestinationConfiguration of(DestinationDynamodb value) {
        Utils.checkNotNull(value, "value");
        return new DestinationConfiguration(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<DestinationDynamodb>(){}));
    }

    public static DestinationConfiguration of(DestinationElasticsearch value) {
        Utils.checkNotNull(value, "value");
        return new DestinationConfiguration(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<DestinationElasticsearch>(){}));
    }

    public static DestinationConfiguration of(DestinationFirebolt value) {
        Utils.checkNotNull(value, "value");
        return new DestinationConfiguration(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<DestinationFirebolt>(){}));
    }

    public static DestinationConfiguration of(DestinationFirestore value) {
        Utils.checkNotNull(value, "value");
        return new DestinationConfiguration(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<DestinationFirestore>(){}));
    }

    public static DestinationConfiguration of(DestinationGcs value) {
        Utils.checkNotNull(value, "value");
        return new DestinationConfiguration(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<DestinationGcs>(){}));
    }

    public static DestinationConfiguration of(DestinationMilvus value) {
        Utils.checkNotNull(value, "value");
        return new DestinationConfiguration(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<DestinationMilvus>(){}));
    }

    public static DestinationConfiguration of(DestinationMongodb value) {
        Utils.checkNotNull(value, "value");
        return new DestinationConfiguration(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<DestinationMongodb>(){}));
    }

    public static DestinationConfiguration of(DestinationMssql value) {
        Utils.checkNotNull(value, "value");
        return new DestinationConfiguration(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<DestinationMssql>(){}));
    }

    public static DestinationConfiguration of(DestinationMysql value) {
        Utils.checkNotNull(value, "value");
        return new DestinationConfiguration(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<DestinationMysql>(){}));
    }

    public static DestinationConfiguration of(DestinationOracle value) {
        Utils.checkNotNull(value, "value");
        return new DestinationConfiguration(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<DestinationOracle>(){}));
    }

    public static DestinationConfiguration of(DestinationPinecone value) {
        Utils.checkNotNull(value, "value");
        return new DestinationConfiguration(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<DestinationPinecone>(){}));
    }

    public static DestinationConfiguration of(DestinationPostgres value) {
        Utils.checkNotNull(value, "value");
        return new DestinationConfiguration(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<DestinationPostgres>(){}));
    }

    public static DestinationConfiguration of(DestinationPubsub value) {
        Utils.checkNotNull(value, "value");
        return new DestinationConfiguration(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<DestinationPubsub>(){}));
    }

    public static DestinationConfiguration of(DestinationQdrant value) {
        Utils.checkNotNull(value, "value");
        return new DestinationConfiguration(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<DestinationQdrant>(){}));
    }

    public static DestinationConfiguration of(DestinationRedis value) {
        Utils.checkNotNull(value, "value");
        return new DestinationConfiguration(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<DestinationRedis>(){}));
    }

    public static DestinationConfiguration of(DestinationRedshift value) {
        Utils.checkNotNull(value, "value");
        return new DestinationConfiguration(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<DestinationRedshift>(){}));
    }

    public static DestinationConfiguration of(DestinationS3 value) {
        Utils.checkNotNull(value, "value");
        return new DestinationConfiguration(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<DestinationS3>(){}));
    }

    public static DestinationConfiguration of(DestinationS3Glue value) {
        Utils.checkNotNull(value, "value");
        return new DestinationConfiguration(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<DestinationS3Glue>(){}));
    }

    public static DestinationConfiguration of(DestinationSftpJson value) {
        Utils.checkNotNull(value, "value");
        return new DestinationConfiguration(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<DestinationSftpJson>(){}));
    }

    public static DestinationConfiguration of(DestinationSnowflake value) {
        Utils.checkNotNull(value, "value");
        return new DestinationConfiguration(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<DestinationSnowflake>(){}));
    }

    public static DestinationConfiguration of(DestinationSnowflakeCortex value) {
        Utils.checkNotNull(value, "value");
        return new DestinationConfiguration(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<DestinationSnowflakeCortex>(){}));
    }

    public static DestinationConfiguration of(DestinationTeradata value) {
        Utils.checkNotNull(value, "value");
        return new DestinationConfiguration(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<DestinationTeradata>(){}));
    }

    public static DestinationConfiguration of(DestinationTypesense value) {
        Utils.checkNotNull(value, "value");
        return new DestinationConfiguration(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<DestinationTypesense>(){}));
    }

    public static DestinationConfiguration of(DestinationVectara value) {
        Utils.checkNotNull(value, "value");
        return new DestinationConfiguration(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<DestinationVectara>(){}));
    }

    public static DestinationConfiguration of(DestinationWeaviate value) {
        Utils.checkNotNull(value, "value");
        return new DestinationConfiguration(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<DestinationWeaviate>(){}));
    }

    public static DestinationConfiguration of(DestinationYellowbrick value) {
        Utils.checkNotNull(value, "value");
        return new DestinationConfiguration(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<DestinationYellowbrick>(){}));
    }
    
    /**
     * Returns an instance of one of these types:
     * <ul>
     * <li>{@code com.airbyte.api.models.shared.DestinationGoogleSheets}</li>
     * <li>{@code com.airbyte.api.models.shared.DestinationAstra}</li>
     * <li>{@code com.airbyte.api.models.shared.DestinationAwsDatalake}</li>
     * <li>{@code com.airbyte.api.models.shared.DestinationAzureBlobStorage}</li>
     * <li>{@code com.airbyte.api.models.shared.DestinationBigquery}</li>
     * <li>{@code com.airbyte.api.models.shared.DestinationClickhouse}</li>
     * <li>{@code com.airbyte.api.models.shared.DestinationConvex}</li>
     * <li>{@code com.airbyte.api.models.shared.DestinationDatabricks}</li>
     * <li>{@code com.airbyte.api.models.shared.DestinationDevNull}</li>
     * <li>{@code com.airbyte.api.models.shared.DestinationDuckdb}</li>
     * <li>{@code com.airbyte.api.models.shared.DestinationDynamodb}</li>
     * <li>{@code com.airbyte.api.models.shared.DestinationElasticsearch}</li>
     * <li>{@code com.airbyte.api.models.shared.DestinationFirebolt}</li>
     * <li>{@code com.airbyte.api.models.shared.DestinationFirestore}</li>
     * <li>{@code com.airbyte.api.models.shared.DestinationGcs}</li>
     * <li>{@code com.airbyte.api.models.shared.DestinationMilvus}</li>
     * <li>{@code com.airbyte.api.models.shared.DestinationMongodb}</li>
     * <li>{@code com.airbyte.api.models.shared.DestinationMssql}</li>
     * <li>{@code com.airbyte.api.models.shared.DestinationMysql}</li>
     * <li>{@code com.airbyte.api.models.shared.DestinationOracle}</li>
     * <li>{@code com.airbyte.api.models.shared.DestinationPinecone}</li>
     * <li>{@code com.airbyte.api.models.shared.DestinationPostgres}</li>
     * <li>{@code com.airbyte.api.models.shared.DestinationPubsub}</li>
     * <li>{@code com.airbyte.api.models.shared.DestinationQdrant}</li>
     * <li>{@code com.airbyte.api.models.shared.DestinationRedis}</li>
     * <li>{@code com.airbyte.api.models.shared.DestinationRedshift}</li>
     * <li>{@code com.airbyte.api.models.shared.DestinationS3}</li>
     * <li>{@code com.airbyte.api.models.shared.DestinationS3Glue}</li>
     * <li>{@code com.airbyte.api.models.shared.DestinationSftpJson}</li>
     * <li>{@code com.airbyte.api.models.shared.DestinationSnowflake}</li>
     * <li>{@code com.airbyte.api.models.shared.DestinationSnowflakeCortex}</li>
     * <li>{@code com.airbyte.api.models.shared.DestinationTeradata}</li>
     * <li>{@code com.airbyte.api.models.shared.DestinationTypesense}</li>
     * <li>{@code com.airbyte.api.models.shared.DestinationVectara}</li>
     * <li>{@code com.airbyte.api.models.shared.DestinationWeaviate}</li>
     * <li>{@code com.airbyte.api.models.shared.DestinationYellowbrick}</li>
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
        DestinationConfiguration other = (DestinationConfiguration) o;
        return Objects.deepEquals(this.value.value(), other.value.value()); 
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(value.value());
    }
    
    @SuppressWarnings("serial")
    public static final class _Deserializer extends OneOfDeserializer<DestinationConfiguration> {

        public _Deserializer() {
            super(DestinationConfiguration.class, false,
                  TypeReferenceWithShape.of(new TypeReference<com.airbyte.api.models.shared.DestinationAwsDatalake>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<com.airbyte.api.models.shared.DestinationPostgres>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<com.airbyte.api.models.shared.DestinationRedshift>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<com.airbyte.api.models.shared.DestinationSnowflake>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<com.airbyte.api.models.shared.DestinationS3Glue>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<com.airbyte.api.models.shared.DestinationYellowbrick>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<com.airbyte.api.models.shared.DestinationDatabricks>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<com.airbyte.api.models.shared.DestinationMssql>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<com.airbyte.api.models.shared.DestinationS3>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<com.airbyte.api.models.shared.DestinationBigquery>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<com.airbyte.api.models.shared.DestinationOracle>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<com.airbyte.api.models.shared.DestinationMysql>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<com.airbyte.api.models.shared.DestinationPubsub>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<com.airbyte.api.models.shared.DestinationClickhouse>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<com.airbyte.api.models.shared.DestinationRedis>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<com.airbyte.api.models.shared.DestinationFirebolt>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<com.airbyte.api.models.shared.DestinationVectara>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<com.airbyte.api.models.shared.DestinationAzureBlobStorage>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<com.airbyte.api.models.shared.DestinationTeradata>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<com.airbyte.api.models.shared.DestinationTypesense>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<com.airbyte.api.models.shared.DestinationGcs>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<com.airbyte.api.models.shared.DestinationDynamodb>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<com.airbyte.api.models.shared.DestinationSftpJson>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<com.airbyte.api.models.shared.DestinationMilvus>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<com.airbyte.api.models.shared.DestinationQdrant>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<com.airbyte.api.models.shared.DestinationSnowflakeCortex>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<com.airbyte.api.models.shared.DestinationElasticsearch>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<com.airbyte.api.models.shared.DestinationMongodb>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<com.airbyte.api.models.shared.DestinationWeaviate>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<com.airbyte.api.models.shared.DestinationPinecone>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<com.airbyte.api.models.shared.DestinationAstra>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<com.airbyte.api.models.shared.DestinationDuckdb>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<com.airbyte.api.models.shared.DestinationFirestore>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<com.airbyte.api.models.shared.DestinationConvex>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<com.airbyte.api.models.shared.DestinationGoogleSheets>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<com.airbyte.api.models.shared.DestinationDevNull>() {}, JsonShape.DEFAULT));
        }
    }
    
    @Override
    public String toString() {
        return Utils.toString(DestinationConfiguration.class,
                "value", value);
    }
 
}
