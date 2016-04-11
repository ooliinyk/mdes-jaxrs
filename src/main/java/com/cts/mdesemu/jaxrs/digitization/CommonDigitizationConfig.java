package com.cts.mdesemu.jaxrs.digitization;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.cts.mdesemu.jaxrs.CommonMdesRequest;
import com.cts.mdesemu.jaxrs.CommonMdesResponse;
import com.cts.mdesemu.jaxrs.CommonMdesResponseConfig;
import com.cts.mdesemu.jaxrs.RejectingException;

/**
 * PAN-range-based configurfation for check eligibility service
 * 
 * @author pilip
 *
 */
public abstract class CommonDigitizationConfig<T extends CommonMdesRequest, V extends CommonMdesResponse>
		extends CommonMdesResponseConfig {

	private Log logger = LogFactory.getLog(getClass());

	private RejectingException noMappingException;

	// TODO load as string, deserialize on-demand to change fields w/o original
	// affect?
	private Map<String, V> responseMap;

	public RejectingException getNoMappingException() {
		return noMappingException;
	}

	public void setNoMappingException(RejectingException noMappingException) {
		this.noMappingException = noMappingException;
	}

	public Map<String, V> getResponseMap() {
		return responseMap;
	}

	public void setResponseMap(Map<String, V> responseMap) {
		this.responseMap = responseMap;
	}

	protected abstract V deserialize(String json) throws IOException;

	private void addToResponses(String range, String json) throws IOException {

		if (this.logger.isDebugEnabled())
			this.logger.debug("Adding response from JSON. Range: " + range
					+ "; json = " + json);
		this.responseMap.put(range, this.deserialize(json));

	}

	public void setResponseMapJsons(Map<String, String> responseMapJsons)
			throws IOException {
		this.responseMap = new HashMap<>(responseMapJsons.size());
		for (String range : responseMapJsons.keySet()) {
			this.addToResponses(range, responseMapJsons.get(range));
		}
	}

	public void setResponseMapAsResources(
			Map<String, String> responseMapJsonsResources) throws IOException {
		this.responseMap = new HashMap<>(responseMapJsonsResources.size());
		for (String range : responseMapJsonsResources.keySet()) {

			StringBuilder json = new StringBuilder();
			try (FileReader fr = new FileReader(
					responseMapJsonsResources.get(range));
					BufferedReader r = new BufferedReader(fr);) {
				String s = null;
				while ((s = r.readLine()) != null) {
					json.append(s);
				}
			}

			this.addToResponses(range, json.toString());
		}
	}

	public V responseForRange(T request, String range)
			throws RejectingException {

		if (this.logger.isDebugEnabled())
			this.logger.debug("Searching response for range " + range);

		for (String key : this.responseMap.keySet()) {
			if (this.logger.isTraceEnabled())
				this.logger.trace("Trying key " + key + "...");
			if (range.startsWith(key)) {
				V response = this.responseMap.get(key);
				this.logger.info("Found matching response. key = " + key
						+ ", range = " + range + ", response = " + response);
				super.appyResponseId(request, response);
				return response;
			}
		}

		this.logger.warn("No response found for range " + range);

		throw this.noMappingException;
	}

	public V responseForValue(T request, String value)
			throws RejectingException {

		if (this.logger.isDebugEnabled())
			this.logger.debug("Searching response for key " + value);

		for (String key : this.responseMap.keySet()) {
			if (this.logger.isTraceEnabled())
				this.logger.trace("Trying key " + key + "...");
			if (key.startsWith(value)) {
				V response = this.responseMap.get(value);
				this.logger.info("Found matching response. key = " + key
						+ ", range = " + value + ", response = " + response);
				super.appyResponseId(request, response);
				return response;
			}
		}

		this.logger.warn("No response found for value " + value);
		throw this.noMappingException;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(this.getClass().getSimpleName() + " [");
		if (noMappingException != null) {
			builder.append("noMapping=");
			builder.append(noMappingException.getErrorCode());
			builder.append(", ");
		}
		if (responseMap != null) {
			builder.append("responseMap=<");
			for (String range : this.responseMap.keySet()) {
				builder.append("{").append(range).append("->")
						.append(this.responseMap.get(range)).append("}");
			}
			builder.append(">");
		}
		builder.append("]");
		return builder.toString();
	}

}
