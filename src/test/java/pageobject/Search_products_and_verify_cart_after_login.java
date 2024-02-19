package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Search_products_and_verify_cart_after_login extends Basepage
{
	public Search_products_and_verify_cart_after_login(WebDriver driver)
	{
		super(driver);
	}
	
	
@FindBy(xpath = "//a[@href=\"/products\"]")
WebElement productsbtn;

@FindBy(xpath = "//input[@id=\"search_product\"]")
WebElement srhproduct;

@FindBy(xpath = "//button[@id=\"submit_search\"]")
WebElement srhbtn;

@FindBy(xpath = "//div[@class=\"features_items\"]")
WebElement srhrslt;

@FindBy(xpath = "//a[@class=\"btn btn-default add-to-cart\"]")
WebElement addtocrt;

@FindBy(xpath = "//button[text()=\"Continue Shopping\"]")
WebElement conshop;

@FindBy(xpath = "//a[@href=\"/view_cart\"]")
WebElement cart;

@FindBy(xpath = "//table[@class=\"table table-condensed\"]")
WebElement cartdtl;

@FindBy(xpath = "//a[@href=\"/login\"]")
WebElement login;

@FindBy(xpath = "//input[@data-qa=\"login-email\"]")
WebElement email;

@FindBy(xpath = "//input[@data-qa=\"login-password\"]")
WebElement pass;

@FindBy(xpath = "//button[@data-qa=\"login-button\"]")
WebElement loginbtn;

@FindBy(xpath = "//table[@class=\"table table-condensed\"]")
WebElement aftcartdt;

@FindBy(xpath = "//a[@href=\"/logout\"]")
WebElement logout;




public void product_button()
{
	productsbtn.click();
}

public void search_product(String sp)
{
	srhproduct.sendKeys(sp);
}

public void search_button()
{
	srhbtn.click();
}

public void search_features()
{
	System.out.println(srhrslt.getText());
}

public void addto_cart()
{
	addtocrt.click();
}

public void continue_shopping()
{
	conshop.click();
}

public void cart()
{
	cart.click();
}


public void cart_detail1()
{
	System.out.println("shown results are before login"+cartdtl.getText());
}

public void signup_login()
{
	login.click();
}

public void email(String em)
{
	email.sendKeys(em);
}

public void password(String ps)
{
	pass.sendKeys(ps);
}

public void login_button()
{
	loginbtn.click();
}

public void cart_detail2()
{
	System.out.println("shown results are after login"+aftcartdt.getText());
}

public void logout()
{
	logout.click();
}





}
