package POM;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import generic.basepage;
public class actitime_login1 extends basepage {
	       	       @FindBy(id="username")//declaration and @findby is an annotation
	       private WebElement username;//initialisation both done in a single line
	       
	       @FindBy(name="pwd")
	       private WebElement password;
	       
	       @FindBy(id="loginButton")
	       private WebElement login;
	       
	       public actitime_login1(WebDriver driver) {
	    	  super(driver);
	    	   PageFactory.initElements(driver, this);
	       }
	       public void setusername(String un) {
	    	   this.username.sendKeys(un);
	       }
	       public void setpassword(String pw) {
	    	   this.password.sendKeys(pw);
	       }
	       public void setclicklogin() {
	       this.login.click();
	       }
	      
	       }

//getter and setter can also be used but whatever the method is used need to achieve encapsulation