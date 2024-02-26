package companyway;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorTagName {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shri\\Downloads\\chromedriver_win32\\chromedriver.exe");
            WebDriver driver =new ChromeDriver();
            driver.get("file:///D:/Softwaretesting/Testing%20Note/Webelement4.html");
            driver.manage().window().maximize();
            // By using the tagname Locator
            WebElement n=driver.findElement(By.tagName("input"));
            n.sendKeys("Maharashtra");
            // By using the name Locator
            WebElement p=driver.findElement(By.name("pwd"));
            p.sendKeys("1011101010");
            //By Using the ID Locator
            driver.findElement(By.id("A13"))
            .click();           
             //by Using the Classname Locator
            driver.findElement(By.className("mail")).sendKeys("rkurkute@gmail.com");
            //By using the classname Locator
           WebElement f= driver.findElement(By.name("emid"));
        		   f.sendKeys("967335094");
        		   // By Using the Link test Locator
        		   driver.findElement(By.linkText("Forgotten Password?")).click();
        		   
			

            
            
	}

}
