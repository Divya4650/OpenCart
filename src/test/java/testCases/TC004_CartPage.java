package testCases;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.ShoppingCart;
import testBase.Base_Class;

public class TC004_CartPage extends Base_Class{
	@Test(dependsOnGroups = "cartSetup")

	public void Cart() {
		try {
			logger.info("***Starting TC004 ***");
			HomePage hp=new HomePage(driver);
			hp.GoToCart();
			
			ShoppingCart shopcart=new ShoppingCart(driver);
			shopcart.CartAddedProducts();
			Assert.assertEquals(shopcart.cartverifyproduct, "MacBook Air"); // ✅ correct order
			shopcart.ClickCheckOutbtn();
			
			
		}catch(Exception e) {
				logger.error("Test failed");
				logger.debug("Debug logs....");
				Assert.fail();
			
		}
		
	}

}
