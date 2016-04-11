package com.cts.mdesemu.jaxrs.digitization.impl;

import com.cts.mdesemu.jaxrs.RejectingException;
import com.cts.mdesemu.jaxrs.digitization.dictionary.CardInfo;
import com.cts.mdesemu.jaxrs.digitization.dictionary.CardInfoData;

/**
 * Resolver for card-info-data object from CardInfo. Extracts data from
 * cardInfo.unencryptedData (as-is) or from cardInfo.encryptedData with
 * decryption
 * 
 * @author pilip
 *
 */
public interface CardInfoDataResolver {

	public CardInfoData resolveCardInfoData(CardInfo cardInfo)
			throws RejectingException;

}
