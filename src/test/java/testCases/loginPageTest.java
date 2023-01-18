package testCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import pages.LoginPage;

public class loginPageTest extends TestBase{

	LoginPage login;
	@BeforeMethod
	public void setup() 
	{
		initialization();
		login=new LoginPage();
	}
	
	@Test
	public void verifyTitleTest()
	{
		String expTitle="Swag Labs";
		String actTitle = login.verifyTitle();
		Assert.assertEquals(actTitle, expTitle);
	}

	@Test
	public void verifyUrlTest()
	{
		String expUrl="https://www.saucedemo.com/";
		String actUrl=login.verifyUrl();
		Assert.assertEquals(expUrl, actUrl);
	}
	@Test
	public void verifyLoginLogoTest()
	{
		boolean act = login.verifyLoginLogo();
		Assert.assertEquals(act, true);
	}
	@Test
	public void verifyBotLogoTest()
	{
		boolean act = login.verifyBotLogo();
		Assert.assertEquals(act, true);
	
	}
	
	@Test
	public void LoginInfoTest() throws InterruptedException
	{
		login.verifyLoginInfo();
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		driver.close(); 
	}
	
	
	
	
}
