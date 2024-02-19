package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Add_review_on_product extends Basepage
{
	public Add_review_on_product(WebDriver driver)
	{
		super(driver);
	}
	
	
@FindBy(xpath = "//a[@href=\"/product_details/2\"]")
WebElement prddtl;

@FindBy(xpath = "//input[@placeholder=\"Your Name\"]")
WebElement yourname;

@FindBy(xpath = "//input[@placeholder=\"Email Address\"]")
WebElement email;

@FindBy(xpath = "//textarea[@name=\"review\"]")
WebElement txtarea;
 
@FindBy(xpath = "//button[@type=\"submit\"]")
WebElement submit;

@FindBy(xpath = "//span[text()=\"Thank you for your review.\"]")
WebElement msg;

public void product_detail()
{
	prddtl.click();
}

public void your_name(String yn)
{
	yourname.sendKeys(yn);
}

public void email(String e)
{
	email.sendKeys(e);
}

public void text_area(String a)
{
	txtarea.sendKeys(a);
}

public void submit_button()
{
	submit.click();
}

public void thankyou_message()
{
	System.out.println(msg.getText());
}
}

