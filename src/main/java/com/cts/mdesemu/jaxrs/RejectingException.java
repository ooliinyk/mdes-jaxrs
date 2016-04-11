package com.cts.mdesemu.jaxrs;

public class RejectingException extends Exception {

	public static enum ERROR_CODE {
		INVALID_JSON, INVALID_FIELD_FORMAT, INVALID_FIELD_VALUE, NO_RESPONSE_FROM_ISSUER, MISSING_REQUIRED_FIELD, CRYPTOGRAPHY_ERROR, INTERNAL_SERVICE_FAILURE, PAN_INELIGIBLE, DEVICE_INELIGIBLE, PAN_PROVISIONING_COUNT_EXCEEDED, INVALID_ELIGIBILITY_RECEIPT, INVALID_TASK_ID, INVALID_TERMS_AND_CONDITIONS, INVALID_TOKEN_UNIQUE_REFERENCE, INVALID_TOKEN_STATUS, NO_ACTIVE_TOKENS
	}

	private static final long serialVersionUID = 4470285347691917332L;

	private String errorCode;

	private String errorDescription;

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorDescription() {
		return errorDescription;
	}

	public void setErrorDescription(String errorDescription) {
		this.errorDescription = errorDescription;
	}

	public RejectingException(String errorCode, String errorDescription) {
		super();
		this.errorCode = errorCode;
		this.errorDescription = errorDescription;
	}

	public RejectingException(String errorCode, String errorDescription,
			String message, Throwable cause) {
		super(message, cause);
		this.errorCode = errorCode;
		this.errorDescription = errorDescription;
	}

	public RejectingException(String errorCode, String errorDescription,
			String message) {
		super(message);
		this.errorCode = errorCode;
		this.errorDescription = errorDescription;
	}

	public RejectingException(String errorCode, String errorDescription,
			Throwable cause) {
		super(cause);
		this.errorCode = errorCode;
		this.errorDescription = errorDescription;
	}

}
