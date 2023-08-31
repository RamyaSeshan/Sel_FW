package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


import base.BaseClass1;

public class FindLeads1 extends BaseClass1 {

	
	
	
	public FindLeads1 clickOnFindLead() {
		getDriver().findElement(By.xpath("//a[text()='Find Leads']")).click();
		return this;
	}
}
