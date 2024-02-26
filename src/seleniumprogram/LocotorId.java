package seleniumprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocotorId {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shri\\Downloads\\chromedriver_win32\\chromedriver.exe");
           WebDriver driver=new ChromeDriver();
           driver.get("file:///C:/Users/shri/Desktop/Selenium.html");
           
           driver.manage().window().maximize();
           
           driver.findElement(By.xpath("//input[contains(@name,'UN')]"))
          .sendKeys("Rahul_kurkute");
           
           driver.findElement(By.xpath("//input[contains(@type,'password')]")).sendKeys("9676635456");
        //  driver.findElement(By.xpath("//a[contains(text(),'Forgotten password?')]")).click();
          
           driver.findElement(By.xpath("//input[contains(@name,'emid')]")).sendKeys("rahulK@gmail.com");
           
           driver.findElement(By.xpath("//input[@name='14aq']")).sendKeys("9673351094");
           
           driver.findElement(By.xpath("//input[@id='12']")).click();
           
           driver.findElement(By.xpath("//input[@type='checkbox']")).click();
           
           driver.findElement(By.xpath("//input[contains(@type,'button')]")).click();
           
           
	}

	 
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
	

}
