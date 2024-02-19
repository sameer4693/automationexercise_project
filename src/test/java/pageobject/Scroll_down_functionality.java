package pageobject;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class Scroll_down_functionality extends Basepage 
{
	
	public Scroll_down_functionality(WebDriver driver)
	{
		super(driver);
	}
	
	
	



public void scrolldown()
{
	JavascriptExecutor js=(JavascriptExecutor) driver;
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	js.executeScript("window.scrollTo(0, document.body.scrollHeight)");}


}
