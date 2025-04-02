package com.automationexercise.pages;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignupLoginPage {
	private WebDriver d;

	/**
	 * New User Signup!
	 */

	@FindBy(xpath = "//h2[.='New User Signup!']")
	private WebElement signupText;

	@FindBy(xpath = "//input[@data-qa='signup-name']")
	private WebElement signupName;

	@FindBy(xpath = "//input[@data-qa='signup-email']")
	private WebElement signupPassword;

	@FindBy(xpath = "//button[@data-qa='signup-button']")
	private WebElement signupButton;

	@FindBy(xpath = "//p[.='Email Address already exist!']")
	private WebElement errorMessage;

	@FindBy(xpath = "//div[.='Swag Labs' and @class='app_logo']") // successful login
	private WebElement inventoryList;

	// Constructor with correct class name
	public SignupLoginPage(WebDriver driver) {
		this.d = driver;
		PageFactory.initElements(d, this);
	}

	public void isVisibleSignupText() {
		signupText.isDisplayed();
	}

	public void enterSignupName(String user) {
		signupName.sendKeys(user);
	}

	public void enterSignupPassword(String pwd) {
		signupPassword.sendKeys(pwd);
	}

	public void clickSignup() {
		signupButton.click();
	}

	public boolean isLoginSuccessful() {
		try {
			return inventoryList.isDisplayed();
		} catch (NoSuchElementException e) {
			return false;
		}
	}
}
