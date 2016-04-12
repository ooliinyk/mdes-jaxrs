package com.cts.mdesemu.jaxrs.provision.dictionary.notify;

import java.io.Serializable;

/**
 * Created by user on 07.04.2016.
 */
public class APDUResponse implements Serializable {


    private static final long serialVersionUID = 6469474912990962639L;

    private String messageId;

    private String apduResponse;

    public String getApduResponse() {
        return apduResponse;
    }

    public void setApduResponse(String apduResponse) {
        this.apduResponse = apduResponse;
    }

    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    @Override
    public String toString() {
        return "APDUResponse{" +
                "messageId='" + messageId + '\'' +
                ", apduResponse='" + apduResponse + '\'' +
                '}';
    }
}
