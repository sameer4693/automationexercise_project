package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class View_category_products extends Basepage
{
	public View_category_products(WebDriver driver)
	{
		super(driver);
	}
	
	
	
@FindBy(xpath = "//i[@class=\"fa fa-plus\"]")
WebElement women;

@FindBy(xpath = "//a[@href=\"/category_products/1\"]")
WebElement dress;

@FindBy(xpath = "//h2[@class=\"title text-center\"]")
WebElement txt;

public void women_category()
{
	women.click();
}

public void women_dress()
{
	dress.click();
}

public void product_list_women()
{
	System.out.println(txt.getText());
}


}
