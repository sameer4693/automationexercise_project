package testcases;

import org.testng.annotations.Test;

import pageobject.View_and_cart_brandproducts;
import testbase.Baseclass;

public class TC_17_View_and_cart_brandproducts extends Baseclass
{
	@Test
	public void brand()
	{
		View_and_cart_brandproducts bp=new View_and_cart_brandproducts(driver);
		bp.products_button();
		bp.polo_brand();
		bp.polo_products();
		bp.h_m();
		bp.h_m_products();
		
		
		
	}

}
