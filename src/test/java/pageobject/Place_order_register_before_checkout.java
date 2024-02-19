package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Place_order_register_before_checkout extends Basepage
{
	public Place_order_register_before_checkout(WebDriver driver)
	{
		super(driver);
	}
	
	
	
@FindBy(xpath = "//input[@data-qa=\"login-email\"]")
WebElement loginemail;

@FindBy(xpath = "//input[@data-qa=\"login-password\"]")
WebElement loginpass;

@FindBy(xpath = "//button[@data-qa=\"login-button\"]")
WebElement loginbtn;

@FindBy(xpath = "//a[@data-product-id=\"2\"]")
WebElement adtocart;

@FindBy(xpath = "//button[text()=\"Continue Shopping\"]")
WebElement contshop;

@FindBy(xpath = "//a[@href=\"/view_cart\"]")
WebElement cart;

@FindBy(xpath = "//a[text()=\"Proceed To Checkout\"]")
WebElement proceedtochk;

@FindBy(xpath = "//ul[@class=\"address item box\"]")
WebElement deliveryadd;

@FindBy(xpath = "//ul[@class=\"address alternate_item box\"]")
WebElement billingadd;

@FindBy(xpath = "//table[@class=\"table table-condensed\"]")
WebElement reviewurprd;

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
WebElement continuebtn;

@FindBy(xpath = "//a[@href=\"/logout\"] ")
WebElement logout;



public void login(String lo)
{
	loginemail.sendKeys(lo);
}

public void password(String pass)
{
	loginpass.sendKeys(pass);
}

public void loginbutton()
{
	loginbtn.click();
}

public void addtocart()
{
	adtocart.click();
}

public void continue_shopping()
{
	contshop.click();
}

public void cart()
{
	cart.click();
}

public void proceed_to_checkout()
{
	proceedtochk.click();
}

public void delivery_address()
{
	System.out.println(deliveryadd.getText());
}

public void billing_address()
{
	System.out.println(billingadd.getText());
}

public void review_order()
{
	System.out.println(reviewurprd.getText());
}

public void placeorder()

{
	placeorder.click();
}

public void name_of_card(String nc)
{
	nameofcard.sendKeys(nc);
}

public void cardnumber(String cn)
{
	cardnumber.sendKeys(cn);
}

public void cvc(String cv)
{
	cvc.sendKeys(cv);
}

public void expiry_month(String mnt)
{
	expirymnt.sendKeys(mnt);
}

public void expiry_year(String yr)
{
	expiryyr.sendKeys(yr);
}

public void pay_and_conformorder()
{
	paybtn.click();
}

public void success_msg()
{
	System.out.println(succmsg.getText());
}

public void continue_button()
{
	continuebtn.click();
}

public void logout()
{
	logout.click();
}

}
