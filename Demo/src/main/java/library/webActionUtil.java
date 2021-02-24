package library;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class webActionUtil 
{
	public WebDriverWait wait;
	long ETO;
	public WebDriver driver;
	
	public webActionUtil(WebDriver driver, long ETO) {
		this.driver=driver;
		wait=new WebDriverWait(driver, ETO);
		this.ETO=ETO;
	}
	
	
	public void clickOnElement(WebElement target)
	{
	   wait=new WebDriverWait(driver, ETO);
	   wait.until(ExpectedConditions.elementToBeClickable(target));
	   target.click();
	}
	
	public void enterKeys(WebElement target, String keysToSend)
	{
		wait.until(ExpectedConditions.visibilityOf(target));
		target.sendKeys(keysToSend);
	}

}
