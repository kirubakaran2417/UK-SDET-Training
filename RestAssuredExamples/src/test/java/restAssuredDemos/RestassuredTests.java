package restAssuredDemos;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class RestassuredTests {

    RequestSpecification requestSpecification;
    Response response;
    ValidatableResponse validatableResponse;
    @Test
    public void getRequest() {
        RestAssured.baseURI = "https://dummy.restapiexample.com/api/v1/employees";
        //create a request specification
        requestSpecification = RestAssured.given();
        //send a get request
        response = requestSpecification.get();
        //print the response body
        String responseBody = response.getBody().asString();
        System.out.println("Response Body is: " + responseBody);
        //To validate the response
        validatableResponse=response.then();
        validatableResponse.assertThat().statusCode(200);
        validatableResponse.assertThat().contentType("application/json");
        validatableResponse.assertThat().statusLine("HTTP/1.1 200 OK");
    }
    @Test
    public void getRequest2() {
        RestAssured.given().baseUri("https://dummy.restapiexample.com/api/v1/employees")
                .when().get()
                .then().assertThat().statusCode(200)
                .and().contentType("application/json")
                .and().statusLine("HTTP/1.1 200 OK");
    }
    @Test
    public void postRequest() {
        String jsonString = "{\"name\":\"lokesh\",\"salary\":\"3000000\",\"age\":\"23\"}";
        Response response = RestAssured.given().baseUri("https://dummy.restapiexample.com/api/v1/create")
                .contentType(ContentType.JSON)
                .body(jsonString)
                .when().post();

        response.then().assertThat().statusCode(200)
                .and().contentType("application/json")
                .and().statusLine("HTTP/1.1 200 OK");

        response.prettyPrint();


    }
}
