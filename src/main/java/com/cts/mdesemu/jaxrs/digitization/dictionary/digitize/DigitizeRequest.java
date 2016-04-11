package com.cts.mdesemu.jaxrs.digitization.dictionary.digitize;

import java.util.Map;

import com.cts.mdesemu.jaxrs.digitization.dictionary.CardInfo;
import com.cts.mdesemu.jaxrs.digitization.dictionary.CommonDigitizationRequest;
import com.cts.mdesemu.jaxrs.digitization.dictionary.RnsInfo;
import com.cts.mdesemu.jaxrs.digitization.dictionary.chel.EligibilityReceipt;

/**
 * Simplified request source for 2.2.2: Digitize service
 * 
 * @author pilip
 *
 */
public class DigitizeRequest extends CommonDigitizationRequest {

	private static final long serialVersionUID = -7631673530668623837L;

	private EligibilityReceipt eligibilityReceipt;
	private String taskId;
	private String termsAndConditionsAssetId;
	private String termsAndConditionsAcceptedTimestamp;
	private RnsInfo rnsInfo;
	private CardInfo cardInfo;
	private String tokenizationAuthenticationValue;
	private Map<String, String> decisioningData;

	public EligibilityReceipt getEligibilityReceipt() {
		return eligibilityReceipt;
	}

	public void setEligibilityReceipt(EligibilityReceipt eligibilityReceipt) {
		this.eligibilityReceipt = eligibilityReceipt;
	}

	public String getTaskId() {
		return taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	public String getTermsAndConditionsAssetId() {
		return termsAndConditionsAssetId;
	}

	public void setTermsAndConditionsAssetId(String termsAndConditionsAssetId) {
		this.termsAndConditionsAssetId = termsAndConditionsAssetId;
	}

	public String getTermsAndConditionsAcceptedTimestamp() {
		return termsAndConditionsAcceptedTimestamp;
	}

	public void setTermsAndConditionsAcceptedTimestamp(
			String termsAndConditionsAcceptedTimestamp) {
		this.termsAndConditionsAcceptedTimestamp = termsAndConditionsAcceptedTimestamp;
	}

	public RnsInfo getRnsInfo() {
		return rnsInfo;
	}

	public void setRnsInfo(RnsInfo rnsInfo) {
		this.rnsInfo = rnsInfo;
	}

	public CardInfo getCardInfo() {
		return cardInfo;
	}

	public void setCardInfo(CardInfo cardInfo) {
		this.cardInfo = cardInfo;
	}

	public String getTokenizationAuthenticationValue() {
		return tokenizationAuthenticationValue;
	}

	public void setTokenizationAuthenticationValue(
			String tokenizationAuthenticationValue) {
		this.tokenizationAuthenticationValue = tokenizationAuthenticationValue;
	}

	public Map<String, String> getDecisioningData() {
		return decisioningData;
	}

	public void setDecisioningData(Map<String, String> decisioningData) {
		this.decisioningData = decisioningData;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("DigitizeRequest [");
		if (getRequestId() != null) {
			builder.append("requestId=");
			builder.append(getRequestId());
			builder.append(", ");
		}
		if (eligibilityReceipt != null) {
			builder.append("eligibilityReceipt=");
			builder.append(eligibilityReceipt);
			builder.append(", ");
		}
		if (taskId != null) {
			builder.append("taskId=");
			builder.append(taskId);
			builder.append(", ");
		}
		if (termsAndConditionsAssetId != null) {
			builder.append("termsAndConditionsAssetId=");
			builder.append(termsAndConditionsAssetId);
			builder.append(", ");
		}
		if (termsAndConditionsAcceptedTimestamp != null) {
			builder.append("termsAndConditionsAcceptedTimestamp=");
			builder.append(termsAndConditionsAcceptedTimestamp);
			builder.append(", ");
		}
		if (rnsInfo != null) {
			builder.append("rnsInfo=");
			builder.append(rnsInfo);
			builder.append(", ");
		}
		if (cardInfo != null) {
			builder.append("cardInfo=");
			builder.append(cardInfo);
			builder.append(", ");
		}
		if (tokenizationAuthenticationValue != null) {
			builder.append("tokenizationAuthenticationValue=");
			builder.append(tokenizationAuthenticationValue);
			builder.append(", ");
		}
		if (decisioningData != null) {
			builder.append("decisioningData=");
			builder.append(decisioningData);
		}
		builder.append("]");
		return builder.toString();
	}

}
