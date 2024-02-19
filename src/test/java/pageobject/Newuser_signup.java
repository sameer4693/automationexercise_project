package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Newuser_signup extends Basepage
{
	public Newuser_signup (WebDriver driver)
	{
		super(driver);
	}
	
	
@FindBy(xpath = "//input[@name=\"name\"]")
WebElement name;

@FindBy(xpath = "//input[@data-qa=\"signup-email\"]")
WebElement email;

@FindBy(xpath = "//button[@data-qa=\"signup-button\"]")
WebElement button;

public void signupname(String Name)
{
	name.sendKeys(Name);
}
	
public void signupmail(String mail)
{
	email.sendKeys(mail);
}

public void signupbutton()
{
	button.click();
}


}
