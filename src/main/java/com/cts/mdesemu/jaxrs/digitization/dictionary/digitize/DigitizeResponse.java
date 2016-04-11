package com.cts.mdesemu.jaxrs.digitization.dictionary.digitize;

import java.util.Map;

import com.cts.mdesemu.jaxrs.digitization.dictionary.CommonDigitizationResponse;
import com.cts.mdesemu.jaxrs.digitization.dictionary.TokenInfo;

/**
 * Simplified response source for 2.2.2: Digitize service
 * 
 * @author pilip
 *
 */
public class DigitizeResponse extends CommonDigitizationResponse {

	private static final long serialVersionUID = 164939361293105468L;

	private String decision;
	private String tokenUniqueReference;
	private String panUniqueReference;
	private Map<String, String> productConfig;
	private TokenInfo tokenInfo;
	private String tdsRegistrationUrl;

	public String getDecision() {
		return decision;
	}

	public void setDecision(String decision) {
		this.decision = decision;
	}

	public String getTokenUniqueReference() {
		return tokenUniqueReference;
	}

	public void setTokenUniqueReference(String tokenUniqueReference) {
		this.tokenUniqueReference = tokenUniqueReference;
	}

	public String getPanUniqueReference() {
		return panUniqueReference;
	}

	public void setPanUniqueReference(String panUniqueReference) {
		this.panUniqueReference = panUniqueReference;
	}

	public Map<String, String> getProductConfig() {
		return productConfig;
	}

	public void setProductConfig(Map<String, String> productConfig) {
		this.productConfig = productConfig;
	}

	public TokenInfo getTokenInfo() {
		return tokenInfo;
	}

	public void setTokenInfo(TokenInfo tokenInfo) {
		this.tokenInfo = tokenInfo;
	}

	public String getTdsRegistrationUrl() {
		return tdsRegistrationUrl;
	}

	public void setTdsRegistrationUrl(String tdsRegistrationUrl) {
		this.tdsRegistrationUrl = tdsRegistrationUrl;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("DigitizeResponse [");
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
		if (decision != null) {
			builder.append("decision=");
			builder.append(decision);
			builder.append(", ");
		}
		if (tokenUniqueReference != null) {
			builder.append("tokenUniqueReference=");
			builder.append(tokenUniqueReference);
			builder.append(", ");
		}
		if (panUniqueReference != null) {
			builder.append("panUniqueReference=");
			builder.append(panUniqueReference);
			builder.append(", ");
		}
		if (productConfig != null) {
			builder.append("productConfig=");
			builder.append(productConfig);
			builder.append(", ");
		}
		if (tokenInfo != null) {
			builder.append("tokenInfo=");
			builder.append(tokenInfo);
			builder.append(", ");
		}
		if (tdsRegistrationUrl != null) {
			builder.append("tdsRegistrationUrl=");
			builder.append(tdsRegistrationUrl);
		}
		builder.append("]");
		return builder.toString();
	}

}
