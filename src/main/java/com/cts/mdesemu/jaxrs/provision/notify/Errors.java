package com.cts.mdesemu.jaxrs.provision.notify;

import java.io.Serializable;

/**
 * Created by user on 12.04.2016.
 */
public class Errors implements Serializable {

    private static final long serialVersionUID = -1344362250684571047L;

    private String errorCode;
    private String errorDescription;

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

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Errors{");
        sb.append("errorCode='").append(errorCode).append('\'');
        sb.append(", errorDescription='").append(errorDescription).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
