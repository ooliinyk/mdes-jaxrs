package com.cts.mdesemu.jaxrs.digitization.chel;

import java.io.IOException;

import com.cts.mdesemu.jaxrs.JsonObjectMapper;
import com.cts.mdesemu.jaxrs.digitization.CommonDigitizationConfig;
import com.cts.mdesemu.jaxrs.digitization.dictionary.chel.CheckEligibilityRequest;
import com.cts.mdesemu.jaxrs.digitization.dictionary.chel.CheckEligibilityResponse;

/**
 * PAN-range-based configurfation for check eligibility service
 * 
 * @author pilip
 *
 */
public class CheckEligibilityConfig
		extends
		CommonDigitizationConfig<CheckEligibilityRequest, CheckEligibilityResponse> {

	@Override
	protected CheckEligibilityResponse deserialize(String json)
			throws IOException {
		return JsonObjectMapper.getInstance().readValue(json,
				CheckEligibilityResponse.class);
	}

}
