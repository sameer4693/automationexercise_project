package testbase;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ResourceBundle;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Baseclass 
{
public static WebDriver driver;

public Logger logger;

public ResourceBundle rb;

@BeforeClass
public void setup()
{
	rb=ResourceBundle.getBundle("config");
	logger= LogManager.getLogger(this.getClass());
	/*ChromeOptions op=new ChromeOptions(); //-->if you want headless testing use this (2lines)code
	op.addArguments("--headless");*/
	
	driver=new ChromeDriver();             //-->if you use headless testing include the object name inside the braces like this chromedriver(op);
	driver.get(rb.getString("appliactionurl"));
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
}

@AfterClass
public void teardown()
{
	driver.close();
}

public String captureScreen(String tname) throws IOException {

	String timeStamp = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date(0));
			
	TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
	File source = takesScreenshot.getScreenshotAs(OutputType.FILE);
	String destination = System.getProperty("user.dir") + "\\screenshot\\" + tname + "_" + timeStamp + ".png";

	try {
		FileUtils.copyFile(source, new File(destination));
	} catch (Exception e) {
		e.getMessage();
	}
	return destination;

}
}
