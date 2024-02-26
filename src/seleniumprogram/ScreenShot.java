package seleniumprogram;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shri\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
		d.navigate().to("https://www.myemploywise.com/asperm/servlet/ggs.erm.servlet.setup3.LoginS");
		File s=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		String path="D:\\Automation\\Camera Roll\\Rahul.png";
		File F= new File(path);
		FileHandler.copy(s, F);
		

	}

	}
