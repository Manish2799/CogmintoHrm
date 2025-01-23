package StepDefinitions;

import org.testng.Assert;

import BaseLayer.BaseClass;
import PageLayer.HomePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageStep extends BaseClass {

	static HomePage homepage;
	@When("validate HomePage URL")
	public void validate_home_page_url() {
		 homepage= new HomePage();
		String URL= homepage.validateUrl();
		 Assert.assertEquals(URL.contains("cogmento"), true);
	}
	@Then("click on ContactLink")
	public void click_on_contact_link() {
		homepage.clickOnCompanyLink();
	}

}
