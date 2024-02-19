package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Delete_Account extends Basepage
{
	public Delete_Account(WebDriver driver)
	{
		super(driver);
	}
	
	

@FindBy(xpath = "href=\"/login\"")
WebElement signup_login;

@FindBy(xpath = "//input[@data-qa=\"login-email\"]")
WebElement loginemail;

@FindBy(xpath = "//input[@data-qa=\"login-password\"]")
WebElement  loginpas;

@FindBy(xpath = "//button[@data-qa=\"login-button\"]")
WebElement loginbutt;

@FindBy(xpath = "//a[@href=\"/delete_account\"]")
WebElement delete_acc;

@FindBy(xpath = "//h2[@data-qa=\"account-deleted\"]")
WebElement confirmationmsg;

@FindBy(xpath = "//a[@class=\"btn btn-primary\"]")
WebElement conbtn;

public void signup_login()
{
	signup_login.click();
}

public void email(String e)
{
	loginemail.sendKeys(e);
}

public void password(String p)
{
	loginpas.sendKeys(p);
}

public void login_button()
{
	loginbutt.click();
}

public void delete_account()
{
	delete_acc.click();
}

public void confirmation_msg()
{
	System.out.println(confirmationmsg.getText());
}

public void continue_button()
{
	conbtn.click();
}
}
