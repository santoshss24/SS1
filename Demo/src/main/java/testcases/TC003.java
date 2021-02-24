package testcases;

import org.testng.annotations.Test;

import pages.Homepage;

public class TC003 extends BaseTest 
{
	@Test
	public void createUser() 
	{
		Homepage homepage=new Homepage(driver, webActionUtil);
		homepage.enterKeysInSearchBox("Tomato");
		homepage.clickOnSearchButton();
		
	}
}
