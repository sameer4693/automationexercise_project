package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Logging extends Basepage
{
	public Logging(WebDriver driver)
	{
	super(driver);
	}
	
@FindBy(xpath = "//input[@data-qa=\"login-email\"]")
WebElement lemail;

@FindBy(xpath = "//input[@data-qa=\"login-password\"]")
WebElement lpass;

@FindBy(xpath = "//button[@data-qa=\"login-button\"]")
WebElement login;
	
	
public void loginemail(String le)
{
	
	lemail.sendKeys(le);
	
}

public void loginpassword(String lpassw)
{
	
	lpass.sendKeys(lpassw);
	
}

public void logbutton()
{
	
	login.click();
}
	
	
}
