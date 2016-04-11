package com.cts.mdesemu.jaxrs.digitization.impl;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.cxf.common.util.StringUtils;

import com.cts.mdesemu.jaxrs.RejectingException;
import com.cts.mdesemu.jaxrs.ServiceWrapper;
import com.cts.mdesemu.jaxrs.digitization.chel.CheckEligibilityConfig;
import com.cts.mdesemu.jaxrs.digitization.dictionary.CardInfoData;
import com.cts.mdesemu.jaxrs.digitization.dictionary.chel.CheckEligibilityRequest;
import com.cts.mdesemu.jaxrs.digitization.dictionary.chel.CheckEligibilityResponse;

/**
 * @author pilip
 *
 */
public class CheckEligibilityService extends
		ServiceWrapper<CheckEligibilityRequest, CheckEligibilityResponse> {

	private Log logger = LogFactory.getLog(getClass());

	private CardInfoDataResolver cardInfoDataResolver;

	private CheckEligibilityConfig config;



	public CardInfoDataResolver getCardInfoDataResolver() {
		return cardInfoDataResolver;
	}

	public void setCardInfoDataResolver(
			CardInfoDataResolver cardInfoDataResolver) {
		this.cardInfoDataResolver = cardInfoDataResolver;
	}

	public CheckEligibilityConfig getConfig() {
		return config;
	}

	public void setConfig(CheckEligibilityConfig config) {
		this.config = config;
	}

	@Override
	protected CheckEligibilityResponse doProcessRequest(
			CheckEligibilityRequest request) throws RejectingException {

		if (this.logger.isDebugEnabled())
			this.logger.debug("Processing request: " + request);

		if (request == null)
			throw new RejectingException(
					RejectingException.ERROR_CODE.INVALID_JSON.name(),
					"Empty (null) request");

		if (request.getCardInfo() == null)
			throw new RejectingException(
					RejectingException.ERROR_CODE.MISSING_REQUIRED_FIELD.name(),
					"Missing Required Field - {cardInfo}");

		// TODO decrypt encrypted-data and use it instead of
		// cardinfo.unencrypted data

		CardInfoData cardInfoData = this.cardInfoDataResolver
				.resolveCardInfoData(request.getCardInfo());

		if (cardInfoData == null)
			throw new RejectingException(
					RejectingException.ERROR_CODE.MISSING_REQUIRED_FIELD.name(),
					"Missing Required Field - {cardInfoData}");

		String pan = cardInfoData.getAccountNumber();
		if (StringUtils.isEmpty(pan))
			throw new RejectingException(
					RejectingException.ERROR_CODE.MISSING_REQUIRED_FIELD.name(),
					"Missing Required Field - {accountNumber}");

		CheckEligibilityResponse response = this.config.responseForRange(
				request, pan);

		this.logger.info("Processed request.\n\tRequest details: " + request
				+ "\n\tResponse details = " + response);

		return response;
	}

	@Override
	protected CheckEligibilityResponse responseOnError(
			CheckEligibilityRequest request, RejectingException re) {
		CheckEligibilityResponse response = new CheckEligibilityResponse();
		if (request != null && request.getRequestId() != null
				&& request.getRequestId().length() > 0) {
			response.setResponseId(request.getRequestId());
		} else {
			response.setResponseId(new SimpleDateFormat("yyDDDHHmmssSS")
					.format(new Date()));
		}
		response.setErrorCode(re.getErrorCode());
		response.setErrorDescription(re.getErrorDescription());
		return response;
	}

}
