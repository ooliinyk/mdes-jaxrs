package com.cts.mdesemu.jaxrs.digitization;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;

import com.cts.mdesemu.jaxrs.digitization.dictionary.chel.CheckEligibilityRequest;
import com.cts.mdesemu.jaxrs.digitization.dictionary.chel.CheckEligibilityResponse;
import com.cts.mdesemu.jaxrs.digitization.dictionary.digitize.DigitizeRequest;
import com.cts.mdesemu.jaxrs.digitization.impl.CheckEligibilityService;

@Path("/digitization/1/0/{paymentAppInstanceId}")
public class DigitizationService {

	@Autowired
	private CheckEligibilityService checkEligibilityService;

	@POST
	@Produces("application/json")
	@Consumes("application/json")
	@Path("/checkEligibility")
	public Response checkEligibility(
			@PathParam("paymentAppInstanceId") String paymentAppInstanceId,
			CheckEligibilityRequest request) {
		CheckEligibilityResponse response = this.checkEligibilityService
				.processRequest(request);
		return Response.ok().entity(response).build();
	}

	@POST
	@Produces("application/json")
	@Consumes("application/json")
	@Path("/digitize")
	public Response digitize(
			@PathParam("paymentAppInstanceId") String paymentAppInstanceId,
			DigitizeRequest request) {
		// TODO implement
		return Response.ok().entity(request).build();
	}
}
