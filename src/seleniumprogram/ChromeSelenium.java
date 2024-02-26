package seleniumprogram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeSelenium {
	
	public void nonstatic() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shri\\Downloads\\chromedriver_win32\\chromedriver.exe");
		// Set property by giving key and value.
				// key=path of browser and value =name of image
		
		WebDriver driver =new ChromeDriver();
		

	}

	public static void main(String[] args) {
		
		ChromeSelenium z=new ChromeSelenium();  // Object Creation
	
		z.nonstatic(); // method Calling
		
	
	}

}
