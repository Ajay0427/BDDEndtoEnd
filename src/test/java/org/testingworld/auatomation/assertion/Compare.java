package org.testingworld.auatomation.assertion;

import org.openqa.selenium.WebDriver;

public class Compare {

	public boolean validateURL(WebDriver Driver, String URL)
	{
		
		String currentURL = Driver.getCurrentUrl();
		Boolean flag = false;
		if(currentURL.equalsIgnoreCase(URL))
		{
			flag = true;
		}
		
		return flag;
	}
}
