package seleniumprogram;

import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlingTitle {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shri\\Downloads\\com\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
		d.get("https://www.naukri.com/recruit/login");
         String parendId = d.getWindowHandle();
         System.out.println("Main window id is ="+parendId);
d.findElement(By.xpath("(//a[@target='_blank'])[5]")).click();
//Here We go on the next webpage on click on element;

        Set<String> pcids = d.getWindowHandles();
         System.out.println("Parent and child window id is ="+pcids);
         //  For Each Loop String
         for(String child:pcids) {
        	 if(!pcids.equals(child)) {
        		 d.switchTo().window(child);
        		 System.out.println("child window Title"+d.getTitle());
        		
        		d.findElement(By.xpath("//span[@class='banner-btn ls-layer']")).click();
        		Thread.sleep(2000);
        		
        		 d.findElement(By.xpath("//input[@class='medium']")).sendKeys("Rada rada");
        		 Thread.sleep(2000);
        		 
        	 }
     d.switchTo().window(parendId);
       	 d.findElement(By.xpath("//input[@id='RCBcontactPerson']")).sendKeys("Zale re baba");
        	 Thread.sleep(3000);
        	 d.quit();
         }
         
        
         
	}
}
        	
        	 
         
         
		

	


