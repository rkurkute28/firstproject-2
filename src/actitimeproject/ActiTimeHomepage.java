package actitimeproject;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ActiTimeHomepage {
	
	//Declaration
	// private variable
	
	private WebElement logo;
private	WebElement logout;
 WebElement driver;

// Initiallation
public ActiTimeHomepage(WebDriver driver) {
	this.driver=(WebElement) driver;
	logo.findElement(By.xpath("//img[@height='61']"));
	logout.findElement(By.xpath("//a[@id='logoutLink']"));
	}
// Usage
public void veriftyActiTimeLogo() {
	boolean result = logo.isDisplayed();
	if(result==true) {
		System.out.println("Test Scenario is passed and logo is Verified");
		
	}else {
		System.out.println("Test Scenario is failed and please check with Devloper");
		
	}
}
public void setActiTimelogout() {
	logout.click();
}
	
	
	
	
}


