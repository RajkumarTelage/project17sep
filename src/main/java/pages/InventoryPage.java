package pages;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class InventoryPage extends TestBase{
	LoginPage login=new LoginPage();
	@FindBy(xpath="//select[@class=\"product_sort_container\"]")private WebElement DropDown;
	@FindBy(xpath="//div[@class=\"app_logo\"]")private WebElement AppLogo;
	@FindBy(xpath="//a[text()=\"Facebook\"]")private WebElement Facebook;
	@FindBy(xpath="//a[@href=\"https://twitter.com/saucelabs\"]")private WebElement Twitter;
	@FindBy(xpath="//button[@id=\"add-to-cart-sauce-labs-onesie\"]")private WebElement AddCart1;
	@FindBy(xpath="//button[@id=\"add-to-cart-sauce-labs-bike-light\"]")private WebElement AddCart2;

 	{
		PageFactory.initElements(driver, this);
	}
	
	public String verifyCurrentUrl() throws Exception
	
	{		
		 login.verifyLoginInfo();
		 Thread.sleep(2000);
		return driver.getCurrentUrl();
	}
	
	public String verifyTitle() throws Exception
	{			
		 login.verifyLoginInfo();
		 Thread.sleep(2000);

		return driver.getTitle();
	}
	public void verifyAppLogo() throws InterruptedException {
		 login.verifyLoginInfo();
		 Thread.sleep(2000);
		AppLogo.click();
	}
	public  void verifyDropdown() throws InterruptedException 
	{		 login.verifyLoginInfo();
	

			
	Thread.sleep(2000); 
				Actions a=new Actions(driver);
				a.moveToElement(DropDown).click().build().perform();
				a.sendKeys(Keys.DOWN).click().build().perform();
				a.sendKeys(Keys.ENTER).click().build().perform();
				Thread.sleep(3000);
}
				
	public boolean VerifyFacebook() throws InterruptedException
	{ login.verifyLoginInfo();
		return Facebook.isDisplayed();
	
	}
	
	public boolean VerifyTwitter() throws InterruptedException
	{ login.verifyLoginInfo();
		return Twitter.isDisplayed();
	}
	public void verifyAddCart() throws InterruptedException 
	{login.verifyLoginInfo();
	Thread.sleep(1000);
		AddCart1.click();
		AddCart2.click();
		
	
		
	}
}

  