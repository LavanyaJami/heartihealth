package com.pratian.heartihealth.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

	WebDriver driver;
	WebDriverWait wait;
	
	By homepage = By.id("home");
	
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void navigatedToHomePage() {
		wait= new WebDriverWait(driver,10 );
		wait.until(ExpectedConditions.visibilityOfElementLocated(homepage));
		
	}
	
}
