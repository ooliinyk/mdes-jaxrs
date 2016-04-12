package com.cts.mdesemu.jaxrs.provision.notify;

import com.cts.mdesemu.jaxrs.CommonMdesRequest;

/**
 * Created by user on 12.04.2016.
 */
public class CommonProvisionRequest extends CommonMdesRequest {


    private static final long serialVersionUID = 3772621807400765363L;
    private String responseHost;
    private String requestId;

    public String getResponseHost() {
        return responseHost;
    }

    public void setResponseHost(String responseHost) {
        this.responseHost = responseHost;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }


}
