package Date_picker;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class IRCTC_RailNetwork {
	WebDriver driver;
	String mm_yy="August2023";
	String Day="15";
	
  @Test
  public void M1() {
	  
	  System.setProperty("webdriver.chrome.driver","C://chromedriver_win32//chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  
	  driver.get("https://www.irctc.co.in/nget/train-search/");
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  
	  driver.findElement(By.xpath("(//input[@type='text'])[3]")).click();
	  
	  while(true)
	  {
		  String abc=driver.findElement(By.xpath("//div[@class='ui-datepicker-title ng-tns-c58-10']")).getText();
		  System.out.println(abc);
		  if(abc.equals(mm_yy))
		    {
			  break;
			}	  
		  else
		    {
			  WebElement elem= driver.findElement(By.xpath("//span[@class='ui-datepicker-next-icon pi pi-chevron-right ng-tns-c58-10']"));
			  JavascriptExecutor js=(JavascriptExecutor)driver;
			  
			  js.executeScript("arguments[0].click()",elem);
		    }  
	  }
	  
	  driver.findElement(By.xpath("//a[text()="+Day+"]")).click();
  }
}
