package StepDefinitions;

import BaseLayer.BaseClass;
import PageLayer.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStep extends BaseClass{

	static LoginPage login;
	
	@Given("user open url in  browser")
	public void user_open_url_in_browser() {
	
		BaseClass.initlialization();
	}
	@When("user enter valid username and password")
	public void user_enter_valid_username_and_password() {
	 
		 login = new LoginPage();
		 
		 login.enterUsernameAndPassword("hollif4@bootsance.com","QpWdcqH$VY#8sKx");
	}
	@Then("user click on login button")
	public void user_click_on_login_button() {
	 
		login.clickOnLoginButton();
	}
	
}
