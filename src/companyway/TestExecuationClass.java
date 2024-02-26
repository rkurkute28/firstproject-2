package companyway;

public class TestExecuationClass extends TestScenario1Class	{

	public static void main(String[] args) throws InterruptedException {
	TestExecuationClass t1=new TestExecuationClass();
	
	
	t1.firefoxluanch();
	Thread.sleep(3000);
	t1.browserquit();

	
	t1.welcome();
	//t1.chromeluanch();
	//Thread.sleep(3000);
	t1.verifyURL();
	//t1.browserquit();
	CommonProperties.ty();
	

	}

}
