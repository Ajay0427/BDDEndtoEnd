package org.testingworld.automation.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testingworld.automation.base.CreateDriverinstance;

public class LoginPage extends CreateDriverinstance{

	@FindBy(xpath="//*[@id='email']")
	WebElement Username;
	

	@FindBy(xpath="//*[@id='pass']")
	WebElement password;
	
	@FindBy(xpath="//*[@id='loginbutton']")
	WebElement login;
	
	   public LoginPage(final WebDriver driver) {
	        super(driver);
	        PageFactory.initElements(driver, this);
	    }

	
	public void enterUsername(WebDriver driver)
	{
		Username.sendKeys("ajay0427@gmail.com");
	}

	public void enterPassword()
	{
		password.sendKeys("ididit");
	}
	
	public void btnLogin()
	{
		login.click();
	}


	public void enterUsername(String username2) {
		// TODO Auto-generated method stub
		Username.sendKeys(username2);
	}


	public void enterPassword(String password2) {
		// TODO Auto-generated method stub
		password.sendKeys(password2);
		
	}
	
}

