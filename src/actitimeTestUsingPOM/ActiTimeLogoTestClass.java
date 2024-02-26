package actitimeTestUsingPOM;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import actitimeproject.ActiTimeHomepage;
import actitimeproject.ActiTimeLoginPage;

public class ActiTimeLogoTestClass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shri\\Downloads\\com\\chromedriver.exe");
					
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("http://localhost/login.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// login page
		ActiTimeLoginPage a=new ActiTimeLoginPage(driver);
		a.setActiTimeUsername();
	     a.setActiTimePassword();
		a.verifyActiTimeLoginButton();
		Thread.sleep(3000);
		
		// Home page
		ActiTimeHomepage b =new ActiTimeHomepage(driver);
		b.veriftyActiTimeLogo();
		b.setActiTimelogout();
		Thread.sleep(3000);
		driver.quit();
	
	
		
		
		
		
		
		

	}

}
