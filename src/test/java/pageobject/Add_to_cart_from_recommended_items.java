package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Add_to_cart_from_recommended_items extends Basepage
{
	public Add_to_cart_from_recommended_items(WebDriver driver)
	{
		super(driver);
	}
	
	
	
@FindBy(xpath = "//a[@data-product-id=\"2\"]")
WebElement tshirt;

@FindBy(xpath = "//a[@href=\"/view_cart\"]")
WebElement viewcart;

@FindBy(xpath = "//table[@class=\"table table-condensed\"]")
WebElement cartdtl;

public void recommended_tshirt()
{
	tshirt.click();
}

public void viewcart_buttob()
{
	viewcart.click();
}

public void cart_detail()
{
	System.out.println(cartdtl.getText());
}

}
