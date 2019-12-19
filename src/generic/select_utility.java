package generic;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class select_utility {
	public static void selectbyindex(WebElement element,int index)
	{
		Select s=new Select(element);
		s.selectByIndex(index);
	}

}
