package POM;


	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

import generic.basepage;

	public class actitime_enter_timetrack_logout extends basepage{
			@FindBy(id="logoutLink")
			private WebElement logout;
			
			
			 public actitime_enter_timetrack_logout(WebDriver driver) {
				 super(driver);
		    	   PageFactory.initElements(driver, this);   
			 }
			 public WebElement logout() {
		    	   this.logout.click();
				return logout;
				
		       }
			 
		      
	}

