package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);	
	}
@FindBy(id="email")
WebElement emailid;

@FindBy(id="pass")
WebElement password;

@FindBy(name="login")
WebElement signin;

public void textEmail(String email)
{
	emailid.sendKeys(email);
}

public void textPassword(String pass)
{
	password.sendKeys(pass);
}

public void clickSignin()
{
	signin.click();
}

}
