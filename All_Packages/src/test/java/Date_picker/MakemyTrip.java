package Date_picker;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MakemyTrip {
	WebDriver driver;
    String mm_yy="June 2024";
    String Day="15";
	@Test
  public void M1() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C://chromedriver_win32//chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  
		  driver.get("https://www.makemytrip.com/");
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  
		  driver.findElement(By.xpath("(//span[@class='lbl_input appendBottom10'])[3]")).click();
		
		while(true)
		{
			String mon=driver.findElement(By.xpath("(//div[@class='DayPicker-Caption'])[1]")).getText();
			System.out.println(mon);
			if(mon.equals(mm_yy))
			{
				break;
			}
			else
			{
				driver.findElement(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']")).click();
				Thread.sleep(5000);
			}
		}
		
		driver.findElement(By.xpath("(//div[@class='dateInnerCell']//parent::p[text()="+Day+"])")).click();
		
  }
}
