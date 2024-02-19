package testcases;

import org.testng.annotations.Test;

import pageobject.Homepage;
import pageobject.Newuser_signup;
import testbase.Baseclass;

public class TC_002_Newusersignup extends Baseclass
{	  
	@Test
	public void newusersignup()
	{
		logger.info("***********starting TC_002_Newusersignup**********");
		Homepage hp=new Homepage(driver);
		hp.loginbutton();
		logger.info("************clicking newusersignup*********");
		Newuser_signup ns=new  Newuser_signup(driver);
		ns.signupname("sameer");
		ns.signupmail("sameer@gmail.com");
		ns.signupbutton();
		logger.info("*********finishing TC_002_Newusersignup*************");
	}
}
