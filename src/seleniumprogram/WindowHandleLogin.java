package seleniumprogram;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandleLogin {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shri\\Downloads\\chromedriver_win32\\chromedriver.exe");
            WebDriver d=new ChromeDriver();
            d.manage().window().maximize();
            d.manage().deleteAllCookies();
           d.navigate().to("https://www.myemploywise.com/asperm/servlet/ggs.erm.servlet.setup3.LoginS");
           String parendId = d.getWindowHandle();
           System.out.println("Main window id"+parendId);
           d.findElement(By.xpath("//input[@id='customer_login']")).sendKeys("varrocgroup");
           d.findElement(By.xpath("//input[@id='User_Name']")).sendKeys("00019209");
           d.findElement(By.xpath("//input[@id='Password']")).sendKeys("19209");
           d.findElement(By.xpath("//input[@value='LOGIN']")).click();
         //span[@style='padding:5px 0px 0px 0px;']
           Set<String> pcids = d.getWindowHandles();
           System.out.println("Parend and Child window id is ="+pcids);
           for(String child:pcids) {
        	   if(!pcids.equals(child)) {
        		   d.switchTo().window(child);
        		   System.out.println("Main Window Title"+d.getTitle());
        		   

        		   d.findElement(By.xpath("//a[@onclick='getFeedBack()']")).click();
        		   Thread.sleep(6000);
        		   
        	   }
        	   
           }
          
           
           
           
          
            
	}

}
