package testcase;

import org.testng.annotations.Test;


import base.BaseClass1;

import pages.LoginPage1;

public class TC_0011 extends BaseClass1 {

	@Test
	public void loginData() {
		
		LoginPage1 lp= new LoginPage1();
		
		
		lp.enterUserName1("DemoCsr").enterPassword1("crmsfa")
		.clickOnLogin1().clickOnCrmsfa();
	}
}
