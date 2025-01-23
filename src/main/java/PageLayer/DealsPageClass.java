package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilityLayer.WebElementHelper;

public class DealsPageClass extends BaseClass{

	@FindBy(xpath="//span[text()='Deals']/parent::a/following-sibling::button")
	WebElement dealsPlus;


	@FindBy(name="title")
		WebElement title;
		
		@FindBy(name="description")
		WebElement description;
		
		@FindBy(name="probability")
		WebElement probability;
		
		@FindBy(name="amount")
		WebElement amount;

		
		
		@FindBy(xpath="//button[text()='Save']")
		WebElement savebtn;
		
		
		public DealsPageClass()
		{
			PageFactory.initElements(getDriver(), this);
		}
		
	
		
		public void dealsPageFunctionality(String Title,String Description,
				String Probability,String Amount) 	{
			
			WebElementHelper.click(dealsPlus);
			
			WebElementHelper.sendKeys(title, Title);
			WebElementHelper.sendKeys(description, Description);
			
			WebElementHelper.sendKeys(probability, Probability);
			
			WebElementHelper.sendKeys(amount, Amount);
			
			
			
		}

	public void saveBtnFunctionality()
	{

	WebElementHelper.click(savebtn);

	}


}
