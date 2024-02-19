package pageobject;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Increaseprd_count extends Basepage
{
	public Increaseprd_count(WebDriver driver)
	{
		super(driver);
	}
	
@FindBy(xpath = "//a[@href=\"/product_details/2\"]")
WebElement vewprd;

@FindBy(xpath = "//input[@type=\"number\"]")
WebElement qt;

@FindBy(xpath = "//button[@class=\"btn btn-default cart\"]")
WebElement addc;

@FindBy(xpath = "//button[text()=\"Continue Shopping\"]")
WebElement conshop;

@FindBy(xpath = "//a[@href=\"/view_cart\"]")
WebElement cart;

//@FindBy(xpath = "//a[@href=\"/view_cart\"]")
//WebElement vic;

@FindBy(xpath = "//div[@class=\"table-responsive cart_info\"]")
WebElement crtdetail;

public void viewpr()
{
	
	vewprd.click();
}

public void increaseqt(String num)
{
	qt.clear();
	qt.sendKeys(num);
}

public void addc()
{
	addc.click();
	
}


/*public void viewc()
{
	
	vic.click();
}*/

public void continueshopping()
{
	conshop.click();
	
}

public void cartbtn()
{
	
	cart.click();
}

public void cartdetails()
{
	System.out.println(crtdetail.getText());
}
}

