package testcases;

import org.testng.annotations.Test;

import pageobject.Homepage;
import pageobject.Place_order_register_whilecheckout;
import testbase.Baseclass;

public class TC_13_Place_order_register_while_checkout extends Baseclass
{
	@Test
	public void placeorder()
	{
		
		Homepage hp=new Homepage(driver);
		hp.clickproduct();
		
		Place_order_register_whilecheckout pr=new Place_order_register_whilecheckout(driver);
		pr.addto_cart();
		pr.continueshopping();
		pr.cart();
		pr.proceedtocheckout();
		pr.register_login();
		pr.login("sameer@gmail.com");
		pr.password("sameer@gmail.com");
		pr.login_button();
		pr.cart();
		pr.proceedtocheckout();
		pr.address_details();
		pr.billing_address();
		pr.review_your_order();
		pr.textarea("delivery fast");
		pr.placeorder();
		pr.name_of_card("card");
		pr.card_number("23456765434567");
		pr.cvc("453");
		pr.expiry_month("2");
		pr.expiry_year("2039");
		pr.pay_and_conform_order();
		pr.success_msg();
		pr.continue_button();
		pr.logout();
	}
}
