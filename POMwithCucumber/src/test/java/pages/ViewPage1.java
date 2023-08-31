package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


import base.BaseClass1;

public class ViewPage1 extends BaseClass1{

	
	
	
	public ViewPage1 viewPage() {
		String text = getDriver().findElement(By.id("viewLead_companyName_sp")).getText();
		if (text.contains("Testleaf")) {
			System.out.println("Lead created successfully");
		}
		else {
			System.out.println("Lead is not created");
		}
		return this;
	}
}
