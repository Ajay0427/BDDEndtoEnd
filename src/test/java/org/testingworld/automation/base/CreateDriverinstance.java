package org.testingworld.automation.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CreateDriverinstance {
	
	
	public CreateDriverinstance(WebDriver driver) {
		// TODO Auto-generated constructor stub
	}

	public WebDriver getDriverInstancein()
	{
		
		System.setProperty("webdriver.gecko.driver","./Driver/geckodriver.exe");
		System.setProperty("webdriver.firefox.bin",
                "C:\\Users\\ajjaiswa\\AppData\\Local\\Mozilla Firefox\\firefox.exe");
		WebDriver Driver = new FirefoxDriver();
		Driver.get("https://www.facebook.com/login/");
		return Driver;
	}
	
	
	

}
