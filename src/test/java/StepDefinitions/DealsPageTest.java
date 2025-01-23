package StepDefinitions;

import BaseLayer.BaseClass;
import PageLayer.DealsPageClass;
import PageLayer.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DealsPageTest extends BaseClass{

	static DealsPageClass dls;

@Given("user should click on deals page")
public void user_should_click_on_deals_page() {
   
	HomePage hmp = new HomePage();
	 
	hmp.clickOnDealsLink();
}


@When("user should enter title as {string} and description as {string} and probability as {string} and amount as {string}")
public void user_should_enter_title_as_and_description_as_and_probability_as_and_amount_as(String Title, String Description, String Probability, String Amount) 
{
dls = new DealsPageClass();
	
	dls.dealsPageFunctionality(Title, Description, Probability, Amount);
} 

	


@Then("user should click on save button")
public void user_should_click_on_save_button() {
 
	dls.saveBtnFunctionality();
	
}
}
