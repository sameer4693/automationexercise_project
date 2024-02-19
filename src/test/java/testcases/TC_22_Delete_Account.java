package testcases;

import org.testng.annotations.Test;

import pageobject.Delete_Account;
import testbase.Baseclass;

public class TC_22_Delete_Account extends Baseclass
{
	@Test
	public void dc()
	{
		Delete_Account dc=new Delete_Account(driver); 
		dc.signup_login();
		dc.email("sameer@gmail.com");
		dc.password("sameer@gmail.com");
		dc.login_button();
		dc.delete_account();
		dc.confirmation_msg();
		dc.continue_button();
		
		
		
	}

}
