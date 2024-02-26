package seleniumprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorXpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shri\\Downloads\\chromedriver_win32\\chromedriver.exe");
            WebDriver driver=new ChromeDriver();
            driver.get("file:///D:/Softwaretesting/Testing%20Note/Webelement4.html");
            driver.manage().window().maximize();
            //BY using Sytax = Tagname/Tagname/Tagname
            driver.findElement(By.xpath("html/body/div1/input")).sendKeys("Selenium");
	}
	

}
