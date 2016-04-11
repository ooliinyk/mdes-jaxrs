package com.cts.mdesemu.jaxrs.digitization.dictionary.chel;

import java.util.Arrays;

import com.cts.mdesemu.jaxrs.digitization.dictionary.CommonDigitizationResponse;

/**
 * Simplified response source for 2.2.1: check eligibility service
 * 
 * @author pilip
 *
 */
public class CheckEligibilityResponse extends CommonDigitizationResponse {

	private static final long serialVersionUID = 3280375812799599293L;

	private EligibilityReceipt eligibilityReceipt;
	private String[] deviceNotEligibleReasons;
	private String termsAndConditionsAssetId;
	private ApplicableCardInfo applicableCardInfo;

	public EligibilityReceipt getEligibilityReceipt() {
		return eligibilityReceipt;
	}

	public void setEligibilityReceipt(EligibilityReceipt eligibilityReceipt) {
		this.eligibilityReceipt = eligibilityReceipt;
	}

	public String[] getDeviceNotEligibleReasons() {
		return deviceNotEligibleReasons;
	}

	public void setDeviceNotEligibleReasons(String[] deviceNotEligibleReasons) {
		this.deviceNotEligibleReasons = deviceNotEligibleReasons;
	}

	public String getTermsAndConditionsAssetId() {
		return termsAndConditionsAssetId;
	}

	public void setTermsAndConditionsAssetId(String termsAndConditionsAssetId) {
		this.termsAndConditionsAssetId = termsAndConditionsAssetId;
	}

	public ApplicableCardInfo getApplicableCardInfo() {
		return applicableCardInfo;
	}

	public void setApplicableCardInfo(ApplicableCardInfo applicableCardInfo) {
		this.applicableCardInfo = applicableCardInfo;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CheckEligibilityResponse [");
		if (getResponseId() != null) {
			builder.append("responseId=");
			builder.append(getResponseId());
			builder.append(", ");
		}
		if (getErrorCode() != null) {
			builder.append("errorCode=");
			builder.append(getErrorCode());
			builder.append(", ");
		}
		if (getErrorDescription() != null) {
			builder.append("errorDescription=");
			builder.append(getErrorDescription());
			builder.append(", ");
		}
		if (eligibilityReceipt != null) {
			builder.append("eligibilityReceipt=");
			builder.append(eligibilityReceipt);
			builder.append(", ");
		}
		if (deviceNotEligibleReasons != null) {
			builder.append("deviceNotEligibleReasons=");
			builder.append(Arrays.toString(deviceNotEligibleReasons));
			builder.append(", ");
		}
		if (termsAndConditionsAssetId != null) {
			builder.append("termsAndConditionsAssetId=");
			builder.append(termsAndConditionsAssetId);
			builder.append(", ");
		}
		if (applicableCardInfo != null) {
			builder.append("applicableCardInfo=");
			builder.append(applicableCardInfo);
		}
		builder.append("]");
		return builder.toString();
	}

}
