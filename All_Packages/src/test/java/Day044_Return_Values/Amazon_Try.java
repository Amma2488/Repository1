package Day044_Return_Values;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Amazon_Try {
	
	
	 static WebDriver driver;
	
	@Test
	
		public void allmethod() throws InterruptedException {
		
		
		Amazon_Try.openChrome();
		Amazon_Try.addcart();
		Amazon_Try.checkpoint();
		
		   /*
        String str1="8,499.00";
        String str = str1.replace(",","");
        System.out.println(str);
 
        float f=Float.parseFloat(str);
        System.out.println("Price is "+f);;
        */

		
	}

	public static void openChrome() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();  // 111222
		driver.manage().window().maximize() ;	
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);// Implicit wait 
	}
	

	public static void addcart() throws InterruptedException {
		
		findElement(By.xpath("(//div[@id='nav-xshop'])//a[5]")).click();
		findElement(By.xpath("(((//div[@class='sl-sobe-carousel-viewport-row'])[2])//ol)//li[2]")).click(); //in mobile product select
		findElement(By.xpath("//input[@id='add-to-cart-button']")).click(); //add cart Add to Cart
		Thread.sleep(3000);
		findElement(By.xpath("//span[@id='attach-sidesheet-view-cart-button'][1]")).click(); //cart click
		Thread.sleep(3000);
		findElement(By.xpath("(//div[@class='a-row sc-action-links'])//span[1]")).click(); //clickqty
		Thread.sleep(3000);
		findElement(By.linkText("1")).click(); //Qty
		Thread.sleep(3000);
		
		findElement(By.xpath("(//div[@id='nav-xshop'])//a[5]")).click();
		findElement(By.xpath("(((//div[@class='sl-sobe-carousel-viewport-row'])[2])//ol)//li[4]")).click();
		findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
		findElement(By.xpath("//span[@id='attach-sidesheet-view-cart-button'][1]")).click();
		findElement(By.xpath("(//div[@class='a-row sc-action-links'])//span[1]")).click();
		findElement(By.linkText("3")).click();
		
	}
	
	public static void checkpoint() {
		String P1= driver.findElement(By.xpath("(((//div[@class='sc-badge-price-to-pay'])[1])/p)//span[1]")).getText();
		String P2= driver.findElement(By.xpath("(((//div[@class='sc-badge-price-to-pay'])[2])/p)//span[1]")).getText();
        String Cart_Total_Amount= driver.findElement(By.xpath("((//span[@id='sc-subtotal-amount-activecart'])//span)[1]")).getText(); 
		
       
		float Product1Price= 3*removecomma_converFloat(P1);
        float Product2Price=1*removecomma_converFloat(P2);
        float Actual_CartAmount=removecomma_converFloat(Cart_Total_Amount);  
        
        float ExpectedSum=Product1Price+Product2Price;
          
        if(Float.compare(Actual_CartAmount, ExpectedSum)==0)
        {
        	System.out.println("ExpectedSum = Actual_CartAmount");
        	Assert.assertEquals(Actual_CartAmount, ExpectedSum);
        	Reporter.log("Cart Amount logic is working as Ecpected");
        	System.out.println("Cart Amount logic is working as Ecpected : Matched");
        	
        }
        else
        {
        	System.out.println("ExpectedSum != Actual_CartAmount");
        	Assert.assertEquals(Actual_CartAmount, ExpectedSum);
        	Reporter.log("Cart Amount logic is not working as Ecpected");
        	System.out.println("Cart Amount logic is not working as Ecpected : NotMatched");
        }
        	
        System.out.println("Product1Price is :"+Product1Price);
        System.out.println("Product2Price is :"+Product2Price);
        System.out.println("");
        System.out.println("Actual_CartAmount is :"+Actual_CartAmount);
        System.out.println("ExpectedSum is :"+ExpectedSum);

    
        
	}

	
	public static float removecomma_converFloat(String str1){
           
    	
    	String str = str1.replace(",","");
        float f=Float.parseFloat(str);
        
        return f;
        
    }
	


	public static WebElement findElement(By by) {
	
	WebElement elem= driver.findElement(by);
	if(driver instanceof JavascriptExecutor)
	{
		((JavascriptExecutor)driver).executeScript("arguments[0].style.background='yellow'",elem);
		
	}
	return elem;
	
	}	
	
}	


