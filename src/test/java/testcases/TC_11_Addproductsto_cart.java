package testcases;

import org.testng.annotations.Test;

import pageobject.Addproduct_incart;
import pageobject.Homepage;
import testbase.Baseclass;

public class TC_11_Addproductsto_cart extends Baseclass
{
	
	@Test
	public void addcart()
	{
		Homepage hp=new Homepage(driver);
		hp.clickproduct();
		
		Addproduct_incart ac=new Addproduct_incart(driver);
		ac.addtocart();
		ac.continueshopping();
		ac.addcrt2();
		ac.viewcart();
		ac.crtdetails(); 
		
		
	}
}
