package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import base.BaseClass1;

public class MyHomePage1 extends BaseClass1 {

	
	
	
	public MyLeads1 clickOnLeads() {
		getDriver().findElement(By.linkText("Leads")).click();

		return new MyLeads1();
	}
	
	public FindLeads1 clickOnLead() {
		getDriver().findElement(By.linkText("Leads")).click();
		return new FindLeads1();
	}
}
