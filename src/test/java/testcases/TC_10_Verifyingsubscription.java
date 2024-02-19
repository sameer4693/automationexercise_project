package testcases;

import org.testng.annotations.Test;

import pageobject.Verifiying_subscription;
import testbase.Baseclass;

public class TC_10_Verifyingsubscription extends Baseclass 
{

	@Test
	public void  verifysubscription()
	{
		Verifiying_subscription vs=new Verifiying_subscription(driver);
		vs.subemail("sameer@gmail.com");
		vs.clicksemail();
		vs.successmsg();
	}
}

