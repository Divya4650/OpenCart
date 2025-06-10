package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends BasePage{
	WebDriver driver;
	
	public AccountRegistrationPage(WebDriver driver) {
		super(driver);
	}

@FindBy(name="firstname")	
WebElement Firstname;	
	
@FindBy(name="lastname")	
WebElement Lastname;	

@FindBy(name="email")	
WebElement Email;	

@FindBy(name="telephone")	
WebElement Telephone;	

@FindBy(name="password")	
WebElement Password;	

@FindBy(name="confirm")	
WebElement ConfirmPassword;	

@FindBy(name="agree")	
WebElement AgreeCheckBox;	

@FindBy(css="input[type='submit']")
WebElement Submit;

@FindBy(xpath="//h1[normalize-space()='Your Account Has Been Created!']")
WebElement confirmsg;

public void FirstName(String fname)
{
Firstname.sendKeys(fname);
}

public void LastName(String lname)
{
	Lastname.sendKeys(lname);
}

public void Mail(String mail)
{
	Email.sendKeys(mail);
}

public void Phone(String phonenum)
{
	Telephone.sendKeys(phonenum);
}

public void password(String pwd)
{
	Password.sendKeys(pwd);
}

public void Confirmpassword(String pwd)
{
	ConfirmPassword.sendKeys(pwd);
}

public void PrivacyCheckbox()
{
	AgreeCheckBox.click();
}

public void submit() {
	Submit.click();
}

public String MessageConfirm() {
	try {
		return(confirmsg.getText());
	}catch(Exception e) {
		return (e.getMessage());
	}
}
}
