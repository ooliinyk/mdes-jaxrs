package com.cts.mdesemu.jaxrs;

import java.io.Serializable;

public class CommonMdesResponse implements Serializable {

	private static final long serialVersionUID = 7238826804340405639L;

	private String responseHost;
	private String responseId;

	public String getResponseHost() {
		return responseHost;
	}

	public void setResponseHost(String responseHost) {
		this.responseHost = responseHost;
	}

	public String getResponseId() {
		return responseId;
	}

	public void setResponseId(String responseId) {
		this.responseId = responseId;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CommonMdesResponse [");
		if (responseHost != null) {
			builder.append("responseHost=");
			builder.append(responseHost);
			builder.append(", ");
		}
		if (responseId != null) {
			builder.append("responseId=");
			builder.append(responseId);
			builder.append(", ");
		}
		builder.append("]");
		return builder.toString();
	}

}
