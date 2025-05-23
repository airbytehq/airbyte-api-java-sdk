/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.airbyte.api.models.operations;

import com.airbyte.api.utils.SpeakeasyMetadata;
import com.airbyte.api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

public class GetSourceRequest {

    /**
     * Rather than return *** for secret properties include the secret coordinate information
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=includeSecretCoordinates")
    private Optional<Boolean> includeSecretCoordinates;

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=sourceId")
    private String sourceId;

    @JsonCreator
    public GetSourceRequest(
            Optional<Boolean> includeSecretCoordinates,
            String sourceId) {
        Utils.checkNotNull(includeSecretCoordinates, "includeSecretCoordinates");
        Utils.checkNotNull(sourceId, "sourceId");
        this.includeSecretCoordinates = includeSecretCoordinates;
        this.sourceId = sourceId;
    }
    
    public GetSourceRequest(
            String sourceId) {
        this(Optional.empty(), sourceId);
    }

    /**
     * Rather than return *** for secret properties include the secret coordinate information
     */
    @JsonIgnore
    public Optional<Boolean> includeSecretCoordinates() {
        return includeSecretCoordinates;
    }

    @JsonIgnore
    public String sourceId() {
        return sourceId;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    /**
     * Rather than return *** for secret properties include the secret coordinate information
     */
    public GetSourceRequest withIncludeSecretCoordinates(boolean includeSecretCoordinates) {
        Utils.checkNotNull(includeSecretCoordinates, "includeSecretCoordinates");
        this.includeSecretCoordinates = Optional.ofNullable(includeSecretCoordinates);
        return this;
    }

    /**
     * Rather than return *** for secret properties include the secret coordinate information
     */
    public GetSourceRequest withIncludeSecretCoordinates(Optional<Boolean> includeSecretCoordinates) {
        Utils.checkNotNull(includeSecretCoordinates, "includeSecretCoordinates");
        this.includeSecretCoordinates = includeSecretCoordinates;
        return this;
    }

    public GetSourceRequest withSourceId(String sourceId) {
        Utils.checkNotNull(sourceId, "sourceId");
        this.sourceId = sourceId;
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
        GetSourceRequest other = (GetSourceRequest) o;
        return 
            Objects.deepEquals(this.includeSecretCoordinates, other.includeSecretCoordinates) &&
            Objects.deepEquals(this.sourceId, other.sourceId);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            includeSecretCoordinates,
            sourceId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetSourceRequest.class,
                "includeSecretCoordinates", includeSecretCoordinates,
                "sourceId", sourceId);
    }
    
    public final static class Builder {
 
        private Optional<Boolean> includeSecretCoordinates = Optional.empty();
 
        private String sourceId;
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Rather than return *** for secret properties include the secret coordinate information
         */
        public Builder includeSecretCoordinates(boolean includeSecretCoordinates) {
            Utils.checkNotNull(includeSecretCoordinates, "includeSecretCoordinates");
            this.includeSecretCoordinates = Optional.ofNullable(includeSecretCoordinates);
            return this;
        }

        /**
         * Rather than return *** for secret properties include the secret coordinate information
         */
        public Builder includeSecretCoordinates(Optional<Boolean> includeSecretCoordinates) {
            Utils.checkNotNull(includeSecretCoordinates, "includeSecretCoordinates");
            this.includeSecretCoordinates = includeSecretCoordinates;
            return this;
        }

        public Builder sourceId(String sourceId) {
            Utils.checkNotNull(sourceId, "sourceId");
            this.sourceId = sourceId;
            return this;
        }
        
        public GetSourceRequest build() {
            return new GetSourceRequest(
                includeSecretCoordinates,
                sourceId);
        }
    }
}
