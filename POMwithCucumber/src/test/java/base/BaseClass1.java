package base;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;



public class BaseClass1 extends AbstractTestNGCucumberTests {
	
	private static final ThreadLocal<RemoteWebDriver> tldriver=new ThreadLocal<RemoteWebDriver>();
	
	
	public void setDriver() {
		tldriver.set(new ChromeDriver());
		//chromedriver driver= new chromedriver();
	}
	
	public RemoteWebDriver getDriver() {
		
		return tldriver.get();
	}
	
	@BeforeMethod
	public void preCondition() {
		//chromedriver driver= new chromedriver();

		setDriver();
		getDriver().manage().window().maximize();
		getDriver().get("http://leaftaps.com/opentaps/control/main");
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
	}
	
	@AfterMethod
	public void postCondition() {
		
		getDriver().close();

	}
	
	
}
