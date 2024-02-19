package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Logout extends Basepage
{
	public Logout(WebDriver driver) 
	{
		super(driver);
	}
	
	
@FindBy(xpath = "//a[@href=\"/logout\"]")
WebElement logout;

public void logout()
{
	logout.click();
}
}
