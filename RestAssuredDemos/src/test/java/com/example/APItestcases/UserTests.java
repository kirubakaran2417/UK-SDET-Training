package com.example.APItestcases;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.example.endpoints.UserEndPoints;
import com.example.payload.UserModel;
import com.github.javafaker.Faker;

import io.restassured.response.Response;

public class UserTests {
	 Faker faker;
	    UserModel userPayload;
	    @BeforeClass
	    public void setup()
	    {
	        faker = new Faker();
	        userPayload = new UserModel();
	        userPayload.setId(faker.idNumber().hashCode());
	        userPayload.setUsername(faker.name().username());
	        userPayload.setFirstname(faker.name().firstName());
	        userPayload.setLastname(faker.name().lastName());
	        userPayload.setEmail(faker.internet().safeEmailAddress());
	        userPayload.setPassword(faker.internet().password(5,10));
	        userPayload.setPhone(faker.phoneNumber().cellPhone());
	        //Logs
	    }
	    @Test(priority = 1)
	    public void testPostUser()
	    {
	        Response response = UserEndPoints.createUser(this.userPayload);
	        response.then().log().all();
	        Assert.assertEquals(response.getStatusCode(),200);
	    }
	    @Test(priority=2)
	    public void testGetUserByName()
	    {
	        Response response = UserEndPoints.getUser(this.userPayload.getUsername());
	       response.then().log().all();
	       Assert.assertEquals(response.getStatusCode(),200);
	    }
	    @Test(priority = 3)
	    public void testUpdateuserByName()
	    {
	        //Update data using payload
	        userPayload.setFirstname(faker.name().firstName());
	        userPayload.setLastname(faker.name().lastName());
	        userPayload.setEmail(faker.internet().safeEmailAddress());
	        Response response = UserEndPoints.updateUser(this.userPayload.getUsername(),userPayload);
	        response.then().log().all();
	        Assert.assertEquals(response.getStatusCode(),200);
	        //Checking data after updation
	        Response responseAfterUpdate = UserEndPoints.getUser(this.userPayload.getUsername());
	        responseAfterUpdate.then().log().all();
	        Assert.assertEquals(response.getStatusCode(),200);
	    }
	    @Test(priority = 4)
	    public void testDeleteUserByName()
	    {
	        Response response = UserEndPoints.deleteUser(this.userPayload.getUsername());
	        response.then().log().all();
	        Assert.assertEquals(response.getStatusCode(),200);
	    }
}