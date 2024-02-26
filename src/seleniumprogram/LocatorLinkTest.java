package seleniumprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorLinkTest {

	public static void main(String[] args) {
	        System.setProperty("webdriver.chrome.driver","C:\\Users\\shri\\Downloads\\chromedriver_win32\\chromedriver.exe");
              WebDriver driver=new ChromeDriver();
              driver.get("file:///D:/Softwaretesting/Testing%20Note/Webelement4.html");
              driver.manage().window().maximize();
              //driver.findElement(By.linkText("Forgotten Password?")).click();
              // BY Using the Partial Link Test Locator
             driver.findElement(By.partialLinkText("ten Passw")).click();
              
              
              
	}

}
