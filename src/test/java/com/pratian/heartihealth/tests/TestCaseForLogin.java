package com.pratian.heartihealth.tests;

import org.testng.annotations.Test;

import com.pratian.heartihealth.pages.HomePage;
import com.pratian.heartihealth.pages.LoginPage;

public class TestCaseForLogin extends BaseClass {
	
	@Test(priority = 1)
	public void LoginCheck() {
		LoginPage loginPage=new LoginPage(driver);
		
		loginPage.open();
		
		loginPage.LoginIntoApplication("j_lavanya@ahcpllc.com", "Password@123");
		HomePage homePage = new HomePage(driver);
		homePage.navigatedToHomePage();
		
		
		
	}

}
