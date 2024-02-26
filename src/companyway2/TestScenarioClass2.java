package companyway2;

public class TestScenarioClass2 extends BrowserLaunch2{
String expectedURL="https://www.facebook.com/signup";

	
	public void verifyURL() {
		String actURL =d.getCurrentUrl();
		
		if ( expectedURL.equals(actURL) ){
			System.out.println("Test Scenario 1 is passed and Actual URL ="+actURL);
			
		}
		else {
			System.out.println("Test Scenario 1 is failed and Actula URL ="+actURL);
		}
		

	}
	
	

	

}



	


