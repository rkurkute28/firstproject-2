package seleniumprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\\\shri\\Downloads\\chromedriver_win32\\chromedriver.exe");
                    WebDriver d=new ChromeDriver();
                    
                    d.manage().window().maximize();
                    d.navigate().to("https://www.facebook.com/");
                    d.findElement(By.xpath("//input[@id='email']")).sendKeys("9673354094");
                    
                    d.findElement(By.xpath("//input[@id='pass']")).sendKeys("Rahul@1234");
                    
                    d.findElement(By.xpath("//button[@name='login']")).click();
               
                    
                    
	}

}
