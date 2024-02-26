package seleniumprogram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumChrome {

	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shri\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    // Set property by giving key and value.
		// key=path of browser and value =name of image
		
		WebDriver driver = new ChromeDriver();    // Upcasting
		
		 driver.get("https://www.myemploywise.com/asperm/servlet/ggs.erm.servlet.setup3.LoginS");
	
		

	}

}
