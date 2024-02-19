package testcases;

import org.testng.annotations.Test;

import pageobject.Enteraccount_information;
import pageobject.Homepage;
import pageobject.Newuser_signup;
import testbase.Baseclass;

public class TC_003_enteraccinformation extends Baseclass
{

@Test
public void enteraccinformation()
{
	logger.info("************startingTC_003_enteraccinformation***************");
	Homepage hp=new Homepage(driver);
	hp.loginbutton();
	logger.info("************clicking newusersignup*********");
	Newuser_signup ns=new  Newuser_signup(driver);
	ns.signupname("sameer");
	ns.signupmail("sameer@gmail.com");
	ns.signupbutton();
	logger.info("***************passing values for enter account information***************");
	Enteraccount_information ai=new Enteraccount_information(driver);
	ai.gender();
	ai.password("sameer@gmail.com");
	ai.Firstname("mohamed");
	ai.Lastname("sameer");
	ai.companyname("ms");
	ai.companyaddress1("22/31 ms building");
	ai.companyaddress2("ms main road");
	ai.selectcountry("India");
	ai.state("tamilnadu");
	ai.city("trichy");
	ai.zipcode("6200003");
	ai.mobilenumber("1234567890");
	ai.createaccount();
	logger.info("**************finishingTC_003_enteraccinformation***************");
	
}

}
