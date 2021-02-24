package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage 
{
	@FindBy(id = "username")
	private WebElement username;
	
	@FindBy(name = "pwd")
	private WebElement password;
	
	@FindBy(id = "loginButton")
	private WebElement loginButton;
	

	public LoginPage(WebDriver driver, library.webActionUtil webActionUtil) {
		super(driver, webActionUtil);
	}
	
	
	public void login(String usn, String pwd)
	{
		webActionUtil.enterKeys(username, usn);
		webActionUtil.enterKeys(password, pwd);
		webActionUtil.clickOnElement(loginButton);
	}

}
