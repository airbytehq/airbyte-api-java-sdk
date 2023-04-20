/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.operations;

import com.airbyte.api.utils.SpeakeasyMetadata;

public class CreateOrUpdateWorkspaceOAuthCredentialsRequest {
    @SpeakeasyMetadata("request:mediaType=application/json")
    public com.airbyte.api.models.shared.WorkspaceOAuthCredentialsRequest workspaceOAuthCredentialsRequest;
    public CreateOrUpdateWorkspaceOAuthCredentialsRequest withWorkspaceOAuthCredentialsRequest(com.airbyte.api.models.shared.WorkspaceOAuthCredentialsRequest workspaceOAuthCredentialsRequest) {
        this.workspaceOAuthCredentialsRequest = workspaceOAuthCredentialsRequest;
        return this;
    }
    
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=workspaceId")
    public String workspaceId;
    public CreateOrUpdateWorkspaceOAuthCredentialsRequest withWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    
}
