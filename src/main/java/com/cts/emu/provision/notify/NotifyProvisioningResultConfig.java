package com.cts.emu.provision.notify;

import com.cts.emu.provision.dictionary.notify.NotifyProvisioningResultRequest;
import com.cts.mdesemu.jaxrs.JsonObjectMapper;
import com.cts.mdesemu.jaxrs.digitization.CommonDigitizationConfig;
import com.cts.emu.provision.dictionary.notify.NotifyProvisioningResultResponse;

import java.io.IOException;

/**
 * Created by user on 07.04.2016.
 */
public class NotifyProvisioningResultConfig extends CommonDigitizationConfig<NotifyProvisioningResultRequest, NotifyProvisioningResultResponse> {
    @Override
    protected NotifyProvisioningResultResponse deserialize(String json) throws IOException {
        return JsonObjectMapper.getInstance().readValue(json,
                NotifyProvisioningResultResponse.class);
    }
}
