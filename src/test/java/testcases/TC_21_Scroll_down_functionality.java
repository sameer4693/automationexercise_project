
package testcases;

import org.testng.annotations.Test;

import pageobject.Scroll_down_functionality;
import testbase.Baseclass;

public class TC_21_Scroll_down_functionality extends Baseclass
{
		@Test
		public void scrolldown()
		{
			Scroll_down_functionality sd=new Scroll_down_functionality(driver);
			sd.scrolldown();
		}
}
