package testcases;

import org.testng.annotations.Test;

import pageobject.View_category_products;
import testbase.Baseclass;

public class TC_16_View_category_products extends Baseclass
{
	@Test
	public void view_category()
	{
		View_category_products vc=new View_category_products(driver);
		vc.women_category();
		vc.women_dress();
		vc.product_list_women();
		
	}

}
