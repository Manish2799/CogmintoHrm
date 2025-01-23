package StepDefinitions;

import BaseLayer.BaseClass;
import io.cucumber.java.AfterAll;

public class Hooks extends BaseClass{

	@AfterAll
	public void termination()
	{
		getDriver().quit();
	}
}
