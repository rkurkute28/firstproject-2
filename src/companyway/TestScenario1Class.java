package companyway;

public class TestScenario1Class extends BrowserLaunch {
	// Test Scenario 1= Validate the Actual URL is matching with expected given URL of FB APP
	// Test Case/Steps=User Luanchesthe Browser successfully.
	//User hits the provided URL
	//pre Requisite
	
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
