package com.pratian.heartihealth;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.um.calypso.pageobjects.HomePage;
import com.um.exceptions.HtmlElementsException;

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
			throw new HtmlElementsException(signError);
		}
		return this;
	}

	public HomePage Login(String Username, String Password) throws InterruptedException {
		driver.findElement(username).click();
		driver.findElement(username).sendKeys(Username);
		driver.findElement(password).click();
		driver.findElement(password).sendKeys(Password);
		driver.findElement(signInapp).click();
		return new HomePage(driver);
	}

	public WebDriver navigateTo(String pageName) {

		return (driver);
	}
}