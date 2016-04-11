package com.cts.mdesemu.jaxrs.digitization.impl;

import com.cts.mdesemu.jaxrs.RejectingException;
import com.cts.mdesemu.jaxrs.digitization.dictionary.CardInfo;
import com.cts.mdesemu.jaxrs.digitization.dictionary.CardInfoData;

public class CardInfoDataNoEncryptionResolver implements
		CardInfoDataResolver {

	@Override
	public CardInfoData resolveCardInfoData(CardInfo cardInfo)
			throws RejectingException {
		return cardInfo.getUnencryptedData();
	}

}
