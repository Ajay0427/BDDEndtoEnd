package org.testingworld.automation.testcase;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.testingworld.auatomation.assertion.Compare;
import org.testingworld.automation.base.CreateDriverinstance;
import org.testingworld.automation.page.LoginPage;

import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;
import cucumber.table.DataTable;
import junit.framework.Assert;

public class Steps {
	
	
	WebDriver driver;
	LoginPage Login ;
	

@Given("^User is on login Page$")
public void User_is_on_login_Page()  {
    // Express the Regexp above with the code you wish you had
	CreateDriverinstance driverInstance = new CreateDriverinstance(driver);
	driver = driverInstance.getDriverInstancein();
	Login = new LoginPage(driver);
    
}

@When("^user enters username$")
/*public void user_enters_username() throws Throwable {
	
	Login.enterUsername(driver);
    // Express the Regexp above with the code you wish you had
    
}*/
public void user_enters_username(DataTable table) throws Throwable {
	List<List< String>>  data= table.raw();
	System.out.println(data.get(0).get(0));
    // Express the Regexp above with the code you wish you had
    
}

// Outline Example
///@When("^user enters <username>$")
@When("^user enters \"([^\"]*)\"$")
public void user_enters_username(String username) throws Throwable {
    // Express the Regexp above with the code you wish you had
	Login.enterUsername(username);
}

@When("^user enters <password>$")
public void user_enters_password(String Password) throws Throwable {
    // Express the Regexp above with the code you wish you had
	Login.enterPassword(Password);
}

/*
@When("^user enters password$")
public void user_enters_password() throws Throwable {
    // Express the Regexp above with the code you wish you had
	Login.enterPassword();
}
*/
@When("^user clicks on sign in button$")
public void user_clicks_on_sign_in_button() throws Throwable {
    // Express the Regexp above with the code you wish you had
    Login.btnLogin();
}

@Then("^User logged in successfully$")
public void User_logged_in_successfully() throws Throwable {
    // Express the Regexp above with the code you wish you had
	Compare validate = new Compare();
	
	Assert.assertTrue(validate.validateURL(driver, "ds"));
	
    
}
@Then("^User got errorpage$")
public void User_got_errorpage() throws Throwable {
    
}

}
