package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass1;



public class CreateLeadPage1 extends BaseClass1{

	
	
	
	public CreateLeadPage1 enterCName(String cName) {
		getDriver().findElement(By.id("createLeadForm_companyName")).sendKeys(cName);

		return this;
	}

	public CreateLeadPage1 enterFName(String fName) {
		getDriver().findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
return this;
	}

	public CreateLeadPage1 enterLName(String lName) {
		getDriver().findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
return this;
	}

	public ViewPage1 clickCreateButton() {
		getDriver().findElement(By.name("submitButton")).click();

		return new ViewPage1();
	}



}
