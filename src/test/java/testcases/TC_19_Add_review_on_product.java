package testcases;

import org.testng.annotations.Test;

import pageobject.Add_review_on_product;
import pageobject.Homepage;
import testbase.Baseclass;

public class TC_19_Add_review_on_product extends Baseclass
{
	@Test
	public void review()
	{
		Homepage hp=new Homepage(driver);
		hp.clickproduct();
		
		Add_review_on_product ar=new Add_review_on_product(driver);
		ar.product_detail();
		ar.your_name("sameer");
		ar.email("sameer@gmail.com");
		ar.text_area("fabulous tshirt");
		ar.submit_button();
		ar.thankyou_message();
	}

}
