package com.automationexercise.pages;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.automationexercise.utility.BrowserFactory;
import com.automationexercise.utility.ConfigDataProvider;

public class BaseTest {

	/**
	 * Global Variable
	 */
	public WebDriver driver;
	public ConfigDataProvider config = new ConfigDataProvider();

	@BeforeClass
	public void setup() {
		String url = config.getStagingUrl();

		// Debugging Logs
		System.out.println("URL: " + url);

		driver = BrowserFactory.startApplication(driver, url);

		if (driver != null) {
			System.out.println("Driver initialized successfully.");
		} else {
			System.out.println("Driver initialization failed.");
		}
	}

	@AfterClass
	public void tearDown() {
		if (driver != null) {
			BrowserFactory.quitBrowser(driver);
		}
	}

}
