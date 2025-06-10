package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.Base_Class;

public class TC002_LoginTest extends Base_Class {

	
	@Test(groups={"Sanity","Master"})
	public void verify_login() {
		logger.info("*** starting TC002 login test***");
		try {
		HomePage hp=new HomePage(driver);
		hp.clickMyAccount();
		hp.clickLogin();
		
		LoginPage lp =new LoginPage(driver);
		lp.SendEmail(p.getProperty("mail"));
		lp.SendPassword(p.getProperty("password"));
		lp.ClickLogin();
		
		MyAccountPage mac=new MyAccountPage(driver);
		boolean targetpage=mac.isMyAccountExists();
		
		Assert.assertEquals(targetpage, true, "login failed");
		}
		catch(Exception e){
			Assert.fail();
		}
		logger.info("*** finished TC002 login test***");
		
		
		
				
	}
}
