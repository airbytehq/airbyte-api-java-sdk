/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.airbyte.api.utils.LazySingletonValue;
import com.airbyte.api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Optional;

public class DestinationFirestore {

    /**
     * The contents of the JSON service account key. Check out the &lt;a href="https://docs.airbyte.io/integrations/destinations/firestore"&gt;docs&lt;/a&gt; if you need help generating this key. Default credentials will be used if this field is left empty.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("credentials_json")
    private Optional<? extends String> credentialsJson;

    @JsonProperty("destinationType")
    private Firestore destinationType;

    /**
     * The GCP project ID for the project containing the target BigQuery dataset.
     */
    @JsonProperty("project_id")
    private String projectId;

    @JsonCreator
    public DestinationFirestore(
            @JsonProperty("credentials_json") Optional<? extends String> credentialsJson,
            @JsonProperty("project_id") String projectId) {
        Utils.checkNotNull(credentialsJson, "credentialsJson");
        Utils.checkNotNull(projectId, "projectId");
        this.credentialsJson = credentialsJson;
        this.destinationType = Builder._SINGLETON_VALUE_DestinationType.value();
        this.projectId = projectId;
    }
    
    public DestinationFirestore(
            String projectId) {
        this(Optional.empty(), projectId);
    }

    /**
     * The contents of the JSON service account key. Check out the &lt;a href="https://docs.airbyte.io/integrations/destinations/firestore"&gt;docs&lt;/a&gt; if you need help generating this key. Default credentials will be used if this field is left empty.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> credentialsJson() {
        return (Optional<String>) credentialsJson;
    }

    @JsonIgnore
    public Firestore destinationType() {
        return destinationType;
    }

    /**
     * The GCP project ID for the project containing the target BigQuery dataset.
     */
    @JsonIgnore
    public String projectId() {
        return projectId;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The contents of the JSON service account key. Check out the &lt;a href="https://docs.airbyte.io/integrations/destinations/firestore"&gt;docs&lt;/a&gt; if you need help generating this key. Default credentials will be used if this field is left empty.
     */
    public DestinationFirestore withCredentialsJson(String credentialsJson) {
        Utils.checkNotNull(credentialsJson, "credentialsJson");
        this.credentialsJson = Optional.ofNullable(credentialsJson);
        return this;
    }

    /**
     * The contents of the JSON service account key. Check out the &lt;a href="https://docs.airbyte.io/integrations/destinations/firestore"&gt;docs&lt;/a&gt; if you need help generating this key. Default credentials will be used if this field is left empty.
     */
    public DestinationFirestore withCredentialsJson(Optional<? extends String> credentialsJson) {
        Utils.checkNotNull(credentialsJson, "credentialsJson");
        this.credentialsJson = credentialsJson;
        return this;
    }

    /**
     * The GCP project ID for the project containing the target BigQuery dataset.
     */
    public DestinationFirestore withProjectId(String projectId) {
        Utils.checkNotNull(projectId, "projectId");
        this.projectId = projectId;
        return this;
    }
    
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DestinationFirestore other = (DestinationFirestore) o;
        return 
            java.util.Objects.deepEquals(this.credentialsJson, other.credentialsJson) &&
            java.util.Objects.deepEquals(this.destinationType, other.destinationType) &&
            java.util.Objects.deepEquals(this.projectId, other.projectId);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            credentialsJson,
            destinationType,
            projectId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(DestinationFirestore.class,
                "credentialsJson", credentialsJson,
                "destinationType", destinationType,
                "projectId", projectId);
    }
    
    public final static class Builder {
 
        private Optional<? extends String> credentialsJson = Optional.empty();
 
        private String projectId;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The contents of the JSON service account key. Check out the &lt;a href="https://docs.airbyte.io/integrations/destinations/firestore"&gt;docs&lt;/a&gt; if you need help generating this key. Default credentials will be used if this field is left empty.
         */
        public Builder credentialsJson(String credentialsJson) {
            Utils.checkNotNull(credentialsJson, "credentialsJson");
            this.credentialsJson = Optional.ofNullable(credentialsJson);
            return this;
        }

        /**
         * The contents of the JSON service account key. Check out the &lt;a href="https://docs.airbyte.io/integrations/destinations/firestore"&gt;docs&lt;/a&gt; if you need help generating this key. Default credentials will be used if this field is left empty.
         */
        public Builder credentialsJson(Optional<? extends String> credentialsJson) {
            Utils.checkNotNull(credentialsJson, "credentialsJson");
            this.credentialsJson = credentialsJson;
            return this;
        }

        /**
         * The GCP project ID for the project containing the target BigQuery dataset.
         */
        public Builder projectId(String projectId) {
            Utils.checkNotNull(projectId, "projectId");
            this.projectId = projectId;
            return this;
        }
        
        public DestinationFirestore build() {
            return new DestinationFirestore(
                credentialsJson,
                projectId);
        }

        private static final LazySingletonValue<Firestore> _SINGLETON_VALUE_DestinationType =
                new LazySingletonValue<>(
                        "destinationType",
                        "\"firestore\"",
                        new TypeReference<Firestore>() {});
    }
}

