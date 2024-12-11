/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.airbyte.api.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

/**
 * PermissionType - Describes what actions/endpoints the permission entitles to
 */
public enum PermissionType {
    INSTANCE_ADMIN("instance_admin"),
    ORGANIZATION_ADMIN("organization_admin"),
    ORGANIZATION_EDITOR("organization_editor"),
    ORGANIZATION_RUNNER("organization_runner"),
    ORGANIZATION_READER("organization_reader"),
    ORGANIZATION_MEMBER("organization_member"),
    WORKSPACE_OWNER("workspace_owner"),
    WORKSPACE_ADMIN("workspace_admin"),
    WORKSPACE_RUNNER("workspace_runner"),
    WORKSPACE_EDITOR("workspace_editor"),
    WORKSPACE_READER("workspace_reader");

    @JsonValue
    private final String value;

    private PermissionType(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
