package com.cts.mdesemu.jaxrs.digitization.dictionary.chel;

import java.io.Serializable;

public class ApplicableCardInfo implements Serializable {

	private static final long serialVersionUID = 1737436900946322063L;

	private Boolean isSecurityCodeApplicable;

	public Boolean getIsSecurityCodeApplicable() {
		return isSecurityCodeApplicable;
	}

	public void setIsSecurityCodeApplicable(Boolean isSecurityCodeApplicable) {
		this.isSecurityCodeApplicable = isSecurityCodeApplicable;
	}



		@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ApplicableCardInfo [");
		if (isSecurityCodeApplicable != null) {
			builder.append("isSecurityCodeApplicable=");
			builder.append(isSecurityCodeApplicable);
		}
		builder.append("]");
		return builder.toString();
	}

}
