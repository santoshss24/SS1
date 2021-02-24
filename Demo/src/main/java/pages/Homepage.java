package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage extends BasePage

{
	@FindBy(xpath = "//input[@class=\"search-keyword\"]")
	private WebElement searchBox;

	
	@FindBy(xpath = "//button[@class=\"search-button\"]")
	private WebElement searchButton;
	
//	@FindBy(xpath = "//h4[@class=\"product-name\"]")
//	private list<WebElement> products;
	
	public Homepage(WebDriver driver, library.webActionUtil webActionUtil) {
		super(driver, webActionUtil);
		// TODO Auto-generated constructor stub
	}
	
	public void enterKeysInSearchBox(String keys)
	{
		webActionUtil.enterKeys(searchBox, keys);
	}
	
	public void clickOnSearchButton()
	{
		webActionUtil.clickOnElement(searchButton);
	}

}
