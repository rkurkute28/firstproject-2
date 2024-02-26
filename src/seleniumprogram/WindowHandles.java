package seleniumprogram;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shri\\Downloads\\com\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
		/*d.get("https://www.facebook.com/");
		String parentID = d.getWindowHandle();
		// To Find out the Main Window Id We use below Syntax
		System.out.println("Main Window ID ="+parentID);	
		// To Find out the Main window and child window ID we use above syntax
		Set<String> pcids = d.getWindowHandles();
		System.out.println("Main And Child Window Id ="+pcids)*/
		 d.get("https://www.naukri.com/");
		 String parentid = d.getWindowHandle();	
		 System.out.println("Main Window ID NO. is ="+parentid);
		 d.findElement(By.xpath("//input[@class='suggestor-input ']")).sendKeys("Assembly ");
		 d.findElement(By.xpath("//div[@class='qsbSubmit']")).click();
		 Set<String> pcids = d.getWindowHandles();
		 System.out.println("Main +child Window ID No. is ="+pcids);
		 
		 
		// To Find out the Title of the child ID we use the above syntax
		 
		 for (String s:pcids) {
			 if(!parentid.equals(s)) {
				 d.switchTo().window(s);
				 System.out.println("Child Window Title is "+d.getTitle());
				 d.findElement(By.xpath("//input[@class='suggestor-input ']")).sendKeys("Assembly ");
				 Thread.sleep(2000);
				 d.close();
			 }
			 
		 }
		
		
		
		
		
		
		
  

	}

}
