package com.example.endpoints;

import com.example.payload.UserModel;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
//create to perform CRUD operations in user api
public class UserEndPoints {

	public static Response createUser(UserModel payload) {
		Response response = RestAssured.given()
				.baseUri(Routes.baseuri)
				.basePath(Routes.post_basePath)
				.contentType("application/json")
				.accept(ContentType.JSON)
				.body(payload)
				.when()
				.post();
		return response;	
	}
	public static Response getUser(String username) {
		Response response = RestAssured.given()
				.baseUri(Routes.baseuri)
				.basePath(Routes.get_basePath)
				.pathParam("username", username)
				.contentType("application/json")
																.accept(ContentType.JSON)
															.when()
																.get();
		return response;
	}
	public static Response deleteUser(String username) {
		Response response = RestAssured.given()
				.baseUri(Routes.baseuri)
				.basePath(Routes.delete_basePath)
				.pathParam("username", username)
				.contentType("application/json")
				.accept(ContentType.JSON)
				.when()
				.delete();
		return response;
	}
	public static Response updateUser(String username,UserModel payload) {
		Response response = RestAssured.given()
																.baseUri(Routes.baseuri)
																.basePath(Routes.update_basePath)
																.pathParam("username", username)
																.contentType("application/json")
																.accept(ContentType.JSON)
								       							.body(payload)
															.when()
																.put();
		return response;
	}
}
