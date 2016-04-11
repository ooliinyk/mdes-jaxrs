package com.cts.mdesemu.jaxrs.digitization.dictionary;

import java.io.Serializable;

public class RnsInfo implements Serializable {

	private static final long serialVersionUID = 7462007869806194934L;

	private String gcmRegistrationId;

	public String getGcmRegistrationId() {
		return gcmRegistrationId;
	}

	public void setGcmRegistrationId(String gcmRegistrationId) {
		this.gcmRegistrationId = gcmRegistrationId;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("RnsInfo [");
		if (gcmRegistrationId != null) {
			builder.append("gcmRegistrationId=");
			builder.append(gcmRegistrationId);
		}
		builder.append("]");
		return builder.toString();
	}

}
