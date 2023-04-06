/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.operations;

import com.airbyte.api.utils.SpeakeasyMetadata;

public class ListDestinationsRequest {
    /**
     * Include deleted destinations in the returned results.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=includeDeleted")
    public Boolean includeDeleted;
    public ListDestinationsRequest withIncludeDeleted(Boolean includeDeleted) {
        this.includeDeleted = includeDeleted;
        return this;
    }
    
    /**
     * Set the limit on the number of destinations returned. The default is 20.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=limit")
    public Integer limit;
    public ListDestinationsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }
    
    /**
     * Set the offset to start at when returning destinations. The default is 0
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=offset")
    public Integer offset;
    public ListDestinationsRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }
    
    /**
     * The UUIDs of the workspaces you wish to list destinations for. Empty list will retrieve all allowed workspaces.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=workspaceIds")
    public String[] workspaceIds;
    public ListDestinationsRequest withWorkspaceIds(String[] workspaceIds) {
        this.workspaceIds = workspaceIds;
        return this;
    }
    
}
