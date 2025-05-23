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

@JsonDeserialize(using = SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayFilter._Deserializer.class)
public class SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayFilter {

    @JsonValue
    private TypedObject value;
    
    private SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayFilter(TypedObject value) {
        this.value = value;
    }

    public static SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayFilter of(StringFilter value) {
        Utils.checkNotNull(value, "value");
        return new SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayFilter(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<StringFilter>(){}));
    }

    public static SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayFilter of(InListFilter value) {
        Utils.checkNotNull(value, "value");
        return new SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayFilter(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<InListFilter>(){}));
    }

    public static SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayFilter of(NumericFilter value) {
        Utils.checkNotNull(value, "value");
        return new SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayFilter(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<NumericFilter>(){}));
    }

    public static SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayFilter of(BetweenFilter value) {
        Utils.checkNotNull(value, "value");
        return new SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayFilter(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<BetweenFilter>(){}));
    }
    
    /**
     * Returns an instance of one of these types:
     * <ul>
     * <li>{@code com.airbyte.api.models.shared.StringFilter}</li>
     * <li>{@code com.airbyte.api.models.shared.InListFilter}</li>
     * <li>{@code com.airbyte.api.models.shared.NumericFilter}</li>
     * <li>{@code com.airbyte.api.models.shared.BetweenFilter}</li>
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
        SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayFilter other = (SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayFilter) o;
        return Objects.deepEquals(this.value.value(), other.value.value()); 
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(value.value());
    }
    
    @SuppressWarnings("serial")
    public static final class _Deserializer extends OneOfDeserializer<SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayFilter> {

        public _Deserializer() {
            super(SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayFilter.class, false,
                  TypeReferenceWithShape.of(new TypeReference<StringFilter>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<BetweenFilter>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<NumericFilter>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<InListFilter>() {}, JsonShape.DEFAULT));
        }
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourceGoogleAnalyticsDataApiSchemasCustomReportsArrayFilter.class,
                "value", value);
    }
 
}

