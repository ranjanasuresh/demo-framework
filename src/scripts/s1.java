package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import POM.actitime_enter_timetrack_logout;
import POM.actitime_login1;
import generic.basetest;
import generic.basetest1;
import generic.data;

public class s1 extends basetest1 {//changed to basetest1
	@Test
	public void actilogin()
	{
		actitime_login1 ob=new actitime_login1(driver);
//		ob.setusername(data.getdata(excelpath, "sheet1", 0, 0));  excel is not installed
//		ob.setpassword(data.getdata(excelpath, "sheet1", 1, 0));
		ob.setusername("admin");
		ob.setpassword("manager");
		ob.setclicklogin();
		ob.titlewait("actiTIME - Enter Time-Track");
		
	}

	
	}


//excel is not there