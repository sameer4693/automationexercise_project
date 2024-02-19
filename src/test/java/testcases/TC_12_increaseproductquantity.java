package testcases;

import org.testng.annotations.Test;

import pageobject.Homepage;
import pageobject.Increaseprd_count;
import testbase.Baseclass;

public class TC_12_increaseproductquantity extends Baseclass
{
	
	@Test
	public void increaseqt()
	{
		Homepage hp=new Homepage(driver);
		hp.clickproduct();
		
		Increaseprd_count ic=new Increaseprd_count(driver);
		ic.viewpr();
		ic.increaseqt("5");
		ic.addc();
		//ic.viewc();
		ic.continueshopping();
		ic.cartbtn();
		ic.cartdetails();
		
	}

}
