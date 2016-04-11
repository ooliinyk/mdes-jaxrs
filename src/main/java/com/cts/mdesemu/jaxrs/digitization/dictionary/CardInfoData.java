package com.cts.mdesemu.jaxrs.digitization.dictionary;

import java.io.Serializable;

public class CardInfoData implements Serializable {

	private static final long serialVersionUID = -8769722756061005669L;

	private String accountNumber;
	private Integer expiryMonth;
	private Integer expiryYear;
	private String source;
	private String cardholderName;
	private String securityCode;

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public Integer getExpiryMonth() {
		return expiryMonth;
	}

	public void setExpiryMonth(Integer expiryMonth) {
		this.expiryMonth = expiryMonth;
	}

	public Integer getExpiryYear() {
		return expiryYear;
	}

	public void setExpiryYear(Integer expiryYear) {
		this.expiryYear = expiryYear;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getCardholderName() {
		return cardholderName;
	}

	public void setCardholderName(String cardholderName) {
		this.cardholderName = cardholderName;
	}

	public String getSecurityCode() {
		return securityCode;
	}

	public void setSecurityCode(String securityCode) {
		this.securityCode = securityCode;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CardInfoData [");
		if (accountNumber != null) {
			builder.append("accountNumber=");
			builder.append(accountNumber);
			builder.append(", ");
		}
		if (expiryMonth != null) {
			builder.append("expiryMonth=");
			builder.append(expiryMonth);
			builder.append(", ");
		}
		if (expiryYear != null) {
			builder.append("expiryYear=");
			builder.append(expiryYear);
			builder.append(", ");
		}
		if (source != null) {
			builder.append("source=");
			builder.append(source);
			builder.append(", ");
		}
		if (cardholderName != null) {
			builder.append("cardholderName=");
			builder.append(cardholderName);
			builder.append(", ");
		}
		if (securityCode != null) {
			builder.append("securityCode=");
			builder.append(securityCode);
		}
		builder.append("]");
		return builder.toString();
	}

}
