package testcases;

import org.testng.annotations.Test;

import pageobject.Search_products_and_verify_cart_after_login;
import testbase.Baseclass;

public class TC_18_Search_products_and_verify_cart_after_login extends Baseclass
{
	@Test
	public void tc18()
	{
		Search_products_and_verify_cart_after_login sp=new Search_products_and_verify_cart_after_login(driver);
		sp.product_button();
		sp.search_product("polo");
		sp.search_button();
		sp.search_features();
		sp.addto_cart();
		sp.continue_shopping();
		sp.cart();
		sp.cart_detail1();
		sp.signup_login();
		sp.email("sameer@gmail.com");
		sp.password("sameer@gmail.com");
		sp.login_button();
		sp.cart();
		sp.cart_detail2();
		sp.logout();
	}
}
