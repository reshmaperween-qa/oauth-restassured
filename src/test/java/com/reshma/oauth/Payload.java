package com.reshma.oauth;

public class Payload {

	// Update Place request body
	public static String updatePlacePayload(String placeId) {

		return "{\r\n"
				+ "\"place_id\":\"" + placeId + "\",\r\n"
				+ "\"address\":\"70 Summer walk, USA\",\r\n"
				+ "\"key\":\"qaclick123\"\r\n"
				+ "}";
	}

}