package companyway2;




public class TestExecuationClass2 extends TestScenarioClass2{

	public static void main(String[] args) throws InterruptedException {
		
		TestExecuationClass2 t1=new TestExecuationClass2();
		
		
		t1.firefoxluanch();
		Thread.sleep(3000);
		t1.browserquit();
		t1.welcome();
		t1.verifyURL();

		
		
		//t1.chromeluanch();
		//Thread.sleep(3000);
		
		//t1.browserquit();
		CommonProperty3.ty();
		

		}

	}

		

	


