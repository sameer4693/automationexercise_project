package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Productdetail_page extends Basepage
{
	public Productdetail_page(WebDriver driver)
	{
		super(driver);
	}
	

@FindBy(xpath = "//a[@href=\"/product_details/1\"]")
WebElement details;

@FindBy(xpath = "//div[@class=\"product-information\"]")
WebElement prddetails;

public void viewproduct()
{
	
	details.click();
}

public void productdetailscategory()
{
	System.out.println(prddetails.getText());
	
}

}
