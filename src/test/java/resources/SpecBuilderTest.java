package resources;

import static io.restassured.RestAssured.given;

import java.util.Arrays;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import pojo.AddPlace;
import pojo.Location;

public class SpecBuilderTest {

	public static void main(String[] args) {

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

		// Create Request Specification
		RequestSpecification reqSpec = new RequestSpecBuilder()

				// Set Base URI
				.setBaseUri("https://rahulshettyacademy.com")

				// Set Content Type
				.setContentType(ContentType.JSON)

				// Add Query Parameter
				.addQueryParam("key", "qaclick123")

				// Build Request Specification
				.build();

		// Create Response Specification
		ResponseSpecification resSpec = new ResponseSpecBuilder()

				// Expect Status Code
				.expectStatusCode(200)

				// Expect JSON Response
				.expectContentType(ContentType.JSON)

				// Build Response Specification
				.build();

		// Send POST Request
		Response response = given()

				// Use Request Specification
				.spec(reqSpec)

				// Add Request Body
				.body(addPlace)

		.when()

				// Call Add Place API
				.post("/maps/api/place/add/json")

		.then()

				// Use Response Specification
				.spec(resSpec)

				// Extract Response
				.extract()

				// Store Response
				.response();

		// Convert Response to String
		String responseString = response.asString();

		// Print Response
		System.out.println(responseString);

		// Create JsonPath object
		JsonPath js = new JsonPath(responseString);

		// Get Place ID
		String placeId = js.getString("place_id");

		// Print Place ID
		System.out.println("Place ID : " + placeId);

	}

}