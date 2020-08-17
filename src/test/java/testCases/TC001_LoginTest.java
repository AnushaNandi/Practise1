package testCases;

import org.testng.annotations.Test;

import pages.LoginPage;

public class TC001_LoginTest extends BaseClass {
	
	@Test
	
	public void LoginTest()
	{
		LoginPage lp= new LoginPage(driver);
		lp.textEmail("anushavani@yahoo.com");
		log.info("Entered email id");
		lp.textPassword("SaiHA369");
		log.info("Entered password");
		lp.clickSignin();
		log.info("Clicked signin");
	}
	
	

}
