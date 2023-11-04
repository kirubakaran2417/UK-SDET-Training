package org.example;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.InputStream;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.responseSpecification;

public class GetRequest {




@Test
    public  void postRequest() {
        // Define the base URL of the API
        RestAssured.baseURI = "https://rahulshettyacademy.com/maps/api/place/add/json?key=qaclick123"; // Replace with the actual API base URL.

        // Create a RequestSpecification object
        String requestBody = "{\n" +
                "  \"location\": {\n" +
                "    \"lat\": -38.383494,\n" +
                "    \"lng\": 33.427362\n" +
                "  },\n" +
                "  \"accuracy\": 50,\n" +
                "  \"name\": \"Frontline house\",\n" +
                "  \"phone_number\": \"(+91) 983 893 3937\",\n" +
                "  \"address\": \"29, side layout, cohen 09\",\n" +
                "  \"types\": [\n" +
                "    \"shoe park\",\n" +
                "    \"shop\"\n" +
                "  ],\n" +
                "  \"website\": \"http://google.com\",\n" +
                "  \"language\": \"French-IN\"\n" +
                "}";

        // Send the POST request
        RestAssured.given()
                .contentType(ContentType.JSON)
                .body(requestBody)
                .when()
                .post("/endpoint") // Replace with the actual API endpoint
                .then()
                .statusCode(200); // Replace with the expected HTTP status code
    }

    @Test
    public void putTest(){
        String baseUrl = "https://rahulshettyacademy.com/maps/api/place/update/json";

        // Define the request body
        String requestBody = "{\n" +
                "\"place_id\":\"ec829b9361c80a59dba195279c00cd30\",\n" +
                "\"address\":\"70 Summer walk, USA\",\n" +

                "}";

        // Perform the PUT request using Rest Assured
        RestAssured.given()
                .contentType(ContentType.JSON)
                .queryParam("key", "qaclick123")
                .body(requestBody)
                .when()
                .put(baseUrl)
                .then()
                .statusCode(200); // You can adjust the expected status code

        System.out.println("Place updated successfully!");
    }

    //create a new get request method using TestNG and restassured
    @Test
    public void getRequest(){
        String baseUrl = "https://dummy.restapiexample.com/api/v1/employee/1";
       Response response = RestAssured.get(baseUrl);
        ResponseBody body = response.getBody();
        String responseString = body.asString();
        System.out.println(responseString);
        Assert.assertTrue(responseString.contains("employee_name"));

        JsonPath jsonpatheval=response.jsonPath();
        String status=jsonpatheval.get("status");
        System.out.println(status);
        Assert.assertEquals(status,"success");
    }
    @Test
    public void testCreateJSONschema(){
        String baseUrl = "https://dummy.restapiexample.com/api/v1/employee/1";
        InputStream getBookingJSONSchema = getClass().getClassLoader()
                .getResourceAsStream("getRequestJSONschema.json");
        given()
                .when().get(baseUrl).then().statusCode(200)
                .and().assertThat().body(JsonSchemaValidator.matchesJsonSchema(getBookingJSONSchema));
    }

}









