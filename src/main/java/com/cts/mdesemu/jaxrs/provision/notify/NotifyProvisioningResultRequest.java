package com.cts.mdesemu.jaxrs.provision.notify;

import com.cts.mdesemu.jaxrs.CommonMdesRequest;

import java.util.Arrays;

/**
 *
 * Simplified request source for 3.3.1: Notify Provisioning Result
 * Created by user on 07.04.2016.
 */
public class NotifyProvisioningResultRequest extends CommonProvisionRequest {


    private static final long serialVersionUID = 8404820311718893206L;



    private String tokenUniqueReference;
    private String result;
    private String errorCode;
    private String errorDescription;
    private APDUResponse[] apduResponses;

    public String getTokenUniqueReference() {
        return tokenUniqueReference;
    }

    public void setTokenUniqueReference(String tokenUniqueReference) {
        this.tokenUniqueReference = tokenUniqueReference;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

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

    public APDUResponse[] getApduResponses() {
        return apduResponses;
    }

    public void setApduResponses(APDUResponse[] apduResponses) {
        this.apduResponses = apduResponses;
    }

    @Override
    public String toString() {
        return "NotifyProvisioningResultRequest{" +
                "tokenUniqueReference='" + tokenUniqueReference + '\'' +
                ", result='" + result + '\'' +
                ", errorCode='" + errorCode + '\'' +
                ", errorDescription='" + errorDescription + '\'' +
                ", apduResponses=" + Arrays.toString(apduResponses) +
                '}';
    }
}

