package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilityLayer.WebElementHelper;

public class CompanyPageFunctionality extends BaseClass {
	@FindBy(name = "name")
	private WebElement wbName;

	@FindBy(name = "value")
	private WebElement wbEmail;

	@FindBy(xpath = "//button[@class='ui linkedin button']")
	private WebElement wbSave;

	public CompanyPageFunctionality() {
		PageFactory.initElements(getDriver(), this);

	}

	public void nameFunctionality(String name) {
		WebElementHelper.sendKeys(wbName, name);
	}

	public void emailFunctionality(String email) {
		WebElementHelper.sendKeys(wbEmail, email);
	}

	public void clickOnSaveFunctionality(String email) {
		WebElementHelper.click(wbSave);
		
	}

}
