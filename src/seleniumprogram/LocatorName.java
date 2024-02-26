package seleniumprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorName {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shri\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.get("file:///D:/Softwaretesting/Testing%20Note/Webelement4.html");
        driver.manage().window().maximize();
        // By using the tagname Locator
        WebElement p=driver.findElement(By.name("emid"));
        p.sendKeys("101110110");
	}

}