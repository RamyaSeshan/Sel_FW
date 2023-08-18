package day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		
		//open my browser
		//ChromeDriver driver=new ChromeDriver();
		
		EdgeDriver driver=new EdgeDriver();
		
		//window max
		driver.manage().window().maximize();
		
		//wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//load URL
		driver.get("https://login.salesforce.com/");
		
		//sendkeys() method pass values in textbox
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		
		driver.findElement(By.id("password")).sendKeys("Leaf$1234");
		
		driver.findElement(By.id("Login")).click();
		
		
		//javascrpit
		
		WebElement account = driver.findElement(By.xpath("//span[text()='Accounts']"));
		driver.executeScript("arguments[0].click();", account);

	}

}
