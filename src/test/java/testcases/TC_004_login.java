package testcases;

import org.testng.annotations.Test;

import pageobject.Homepage;
import pageobject.Logging;
import testbase.Baseclass;

public class TC_004_login extends Baseclass
{
	
	@Test
	public void login()
	{
		Homepage hp=new Homepage(driver);
		hp.loginbutton();
		logger.info("**********startingTC_004_login**********");
		Logging l=new Logging(driver);
		l.loginemail("sameer@gmail.com");
		l.loginpassword("sameer@gmail.com");
		l.logbutton();
	
		
	}
}
