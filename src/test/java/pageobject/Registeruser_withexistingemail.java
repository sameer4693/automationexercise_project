package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Registeruser_withexistingemail extends Basepage 
{

	public Registeruser_withexistingemail(WebDriver driver)
	{
		super(driver);
	}
	
	
@FindBy(xpath = "//input[@data-qa=\"signup-name\"]")
WebElement regname;

@FindBy(xpath = "//input[@data-qa=\"signup-email\"]")
WebElement regemail;

@FindBy(xpath = "//p[text()=\"Email Address already exist!\"]")
WebElement alreadyreg;

public void regname(String ren)
{
	
	regname.sendKeys(ren);
	
}

public void regemail(String ree)
{
	
	regemail.sendKeys(ree);
	
}

public String alreadyregisteredmsg()
{
	return(alreadyreg.getText());
}

	
	
	
	
	
	
}
