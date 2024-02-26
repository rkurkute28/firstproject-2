package seleniumprogram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FoxSelenium {
 
	public void nonstatics() {
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\shri\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.myemploywise.com/asperm/servlet/ggs.erm.servlet.setup3.LoginS");
		
	}
	
	public static void main(String[] args) {

		           FoxSelenium x=new FoxSelenium();
		           x.nonstatics();
	}

}
