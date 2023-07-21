package WEB_PAGES;

import org.openqa.selenium.WebDriver;

public class LOGOUT {

	WebDriver driver;
	
	public void LOGOUT(WebDriver driver1) {
		this.driver=driver1;
	}
	
	public void Logout() {
		
		driver.close();
	}
	
	
}
