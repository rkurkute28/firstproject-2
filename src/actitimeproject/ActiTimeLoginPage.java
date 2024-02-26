package actitimeproject;

import org.openqa.selenium.By;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ActiTimeLoginPage {
	// Declaration
		// Private Variable
		private WebElement un;
	private	WebElement pwd;
	private	WebElement Loginbutton;
		WebElement driver;
		
		// Initiallation
		public ActiTimeLoginPage(WebDriver driver) {
			this.driver= (WebElement) driver;
			 un = driver.findElement(By.xpath("//input[@name='username']"));
			 pwd = driver.findElement(By.xpath("//input[@name='pwd']"));
			  Loginbutton = driver.findElement(By.xpath("//a[@id='loginButton']"));
		}
		// Usage
		public void setActiTimeUsername() {
			un.sendKeys("admin");
			
		}
		public void setActiTimePassword() {
			pwd.sendKeys("manager");
		}
		public void verifyActiTimeLoginButton() {
			Loginbutton.click();
			
		}

}
