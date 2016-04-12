package com.cts.mdesemu.jaxrs.provision.impl;

import com.cts.mdesemu.jaxrs.RejectingException;
import com.cts.mdesemu.jaxrs.ServiceWrapper;
import com.cts.mdesemu.jaxrs.provision.dictionary.Errors;
import com.cts.mdesemu.jaxrs.provision.dictionary.notify.NotifyProvisioningResultConfig;
import com.cts.mdesemu.jaxrs.provision.dictionary.notify.NotifyProvisioningResultRequest;
import com.cts.mdesemu.jaxrs.provision.dictionary.notify.NotifyProvisioningResultResponse;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.text.SimpleDateFormat;
import java.util.Date;

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

        if (request == null){
            throw new RejectingException(
                    RejectingException.ERROR_CODE.INVALID_JSON.name(),
                    "Empty (null) request");}

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

        NotifyProvisioningResultResponse response = new NotifyProvisioningResultResponse();
        if (request != null && request.getRequestId() != null
                && request.getRequestId().length() > 0) {
            response.setResponseId(request.getRequestId());
        } else {
            response.setResponseId(new SimpleDateFormat("yyDDDHHmmssSS")
                    .format(new Date()));
        }

        Errors errors = new Errors();
        errors.setErrorCode(re.getErrorCode());
        errors.setErrorDescription(re.getErrorDescription());
        Errors[] errorses = {errors};
        response.setErrors(errorses);
        return response;
    }
}
