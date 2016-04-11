package com.cts.mdesemu.jaxrs;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.cxf.common.util.StringUtils;

/**
 * Configuration for MDES services. Defines global behaviour during responses
 * rendering
 * 
 * @author pilip
 *
 */
public class CommonMdesResponseConfig {

	/**
	 * Rewrites original pre-configured responseId field with request.requestId
	 * value. Actual when request contains that field
	 */
	public Boolean overrideResponseId = Boolean.TRUE;

	/**
	 * Determines whether need to generate responseId when resulting response
	 * (with param {@link #overrideResponseId} applied) has not defined
	 * responseId
	 */
	public Boolean forceResponseIdGeneration = Boolean.TRUE;

	public Boolean getOverrideResponseId() {
		return overrideResponseId;
	}

	public void setOverrideResponseId(Boolean overrideResponseId) {
		this.overrideResponseId = overrideResponseId;
	}

	public Boolean getForceResponseIdGeneration() {
		return forceResponseIdGeneration;
	}

	public void setForceResponseIdGeneration(Boolean forceResponseIdGeneration) {
		this.forceResponseIdGeneration = forceResponseIdGeneration;
	}

	protected void appyResponseId(CommonMdesRequest request,
			CommonMdesResponse response) {

		if (this.overrideResponseId) {
			if (request != null && !StringUtils.isEmpty(request.getRequestId())) {
				response.setResponseId(request.getRequestId());
			}
		}

		if (this.forceResponseIdGeneration) {
			if (StringUtils.isEmpty(response.getResponseId()))
				response.setResponseId(new SimpleDateFormat("yyDDDHHmmssSS")
						.format(new Date()));
		}

	}

}
