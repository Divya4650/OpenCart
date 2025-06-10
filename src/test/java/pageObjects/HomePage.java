package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
	
	WebDriver driver;
	
	public HomePage(WebDriver driver)
	{
		super(driver);
	}

	
@FindBy(xpath="//span[text()='My Account']")
WebElement MyAccount;

@FindBy(xpath="//a[text()='Register']")
WebElement Register;

@FindBy(xpath="//*[text()='Login']")
WebElement loginbutton;

public void clickMyAccount() {
	MyAccount.click();
}

public void clickRegister() {
	Register.click();
}

public void clickLogin() {
	loginbutton.click();
}
}
