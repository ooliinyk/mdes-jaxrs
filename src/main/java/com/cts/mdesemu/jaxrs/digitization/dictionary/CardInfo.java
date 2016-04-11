package com.cts.mdesemu.jaxrs.digitization.dictionary;

import java.io.Serializable;

public class CardInfo implements Serializable {

	private static final long serialVersionUID = 5000234998225122259L;

	private String certificateFingerprint;
	private String encryptedKey;
	private String oaepHashingAlgorithm;
	private String iv;
	private String encryptedData;
	private CardInfoData unencryptedData;

	public String getCertificateFingerprint() {
		return certificateFingerprint;
	}

	public void setCertificateFingerprint(String certificateFingerprint) {
		this.certificateFingerprint = certificateFingerprint;
	}

	public String getEncryptedKey() {
		return encryptedKey;
	}

	public void setEncryptedKey(String encryptedKey) {
		this.encryptedKey = encryptedKey;
	}

	public String getOaepHashingAlgorithm() {
		return oaepHashingAlgorithm;
	}

	public void setOaepHashingAlgorithm(String oaepHashingAlgorithm) {
		this.oaepHashingAlgorithm = oaepHashingAlgorithm;
	}

	public String getIv() {
		return iv;
	}

	public void setIv(String iv) {
		this.iv = iv;
	}

	public String getEncryptedData() {
		return encryptedData;
	}

	public void setEncryptedData(String encryptedData) {
		this.encryptedData = encryptedData;
	}

	public CardInfoData getUnencryptedData() {
		return unencryptedData;
	}

	public void setUnencryptedData(CardInfoData unencryptedData) {
		this.unencryptedData = unencryptedData;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CardInfo [");
		if (certificateFingerprint != null) {
			builder.append("certificateFingerprint=");
			builder.append(certificateFingerprint);
			builder.append(", ");
		}
		if (encryptedKey != null) {
			builder.append("encryptedKey=");
			builder.append(encryptedKey);
			builder.append(", ");
		}
		if (oaepHashingAlgorithm != null) {
			builder.append("oaepHashingAlgorithm=");
			builder.append(oaepHashingAlgorithm);
			builder.append(", ");
		}
		if (iv != null) {
			builder.append("iv=");
			builder.append(iv);
			builder.append(", ");
		}
		if (encryptedData != null) {
			builder.append("encryptedData=");
			builder.append(encryptedData);
			builder.append(", ");
		}
		if (unencryptedData != null) {
			builder.append("unencryptedData=");
			builder.append(unencryptedData);
		}
		builder.append("]");
		return builder.toString();
	}

}
