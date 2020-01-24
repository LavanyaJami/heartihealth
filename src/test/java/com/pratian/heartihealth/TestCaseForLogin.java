package com.pratian.heartihealth;

import org.testng.annotations.Test;

public class TestCaseForLogin extends BaseClass {
	
	@Test(priority = 1)
	public void LoginCheck() {
		Login loginpage=new Login(driver);
		loginpage.open();
		
	}

}
