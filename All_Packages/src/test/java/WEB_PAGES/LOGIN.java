package WEB_PAGES;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LOGIN {
	
	WebDriver driver;
	
	//Object Repository
	String LoginButton="//button[@type='submit']";
	
	public void LOGIN(WebDriver driver1) {
		this.driver=driver1; //111222
	}
	
	public void Login() {
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath(LoginButton)).click();
		
	}
	

}
