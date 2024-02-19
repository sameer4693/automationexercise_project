package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage extends Basepage
{

		public Homepage(WebDriver driver)
		{
			super(driver);
		}
		
//clicking login/new registration button
		
@FindBy(xpath = "//a[@href=\"/login\"]")
WebElement login;
		
@FindBy(xpath = "//a[@href=\"/contact_us\"]")
WebElement contus;

@FindBy(xpath = "//a[@href=\"/products\"]")
WebElement product;
		
//action for above element

		public void loginbutton()
		{
			login.click();
		}
		
		public void contactus()
		{
			contus.click();  
		}
		
		public void clickproduct()
		{
			
			product.click();
		}  


}
