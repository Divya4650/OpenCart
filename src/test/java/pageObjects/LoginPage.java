package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(id="input-email")
	WebElement mailid;
	
	@FindBy(css="#input-password")
	WebElement passwordd;
	
	@FindBy(css="[value='Login']")
	WebElement Loginbuttonn;
	
	public void SendEmail(String Email) {
		mailid.sendKeys(Email);
	}
	public void SendPassword(String Passwordd) {
		passwordd.sendKeys(Passwordd);
	}
	public void ClickLogin() {
		Loginbuttonn.click();
	}
}
