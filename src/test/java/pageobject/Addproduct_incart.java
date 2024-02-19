package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Addproduct_incart extends Basepage
{
	public Addproduct_incart(WebDriver driver)
	{
		super(driver);
	}
	
	
@FindBy(xpath = "//a[@data-product-id=\"1\"]")
WebElement addcrt;

@FindBy(xpath = "//button[text()=\"Continue Shopping\"]")
WebElement cntshp;

@FindBy(xpath = "//a[@data-product-id=\"2\"]")
WebElement addcrt2;

@FindBy(xpath = "//a[@href=\"/view_cart\"]")
WebElement viewcrt;

@FindBy(xpath = "//div[@class=\"table-responsive cart_info\"]")
WebElement crttbl;




public void addtocart()
{
	
	addcrt.click();
}

public void continueshopping()
{
	
	cntshp.click();
}

public void addcrt2()
{
	
	addcrt2.click();
}

public void viewcart()
{
	
	viewcrt.click();
}

public void crtdetails()
{
	System.out.print(crttbl.getText());
}
}
