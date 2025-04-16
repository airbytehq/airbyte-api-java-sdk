/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.airbyte.api.models.shared;

import com.airbyte.api.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * TagResponse
 * 
 * <p>Provides details of a single tag.
 */
public class TagResponse {

    /**
     * A hexadecimal color value
     */
    @JsonProperty("color")
    private String color;

    @JsonProperty("name")
    private String name;

    @JsonProperty("tagId")
    private String tagId;

    @JsonProperty("workspaceId")
    private String workspaceId;

    @JsonCreator
    public TagResponse(
            @JsonProperty("color") String color,
            @JsonProperty("name") String name,
            @JsonProperty("tagId") String tagId,
            @JsonProperty("workspaceId") String workspaceId) {
        Utils.checkNotNull(color, "color");
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(tagId, "tagId");
        Utils.checkNotNull(workspaceId, "workspaceId");
        this.color = color;
        this.name = name;
        this.tagId = tagId;
        this.workspaceId = workspaceId;
    }

    /**
     * A hexadecimal color value
     */
    @JsonIgnore
    public String color() {
        return color;
    }

    @JsonIgnore
    public String name() {
        return name;
    }

    @JsonIgnore
    public String tagId() {
        return tagId;
    }

    @JsonIgnore
    public String workspaceId() {
        return workspaceId;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    /**
     * A hexadecimal color value
     */
    public TagResponse withColor(String color) {
        Utils.checkNotNull(color, "color");
        this.color = color;
        return this;
    }

    public TagResponse withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    public TagResponse withTagId(String tagId) {
        Utils.checkNotNull(tagId, "tagId");
        this.tagId = tagId;
        return this;
    }

    public TagResponse withWorkspaceId(String workspaceId) {
        Utils.checkNotNull(workspaceId, "workspaceId");
        this.workspaceId = workspaceId;
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
        TagResponse other = (TagResponse) o;
        return 
            Objects.deepEquals(this.color, other.color) &&
            Objects.deepEquals(this.name, other.name) &&
            Objects.deepEquals(this.tagId, other.tagId) &&
            Objects.deepEquals(this.workspaceId, other.workspaceId);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            color,
            name,
            tagId,
            workspaceId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(TagResponse.class,
                "color", color,
                "name", name,
                "tagId", tagId,
                "workspaceId", workspaceId);
    }
    
    public final static class Builder {
 
        private String color;
 
        private String name;
 
        private String tagId;
 
        private String workspaceId;
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * A hexadecimal color value
         */
        public Builder color(String color) {
            Utils.checkNotNull(color, "color");
            this.color = color;
            return this;
        }

        public Builder name(String name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
            return this;
        }

        public Builder tagId(String tagId) {
            Utils.checkNotNull(tagId, "tagId");
            this.tagId = tagId;
            return this;
        }

        public Builder workspaceId(String workspaceId) {
            Utils.checkNotNull(workspaceId, "workspaceId");
            this.workspaceId = workspaceId;
            return this;
        }
        
        public TagResponse build() {
            return new TagResponse(
                color,
                name,
                tagId,
                workspaceId);
        }
    }
}
