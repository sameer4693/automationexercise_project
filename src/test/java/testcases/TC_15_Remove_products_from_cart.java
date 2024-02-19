package testcases;

import org.testng.annotations.Test;

import pageobject.Remove_products_from_cart;
import testbase.Baseclass;

public class TC_15_Remove_products_from_cart extends Baseclass
{
	@Test
	public void remove_prd()
	{
		Remove_products_from_cart rp=new Remove_products_from_cart(driver);
		rp.add_product();
		rp.continue_shopping();
		rp.cart();
		rp.delete_product();
		rp.msg();
		
	}

}
