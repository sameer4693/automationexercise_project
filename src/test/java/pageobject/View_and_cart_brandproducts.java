package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class View_and_cart_brandproducts extends Basepage
{
	public View_and_cart_brandproducts(WebDriver driver)
	{
		super(driver);
	}


@FindBy(xpath = "//a[@href=\"/products\"]")
WebElement products;

@FindBy(xpath = "//a[@href=\"/brand_products/Polo\"]")
WebElement polo;

@FindBy(xpath = "//div[@class=\"features_items\"]")
WebElement poloproducts;

@FindBy(xpath = "//a[@href=\"/brand_products/H&M\"]")
WebElement h_m;

@FindBy(xpath = "//div[@class=\"features_items\"]")
WebElement h_mproducts;



public void products_button()
{
	products.click();
}

public void polo_brand()
{
	polo.click();
}

public void polo_products()
{
	System.out.println(poloproducts.getText());
}

public void h_m()
{
	h_m.click();
}

public void h_m_products()
{
	System.out.println(h_mproducts.getText());
}

}
