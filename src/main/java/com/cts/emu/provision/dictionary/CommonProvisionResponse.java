package com.cts.emu.provision.dictionary;

import com.cts.mdesemu.jaxrs.CommonMdesResponse;

import java.util.Arrays;

/**
 * Created by user on 12.04.2016.
 */
public class CommonProvisionResponse extends CommonMdesResponse {


    private static final long serialVersionUID = 8577071203294447010L;

    private Errors[] errors;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Errors[] getErrors() {
        return errors;
    }

    public void setErrors(Errors[] errors) {
        this.errors = errors;
    }



//    CHANGE TO STRING!!!!!
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CommonProvisionResponse{");

        if (getResponseId() != null) {
            sb.append("responseId=");
            sb.append(getResponseId());
            sb.append(", ");
        }
        sb.append("errors=").append(Arrays.toString(errors));

        sb.append('}');
        return sb.toString();
    }
}
