package com.cts.mdesemu.jaxrs.digitization.dictionary;

import com.cts.mdesemu.jaxrs.CommonMdesRequest;

public class CommonDigitizationRequest extends CommonMdesRequest {

	private static final long serialVersionUID = -7381376327007997522L;

	private String responseHost;
	private String requestId;

	public String getResponseHost() {
		return responseHost;
	}

	public void setResponseHost(String responseHost) {
		this.responseHost = responseHost;
	}

	public String getRequestId() {
		return requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

}
