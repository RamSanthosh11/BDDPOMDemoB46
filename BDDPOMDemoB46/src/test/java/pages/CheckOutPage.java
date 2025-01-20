package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutPage {
	
	@FindBy(id= "first-name")
	WebElement frstname;
	
	@FindBy(id= "last-name")
	WebElement lstname;
	
	@FindBy(id= "postal-code")
	WebElement zipcode;
	
	@FindBy(id= "continue")
	WebElement contBtn;
	

	@FindBy(id= "finish")
	WebElement finshBtn;
	
	@FindBy(className = "complete-header")
	WebElement sucessTxt;
	
	public CheckOutPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
		/* PageFactory.initElements(driver, this): 
		This line initializes the web elements defined with the @FindBy annotations using the provided WebDriver instance.*/
		
	}
	public void checkoutInfo(String strfrstname,String strlstname,String intzipcode) {
		frstname.sendKeys(strfrstname);
		lstname.sendKeys(strlstname);
		zipcode.sendKeys(intzipcode);
		contBtn.click();
		
		
		
	}
	public void checkoutOrder() {
		
		finshBtn.click();
		
	}
	
	public String Succeessmsg() {
		return sucessTxt.getText();
	}
	
	
	

}
