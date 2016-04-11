package com.cts.mdesemu.jaxrs.digitization.dictionary;

import java.io.Serializable;

public class TokenInfo implements Serializable {

	private static final long serialVersionUID = 8966805868136085897L;

	private String tokenPanSuffix;
	private String accountPanSuffix;
	private String tokenExpiry;
	private Boolean dsrpCapable;

	public String getTokenPanSuffix() {
		return tokenPanSuffix;
	}

	public void setTokenPanSuffix(String tokenPanSuffix) {
		this.tokenPanSuffix = tokenPanSuffix;
	}

	public String getAccountPanSuffix() {
		return accountPanSuffix;
	}

	public void setAccountPanSuffix(String accountPanSuffix) {
		this.accountPanSuffix = accountPanSuffix;
	}

	public String getTokenExpiry() {
		return tokenExpiry;
	}

	public void setTokenExpiry(String tokenExpiry) {
		this.tokenExpiry = tokenExpiry;
	}

	public Boolean getDsrpCapable() {
		return dsrpCapable;
	}

	public void setDsrpCapable(Boolean dsrpCapable) {
		this.dsrpCapable = dsrpCapable;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("TokenInfo [");
		if (tokenPanSuffix != null) {
			builder.append("tokenPanSuffix=");
			builder.append(tokenPanSuffix);
			builder.append(", ");
		}
		if (accountPanSuffix != null) {
			builder.append("accountPanSuffix=");
			builder.append(accountPanSuffix);
			builder.append(", ");
		}
		if (tokenExpiry != null) {
			builder.append("tokenExpiry=");
			builder.append(tokenExpiry);
			builder.append(", ");
		}
		if (dsrpCapable != null) {
			builder.append("dsrpCapable=");
			builder.append(dsrpCapable);
		}
		builder.append("]");
		return builder.toString();
	}

}
