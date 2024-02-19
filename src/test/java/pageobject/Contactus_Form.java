package pageobject;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Contactus_Form extends Basepage
{
	public Contactus_Form(WebDriver driver)
	{
		super(driver);
	}
	
	
@FindBy(xpath = "//input[@placeholder=\"Name\"]")
WebElement cntname;

@FindBy(xpath = "//input[@placeholder=\"Email\"]")
WebElement cntemail;

@FindBy(xpath = "//input[@placeholder=\"Subject\"]")
WebElement subject;

@FindBy(xpath = "//textarea[@placeholder=\"Your Message Here\"]")
WebElement txtarea;

@FindBy(xpath = "//input[@data-qa=\"submit-button\"]")
WebElement submitbtn;



public void cntname(String nm)
{
	cntname.sendKeys(nm);
}

public void cntemail(String eml)
{
	
	cntemail.sendKeys(eml);
}

public void subject(String sbj)
{
	
	subject.sendKeys(sbj);
}

public void textarea(String txt)
{
	txtarea.sendKeys(txt);
}

public void submitbtn()
{
	submitbtn.click();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
}

public void alert()
{
	
	driver.switchTo().alert().dismiss();
}
}
