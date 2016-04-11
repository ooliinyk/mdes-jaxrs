package com.cts.mdesemu.jaxrs.digitization.impl;

import com.cts.mdesemu.jaxrs.RejectingException;
import com.cts.mdesemu.jaxrs.digitization.dictionary.CardInfo;
import com.cts.mdesemu.jaxrs.digitization.dictionary.CardInfoData;

/**
 * Resolves CardInfo from encrypted data
 * 
 * @author pilip
 *
 */
public class CardInfoDataDecryptor implements CardInfoDataResolver {

	// TODO implement me
	@Override
	public CardInfoData resolveCardInfoData(CardInfo cardInfo)
			throws RejectingException {
		throw new RuntimeException("Data decryption not supported yet");
	}

}
