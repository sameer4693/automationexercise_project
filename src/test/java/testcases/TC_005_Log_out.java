package testcases;

import org.testng.annotations.Test;

import pageobject.Homepage;
import pageobject.Logging;
import pageobject.Logout;
import testbase.Baseclass;

public class TC_005_Log_out extends Baseclass
{
	@Test
	public void lout()
	{
	
		logger.info("**********startingTC_005_log_out***************");
		Homepage hp=new Homepage(driver);
		hp.loginbutton();
		
		Logging l=new Logging(driver);
		l.loginemail("sameer@gmail.com");
		l.loginpassword("sameer@gmail.com");
		l.logbutton();
		
		Logout lo=new Logout(driver);
		lo.logout();
	}
}
