package com.cts.mdesemu.jaxrs;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public abstract class ServiceWrapper<T, V> {

	private Log logger = LogFactory.getLog(ServiceWrapper.class);

	protected abstract V doProcessRequest(T request) throws RejectingException;

	// TODO extend common MDES request and common MDES response
	protected abstract V responseOnError(T request, RejectingException re);

	public V processRequest(T request) {
		try {
			try {
				return this.doProcessRequest(request);
			} catch (RejectingException re) {
				throw re;
			} catch (Exception e) {
				this.logger.warn("Unexpected exception occured", e);
				throw new RejectingException(
						RejectingException.ERROR_CODE.INTERNAL_SERVICE_FAILURE
								.name(),
						e.getMessage());
			}
		} catch (RejectingException re) {
			// TODO remove when common superclass object appears
			return this.responseOnError(request, re);
		}
	}

}
