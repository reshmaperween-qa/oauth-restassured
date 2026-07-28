package com.reshma.oauth;

import static io.restassured.RestAssured.*;

import java.util.Arrays;

import io.restassured.path.json.JsonPath;
import pojo.AddPlace;
import pojo.Location;

public class SerializeTest {

	public static void main(String[] args) {

		// Set Base URI
		baseURI = "https://rahulshettyacademy.com";

		// Create AddPlace object
		AddPlace addPlace = new AddPlace();

		// Create Location object
		Location location = new Location();

		// Set latitude
		location.setLat(-38.383494);

		// Set longitude
		location.setLng(33.427362);

		// Add location
		addPlace.setLocation(location);

		// Set accuracy
		addPlace.setAccuracy(50);

		// Set place name
		addPlace.setName("Frontline house");

		// Set phone number
		addPlace.setPhone_number("(+91) 983 893 3937");

		// Set address
		addPlace.setAddress("29, side layout, cohen 09");

		// Set place types
		addPlace.setTypes(Arrays.asList("shoe park", "shop"));

		// Set website
		addPlace.setWebsite("http://google.com");

		// Set language
		addPlace.setLanguage("French-IN");

		// Add Place API
		String response = given()
				.log().all() // Print request
				.queryParam("key", "qaclick123")
				.header("Content-Type", "application/json")
				.body(addPlace) // Java Object -> JSON

		.when()
				.post("/maps/api/place/add/json")

		.then()
				.log().all() // Print response
				.assertThat()
				.statusCode(200)
				.extract()
				.response()
				.asString();

		// Create JsonPath object
		JsonPath js = new JsonPath(response);

		// Extract place_id
		String placeId = js.getString("place_id");

		// Print place_id
		System.out.println("Place ID : " + placeId);

		// Update Place API
		String updateResponse = given()
				.log().all() // Print request
				.queryParam("key", "qaclick123")
				.header("Content-Type", "application/json")
				.body(Payload.updatePlacePayload(placeId)) // Update payload

		.when()
				.put("/maps/api/place/update/json")

		.then()
				.log().all() // Print response
				.assertThat()
				.statusCode(200)
				.extract()
				.response()
				.asString();

		// Print update response
		System.out.println(updateResponse);

		// Get Place Details API
		String getResponse = given()
				.log().all() // Print request
				.queryParam("key", "qaclick123")
				.queryParam("place_id", placeId)

		.when()
				.get("/maps/api/place/get/json")

		.then()
				.log().all() // Print response
				.assertThat()
				.statusCode(200)
				.extract()
				.response()
				.asString();

		// Print Get Place response
	//	System.out.println(getResponse);

	}
}