package Date_picker;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OrangeHrm_datepicker {
	
	WebDriver driver;
	String birthmonth="May";
	String birthyear="1994";
	String date="10";
	
	
  @Test
  public void M1() {
	  
	  System.setProperty("webdriver.chrome.driver","C://chromedriver_win32//chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  
	  driver.get("https://opensource-demo.orangehrmlive.com/");
	  findElement(By.name("username")).sendKeys("Admin");
	  findElement(By.name("password")).sendKeys("admin123");
	  findElement(By.xpath("//button[@type='submit']")).click();
	  findElement(By.xpath("//span[text()='My Info']")).click(); //click my info
	 
	  
	 // WebElement Pick=driver.findElement(By.className("oxd-icon bi-calendar oxd-date-input-icon"));
//<div class="oxd-input-group oxd-input-field-bottom-space" data-v-957b4417="" data-v-b6d78ace=""><div class="oxd-input-group__label-wrapper" data-v-957b4417=""><!----><label class="oxd-label" data-v-30ff22b1="" data-v-957b4417="">Date of Birth</label></div><div class="" data-v-957b4417=""><div class="oxd-date-wrapper" data-v-4a95a2e0=""><div class="oxd-date-input" data-v-4a95a2e0=""><input class="oxd-input oxd-input--active" placeholder="yyyy-mm-dd" data-v-1f99f73c="" data-v-4a95a2e0=""><i class="oxd-icon bi-calendar oxd-date-input-icon" data-v-bddebfba="" data-v-4a95a2e0=""></i></div><!----></div></div><!----></div>	
	  WebElement Pick=findElement(By.xpath("//div[@class='oxd-input-group oxd-input-field-bottom-space']//following::div[@class='oxd-input oxd-input--active']"));
	  JavascriptExecutor js=(JavascriptExecutor)driver;
	  js.executeScript("arguments[0].click()",Pick);
  }


public WebElement findElement(By By)  {
	
	WebElement salt=driver.findElement(By);
	if(driver instanceof JavascriptExecutor) 
	{
	  JavascriptExecutor js=(JavascriptExecutor)driver;
	  js.executeScript("arguments[0].style.border='3px solid red'",salt);
    }
     return salt;
}
}
