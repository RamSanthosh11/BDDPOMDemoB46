package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutPage {
	
	@FindBy(xpath= "//button[@class='btn btn-success']")
	WebElement placeOrdbtn;
	
	@FindBy(id= "name")
	WebElement name;
	
	@FindBy(id= "country")
	WebElement contryname;
	
	@FindBy(id= "city")
	WebElement cityname;
	
	@FindBy(id= "card")
	WebElement creditcart;
	

	@FindBy(id= "month")
	WebElement mnth;
	

	@FindBy(id= "year")
	WebElement year;
	
	@FindBy(xpath= "//button[contains(@class,'btn-primary') and text()='Purchase']")
	WebElement purchasebutton;
	
	
	@FindBy(xpath = "//div[@class='sa-icon sa-custom']//following-sibling::h2")
	WebElement sucessTxt;
	
	public CheckOutPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
		
	}
	public void checkoutInfo(String strfrstname,String CountryName,String CityName,
			String cardnumber,String cardmonth,String cardyear) {
		
		placeOrdbtn.click();
		name.sendKeys(strfrstname);
		contryname.sendKeys(CountryName);
		cityname.sendKeys(CityName);
		creditcart.sendKeys(cardnumber);
		mnth.sendKeys(cardmonth);
		year.sendKeys(cardyear);
		
		
		
	}
	public void checkoutOrder() {
		
		purchasebutton.click();
		
	}
	
	public String Succeessmsg() {
		return sucessTxt.getText();
	}
	
	
	

}
