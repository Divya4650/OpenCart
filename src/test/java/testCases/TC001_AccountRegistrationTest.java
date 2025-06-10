package testCases;

import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;
import testBase.Base_Class;

public class TC001_AccountRegistrationTest extends Base_Class{
	
	//public WebDriver driver;
	
	@Test(groups={"Master","Regression"})
	public void verify_registration() 
	{
		try {
		logger.info("***Starting TC001 ***");
		HomePage hp=new HomePage(driver);
		hp.clickMyAccount();
		logger.info("***clicked on myaccount link***");
		hp.clickRegister();
		logger.info("***clicked on register link***");
		AccountRegistrationPage arp=new AccountRegistrationPage(driver);
		
		logger.info("*** entering details***");
		arp.FirstName(randomstring().toUpperCase());
		arp.LastName(randomstring().toUpperCase());
		//to get random strings
		arp.Mail(randomstring()+"@gmail.com");
		arp.Phone(randomNumber());
		//to get same random number
		String Pword = randomAlphaNumeric();
		arp.password(Pword);
		arp.Confirmpassword(Pword);
		arp.PrivacyCheckbox();
		arp.submit();
		logger.info("***validating error msg***");
		
		String confirmationmsg=arp.MessageConfirm();
		Assert.assertEquals(confirmationmsg, "Your Account Has Been Created!");
	}catch(Exception e) {
		logger.error("Test failed");
		logger.debug("Debug logs....");
		Assert.fail();
	}
	logger.info("Test finished");
	}
	
}
