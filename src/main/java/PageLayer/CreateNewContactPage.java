package PageLayer;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilityLayer.DropDownHelper;
import UtilityLayer.WebElementHelper;

public class CreateNewContactPage extends BaseClass {

	@FindBy(xpath = "//a[@href='/contacts/new']")
	private WebElement createContact;

	@FindBy(name = "first_name")
	WebElement fname;

	@FindBy(name = "last_name")
	WebElement lname;

	@FindBy(name = "value")
	WebElement email;

	@FindBy(name = "status")
	WebElement status;

	@FindBys(@FindBy(xpath = "//div[@class='visible menu transition']/child::div"))
	List<WebElement> statusList;

	@FindBy(xpath = "//button[text()='Save']")
	WebElement savebtn;

	public CreateNewContactPage() {
		PageFactory.initElements(getDriver(), this);
	}

	public void clickOnCreateContact() {
		WebElementHelper.click(createContact);
	}

	public void createnewContact(String Fname, String Lname, String Email, String Status) {
		WebElementHelper.sendKeys(fname, Fname);
		WebElementHelper.sendKeys(lname, Lname);
		WebElementHelper.sendKeys(email, Email);
		WebElementHelper.click(status);
		DropDownHelper.selectValue(statusList, Status);

	}

	public void clickOnSavebtn() {

		WebElementHelper.click(savebtn);
	}

}
