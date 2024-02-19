package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Searchproduct extends Basepage 
{
	public Searchproduct(WebDriver driver)
	{
		super(driver);
	}
	

@FindBy(xpath = "//input[@placeholder=\"Search Product\"]")
WebElement enternameproduct;

@FindBy(xpath = "//button[@id=\"submit_search\"]")
WebElement searchproduct;

@FindBy(xpath = "//div[@class=\"features_items\"]")
WebElement featureitem;

public void enterproduct_name(String prdname)
{
	
	enternameproduct.sendKeys(prdname);
}

public void searchproductbutton()
{
	searchproduct.click();
}

public void featureitems()
{
	
	System.out.println(featureitem.getText());
}
}
