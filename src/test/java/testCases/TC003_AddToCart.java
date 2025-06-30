package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.Products;
import testBase.Base_Class;

public class TC003_AddToCart extends Base_Class{
	@Test(groups = "cartSetup")
	public void AddCart() {
		try {
			logger.info("***Starting TC003 ***");
			
			Products prod=new Products(driver);
			prod.ClickDesktops();
			prod.ClickShowAllDesktops();
			Scroll();
			//prod.SelectMacBook();
			prod.AddMacCart();
			prod.AddMacCartsuccessmsg();
			
			String confirmOfMacmsg=prod.AddMacCartsuccessmsg();;
			//Assert.assertEquals(confirmOfMacmsg, "Success: You have added MacBook Air to your shopping cart!");
			Assert.assertTrue(confirmOfMacmsg.contains("MacBook Air"), "Success message mismatch!");

		}catch(Exception e) {
				logger.error("Test failed");
				logger.debug("Debug logs....");
				Assert.fail();
			
		}
	}

}
