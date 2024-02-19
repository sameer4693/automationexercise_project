package testcases;

import org.testng.annotations.Test;

import pageobject.Add_to_cart_from_recommended_items;
import testbase.Baseclass;

public class TC_20_Add_to_cart_from_recommended_items extends Baseclass
{
	@Test
	public void items()
	{
		Add_to_cart_from_recommended_items at=new Add_to_cart_from_recommended_items(driver);
		at.recommended_tshirt();
		at.viewcart_buttob();
		at.cart_detail();
	}

}
