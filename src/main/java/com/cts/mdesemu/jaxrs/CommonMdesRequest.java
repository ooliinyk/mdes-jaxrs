package com.cts.mdesemu.jaxrs;

import java.io.Serializable;

public class CommonMdesRequest implements Serializable {

	private static final long serialVersionUID = 6759180689580051226L;

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
