package com.cts.mdesemu.jaxrs.digitization.dictionary.chel;

import java.io.Serializable;

public class EligibilityReceipt implements Serializable {

	private static final long serialVersionUID = -8253400917074864108L;

	private String value;
	private Integer validForMinutes;

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public Integer getValidForMinutes() {
		return validForMinutes;
	}

	public void setValidForMinutes(Integer validForMinutes) {
		this.validForMinutes = validForMinutes;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("EligibilityReceipt [");
		if (value != null) {
			builder.append("value=");
			builder.append(value);
			builder.append(", ");
		}
		if (validForMinutes != null) {
			builder.append("validForMinutes=");
			builder.append(validForMinutes);
		}
		builder.append("]");
		return builder.toString();
	}

}
