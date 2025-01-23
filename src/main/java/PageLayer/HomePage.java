package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilityLayer.WebElementHelper;

public class HomePage extends BaseClass {

	@FindBy(xpath="//a[@href='/contacts']")
	WebElement contactLink;
	
	@FindBy(xpath="//a[@href='/companies']")
	WebElement companyLink;
	
	@FindBy(xpath="//a[@href='/deals']")
	WebElement dealsLink;
	
	public HomePage()
	{
		PageFactory.initElements(getDriver(), this);
	}
	
	public String validateUrl()
	{
		return getDriver().getCurrentUrl();
	}
	
	public void clickOnContactLink()
	{
		WebElementHelper.click(contactLink);
	}
	
	public void clickOnCompanyLink()
	{
		WebElementHelper.click(companyLink);
	}
	
	public void clickOnDealsLink()
	{
		WebElementHelper.click(dealsLink);
	}
}
