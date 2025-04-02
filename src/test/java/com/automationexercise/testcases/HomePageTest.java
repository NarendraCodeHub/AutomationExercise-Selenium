package com.automationexercise.testcases;

import java.time.Duration;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.automationexercise.pages.BaseTest;
import com.automationexercise.pages.HomePage;

public class HomePageTest extends BaseTest {

	private HomePage homePage;

	@BeforeMethod
	public void setUpPage() {
		homePage = new HomePage(driver);
		// Wait for the home page to fully load
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		// wait.until(ExpectedConditions.visibilityOf(homePage.getItemsText()));
	}

	@Test(priority = 1)
	public void testHomeLink() {
		Assert.assertTrue(homePage.isHomeLinkDisplayed(), "Home link is not displayed");
		homePage.clickHome();
	}

	@Test(priority = 2)
	public void testProductsLink() {
		Assert.assertTrue(homePage.isProductsLinkDisplayed(), "Products link is not displayed");
		homePage.clickProducts();
	}

	@Test(priority = 3)
	public void testCartLink() {
		Assert.assertTrue(homePage.isCartLinkDisplayed(), "Cart link is not displayed");
		homePage.clickCart();
	}

	@Test(priority = 4)
	public void testSignupLoginLink() {
		Assert.assertTrue(homePage.isSignupLoginLinkDisplayed(), "Signup/Login link is not displayed");
		homePage.clickSignupLogin();
	}

	@Test(priority = 5)
	public void testTestCasesLink() {
		Assert.assertTrue(homePage.isTestCasesLinkDisplayed(), "Test Cases link is not displayed");
		homePage.clickTestCases();
	}

	@Test(priority = 6)
	public void testApiTestingLink() {
		Assert.assertTrue(homePage.isApiTestingLinkDisplayed(), "API Testing link is not displayed");
		homePage.clickApiTesting();
	}

	@Test(priority = 7)
	public void testVideoTutorialsLink() {
		Assert.assertTrue(homePage.isVideoTutorialsLinkDisplayed(), "Video Tutorials link is not displayed");
		homePage.clickVideoTutorials();
		driver.navigate().back();
	}

	@Test(priority = 8)
	public void testContactUsLink() {
		Assert.assertTrue(homePage.isContactUsLinkDisplayed(), "Contact Us link is not displayed");
		homePage.clickContactUs();
	}
}
