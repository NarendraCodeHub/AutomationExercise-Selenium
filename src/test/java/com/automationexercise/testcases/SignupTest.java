package com.automationexercise.testcases;

import org.testng.annotations.Test;

import com.automationexercise.pages.BaseTest;
import com.automationexercise.pages.HomePage;
import com.automationexercise.pages.SignupLoginPage;

public class SignupTest extends BaseTest {

	@Test
	public void signupTest() {
		// Initialize the LoginPage object
		HomePage homePage = new HomePage(driver);
		SignupLoginPage signupLoginPage = new SignupLoginPage(driver);

		// Assert Visibility of Sign Up page

		signupLoginPage.isVisibleSignupText();

		// Perform the login action
		homePage.clickSignupLogin();
		signupLoginPage.enterSignupName("Narendra123");
		signupLoginPage.enterSignupPassword("narendra123@gmail.com");
		signupLoginPage.clickSignup();
	}
}
