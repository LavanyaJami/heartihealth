package com.pratian.heartihealth.tests;

import org.testng.annotations.Test;

import com.pratian.heartihealth.pages.Login;

public class TestCaseForLogin extends BaseClass {
	
	@Test(priority = 1)
	public void LoginCheck() {
		Login loginpage=new Login(driver);
		loginpage.open();
		
	}

}
