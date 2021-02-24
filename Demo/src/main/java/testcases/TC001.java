package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pages.Homepage;

public class TC001 extends BaseTest 
{
	
	@Test
	public void titleValidation()
	{
		String actualTitle=driver.getTitle();
		
		Assert.assertEquals(actualTitle, "GreenKart - veg and fruits kart");
	}
	
	
	@Test
	public void urlvalidation()
	{
		
		String actualurl=driver.getCurrentUrl();
		
		Assert.assertEquals(actualurl, "https://rahulshettyacademy.com/seleniumPractise/#/");
	}
	
	@Test
	public void searchboxValidation1()
	{
		Homepage homepage=new Homepage(driver, webActionUtil);
		homepage.enterKeysInSearchBox("Tomato");
		homepage.clickOnSearchButton();
		
		WebElement TomatoElement=driver.findElement(By.xpath("//h4[text()='Tomato - 1 Kg']"));
		
		SoftAssert sa=new SoftAssert();
		sa.assertTrue(TomatoElement.isDisplayed());
		
		sa.assertAll();
		
		
	}
	
	@Test
	public void searchboxValidation2()
	{
		Homepage homepage=new Homepage(driver, webActionUtil);
		homepage.enterKeysInSearchBox("123");
		homepage.clickOnSearchButton();
		
		WebElement Text=driver.findElement(By.xpath("//h2[text()=\"Sorry, no products matched your search!\"]"));
		
		Assert.assertTrue(Text.isDisplayed());
		
		
	}

}
