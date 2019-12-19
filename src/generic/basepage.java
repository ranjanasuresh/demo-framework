package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class basepage {
	WebDriver driver;
public basepage(WebDriver driver)
{
	 this.driver=driver;
}
public void titlewait(String expected_title)
{
	   try {
		   WebDriverWait wait=new WebDriverWait(driver,10);
		   wait.until(ExpectedConditions.titleIs(expected_title));
		   Reporter.log("pass:title is matching",true);
	   }
	   catch(Exception e)
	   {
		   Reporter.log("fail:title is not matching",true);
		   Assert.fail();
	   }
	   }
public void elementvisibility(WebElement element)
{
	   try {
		   WebDriverWait wait=new WebDriverWait(driver,10);
		   wait.until(ExpectedConditions.visibilityOf(element));
	   }
	   catch(Exception e)
	   {
		   Reporter.log("fail:title is not matching",true);
		   Assert.fail();
	   }
}
}
