package All_Packages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test_manasa {

	WebDriver driver;
	
	@Test
  public void OpenChromeBrowser() {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize() ;
	  
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
	   driver.findElement(By.name("username")).sendKeys("Admin");   //name
	   driver.findElement(By.name("password")).sendKeys("admin123");   //name
	   driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click(); //Click 
	 
	
	}
}