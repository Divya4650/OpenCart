package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCart extends BasePage {

	public ShoppingCart(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	public String cartverifyproduct;

 @FindBy (xpath="//*[@class='table-responsive']//tbody/tr/td[2]")
 List<WebElement> cartproducts;

@FindBy (linkText="Checkout")
WebElement checkout;

public String CartAddedProducts(){
	for(WebElement products: cartproducts) {
		if(products.getText().equals("MacBook Air")) {
			cartverifyproduct= products.getText();
		}
			
	}
	return cartverifyproduct;
}

public void ClickCheckOutbtn() {
	checkout.click();
}
}