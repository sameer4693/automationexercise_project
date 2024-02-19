package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageobject.Homepage;
import pageobject.Newuser_signup;
import pageobject.Registeruser_withexistingemail;
import testbase.Baseclass;

public class TC_006_alreadyregistered extends Baseclass
{
	@Test
	public void alredyregister()
	{
		Homepage hp=new Homepage(driver);
		hp.loginbutton();
		
		Registeruser_withexistingemail re=new Registeruser_withexistingemail(driver);
		re.regname("sameer@gmail.com");
		re.regemail("sameer@gmail.com");
		
		Newuser_signup ns=new  Newuser_signup(driver);
		ns.signupbutton();
		
		String msg=re.alreadyregisteredmsg();
		Assert.assertEquals(msg,"Email Address already exist!");
		
			
				
	}
}
