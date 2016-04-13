package com.cts.emu;

import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.ws.rs.core.Response;


import com.cts.emu.provision.dictionary.notify.NotifyProvisioningResultRequest;
import com.cts.emu.provision.dictionary.notify.NotifyProvisioningResultResponse;
import org.apache.cxf.jaxrs.client.WebClient;
import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.map.MappingJsonFactory;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import com.cts.mdesemu.jaxrs.digitization.dictionary.CardInfo;
import com.cts.mdesemu.jaxrs.digitization.dictionary.CardInfoData;
import com.cts.mdesemu.jaxrs.digitization.dictionary.chel.CheckEligibilityRequest;
import com.cts.mdesemu.jaxrs.digitization.dictionary.chel.CheckEligibilityResponse;

/**
 * Created by user on 13.04.2016.
 */
public class ProvisionTest {
    private static String endpointUrl;

    @BeforeClass
    public static void beforeClass() {
        endpointUrl = System.getProperty("service.url");
    }


    @Test
    public void testNotifyProvisioninResul() throws Exception{

        List<Object> providers = new ArrayList<Object>();
        providers.add(new org.codehaus.jackson.jaxrs.JacksonJsonProvider());

        NotifyProvisioningResultRequest request= new NotifyProvisioningResultRequest();

        request.setRequestId("123456");
        request.setResponseHost("site2.cmsdedicated.com");
        request.setTokenUniqueReference("D");
        request.setResult("SUCCESS");

        WebClient client = WebClient.create(endpointUrl	+ "/credentials/1/0/notifyProvisioningResult", providers);
        Response r = client.accept("application/json").type("application/json").post(request);
        Assert.assertEquals(Response.Status.OK.getStatusCode(), r.getStatus());
        MappingJsonFactory factory = new MappingJsonFactory();
        JsonParser parser = factory.createJsonParser((InputStream) r.getEntity());
        NotifyProvisioningResultResponse response = parser.readValueAs(NotifyProvisioningResultResponse.class);


        Assert.assertNotNull("Response is NULL", response);
        Assert.assertNotNull("ResponseID is null", response.getResponseId());

    }

}