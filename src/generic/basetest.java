package generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class basetest implements autoconstant {
	public WebDriver driver;//variable creation so it can be used both @before and @after method
	static
	{
		System.setProperty(chromekeys, chromevalue);
		System.setProperty(geckokey, geckovalue);
	}
	@BeforeMethod
	public void precondition()
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
	}
	@AfterMethod
	public void postcondition(ITestResult r) 
	{
		String script_name=r.getMethod().getMethodName();
		int status=r.getStatus();
		if(status==2)
		{
			photo.getphoto(driver, script_name);
		}
		driver.close();
	}

}
