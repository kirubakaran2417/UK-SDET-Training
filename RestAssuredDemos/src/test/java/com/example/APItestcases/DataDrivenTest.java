package com.example.APItestcases;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.example.endpoints.UserEndPoints;
import com.example.payload.UserModel;
import com.example.utilities.DataProviders;

import io.restassured.response.Response;
@Listeners(com.example.utilities.ExtentReportManager.class)
public class DataDrivenTest {

	@Test(priority = 1, dataProvider = "data", dataProviderClass = DataProviders.class)
	public void testPostUser(String userID,String username, String firstname, String lastname, String email, String password, String phone) {
		UserModel user = new UserModel();
		user.setId(Integer.parseInt(userID));
		user.setUsername(username);
		user.setFirstname(firstname);
		user.setLastname(lastname);
		user.setEmail(email);
		user.setPassword(password);
		user.setPhone(phone);
		
		Response response = UserEndPoints.createUser(user);
		response.then().log().all();
		Assert.assertEquals(response.getStatusCode(), 200);
	}
	@Test(priority = 2, dataProvider = "UserNames", dataProviderClass = DataProviders.class)
	public void testDeleteByUserName(String username) {
		
		Response response = UserEndPoints.deleteUser(username);
		response.then().log().all();
		Assert.assertEquals(response.getStatusCode(), 200);
	}
		
	
	
	
	
}
