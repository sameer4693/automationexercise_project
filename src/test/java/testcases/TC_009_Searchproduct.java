package testcases;

import org.testng.annotations.Test;

import pageobject.Homepage;
import pageobject.Searchproduct;
import testbase.Baseclass;

public class TC_009_Searchproduct extends Baseclass
{
	
	@Test
	public void searchproduct()
	{
		Homepage hp=new Homepage(driver);
		hp.clickproduct();
		
		Searchproduct sp=new Searchproduct(driver);
		sp.enterproduct_name("tshirt");
		sp.searchproductbutton();
		sp.featureitems();
	}
}
