/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;


import com.airbyte.api.utils.LazySingletonValue;
import com.airbyte.api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;


public class SourcePypi {

    /**
     * Name of the project/package. Can only be in lowercase with hyphen. This is the name used using pip command for installing the package.
     */
    @JsonProperty("project_name")
    private String projectName;

    @JsonProperty("sourceType")
    private Pypi sourceType;

    /**
     * Version of the project/package.  Use it to find a particular release instead of all releases.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("version")
    private Optional<String> version;

    @JsonCreator
    public SourcePypi(
            @JsonProperty("project_name") String projectName,
            @JsonProperty("version") Optional<String> version) {
        Utils.checkNotNull(projectName, "projectName");
        Utils.checkNotNull(version, "version");
        this.projectName = projectName;
        this.sourceType = Builder._SINGLETON_VALUE_SourceType.value();
        this.version = version;
    }
    
    public SourcePypi(
            String projectName) {
        this(projectName, Optional.empty());
    }

    /**
     * Name of the project/package. Can only be in lowercase with hyphen. This is the name used using pip command for installing the package.
     */
    @JsonIgnore
    public String projectName() {
        return projectName;
    }

    @JsonIgnore
    public Pypi sourceType() {
        return sourceType;
    }

    /**
     * Version of the project/package.  Use it to find a particular release instead of all releases.
     */
    @JsonIgnore
    public Optional<String> version() {
        return version;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Name of the project/package. Can only be in lowercase with hyphen. This is the name used using pip command for installing the package.
     */
    public SourcePypi withProjectName(String projectName) {
        Utils.checkNotNull(projectName, "projectName");
        this.projectName = projectName;
        return this;
    }

    /**
     * Version of the project/package.  Use it to find a particular release instead of all releases.
     */
    public SourcePypi withVersion(String version) {
        Utils.checkNotNull(version, "version");
        this.version = Optional.ofNullable(version);
        return this;
    }

    /**
     * Version of the project/package.  Use it to find a particular release instead of all releases.
     */
    public SourcePypi withVersion(Optional<String> version) {
        Utils.checkNotNull(version, "version");
        this.version = version;
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
        SourcePypi other = (SourcePypi) o;
        return 
            Objects.deepEquals(this.projectName, other.projectName) &&
            Objects.deepEquals(this.sourceType, other.sourceType) &&
            Objects.deepEquals(this.version, other.version);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            projectName,
            sourceType,
            version);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SourcePypi.class,
                "projectName", projectName,
                "sourceType", sourceType,
                "version", version);
    }
    
    public final static class Builder {
 
        private String projectName;
 
        private Optional<String> version = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Name of the project/package. Can only be in lowercase with hyphen. This is the name used using pip command for installing the package.
         */
        public Builder projectName(String projectName) {
            Utils.checkNotNull(projectName, "projectName");
            this.projectName = projectName;
            return this;
        }

        /**
         * Version of the project/package.  Use it to find a particular release instead of all releases.
         */
        public Builder version(String version) {
            Utils.checkNotNull(version, "version");
            this.version = Optional.ofNullable(version);
            return this;
        }

        /**
         * Version of the project/package.  Use it to find a particular release instead of all releases.
         */
        public Builder version(Optional<String> version) {
            Utils.checkNotNull(version, "version");
            this.version = version;
            return this;
        }
        
        public SourcePypi build() {
            return new SourcePypi(
                projectName,
                version);
        }

        private static final LazySingletonValue<Pypi> _SINGLETON_VALUE_SourceType =
                new LazySingletonValue<>(
                        "sourceType",
                        "\"pypi\"",
                        new TypeReference<Pypi>() {});
    }
}

