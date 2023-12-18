package Testpkg;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import Basepkg.BaseClass;
import pagepkg.EbayPage;


public class EbayTest extends BaseClass {
	@Test()
	public void test1()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		EbayPage ob= new EbayPage(driver);
		String window1Ebay=driver.getWindowHandle();
		ob.search();
		ob.toyClick();
		Set<String> childwindows=driver.getWindowHandles(); //child window
		  for(String values:childwindows)
		  {
			  if(!values.equalsIgnoreCase(window1Ebay))
			  {
				  driver.switchTo().window(values);
		          ob.add_Cart();
		          JavascriptExecutor js = (JavascriptExecutor) driver;
				  js.executeScript("window.scrollBy(0,650)", "");   
			  }
			  driver.switchTo().window(window1Ebay);
	     }
		  ob.registrationClick();
		  ob.registration();
	}		  
		
	
}
