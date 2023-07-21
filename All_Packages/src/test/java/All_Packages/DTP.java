package All_Packages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Auto01.TestNG_Parametrers;
import ExcelUtil.ExcelApiTest4;

public class DTP {
	
	WebDriver driver;
	
	@DataProvider(name="TestCase")
	public static Object[][] newdata() throws Exception
	{
		ExcelApiTest4 excel=new  ExcelApiTest4();
		Object[][]dataproviding=excel.getTableArray("C:\\Users\\DELL\\OneDrive\\Documents\\Testcase.xlsx","Sheet2");
		return (dataproviding);
	}
	
	
	  
	  @Test(dataProvider="TestCase")
	  public void MainTest1(String Browser,String Url, String UserName,String Password, String JobTittle,String JobDesc, String JobNote) throws Exception {
		  DTP P1=new DTP();
		 P1.OpenBrowser(Browser);
		  P1.OpenOrangeHRM(Url);
		  P1.Login(UserName,Password);
		  P1.JobTittles(JobTittle,JobDesc,JobNote);
		  
		  
	  }
	  
	  
	  public void OpenBrowser(String Browser) throws InterruptedException  {
		
		  
//		  System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
//			driver =new ChromeDriver();
//			driver.manage().window().maximize();	
		  
		  if(Browser.equals("Chrome"))
		  {
			  
			  System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
				driver =new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			  
		  }
		  if(Browser.equals("Firefox"))
		  {
			 System.setProperty("webdriver.gecko.driver","C://Firefox//geckodriver.exe");
				driver=new FirefoxDriver();
				Thread.sleep(5000);
				driver.manage().window().maximize();
				
		 }
	  }	
	  
	  
	  
	  public void OpenOrangeHRM(String Url)throws Exception {
		  
		  driver.get(Url);
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);// Implicit wait  
	  }
	  
	  
	  public void Login(String UserName,String Password)throws Exception {
		  
		  findElement(By.name("username")).sendKeys(UserName);
		  findElement(By.name("password")).sendKeys(Password);
		  findElement(By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		  
	  }
	  
	  
	  
	  public void JobTittles(String JobTittle,String JobDesc, String JobNote)throws Exception {
		  
		  
		    findElement(By.xpath("//*[@id='app']/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a")).click();
		    findElement(By.xpath("//*[@id='app']/div[1]/div[1]/header/div[2]/nav/ul/li[2]")).click();
			findElement(By.xpath("//*[@id='app']/div[1]/div[1]/header/div[2]/nav/ul/li[2]/ul/li[1]/a")).click();
			
			findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/div[1]/div/button")).click();
			findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input")).sendKeys(JobTittle);
			findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/textarea")).sendKeys(JobDesc);
			findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[4]/div/div[2]/textarea")).sendKeys(JobNote);
		  
			findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[5]/button[2]")).click();	  
	 
			Thread.sleep(5000);
			driver.close();
			
  }
	  
	  public  WebElement findElement(By by) throws Exception 
		{

			WebElement elem = driver.findElement(by);  
			
			if (driver instanceof JavascriptExecutor) 
			{
			 ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", elem);
		 
			}
			return elem;
		} 
	}

