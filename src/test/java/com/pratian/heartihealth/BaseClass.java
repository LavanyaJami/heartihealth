package com.pratian.heartihealth;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	
		public ChromeDriver driver;
		private final String chromeDriverPath = "/heartihealth/src/main/resources/drivers/chromedriver.exe";
		
		
		@BeforeMethod
		public void setUp() {
			System.setProperty("webdriver.chrome.driver", chromeDriverPath);
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}
		
		@AfterMethod
		public void teardown()
		{
			driver.close();
			
		}
	}



