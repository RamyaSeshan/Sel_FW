package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass1;


public class HomePage1 extends BaseClass1{

	
	
	public MyHomePage1 clickOnCrmsfa() {
		getDriver().findElement(By.linkText("CRM/SFA")).click();

		return new MyHomePage1();
	}
}
