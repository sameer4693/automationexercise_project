package testcases;


import org.testng.annotations.Test;

import pageobject.Contactus_Form;
import pageobject.Homepage;
import testbase.Baseclass;

public class TC_007_Contactusform extends Baseclass
{
	@Test
	public void cntform()
	{
		Homepage hp=new Homepage(driver);
		hp.contactus();
		
		Contactus_Form cf=new Contactus_Form(driver);
		cf.cntname("sameer");
		cf.cntemail("sameer@gmail.com");
		cf.subject("server down");
		cf.textarea("bla bla bla");
		cf.submitbtn();
		cf.alert();
		
		
	}
}
