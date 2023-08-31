
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


import base.BaseClass1;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class LoginPage1 extends BaseClass1{


	/*
	 * public LoginPage(ChromeDriver driver) { this.driver=driver; }
	 */

	@And ("Enter the username as (.*)$")
    public LoginPage1 enterUserName1(String username) {
		getDriver().findElement(By.id("username")).sendKeys(username);

		return this;
	}

	@And ("Enter the password as (.*)$")
	public LoginPage1 enterPassword1(String password) {
		getDriver().findElement(By.id("password")).sendKeys(password);

		return this;
	}

	@When ("Click on the loginButton")
	public HomePage1 clickOnLogin1() {
		getDriver().findElement(By.className("decorativeSubmit")).click();

		
		return new HomePage1();
	}

}
