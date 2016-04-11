package com.cts.mdesemu.jaxrs.provision.notify;

import com.cts.mdesemu.jaxrs.RejectingException;
import com.cts.mdesemu.jaxrs.ServiceWrapper;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Created by user on 07.04.2016.
 */
public class NotifyProvisioningResultService extends ServiceWrapper<NotifyProvisioningResultRequest, NotifyProvisioningResultResponse> {

    private Log logger = LogFactory.getLog(getClass());

    private NotifyProvisioningResultConfig config;

    public NotifyProvisioningResultConfig getConfig() {
        return config;
    }

    public void setConfig(NotifyProvisioningResultConfig config) {
        this.config = config;
    }

    @Override
    protected NotifyProvisioningResultResponse doProcessRequest(NotifyProvisioningResultRequest request) throws RejectingException {

        if (this.logger.isDebugEnabled()) {
            this.logger.debug("Processing request: " + request);
        }

        if (request == null)
            throw new RejectingException(
                    RejectingException.ERROR_CODE.INVALID_JSON.name(),
                    "Empty (null) request");

        if (request.getResult().equals("ERROR")) {
//            DO smth
        }
        NotifyProvisioningResultResponse response = new NotifyProvisioningResultResponse();
        response.setResponseHost(request.getResponseHost());
        response.setResponseId(request.getRequestId());

        this.logger.info("Processed request.\n\tRequest details: " + request
                + "\n\tResponse details = " + response);
        return response;
    }

    @Override
    protected NotifyProvisioningResultResponse responseOnError(NotifyProvisioningResultRequest request, RejectingException re) {
        return null;
    }
}
