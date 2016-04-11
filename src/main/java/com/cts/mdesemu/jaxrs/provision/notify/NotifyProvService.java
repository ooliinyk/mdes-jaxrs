package com.cts.mdesemu.jaxrs.provision.notify;

import org.springframework.beans.factory.annotation.Autowired;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;
;

/**
 * Created by user on 07.04.2016.
 */

@Path("/provision")
public class NotifyProvService {

    @Autowired
    private NotifyProvisioningResultService notifyProvisioningResultService;

    @POST
    @Produces("application/json")
    @Consumes("application/json")
    @Path("/notifyProvisioningResult")
    public Response checkEligibility(
            NotifyProvisioningResultRequest request) {
        NotifyProvisioningResultResponse response = this.notifyProvisioningResultService.processRequest(request);
        return Response.ok().entity(response).build();
    }
}
