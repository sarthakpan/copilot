package com.copilot.copilotservice;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CopilotserviceApplicationTests {

	@Test
	void contextLoads() {
	}

	//test case to check if the login method returns the correct string
	@Test
	public void testLogin() {
		RESTController restController = new RESTController();
		String result = restController.login("username", "password");
		assert(result.equals("Username: username Password: password"));
	}

	//test case to check if the register method returns the correct string
	@Test
	public void testRegister() {
		RESTController restController = new RESTController();
		String result = restController.register("username", "password", "confirmPassword", "address", "city", "country", "zip");
		assert(result.equals("Username: username Password: password Confirm Password: confirmPassword Address: address City: city Country: country Zip: zip"));
	}

}
