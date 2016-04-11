package com.cts.mdesemu.jaxrs.digitization.dictionary;

import com.cts.mdesemu.jaxrs.CommonMdesResponse;

public class CommonDigitizationResponse extends CommonMdesResponse {

	private static final long serialVersionUID = 429442204530543493L;

	private String errorCode;
	private String errorDescription;

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorDescription() {
		return errorDescription;
	}

	public void setErrorDescription(String errorDescription) {
		this.errorDescription = errorDescription;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CommonMdesResponse [");
		if (getResponseHost() != null) {
			builder.append("responseHost=");
			builder.append(getResponseHost());
			builder.append(", ");
		}
		if (getResponseId() != null) {
			builder.append("responseId=");
			builder.append(getResponseId());
			builder.append(", ");
		}
		if (errorCode != null) {
			builder.append("errorCode=");
			builder.append(errorCode);
			builder.append(", ");
		}
		if (errorDescription != null) {
			builder.append("errorDescription=");
			builder.append(errorDescription);
		}
		builder.append("]");
		return builder.toString();
	}

}
