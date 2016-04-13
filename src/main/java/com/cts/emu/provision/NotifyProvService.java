package com.cts.emu.provision;

import com.cts.emu.provision.dictionary.notify.NotifyProvisioningResultRequest;
import com.cts.emu.provision.impl.NotifyProvisioningResultService;
import com.cts.emu.provision.dictionary.notify.NotifyProvisioningResultResponse;
import org.springframework.beans.factory.annotation.Autowired;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;
;

/**
 * Created by user on 07.04.2016.
 */

@Path("/credentials/1/0")
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
