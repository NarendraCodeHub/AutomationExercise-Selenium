package com.automationexercise.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	private WebDriver d;

	/**
	 * Home Page Element
	 */
	@FindBy(xpath = "//a[.=' Home']")
	private WebElement homeLink;

	@FindBy(xpath = "//a[@href='/products']")
	private WebElement productsLink;

	@FindBy(xpath = "//a[@href='/view_cart']")
	private WebElement cartLink;

	@FindBy(xpath = "//a[@href='/login']")
	private WebElement signupLoginLink;

	@FindBy(xpath = "//a[@href='/test_cases']")
	private WebElement testCasesLink;

	@FindBy(xpath = "//a[@href='/api_testing']")
	private WebElement apiTestingLink;

	@FindBy(xpath = "//a[.=' Video Tutorials']")
	private WebElement videoTutorialsLink;

	@FindBy(xpath = "//a[@href='/contact_us']")
	private WebElement contactUsLink;

	// Constructor with correct class name
	public HomePage(WebDriver driver) {
		this.d = driver;
		PageFactory.initElements(d, this);
	}

	public void clickHome() {
		homeLink.click();
	}

	public void clickProducts() {
		productsLink.click();
	}

	public void clickCart() {
		cartLink.click();
	}

	public void clickSignupLogin() {
		signupLoginLink.click();
	}

	public void clickTestCases() {
		testCasesLink.click();
	}

	public void clickApiTesting() {
		apiTestingLink.click();
	}

	public void clickVideoTutorials() {
		videoTutorialsLink.click();
	}

	public void clickContactUs() {
		contactUsLink.click();
	}

}
