package com.reshma.oauth;

import static io.restassured.RestAssured.given;

import io.restassured.path.json.JsonPath;
import pojo.GetCourse;

public class OAuthTest {

    public static void main(String[] args) {

        // Generate access token
        String response =

                given()

                        // Pass client ID
                        .formParam("client_id",
                                "692183103107-p0m7ent2hk7suguv4vq22hjcfhcr43pj.apps.googleusercontent.com")

                        // Pass client secret
                        .formParam("client_secret",
                                "erZOWM9g3UtwNRj340YYaK_W")

                        // Pass grant type
                        .formParam("grant_type", "client_credentials")

                        // Pass scope
                        .formParam("scope", "trust")

                .when()

                        // Send POST request
                        .post("https://rahulshettyacademy.com/oauthapi/oauth2/resourceOwner/token")

                .then()

                        // Verify status code
                        .statusCode(200)

                        // Print response
                        .log().all()

                        // Extract response
                        .extract().response().asString();

        // Create JsonPath object
        JsonPath js = new JsonPath(response);

        // Get access token
        String accessToken = js.getString("access_token");

        // Print access token
        System.out.println(accessToken);

        // Call Get Course API
        GetCourse courseResponse =

                given()

                        // Pass access token
                        .queryParam("access_token", accessToken)

                .when()

                        // Send GET request
                        .get("https://rahulshettyacademy.com/oauthapi/getCourseDetails")

                .then()

                        // Print response
                        .log().all()

                        // Convert JSON to POJO
                        .extract().as(GetCourse.class);

        // Print instructor
        System.out.println(courseResponse.getInstructor());

        // Print LinkedIn
        System.out.println(courseResponse.getLinkedIn());

        // Print services
        System.out.println(courseResponse.getServices());

        // Print expertise
        System.out.println(courseResponse.getExpertise());

        // Print first API course
        System.out.println(courseResponse.getCourses().getApi().get(0).getCourseTitle());

        // Print all API courses
        for (int i = 0; i < courseResponse.getCourses().getApi().size(); i++) {

            System.out.println(courseResponse.getCourses().getApi().get(i).getCourseTitle());

        }

        // Print all Web Automation courses
        for (int i = 0; i < courseResponse.getCourses().getWebAutomation().size(); i++) {

            System.out.println(courseResponse.getCourses().getWebAutomation().get(i).getCourseTitle());

        }

        // Print all Mobile courses
        for (int i = 0; i < courseResponse.getCourses().getMobile().size(); i++) {

            System.out.println(courseResponse.getCourses().getMobile().get(i).getCourseTitle());

        }

        // Find Selenium course
        for (int i = 0; i < courseResponse.getCourses().getWebAutomation().size(); i++) {

            // Check course title
            if (courseResponse.getCourses().getWebAutomation().get(i).getCourseTitle()
                    .equalsIgnoreCase("Selenium Webdriver Java")) {

                // Print course price
                System.out.println(courseResponse.getCourses().getWebAutomation().get(i).getPrice());

                break;
            }
        }
    }
}