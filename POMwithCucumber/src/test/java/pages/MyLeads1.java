package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import base.BaseClass1;

public class MyLeads1 extends BaseClass1 {

	
	
	
	public CreateLeadPage1 clickOnCreateLead() {
		getDriver().findElement(By.linkText("Create Lead")).click();

		return new CreateLeadPage1();
	}
}
