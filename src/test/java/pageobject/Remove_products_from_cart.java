package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Remove_products_from_cart extends Basepage
{
	public Remove_products_from_cart(WebDriver driver)
	{
		super(driver);
	}
	

@FindBy(xpath = "//a[@data-product-id=\"1\"]")
WebElement addprd;

@FindBy(xpath = "//button[text()=\"Continue Shopping\"]")
WebElement conshop;

@FindBy(xpath = "//a[@href=\"/view_cart\"]")
WebElement cart;

@FindBy(xpath = "//a[@class=\"cart_quantity_delete\"]")
WebElement deleteprd;

@FindBy(xpath = "//b[text()=\"Cart is empty!\"]")
WebElement deletemsg;



public void add_product()
{
	addprd.click();
}

public void continue_shopping()
{
	conshop.click();
}

public void cart()
{
	cart.click();
}

public void delete_product()
{
	deleteprd.click();
}

public void msg()
{
	System.out.println(deletemsg.getText());
}


}
