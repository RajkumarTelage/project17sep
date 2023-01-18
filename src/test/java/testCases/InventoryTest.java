package testCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import pages.InventoryPage;
import pages.LoginPage;

public class InventoryTest extends TestBase {
	LoginPage login;
	InventoryPage inv;
	@BeforeMethod
	public void setup() throws InterruptedException {
		initialization();
		login=new LoginPage();
		inv=new InventoryPage();
	}

	
	public void verifyLoginInfoTest() throws Exception {
	login.verifyLoginInfo();
	}
//	@Test
//	public void verifyCurrentUrlTest() throws Exception
//	{	
//
//	
//	String exp="https://www.saucedemo.com/inventory.html";
//	String act = inv.verifyCurrentUrl();
//	Thread.sleep(3000);
//	Assert.assertEquals(act, exp);
//	}
//	@Test
//	public void verifyTitleTest() throws Exception
//	{	
//
//		String act = "Swag Labs";	String exp=inv.verifyTitle();
//		Assert.assertEquals(act, exp);
//	}
//	
//	@Test
//	public void  verifyDropdownTest() throws InterruptedException
//	{
//		  inv.verifyDropdown();
//		 
//	}
	@Test
	public void verifyAddCart1Test() throws InterruptedException 
	{
		inv.verifyAddCart();
	
		Thread.sleep(5000);
	}
	
	
//	@Test
//	public void verifyAppLogoTest() throws InterruptedException 
//	{
//		Thread.sleep(2000);
//		inv.verifyAppLogo();
//	}
//	@Test
//	public void verifyFacebookTest() throws InterruptedException 
//	{
//		boolean act = inv.VerifyFacebook();
//		Assert.assertEquals(act, true);
//	}
//	@Test
//	public void verifyTwitterTest() throws InterruptedException 
//	{
//		boolean act = inv.VerifyTwitter();
//		Assert.assertEquals(act, true);
//	}
//	
	
	@AfterMethod
	public void closeBrowser()
	{
		driver.close();
	}
}
