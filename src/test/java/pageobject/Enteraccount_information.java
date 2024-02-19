package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Enteraccount_information extends Basepage 
{
		
	public Enteraccount_information(WebDriver driver)
	{
		super(driver);
	}
	
@FindBy(xpath = "//input[@id=\"id_gender1\"]")
WebElement  genderbutton;

@FindBy(xpath = "//input[@id=\"password\"]")
WebElement pass;

@FindBy(xpath = "//input[@id=\"first_name\"]")
WebElement fn;

@FindBy(xpath = "//input[@id=\"last_name\"]")
WebElement ln;

@FindBy(xpath = "//input[@id=\"company\"]")
WebElement company;

@FindBy(xpath = "//input[@name=\"address1\"]")
WebElement address1;

@FindBy(xpath = "//input[@id=\"address2\"]")
WebElement address2;

@FindBy(xpath = "//select[@id=\"country\"]")
WebElement country;

@FindBy(xpath = "//input[@id=\"state\"]")
WebElement state;

@FindBy(xpath = "//input[@id=\"city\"]")
WebElement city;

@FindBy(xpath = "//input[@id=\"zipcode\"]")
WebElement zipcode;

@FindBy(xpath = "//input[@id=\"mobile_number\"]")
WebElement mn;

@FindBy(xpath = "//button[@data-qa=\"create-account\"]")
WebElement cabutton;



public void gender()
{
	genderbutton.click();
	
}

public void password(String passw)
{
	pass.sendKeys(passw);
	
}

public void Firstname(String fname)
{
	fn.sendKeys(fname);
	
}

public void Lastname(String lname)
{
	ln.sendKeys(lname);
	
}

public void companyname(String com)
{
	company.sendKeys(com);
	
}

public void companyaddress1(String adr)
{
	address1.sendKeys(adr);
	
}

public void companyaddress2(String addr)
{
	address2.sendKeys(addr);
	
}

public void selectcountry(String visibleText)
{
	Select dd=new Select(country);
	//dd.selectByVisibleText(visibleText);
	dd.selectByValue(visibleText);
}

public void state(String sta)
{
	state.sendKeys(sta);
	
}

public void city(String ct)
{
	city.sendKeys(ct);
	
}

public void zipcode(String zc)
{
	zipcode.sendKeys(zc);
	
}

public void mobilenumber(String mon)
{
	mn.sendKeys(mon);
	
}
 
public void createaccount()
{
	cabutton.click();
	
}

}
