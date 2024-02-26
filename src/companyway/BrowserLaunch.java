package companyway;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public  class BrowserLaunch implements CommonProperties{
              
	static WebDriver d;
	
	public void  chromeluanch() {
		System.out.println("ChromeDriver is launching");
		System.getProperty(key1,value1);
		 d= new ChromeDriver ();
		d.manage().window().maximize();
	   d.get(url1);
	}
	public void firefoxluanch() {
		 System.out.println("Firefox driver is luanching");
		 System.getProperty(key2,value2);
		 d=new FirefoxDriver();
		 d.get(url1);
		 
		 
	}
	public void browserquit() {
		d.quit();
	}
	
	

	

}
