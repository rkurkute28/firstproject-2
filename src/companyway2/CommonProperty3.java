package companyway2;

public interface CommonProperty3 {
	
    String key1="webdriver.chrome.driver";
	
	String key2="webdriver.gecko.driver";
	
	String value1="C:\\Users\\shri\\Downloads\\chromedriver_win32\\chromedriver.exe";
	
	String value2="C:\\Users\\shri\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe";
	
	String url1="https://www.facebook.com/signup";
	
	String url2="https://www.amazon.in/";
	
    default void welcome() {
    	System.out.println("Welcome to the jurasic park of selenium");
    }
    
    void chromeluanch();
    
    void firefoxluanch();
    
    public static void ty() {
    	System.out.println("Thanks you !!! Hope your enjoyed the jurasic park of selenium");
    }
	

}


