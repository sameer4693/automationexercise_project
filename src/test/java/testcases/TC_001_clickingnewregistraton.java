package testcases;

import org.testng.annotations.Test;

import pageobject.Homepage;
import testbase.Baseclass;

public class TC_001_clickingnewregistraton extends Baseclass
{

@Test
public void clickingregister()
{
	
	logger.info("***********starting TC_001_clickingnewregistration*********");
	Homepage hp=new Homepage(driver);
	hp.loginbutton();
	
	
}
}
