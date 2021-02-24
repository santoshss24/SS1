package testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import library.ExcelLibrary;

public class TC002 extends BaseTest {

	@DataProvider
	public Object[][] getdata() {
		return ExcelLibrary.getData("./exceldata/data.xlsx", "Sheet1");
	}

	@Test(dataProvider = "getdata")
	public void itemsTextValidation(String text) {

		List<WebElement> products = driver.findElements(By.xpath("//h4[@class=\"product-name\"]"));

		for (WebElement webElement : products) {

			SoftAssert sa = new SoftAssert();
			sa.assertEquals(webElement.getText(), text);
		}
	}

	@Test
	public void imageValidation() {
		// List<WebElement> images =
		// driver.findElement(By.xpath("//div[@class=\"products\"]//div[@class=\"products\"]")).findElements(By.tagName("img"));

		List<WebElement> images = driver.findElements(By.xpath("//div[@class=\"products\"]//img"));

		for (WebElement webElement : images) {

			SoftAssert sa = new SoftAssert();
			sa.assertEquals(webElement.isDisplayed(), true);

			sa.assertAll();
		}
	}
	
	
	@Test
	public void addToCartButton()
	{
		List<WebElement> buttons = driver.findElements(By.xpath("//button[text()='ADD TO CART']"));
		
		for (WebElement button : buttons) {
			
			Assert.assertEquals(button.isEnabled(), true);
			button.click();
		}
		
		
		
	}

}