package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Verifiying_subscription extends Basepage
{
	public Verifiying_subscription(WebDriver driver)
	{
		super(driver);
	}

@FindBy(xpath = "//input[@id=\"susbscribe_email\"]")
WebElement semail;

@FindBy(xpath = "//button[@id=\"subscribe\"]")
WebElement clicksemail;

@FindBy(xpath = "//div[text()=\"You have been successfully subscribed!\"]")
WebElement successmsg;

public void subemail(String se)
{
	
	semail.sendKeys(se);
}

public void clicksemail()
{
	
	clicksemail.click();
}

public String successmsg()
{
	return(successmsg.getText());
}
}
