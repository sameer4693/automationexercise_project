package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Place_order_register_whilecheckout extends Basepage
{
	public Place_order_register_whilecheckout(WebDriver driver)
	{
		super(driver);
	}

	
@FindBy(xpath = "//a[@data-product-id=\"2\"]")
WebElement addtc;

@FindBy(xpath = "//button[text()=\"Continue Shopping\"]")
WebElement cns;

@FindBy(xpath = "//a[@href=\"/view_cart\"]")
WebElement cart;

@FindBy(xpath = "//a[text()=\"Proceed To Checkout\"]")
WebElement protochk;

@FindBy(xpath = "//u[text()=\"Register / Login\"]")
WebElement reg_log;

@FindBy(xpath = "//input[@data-qa=\"login-email\"]")
WebElement login;

@FindBy(xpath = "//input[@data-qa=\"login-password\"]")
WebElement password;

@FindBy(xpath = "//button[@data-qa=\"login-button\"]")
WebElement loginbtn;

@FindBy(xpath = "//ul[@class=\"address item box\"]")
WebElement address;

@FindBy(xpath = "//ul[@class=\"address alternate_item box\"]")
WebElement billingadd;

@FindBy(xpath = "//table[@class=\"table table-condensed\"]")
WebElement rewurord;

@FindBy(xpath = "//textarea[@class=\"form-control\"]")
WebElement textarea;

@FindBy(xpath = "//a[text()=\"Place Order\"]")
WebElement placeorder;

@FindBy(xpath = "//input[@data-qa=\"name-on-card\"]")
WebElement nameofcard;

@FindBy(xpath = "//input[@data-qa=\"card-number\"]")
WebElement cardnumber;

@FindBy(xpath = "//input[@data-qa=\"cvc\"]")
WebElement cvc;

@FindBy(xpath = "//input[@data-qa=\"expiry-month\"]")
WebElement expirymnt;

@FindBy(xpath = "//input[@data-qa=\"expiry-year\"]")
WebElement expiryyr;

@FindBy(xpath = "//button[@data-qa=\"pay-button\"]")
WebElement paybtn;

@FindBy(xpath = "//p[text()=\"Congratulations! Your order has been confirmed!\"]")
WebElement succmsg;

@FindBy(xpath = "//a[@data-qa=\"continue-button\"]")
WebElement conbtn;

@FindBy(xpath = "//a[@href=\"/logout\"]")
WebElement logout;


public void addto_cart()
{
	addtc.click();
}

public void continueshopping()
{
	cns.click();
}

public void cart()
{
	cart.click();
}

public void proceedtocheckout()
{
	protochk.click();
}

public void register_login()
{
	reg_log.click();
}

public void login(String log)
{
	login.sendKeys(log);
}

public void password(String pass)
{
	password.sendKeys(pass);
}

public void login_button()
{
	loginbtn.click();
}

public void address_details()
{
	System.out.println(address.getText());
}

public void billing_address()
{
	System.out.println(billingadd.getText());
}
 
public void review_your_order()
{
	System.out.println(rewurord.getText());
}

public void textarea(String ta)
{
	textarea.sendKeys(ta);
}

public void placeorder()
{
	placeorder.click();
}
public void name_of_card(String nc)
{
	nameofcard.sendKeys(nc);
}

public void card_number(String cn)
{
	cardnumber.sendKeys(cn);
}

public void cvc(String cv)
{
	cvc.sendKeys(cv);
}

public void expiry_month(String em)
{
	expirymnt.sendKeys(em);
}

public void expiry_year(String ey)
{
	expiryyr.sendKeys(ey);
}

public void pay_and_conform_order()
{
	paybtn.click();
}

public void success_msg()
{
	System.out.println(succmsg.getText());
}

public void continue_button()
{
	conbtn.click();
}

public void logout()
{
	logout.click();
}
}
