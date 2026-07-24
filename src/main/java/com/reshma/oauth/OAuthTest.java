package com.reshma.oauth;

import static io.restassured.RestAssured.given;

import io.restassured.path.json.JsonPath;

public class OAuthTest {

    public static void main(String[] args) {

        // Store complete API response in String format
        String response =

                // Start building the HTTP request
                given()

                        // Pass OAuth Client ID
                        .formParam("client_id",
                                "692183103107-p0m7ent2hk7suguv4vq22hjcfhcr43pj.apps.googleusercontent.com")

                        // Pass OAuth Client Secret
                        .formParam("client_secret",
                                "erZOWM9g3UtwNRj340YYaK_W")

                        // Pass OAuth Grant Type
                        .formParam("grant_type", "client_credentials")

                        // Pass OAuth Scope
                        .formParam("scope", "trust")

                // Hit Authorization Server
                .when()

                        .post("https://rahulshettyacademy.com/oauthapi/oauth2/resourceOwner/token")

                // Validate Response
                .then()

                        // Print complete response in console
                        .log().all()

                        // Extract response as String
                        .extract().response().asString();

        // Print response separately
        System.out.println(response);
        JsonPath js = new JsonPath(response);
        String accessToken = js.getString("access_token");
        System.out.println(accessToken);
     // Store Get Course Details API response
        String courseResponse =

                // Start building secured GET request
                given()

                // Pass Access Token as Query Parameter
                .queryParam("access_token", accessToken)

                // Hit Get Course Details API
                .when()
                .get("https://rahulshettyacademy.com/oauthapi/getCourseDetails")

                // Validate response and extract as String
                .then()
                .log().all()
                .extract().response().asString();

        // Print Get Course Details response
        System.out.println(courseResponse);          		
    }

}