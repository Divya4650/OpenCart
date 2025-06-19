package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Products extends BasePage {
	public Products(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(linkText = "Desktops")
	WebElement desktop;

	@FindBy(linkText = "Show AllDesktops")
	WebElement ShowAll;

	@FindBy(xpath = "//div/div/h4/a[text()='MacBook Air']")
	WebElement MacBook;

	@FindBy(xpath = "//a[text()='MacBook Air']/parent::h4/parent::div/following-sibling::div//button[1]")
	WebElement AddMacToCart;

	@FindBy(css = "div.alert.alert-success")
	WebElement AddCartSuccess;

	public void ClickDesktops() {
		desktop.click();
	}

	public void ClickShowAllDesktops() {
		ShowAll.click();
	}

	public void SelectMacBook() {
		MacBook.click();
	}

	public void AddMacCart() {
		AddMacToCart.click();
	}

	public String AddMacCartsuccessmsg() {
		String Macmsg=AddCartSuccess.getText();
		System.out.println(Macmsg);
		return Macmsg ;
	}

	public boolean isMacAdded() {
		try {
			return (AddCartSuccess.isDisplayed());
		} catch (Exception e) {
			return false;
		}
	}

}