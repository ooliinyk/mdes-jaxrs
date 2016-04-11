package com.cts.mdesemu.jaxrs.digitization;

public class StandardDigitizationService {

	protected byte[] encryptSensitiveData(byte[] data) {
		// TODO implement encryption
		byte[] result = new byte[data.length];
		System.arraycopy(data, 0, result, 0, data.length);
		return result;
	}

}
