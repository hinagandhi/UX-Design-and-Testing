package seleniumTesting;

public class HboGo {
	 public static void main(String[] args) throws InterruptedException{
     
		 testCases tests = new testCases();
		 tests.goToWebpage();
	     tests.orderHboProvider();
	     tests.fillNoInformation();
	     tests.fillSomeInformation();
	     tests.fillAllInformation();
	     tests.fillCorrectInformationAndLogin();
	     tests.continueBrowsing();
	     tests.showError();
	 }
}
