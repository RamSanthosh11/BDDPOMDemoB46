package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy(id= "login2")
	WebElement login;
	
	@FindBy(id= "loginusername")
	WebElement username;
	
	@FindBy(id= "loginpassword")
	WebElement pwd;
	
	@FindBy(xpath = "//button[contains(text(),'Log in')]")
	private WebElement loginButton;
	
	public LoginPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
		
	}
	public void validLogin(String strUser,String strPwd) {
		login.click();
		username.sendKeys(strUser);
		pwd.sendKeys(strPwd);
	}
	public void userlogin() {
		loginButton.click();
	}
	
	
	

}
