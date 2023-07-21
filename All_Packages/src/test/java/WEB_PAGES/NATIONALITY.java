package WEB_PAGES;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NATIONALITY {
	
	WebDriver driver;

	//Object Repository
	String AdminButton= "//*[@id='app']/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a/span";
	String NationalityButton= "//*[@id='app']/div[1]/div[1]/header/div[2]/nav/ul/li[5]/a";
	String AddNationalityButton= "//*[@id='app']/div[1]/div[2]/div[2]/div/div/div[1]/div/button";
	String TextBox= "//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input";
	String Save= "//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]";
	
	public void NATIONALITY(WebDriver driver1) {
		this.driver=driver1;
	}
	
	public void AddNationality() {
		driver.findElement(By.xpath(AdminButton)).click();
		driver.findElement(By.xpath(NationalityButton)).click();
		driver.findElement(By.xpath(AddNationalityButton)).click();
		driver.findElement(By.xpath(TextBox)).sendKeys("Kulfistan001");
		driver.findElement(By.xpath(Save)).click();
  
	}
}
