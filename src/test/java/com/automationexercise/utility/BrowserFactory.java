package com.automationexercise.utility;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserFactory {
	public static WebDriver startApplication(WebDriver driver, String weburl) {

		// Manage specific Browser - FIreFox
		WebDriverManager.firefoxdriver().setup();
		FirefoxOptions op = new FirefoxOptions();
		op.setAcceptInsecureCerts(true);
		driver = new FirefoxDriver(op);

		// Maximize the Browser
		driver.manage().window().maximize();
		// Enter the URL
		driver.get(weburl);
		// Wait for the page to fully load
		waitForPageLoad(driver);
		// Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// Return Driver
		return driver;
	}

	public static void waitForPageLoad(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until((ExpectedCondition<Boolean>) webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}

	public static void quitBrowser(WebDriver driver) {
		driver.quit();
	}
}
