package com.automationexercise.pages;

import org.openqa.selenium.NoSuchElementException;
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

	@FindBy(xpath = "//h2[.='Features Items']")
	public WebElement getItemsText;

	@FindBy(xpath = "//a[@href='/products']")
	private WebElement productsLink;

	@FindBy(xpath = "//a[@href='/view_cart']")
	private WebElement cartLink;

	@FindBy(xpath = "//a[@href='/login']")
	private WebElement signupLoginLink;

	@FindBy(xpath = "//a[@href='/test_cases']")
	private WebElement testCasesLink;

	@FindBy(xpath = "//a[@href='/api_list']")
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

	// Validation methods

	public boolean isHomeLinkDisplayed() {
		return isElementDisplayed(homeLink);
	}

	public boolean isProductsLinkDisplayed() {
		return isElementDisplayed(productsLink);
	}

	public boolean isCartLinkDisplayed() {
		return isElementDisplayed(cartLink);
	}

	public boolean isSignupLoginLinkDisplayed() {
		return isElementDisplayed(signupLoginLink);
	}

	public boolean isTestCasesLinkDisplayed() {
		return isElementDisplayed(testCasesLink);
	}

	public boolean isApiTestingLinkDisplayed() {
		return isElementDisplayed(apiTestingLink);
	}

	public boolean isVideoTutorialsLinkDisplayed() {
		return isElementDisplayed(videoTutorialsLink);
	}

	public boolean isContactUsLinkDisplayed() {
		return isElementDisplayed(contactUsLink);
	}

	// Helper method to handle NoSuchElementException
	private boolean isElementDisplayed(WebElement element) {
		try {
			return element.isDisplayed();
		} catch (NoSuchElementException e) {
			return false;
		}
	}

	public WebElement getItemsText() {
		return getItemsText;
	}

}
