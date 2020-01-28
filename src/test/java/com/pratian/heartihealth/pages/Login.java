package com.pratian.heartihealth.pages;

import java.awt.HeadlessException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
	WebDriver driver;
	private final String siteUrl = "";
	private final String expectedUrl = "";
	private final String expectedTitle = "";
	private final String signError = "Login Page is not displayed";
	private By username = By.id("");
	private By password = By.id("");
	private By signInapp = By.id("");

	public Login(WebDriver driver) {
		this.driver = driver;
	}

	/**
	 * Open the application
	 *
	 * @return the home page
	 */
	public Login open() {
		driver.get(siteUrl);

		if (!driver.getCurrentUrl().contains(expectedUrl) || !driver.getTitle().contains(expectedTitle)) {
			// TestListener.reportLog(homePageError);
			throw new HeadlessException(signError);
		}
		return this;
	}

	public WebDriver navigateTo(String pageName) {

		return (driver);
	}
}