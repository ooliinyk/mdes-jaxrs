package com.cts.mdesemu.jaxrs.digitization.dictionary.chel;

import com.cts.mdesemu.jaxrs.digitization.dictionary.CardInfo;
import com.cts.mdesemu.jaxrs.digitization.dictionary.CommonDigitizationRequest;

/**
 * Simplified request source for 2.2.1: check eligibility service
 * 
 * @author pilip
 *
 */
public class CheckEligibilityRequest extends CommonDigitizationRequest {

	private static final long serialVersionUID = -6584100371209310548L;

	private String tokenType;
	private CardInfo cardInfo;
	private String consumerLanguage;

	public String getTokenType() {
		return tokenType;
	}

	public void setTokenType(String tokenType) {
		this.tokenType = tokenType;
	}

	public CardInfo getCardInfo() {
		return cardInfo;
	}

	public void setCardInfo(CardInfo cardInfo) {
		this.cardInfo = cardInfo;
	}

	public String getConsumerLanguage() {
		return consumerLanguage;
	}

	public void setConsumerLanguage(String consumerLanguage) {
		this.consumerLanguage = consumerLanguage;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CheckEligibilityRequest [");
		if (getRequestId() != null) {
			builder.append("requestId=");
			builder.append(getRequestId());
			builder.append(", ");
		}
		if (tokenType != null) {
			builder.append("tokenType=");
			builder.append(tokenType);
			builder.append(", ");
		}
		if (cardInfo != null) {
			builder.append("cardInfo=");
			builder.append(cardInfo);
			builder.append(", ");
		}
		if (consumerLanguage != null) {
			builder.append("consumerLanguage=");
			builder.append(consumerLanguage);
		}
		builder.append("]");
		return builder.toString();
	}

}
