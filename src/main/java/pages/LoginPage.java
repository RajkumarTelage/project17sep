package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class LoginPage extends TestBase{

	@FindBy(xpath="//div[@class=\"login_logo\"]") private WebElement LoginLogo;
	@FindBy(xpath="//div[@class=\"bot_column\"]") private WebElement BotLogo;
	@FindBy(xpath="//input[@id=\"user-name\"]")private WebElement UserName;
	@FindBy(xpath="//input[@id=\"password\"]")private WebElement Password;
	@FindBy(xpath="//input[@id=\"login-button\"]")private WebElement submit;
	@FindBy(xpath="//select[@class=\"product_sort_container\"]")private WebElement DropDown;
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public boolean verifyLoginLogo()
	{
		return LoginLogo.isDisplayed();
	}
	public boolean verifyBotLogo() 
	{
		return BotLogo.isDisplayed();
	}
	public String verifyTitle() 
	{
		  return driver.getTitle();
	}
	public String verifyUrl()
	{
		return driver.getCurrentUrl();
	}
	
	public void verifyLoginInfo() throws InterruptedException
	{
		Thread.sleep(1000);
		UserName.sendKeys("standard_user");
		Thread.sleep(2000);
		Password.sendKeys("secret_sauce");
		Thread.sleep(1000);
		submit.click();
		Thread.sleep(1000);
		DropDown.click();
		Thread.sleep(2000);

		
		
	}
	
	
	
	
}
