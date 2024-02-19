package testcases;

import org.testng.annotations.Test;

import pageobject.Homepage;
import pageobject.Productdetail_page;
import testbase.Baseclass;

public class TC_008_productdetail extends Baseclass
{
	@Test
	public void productdetails()
	{
		Homepage hp=new Homepage(driver);
		hp.clickproduct();
		
		Productdetail_page pp=new Productdetail_page(driver);
		pp.viewproduct();
		pp.productdetailscategory();
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
