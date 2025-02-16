package com.automationexercise.testcases;

import org.testng.annotations.Test;

import com.automationexercise.pages.BaseTest;
import com.automationexercise.pages.SignupLoginPage;

public class SignupTest extends BaseTest {

	@Test(enabled = false)
	public void signupTest() {
		// Initialize the LoginPage object
		SignupLoginPage signupLoginPage = new SignupLoginPage(driver);

		// Perform the login action
		signupLoginPage.enterSignupName("Narendra123");
		signupLoginPage.enterSignupPassword("narendra123@gmail.com");
		signupLoginPage.clickSignup();
	}
}
