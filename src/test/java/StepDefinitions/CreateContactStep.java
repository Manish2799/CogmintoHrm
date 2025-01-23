package StepDefinitions;

import BaseLayer.BaseClass;
import PageLayer.CreateNewContactPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateContactStep extends BaseClass {
	
	CreateNewContactPage createNewContactPage;
	
@When("User should click on create contact")
public void user_should_click_on_create_contact() {
  
	 createNewContactPage = new CreateNewContactPage(); 
	 
	 createNewContactPage.clickOnCreateContact();
	
}
@When("User should enter fname as {string} and lname as {string} and email as {string} and status as {string}")
public void user_should_enter_fname_as_and_lname_as_and_email_as_and_status_as(String Fname, String Lname, String Email, String Status) {
 
	
	 createNewContactPage = new CreateNewContactPage();
	 
	 createNewContactPage.createnewContact(Fname, Lname, Email, Status);
	 
}
@Then("User click on save Button")
public void user_click_on_save_button() {
	
	 createNewContactPage = new CreateNewContactPage();
	 
	 createNewContactPage.clickOnSavebtn();
	 
   
}

}
