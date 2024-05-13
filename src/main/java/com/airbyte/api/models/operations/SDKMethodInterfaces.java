/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.airbyte.api.models.operations;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;


public class SDKMethodInterfaces {

    public interface MethodCallCreateConnection {
        com.airbyte.api.models.operations.CreateConnectionResponse createConnection(
            com.airbyte.api.models.shared.ConnectionCreateRequest request) throws Exception;
    }


    public interface MethodCallDeleteConnection {
        com.airbyte.api.models.operations.DeleteConnectionResponse deleteConnection(
            com.airbyte.api.models.operations.DeleteConnectionRequest request) throws Exception;
    }


    public interface MethodCallGetConnection {
        com.airbyte.api.models.operations.GetConnectionResponse getConnection(
            com.airbyte.api.models.operations.GetConnectionRequest request) throws Exception;
    }


    public interface MethodCallListConnections {
        com.airbyte.api.models.operations.ListConnectionsResponse listConnections(
            com.airbyte.api.models.operations.ListConnectionsRequest request) throws Exception;
    }


    public interface MethodCallPatchConnection {
        com.airbyte.api.models.operations.PatchConnectionResponse patchConnection(
            com.airbyte.api.models.operations.PatchConnectionRequest request) throws Exception;
    }


    public interface MethodCallCancelJob {
        com.airbyte.api.models.operations.CancelJobResponse cancelJob(
            com.airbyte.api.models.operations.CancelJobRequest request) throws Exception;
    }


    public interface MethodCallCreateDestination {
        com.airbyte.api.models.operations.CreateDestinationResponse createDestination(
            Optional<? extends com.airbyte.api.models.shared.DestinationCreateRequest> request) throws Exception;
    }


    public interface MethodCallCreateJob {
        com.airbyte.api.models.operations.CreateJobResponse createJob(
            com.airbyte.api.models.shared.JobCreateRequest request) throws Exception;
    }


    public interface MethodCallCreateOrUpdateWorkspaceOAuthCredentials {
        com.airbyte.api.models.operations.CreateOrUpdateWorkspaceOAuthCredentialsResponse createOrUpdateWorkspaceOAuthCredentials(
            com.airbyte.api.models.operations.CreateOrUpdateWorkspaceOAuthCredentialsRequest request) throws Exception;
    }


    public interface MethodCallCreateSource {
        com.airbyte.api.models.operations.CreateSourceResponse createSource(
            Optional<? extends com.airbyte.api.models.shared.SourceCreateRequest> request) throws Exception;
    }


    public interface MethodCallCreateWorkspace {
        com.airbyte.api.models.operations.CreateWorkspaceResponse createWorkspace(
            com.airbyte.api.models.shared.WorkspaceCreateRequest request) throws Exception;
    }


    public interface MethodCallDeleteDestination {
        com.airbyte.api.models.operations.DeleteDestinationResponse deleteDestination(
            com.airbyte.api.models.operations.DeleteDestinationRequest request) throws Exception;
    }


    public interface MethodCallDeleteSource {
        com.airbyte.api.models.operations.DeleteSourceResponse deleteSource(
            com.airbyte.api.models.operations.DeleteSourceRequest request) throws Exception;
    }


    public interface MethodCallDeleteWorkspace {
        com.airbyte.api.models.operations.DeleteWorkspaceResponse deleteWorkspace(
            com.airbyte.api.models.operations.DeleteWorkspaceRequest request) throws Exception;
    }


    public interface MethodCallGetDestination {
        com.airbyte.api.models.operations.GetDestinationResponse getDestination(
            com.airbyte.api.models.operations.GetDestinationRequest request) throws Exception;
    }


    public interface MethodCallGetJob {
        com.airbyte.api.models.operations.GetJobResponse getJob(
            com.airbyte.api.models.operations.GetJobRequest request) throws Exception;
    }


    public interface MethodCallGetSource {
        com.airbyte.api.models.operations.GetSourceResponse getSource(
            com.airbyte.api.models.operations.GetSourceRequest request) throws Exception;
    }


    public interface MethodCallGetStreamProperties {
        com.airbyte.api.models.operations.GetStreamPropertiesResponse getStreamProperties(
            com.airbyte.api.models.operations.GetStreamPropertiesRequest request) throws Exception;
    }


    public interface MethodCallGetWorkspace {
        com.airbyte.api.models.operations.GetWorkspaceResponse getWorkspace(
            com.airbyte.api.models.operations.GetWorkspaceRequest request) throws Exception;
    }


    public interface MethodCallInitiateOAuth {
        com.airbyte.api.models.operations.InitiateOAuthResponse initiateOAuth(
            com.airbyte.api.models.shared.InitiateOauthRequest request) throws Exception;
    }


    public interface MethodCallListDestinations {
        com.airbyte.api.models.operations.ListDestinationsResponse listDestinations(
            com.airbyte.api.models.operations.ListDestinationsRequest request) throws Exception;
    }


    public interface MethodCallListJobs {
        com.airbyte.api.models.operations.ListJobsResponse listJobs(
            com.airbyte.api.models.operations.ListJobsRequest request) throws Exception;
    }


    public interface MethodCallListSources {
        com.airbyte.api.models.operations.ListSourcesResponse listSources(
            com.airbyte.api.models.operations.ListSourcesRequest request) throws Exception;
    }


    public interface MethodCallListWorkspaces {
        com.airbyte.api.models.operations.ListWorkspacesResponse listWorkspaces(
            com.airbyte.api.models.operations.ListWorkspacesRequest request) throws Exception;
    }


    public interface MethodCallPatchDestination {
        com.airbyte.api.models.operations.PatchDestinationResponse patchDestination(
            com.airbyte.api.models.operations.PatchDestinationRequest request) throws Exception;
    }


    public interface MethodCallPatchSource {
        com.airbyte.api.models.operations.PatchSourceResponse patchSource(
            com.airbyte.api.models.operations.PatchSourceRequest request) throws Exception;
    }


    public interface MethodCallPutDestination {
        com.airbyte.api.models.operations.PutDestinationResponse putDestination(
            com.airbyte.api.models.operations.PutDestinationRequest request) throws Exception;
    }


    public interface MethodCallPutSource {
        com.airbyte.api.models.operations.PutSourceResponse putSource(
            com.airbyte.api.models.operations.PutSourceRequest request) throws Exception;
    }


    public interface MethodCallUpdateWorkspace {
        com.airbyte.api.models.operations.UpdateWorkspaceResponse updateWorkspace(
            com.airbyte.api.models.operations.UpdateWorkspaceRequest request) throws Exception;
    }

}
