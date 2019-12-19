package scripts;

import org.testng.annotations.Test;

import POM.actitime_enter_timetrack_logout;
import POM.actitime_login1;
import generic.basetest;

public class s2 extends basetest {
	@Test
	public void logoutscript() {
		actitime_login1 ob=new actitime_login1(driver);
		ob.setusername("admin");
		ob.setpassword("manager");
		ob.setclicklogin();
		actitime_enter_timetrack_logout ob2= new actitime_enter_timetrack_logout(driver);
		ob2.elementvisibility(ob2.logout());
		ob2.logout();
	}

}
