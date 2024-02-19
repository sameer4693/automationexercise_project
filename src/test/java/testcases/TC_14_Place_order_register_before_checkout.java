package testcases;

import org.testng.annotations.Test;

import pageobject.Homepage;
import pageobject.Place_order_register_before_checkout;
import testbase.Baseclass;

public class TC_14_Place_order_register_before_checkout extends Baseclass
{
	@Test
	public void bfrcheckout()
	{
		Homepage hp=new Homepage(driver);
		hp.loginbutton();
		
		Place_order_register_before_checkout pc=new Place_order_register_before_checkout(driver);
		pc.login("sameer@gmail.com");
		pc.password("sameer@gmail.com");
		pc.loginbutton();
		pc.addtocart();
		pc.continue_shopping();
		pc.cart();
		pc.proceed_to_checkout();
		pc.delivery_address();
		pc.billing_address();
		pc.review_order();
		pc.placeorder();
		pc.name_of_card("sam");
		pc.cardnumber("12345678765");
		pc.cvc("231");
		pc.expiry_month("11");
		pc.expiry_year("2056");
		pc.pay_and_conformorder();
		pc.success_msg();
		pc.continue_button();
		pc.logout();
	}
}
