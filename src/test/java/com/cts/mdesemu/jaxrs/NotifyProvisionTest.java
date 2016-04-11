package com.cts.mdesemu.jaxrs;

import com.cts.mdesemu.jaxrs.provision.notify.NotifyProvisioningResultRequest;
import com.cts.mdesemu.jaxrs.provision.notify.NotifyProvisioningResultResponse;
import org.apache.cxf.jaxrs.client.WebClient;
import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.map.MappingJsonFactory;
import org.junit.Assert;

import javax.ws.rs.core.Response;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 07.04.2016.
 */
public class NotifyProvisionTest {
    private static String endpointUrl;

//    @BeforeClass
    public static void beforeClass() {
        endpointUrl = System.getProperty("service.url");
    }

//    @Test
    public void testNotifyProvisionTest() throws Exception {
        List<Object> providers = new ArrayList<Object>();
        providers.add(new org.codehaus.jackson.jaxrs.JacksonJsonProvider());
        NotifyProvisioningResultRequest request= new NotifyProvisioningResultRequest();

        request.setRequestId("123456");
        request.setResponseHost("site2. cmsdedicated.com");
        request.setTokenUniqueReference("DWSPMC000000000132d72d4fcb2f4136a0532d3093ff1a45");
        request.setResult("SUCCESS");

            WebClient client = WebClient.create(endpointUrl	+ "/provision/AAA/notifyProvisioningResult", providers);
        Response r = client.accept("application/json").type("application/json").post(request);
        Assert.assertEquals(Response.Status.OK.getStatusCode(), r.getStatus());
        MappingJsonFactory factory = new MappingJsonFactory();
        JsonParser parser = factory.createJsonParser((InputStream) r.getEntity());
        NotifyProvisioningResultResponse response = parser.readValueAs(NotifyProvisioningResultResponse.class);
//        CheckEligibilityResponse response = parser.readValueAs(CheckEligibilityResponse.class);

        Assert.assertNotNull("Response is NULL", response);
        Assert.assertNotNull("ResponseID is null", response.getResponseId());
//        Assert.assertNotNull("EligibilityReceipt is null",	response.getEligibilityReceipt());
    }
}
