package com.cts.mdesemu.jaxrs;

import org.codehaus.jackson.map.DeserializationConfig;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.SerializationConfig;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

public class JsonObjectMapper extends ObjectMapper {

	public JsonObjectMapper() {
		super();
		super._serializationConfig
				.setSerializationInclusion(Inclusion.NON_NULL);
		super.configure(SerializationConfig.Feature.FAIL_ON_EMPTY_BEANS, false);
		super.configure(
				DeserializationConfig.Feature.FAIL_ON_UNKNOWN_PROPERTIES, false);
	}

	private static JsonObjectMapper instance = new JsonObjectMapper();

	public static JsonObjectMapper getInstance() {
		return instance;
	}

}
